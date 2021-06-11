package com.sdk.common;

import com.sdk.application.ApplicationModels;
import com.sdk.application.ApplicationService;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import org.apache.commons.lang3.StringUtils;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.PUT;
import retrofit2.http.Url;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class FileStorage {

    private RetrofitServiceFactory retrofitServiceFactory;

    private ApplicationService.FileStorageService fileStorageService;

    public ApplicationModels.CompleteResponse uploadMedia(String fileName, String contentType, int size, String namespace, File file, ApplicationService.FileStorageService fileStorageService) {
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.fileStorageService = fileStorageService;
        AwsApiList awsApiList = generateAwsApiList();
        if(StringUtils.isNotEmpty(fileName) && StringUtils.isNotEmpty(contentType) && StringUtils.isNotEmpty(namespace)) {
            ApplicationModels.StartRequest startRequest = new ApplicationModels.StartRequest(fileName, contentType, size, List.of(), new HashMap<>());
            try {
                ApplicationModels.StartResponse startResponse = fileStorageService.startUpload(namespace, startRequest);
                String cdnUrl = startResponse.getCdn().getUrl();
                String uploadUrl = startResponse.getUpload().getUrl();
                if(StringUtils.isNotEmpty(cdnUrl) && StringUtils.isNotEmpty(uploadUrl) && Objects.nonNull(file)) {
                    String contentTypeFromResponse = StringUtils.isNotEmpty(startResponse.getContentType()) ? startResponse.getContentType():"";
                    awsApiList.updateAWSMedia(contentTypeFromResponse, uploadUrl, RequestBody.create(MediaType.parse(contentTypeFromResponse), file));
                    return fileStorageService.completeUpload(namespace, startResponse);
                }
            }catch (Exception e) {
                throw new FDKError(e.getMessage());
            }
        }
        throw new FDKError("Missing Input Parameters");
    }

    private AwsApiList generateAwsApiList() {
        return retrofitServiceFactory.createService(fileStorageService.getApplicationConfig().getDomain(), AwsApiList.class, List.of());
    }

    interface AwsApiList {
        @PUT
        Call<Void> updateAWSMedia(@Header("Content-type") String header, @Url String url, @Body RequestBody image);
    }
}
