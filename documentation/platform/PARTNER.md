



##### [Back to Platform docs](./README.md)

## Partner Methods
Partner configuration apis
* [addProxyPath](#addproxypath)
* [removeProxyPath](#removeproxypath)



## Methods with example and description


### addProxyPath
Add proxy path for external url




```java
client.application("<APPLICATION_ID>").partner.addProxyPath( extensionId, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | Current company id |   
| applicationId | String | yes | Current application id |   
| extensionId | String | yes | Extension id |  
| body | [AddProxyReq](#AddProxyReq) | yes | Request body |


Add proxy path for external url

*Returned Response:*




[AddProxyResponse](#AddProxyResponse)

Success




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "_id": "607406b8a472cd527303692f",
  "attached_path": "test",
  "proxy_url": "https://www.abc.com",
  "company_id": "1",
  "application_id": "000000000000000000000004",
  "extension_id": "6073280be899ea5b1150fd9d",
  "created_at": "2021-04-12T08:37:12.077Z",
  "modified_at": "2021-04-12T08:37:12.077Z"
}
```
</details>









---


### removeProxyPath
Remove proxy path for external url




```java
client.application("<APPLICATION_ID>").partner.removeProxyPath( extensionId,  attachedPath) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | Current company id |   
| applicationId | String | yes | Current application id |   
| extensionId | String | yes | Extension id |   
| attachedPath | String | yes | Attachaed path slug |  



Remove proxy path for external url

*Returned Response:*




[RemoveProxyResponse](#RemoveProxyResponse)

Success




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "message": "Proxy URL deleted",
  "data": {
    "_id": "607406b8a472cd527303692f",
    "attached_path": "test",
    "proxy_url": "https://www.abc.com",
    "company_id": "1",
    "application_id": "000000000000000000000004",
    "extension_id": "6073280be899ea5b1150fd9d",
    "created_at": "2021-04-12T08:37:12.077Z",
    "modified_at": "2021-04-12T08:37:12.077Z"
  }
}
```
</details>









---



### Schemas

 
 
 #### [AddProxyReq](#AddProxyReq)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | attachedPath | String? |  yes  | Proxy path slug |
 | proxyUrl | String? |  yes  | Proxied url |

---


 
 
 #### [AddProxyResponse](#AddProxyResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String? |  yes  |  |
 | attachedPath | String? |  yes  |  |
 | proxyUrl | String? |  yes  |  |
 | companyId | String? |  yes  |  |
 | applicationId | String? |  yes  |  |
 | extensionId | String? |  yes  |  |
 | createdAt | String? |  yes  |  |
 | modifiedAt | String? |  yes  |  |

---


 
 
 #### [APIError](#APIError)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | code | String? |  yes  |  |
 | message | String? |  yes  |  |
 | info | String? |  yes  | Error code description link |
 | requestId | String? |  yes  |  |
 | meta | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [RemoveProxyResponse](#RemoveProxyResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String? |  yes  |  |
 | data | HashMap<String,Object>? |  yes  |  |

---



