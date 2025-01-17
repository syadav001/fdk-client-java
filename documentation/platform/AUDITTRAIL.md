



##### [Back to Platform docs](./README.md)

## AuditTrail Methods

* [getAuditLogs](#getauditlogs)
* [createAuditLog](#createauditlog)
* [getAuditLog](#getauditlog)
* [getEntityTypes](#getentitytypes)



## Methods with example and description


### getAuditLogs
Get paginated audit logs




```java
client.audittrail.getAuditLogs( qs) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | Compnay Id |   
| qs | String | yes | Logs Query |  



Get audit logs

*Returned Response:*




[LogSchemaResponse](#LogSchemaResponse)

Success




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; default</i></summary>

```json
{
  "value": {
    "docs": [
      {
        "entity": {
          "type": "sales-channel-configuration",
          "id": "5dcbf6065862c28d81beb025",
          "action": "update"
        },
        "modifier": {
          "as_administrator": true,
          "user_id": "5d8391fa7f6b58553d02eb63",
          "user_details": {
            "firstName": "Hitesh",
            "email": "hiteshjha@gofynd.com"
          }
        },
        "device_info": {
          "user_agent": "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/87.0.4280.88 Safari/537.36"
        },
        "location": {
          "IP": "103.226.87.213"
        },
        "_id": "602a1366a7486d63f1e915b2",
        "company": 61,
        "application": "5d63686df2a4f7806b76bb32",
        "sessions": "",
        "date": "2021-02-15T06:23:32.098Z",
        "logs": {
          "modified_by": "5d8391fa7f6b58553d02eb63"
        },
        "created_at": "2021-02-15T06:23:34.497Z",
        "modified_at": "2021-02-15T06:23:34.497Z",
        "meta": {
          "browser": "Linux - Chrome",
          "device": ""
        }
      }
    ]
  }
}
```
</details>

</details>









---


### createAuditLog
Create logs for auditing later on




```java
client.audittrail.createAuditLog(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | Company Id |  
| body | [RequestBodyAuditLog](#RequestBodyAuditLog) | yes | Request body |


Create a Audit log

*Returned Response:*




[CreateLogResponse](#CreateLogResponse)

Success




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; default</i></summary>

```json
{
  "value": {
    "message": "Audit log recorded successfully !",
    "internal_message": "Audit log queued"
  }
}
```
</details>

</details>









---


### getAuditLog
Get audit log




```java
client.audittrail.getAuditLog( id) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | Compnay Id |   
| id | String | yes | log uuid |  



Get audit logs by logs uuid

*Returned Response:*




[LogSchemaResponse](#LogSchemaResponse)

Success




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; default</i></summary>

```json
{
  "value": {
    "docs": [
      {
        "entity": {
          "type": "sales-channel-configuration",
          "id": "5dcbf6065862c28d81beb025",
          "action": "update"
        },
        "modifier": {
          "as_administrator": true,
          "user_id": "5d8391fa7f6b58553d02eb63",
          "user_details": {
            "firstName": "Hitesh",
            "email": "hiteshjha@gofynd.com"
          }
        },
        "device_info": {
          "user_agent": "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/87.0.4280.88 Safari/537.36"
        },
        "location": {
          "IP": "103.226.87.213"
        },
        "_id": "602a1366a7486d63f1e915b2",
        "company": 61,
        "application": "5d63686df2a4f7806b76bb32",
        "sessions": "",
        "date": "2021-02-15T06:23:32.098Z",
        "logs": {
          "modified_by": "5d8391fa7f6b58553d02eb63"
        },
        "created_at": "2021-02-15T06:23:34.497Z",
        "modified_at": "2021-02-15T06:23:34.497Z",
        "meta": {
          "browser": "Linux - Chrome",
          "device": ""
        }
      }
    ]
  }
}
```
</details>

</details>









---


### getEntityTypes
Get entity types




```java
client.audittrail.getEntityTypes() {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | Company Id |  



Get entity types

*Returned Response:*




[EntityTypesResponse](#EntityTypesResponse)

Success




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; default</i></summary>

```json
{
  "value": {
    "items": [
      {
        "entity_value:\"sales-channel\"": null,
        "display_name": "Sales Channel"
      },
      {
        "entity_value:\"shipment-update\"": null,
        "display_name": "Shipment Update"
      }
    ]
  }
}
```
</details>

</details>









---



### Schemas

 
 
 #### [RequestBodyAuditLog](#RequestBodyAuditLog)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | logMeta | [LogMetaObj](#LogMetaObj) |  no  |  |
 | logPayload | HashMap<String,Object> |  no  |  |

---


 
 
 #### [CreateLogResponse](#CreateLogResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String? |  yes  |  |
 | internalMessage | String? |  yes  |  |

---


 
 
 #### [LogMetaObj](#LogMetaObj)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | modifier | HashMap<String,Object>? |  yes  |  |
 | application | String? |  yes  |  |
 | entity | [EntityObject](#EntityObject)? |  yes  |  |
 | deviceInfo | HashMap<String,Object>? |  yes  |  |
 | location | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [EntityObject](#EntityObject)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String? |  yes  |  |
 | type | String? |  yes  |  |
 | action | String? |  yes  |  |

---


 
 
 #### [LogSchemaResponse](#LogSchemaResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | docs | ArrayList<[LogDocs](#LogDocs)>? |  yes  |  |

---


 
 
 #### [LogDocs](#LogDocs)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | entity | [EntityObj](#EntityObj)? |  yes  |  |
 | modifier | [Modifier](#Modifier)? |  yes  |  |
 | deviceInfo | [DeviceInfo](#DeviceInfo)? |  yes  |  |
 | location | [Location](#Location)? |  yes  |  |
 | id | String? |  yes  |  |
 | company | String? |  yes  |  |
 | application | String? |  yes  |  |
 | sessions | String? |  yes  |  |
 | date | String? |  yes  |  |
 | logs | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [EntityObj](#EntityObj)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String? |  yes  |  |
 | type | String? |  yes  |  |
 | action | String? |  yes  |  |
 | entityDetails | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [Modifier](#Modifier)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | userId | String? |  yes  |  |
 | asAdministrator | Boolean? |  yes  |  |
 | userDetails | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [DeviceInfo](#DeviceInfo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | userAgent | String? |  yes  |  |
 | extraMeta | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [Location](#Location)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | extraMeta | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [BadRequest](#BadRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String? |  yes  | Failure message. |

---


 
 
 #### [ResourceNotFound](#ResourceNotFound)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String? |  yes  | Resource not found with {id} |

---


 
 
 #### [InternalServerError](#InternalServerError)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String? |  yes  | Internal server Server error |
 | code | String? |  yes  | Error code |

---


 
 
 #### [EntityTypesResponse](#EntityTypesResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[EntityTypeObj](#EntityTypeObj)>? |  yes  |  |

---


 
 
 #### [EntityTypeObj](#EntityTypeObj)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | entityValue | String? |  yes  |  |
 | displayName | String? |  yes  |  |

---



