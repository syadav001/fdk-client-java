



##### [Back to Platform docs](./README.md)

## Serviceability Methods
Logistics Configuration API's allows you to configure zone, application logistics and many more useful features. 
* [getApplicationServiceability](#getapplicationserviceability)
* [getEntityRegionView](#getentityregionview)
* [getListView](#getlistview)
* [getCompanyStoreView](#getcompanystoreview)
* [updateZoneControllerView](#updatezonecontrollerview)
* [getZoneDataView](#getzonedataview)
* [upsertZoneControllerView](#upsertzonecontrollerview)
* [getZoneFromPincode](#getzonefrompincode)



## Methods with example and description


### getApplicationServiceability
Zone configuration of application.




```java
client.application("<APPLICATION_ID>").serviceability.getApplicationServiceability() {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular sale channel. |  



This API returns serviceability config of the application.

*Returned Response:*




[ApplicationServiceabilityConfigResponse](#ApplicationServiceabilityConfigResponse)

Response Data




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "error": {
    "type": null,
    "value": null,
    "message": null
  },
  "success": true,
  "data": {
    "channel_id": "5d656121a81320c2e6ee2a72",
    "channel_type": "application",
    "serviceability_type": "all"
  }
}
```
</details>









---


### getEntityRegionView
Get country and state list




```java
client.serviceability.getEntityRegionView(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular sale channel. |  
| body | [EntityRegionView_Request](#EntityRegionView_Request) | yes | Request body |


This API returns response for Entity Region View.

*Returned Response:*




[EntityRegionView_Response](#EntityRegionView_Response)

Response status_code




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getListView
Zone List of application.




```java
client.serviceability.getListView( pageNumber,  pageSize,  name,  isActive,  channelIds) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular sale channel. |   
| pageNumber | Integer? | no | index of the item to start returning with |   
| pageSize | Integer? | no | determines the items to be displayed in a page |   
| name | String? | no | Name of particular zone in the seller account |   
| isActive | Boolean? | no | status of  zone whether active or inactive |   
| channelIds | String? | no | zones associated with the given channel ids' |  



This API returns Zone List View of the application.

*Returned Response:*




[ListViewResponse](#ListViewResponse)

Zone List of application in descending order of their last modified date.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getCompanyStoreView
Company Store View of application.




```java
client.serviceability.getCompanyStoreView() {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular company. |  



This API returns Company Store View of the application.

*Returned Response:*




[CompanyStoreView_Response](#CompanyStoreView_Response)

Get Company Store View Data




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### updateZoneControllerView
Updation of zone collections in database.




```java
client.serviceability.updateZoneControllerView( zoneId, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| zoneId | String | yes | A `zone_id` is a unique identifier for a particular zone. |   
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular sale channel. |  
| body | [ZoneUpdateRequest](#ZoneUpdateRequest) | yes | Request body |


This API returns response of updation of zone in mongo database.

*Returned Response:*




[ZoneSuccessResponse](#ZoneSuccessResponse)

Response status_code




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getZoneDataView
Zone Data View of application.




```java
client.serviceability.getZoneDataView( zoneId) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular sale channel. |   
| zoneId | String | yes | A `zone_id` is a unique identifier for a particular zone. |  



This API returns Zone Data View of the application.

*Returned Response:*




[GetSingleZoneDataViewResponse](#GetSingleZoneDataViewResponse)

Get Application Zone Data




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### upsertZoneControllerView
Insertion of zone in database.




```java
client.serviceability.upsertZoneControllerView(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular sale channel. |  
| body | [ZoneRequest](#ZoneRequest) | yes | Request body |


This API returns response of insertion of zone in mongo database.<br>Correction- `zone_id` in the path must be removed.<br> path is `/service/platform/logistics-internal/v1.0/company/{company_id}/zone/`

*Returned Response:*




[ZoneResponse](#ZoneResponse)

Response status_code




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getZoneFromPincode
GET zone from the Pincode.




```java
client.application("<APPLICATION_ID>").serviceability.getZoneFromPincode(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` contains a specific ID of a company. |   
| applicationId | String | yes | A `application_id` contains a unique ID. |  
| body | [GetZoneFromPincodeViewRequest](#GetZoneFromPincodeViewRequest) | yes | Request body |


This API returns zone from the Pincode View.

*Returned Response:*




[GetZoneFromPincodeViewResponse](#GetZoneFromPincodeViewResponse)

Response status_code




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---



### Schemas

 
 
 #### [ServiceabilityrErrorResponse](#ServiceabilityrErrorResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | value | String |  no  |  |
 | message | String |  no  |  |
 | type | String |  no  |  |

---


 
 
 #### [ApplicationServiceabilityConfig](#ApplicationServiceabilityConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | channelType | String |  no  |  |
 | serviceabilityType | String |  no  |  |
 | channelId | String |  no  |  |

---


 
 
 #### [ApplicationServiceabilityConfigResponse](#ApplicationServiceabilityConfigResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | error | [ServiceabilityrErrorResponse](#ServiceabilityrErrorResponse)? |  yes  |  |
 | data | [ApplicationServiceabilityConfig](#ApplicationServiceabilityConfig)? |  yes  |  |
 | success | Boolean |  no  |  |

---


 
 
 #### [EntityRegionView_Request](#EntityRegionView_Request)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | parentId | ArrayList<String>? |  yes  |  |
 | subType | ArrayList<String> |  no  |  |

---


 
 
 #### [EntityRegionView_Error](#EntityRegionView_Error)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | value | String? |  yes  |  |
 | message | String? |  yes  |  |
 | type | String? |  yes  |  |

---


 
 
 #### [EntityRegionView_Items](#EntityRegionView_Items)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | subType | String |  no  |  |
 | uid | String |  no  |  |
 | name | String |  no  |  |

---


 
 
 #### [EntityRegionView_page](#EntityRegionView_page)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | type | String |  no  |  |
 | hasNext | Boolean |  no  |  |
 | size | Integer |  no  |  |
 | itemTotal | Integer |  no  |  |
 | current | Integer |  no  |  |

---


 
 
 #### [EntityRegionView_Response](#EntityRegionView_Response)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | error | [EntityRegionView_Error](#EntityRegionView_Error) |  no  |  |
 | data | ArrayList<[EntityRegionView_Items](#EntityRegionView_Items)> |  no  |  |
 | page | [EntityRegionView_page](#EntityRegionView_page) |  no  |  |
 | success | Boolean |  no  |  |

---


 
 
 #### [ListViewChannels](#ListViewChannels)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | channelType | String |  no  |  |
 | channelId | String |  no  |  |

---


 
 
 #### [ListViewProduct](#ListViewProduct)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | count | Integer |  no  |  |
 | type | String |  no  |  |

---


 
 
 #### [ListViewItems](#ListViewItems)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | zoneId | String |  no  |  |
 | storesCount | Integer |  no  |  |
 | channels | [ListViewChannels](#ListViewChannels) |  no  |  |
 | pincodesCount | Integer |  no  |  |
 | slug | String |  no  |  |
 | product | [ListViewProduct](#ListViewProduct) |  no  |  |
 | companyId | Integer |  no  |  |
 | isActive | Boolean |  no  |  |
 | name | String |  no  |  |

---


 
 
 #### [ZoneDataItem](#ZoneDataItem)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | hasNext | Boolean |  no  |  |
 | size | Integer |  no  |  |
 | itemTotal | Integer |  no  |  |
 | type | String |  no  |  |
 | current | Integer |  no  |  |

---


 
 
 #### [ListViewSummary](#ListViewSummary)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | totalPincodesServed | Integer |  no  |  |
 | totalActiveZones | Integer |  no  |  |
 | totalZones | Integer |  no  |  |

---


 
 
 #### [ListViewResponse](#ListViewResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[ListViewItems](#ListViewItems)> |  no  |  |
 | page | ArrayList<[ZoneDataItem](#ZoneDataItem)> |  no  |  |
 | summary | ArrayList<[ListViewSummary](#ListViewSummary)> |  no  |  |

---


 
 
 #### [CompanyStoreView_PageItems](#CompanyStoreView_PageItems)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | type | String |  no  |  |
 | hasNext | Boolean |  no  |  |
 | size | Integer |  no  |  |
 | itemTotal | Integer |  no  |  |
 | current | Integer |  no  |  |

---


 
 
 #### [CompanyStoreView_Response](#CompanyStoreView_Response)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<HashMap<String,Object>>? |  yes  |  |
 | page | ArrayList<[CompanyStoreView_PageItems](#CompanyStoreView_PageItems)> |  no  |  |

---


 
 
 #### [ZoneMappingType](#ZoneMappingType)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | country | String |  no  |  |
 | pincode | ArrayList<String>? |  yes  |  |
 | state | ArrayList<String>? |  yes  |  |

---


 
 
 #### [GetZoneDataViewChannels](#GetZoneDataViewChannels)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | channelType | String |  no  |  |
 | channelId | String |  no  |  |

---


 
 
 #### [ZoneProductTypes](#ZoneProductTypes)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | tags | ArrayList<String> |  no  |  |
 | type | String |  no  |  |

---


 
 
 #### [UpdateZoneData](#UpdateZoneData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | zoneId | String |  no  |  |
 | mapping | ArrayList<[ZoneMappingType](#ZoneMappingType)> |  no  |  |
 | channels | ArrayList<[GetZoneDataViewChannels](#GetZoneDataViewChannels)> |  no  |  |
 | regionType | String |  no  |  |
 | storeIds | ArrayList<Integer> |  no  |  |
 | slug | String |  no  |  |
 | product | [ZoneProductTypes](#ZoneProductTypes) |  no  |  |
 | companyId | Integer |  no  |  |
 | isActive | Boolean |  no  |  |
 | name | String |  no  |  |

---


 
 
 #### [ZoneUpdateRequest](#ZoneUpdateRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | identifier | String |  no  |  |
 | data | [UpdateZoneData](#UpdateZoneData) |  no  |  |

---


 
 
 #### [ZoneSuccessResponse](#ZoneSuccessResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | statusCode | Integer |  no  |  |
 | success | Boolean |  no  |  |

---


 
 
 #### [GetZoneDataViewItems](#GetZoneDataViewItems)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | zoneId | String |  no  |  |
 | storesCount | Integer |  no  |  |
 | mapping | ArrayList<[ZoneMappingType](#ZoneMappingType)> |  no  |  |
 | channels | ArrayList<[GetZoneDataViewChannels](#GetZoneDataViewChannels)> |  no  |  |
 | regionType | String |  no  |  |
 | storeIds | ArrayList<Integer> |  no  |  |
 | pincodesCount | Integer |  no  |  |
 | slug | String |  no  |  |
 | product | [ZoneProductTypes](#ZoneProductTypes) |  no  |  |
 | companyId | Integer |  no  |  |
 | isActive | Boolean |  no  |  |
 | name | String |  no  |  |

---


 
 
 #### [GetSingleZoneDataViewResponse](#GetSingleZoneDataViewResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | [GetZoneDataViewItems](#GetZoneDataViewItems) |  no  |  |

---


 
 
 #### [CreateZoneData](#CreateZoneData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | mapping | ArrayList<[ZoneMappingType](#ZoneMappingType)> |  no  |  |
 | regionType | String |  no  |  |
 | storeIds | ArrayList<Integer> |  no  |  |
 | slug | String |  no  |  |
 | product | [ZoneProductTypes](#ZoneProductTypes) |  no  |  |
 | companyId | Integer |  no  |  |
 | channels | ArrayList<[GetZoneDataViewChannels](#GetZoneDataViewChannels)> |  no  |  |
 | isActive | Boolean |  no  |  |
 | name | String |  no  |  |

---


 
 
 #### [ZoneRequest](#ZoneRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | identifier | String |  no  |  |
 | data | [CreateZoneData](#CreateZoneData) |  no  |  |

---


 
 
 #### [ZoneResponse](#ZoneResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | statusCode | Integer |  no  |  |
 | zoneId | String |  no  |  |
 | success | Boolean |  no  |  |

---


 
 
 #### [GetZoneFromPincodeViewRequest](#GetZoneFromPincodeViewRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | country | String |  no  |  |
 | pincode | String |  no  |  |

---


 
 
 #### [GetZoneFromPincodeViewResponse](#GetZoneFromPincodeViewResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | serviceabilityType | String |  no  |  |
 | zones | ArrayList<String> |  no  |  |

---


