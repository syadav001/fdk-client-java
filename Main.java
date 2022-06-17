package com.sdk;

import com.sdk.application.ApplicationClient;
import com.sdk.application.ApplicationConfig;
import com.sdk.application.ApplicationModels;
import com.sdk.platform.PlatformClient;
import com.sdk.platform.PlatformConfig;
import com.sdk.platform.PlatformModels;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws IOException {
        // creating a platform config object.
        PlatformConfig platformConfig = null;
        try {
            platformConfig = new PlatformConfig(
                    "2718",
                    "62715d07987796876de0c441",
                    "7a2cEtU.BQfWRBQ",
                    "https://api.fynd.com"
            );

            if(Objects.nonNull(platformConfig)) {

                LinkedList<String> scopes = new LinkedList<>();
                scopes.add("company/saleschannel");
                //putting state as 1234 and isOnline as false
                String authorizationURL = platformConfig.getPlatformOauthClient()
                        .getAuthorizationURL(scopes, "https://google.com", "1234", false);
                System.out.println(authorizationURL);
                System.out.println(authorizationURL);

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
