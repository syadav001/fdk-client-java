



##### [Back to Platform docs](./README.md)

## Webhook Methods
Webhook dispatcher with retry and one event to many subscriber vice versa
* [getSubscribersByCompany](#getsubscribersbycompany)
* [registerSubscriberToEvent](#registersubscribertoevent)
* [updateSubscriberConfig](#updatesubscriberconfig)
* [getSubscribersByExtensionId](#getsubscribersbyextensionid)
* [getSubscriberById](#getsubscriberbyid)
* [fetchAllEventConfigurations](#fetchalleventconfigurations)



## Methods with example and description


### getSubscribersByCompany
Get Subscribers By Company ID




```java
client.webhook.getSubscribersByCompany( pageNo,  pageSize,  extensionId)
{


  //use response
  }
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| pageNo | Integer? | no | Page Number |   
| pageSize | Integer? | no | Page Size |   
| companyId | Integer | yes | Company ID of the application |   
| extensionId | String? | no | Extension ID |  



Get Subscribers By CompanyId

*Returned Response:*




[SubscriberResponse](#SubscriberResponse)

Success




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### registerSubscriberToEvent
Register Subscriber




```java
client.webhook.registerSubscriberToEvent(body body)
{


  //use response
  }
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | Company Id of the application |  
| body | [SubscriberConfig](#SubscriberConfig) | yes | Request body |


Register Subscriber

*Returned Response:*




[SubscriberConfig](#SubscriberConfig)

Success




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### updateSubscriberConfig
Update Subscriber




```java
client.webhook.updateSubscriberConfig(body body)
{


  //use response
  }
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | Company ID of the application |  
| body | [SubscriberConfig](#SubscriberConfig) | yes | Request body |


Update Subscriber

*Returned Response:*




[SubscriberConfig](#SubscriberConfig)

Success




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getSubscribersByExtensionId
Get Subscribers By Extension ID




```java
client.webhook.getSubscribersByExtensionId( pageNo,  pageSize,  extensionId)
{


  //use response
  }
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| pageNo | Integer? | no | Page Number |   
| pageSize | Integer? | no | Page Size |   
| companyId | Integer | yes | Company ID of the application |   
| extensionId | String | yes | Extension ID |  



Get Subscribers By ExtensionID

*Returned Response:*




[SubscriberResponse](#SubscriberResponse)

Success




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getSubscriberById
Get Subscriber By Subscriber ID




```java
client.webhook.getSubscriberById( subscriberId)
{


  //use response
  }
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | Company ID of the application |   
| subscriberId | Integer | yes | Subscriber ID |  



Get Subscriber By Subscriber ID

*Returned Response:*




[SubscriberResponse](#SubscriberResponse)

Success




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### fetchAllEventConfigurations
Get All Webhook Events




```java
client.webhook.fetchAllEventConfigurations()
{


  //use response
  }
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | Company ID of the application |  



Get All Webhook Events

*Returned Response:*




[EventConfigList](#EventConfigList)

Success




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---



### Schemas

 
 
 #### [EventConfig](#EventConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | Integer? |  yes  |  |
 | eventName | String? |  yes  |  |
 | eventType | String? |  yes  |  |
 | eventCategory | String? |  yes  |  |
 | version | String? |  yes  |  |
 | displayName | String? |  yes  |  |
 | description | String? |  yes  |  |
 | createdOn | String? |  yes  |  |

---


 
 
 #### [EventConfigList](#EventConfigList)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[EventConfig](#EventConfig)>? |  yes  |  |
 | page | [Page](#Page)? |  yes  |  |

---


 
 
 #### [SubscriberConfigList](#SubscriberConfigList)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[SubscriberResponse](#SubscriberResponse)>? |  yes  |  |
 | page | [Page](#Page)? |  yes  |  |

---


 
 
 #### [Page](#Page)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | itemTotal | Integer? |  yes  |  |
 | nextId | String? |  yes  |  |
 | hasPrevious | Boolean? |  yes  |  |
 | hasNext | Boolean? |  yes  |  |
 | current | Integer? |  yes  |  |
 | type | String |  no  |  |
 | size | Integer? |  yes  |  |

---


 
 
 #### [EventProcessedStatus](#EventProcessedStatus)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | Integer? |  yes  |  |
 | subscriberId | String? |  yes  |  |
 | attempt | Integer? |  yes  |  |
 | responseCode | String? |  yes  |  |
 | responseMessage | String? |  yes  |  |
 | createdOn | String? |  yes  |  |
 | processedOn | String? |  yes  |  |
 | status | Boolean? |  yes  |  |

---


 
 
 #### [EventPayload](#EventPayload)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | Integer? |  yes  |  |
 | eventTraceId | String? |  yes  |  |
 | messageId | String? |  yes  |  |
 | eventName | String? |  yes  |  |
 | eventType | String? |  yes  |  |
 | version | String? |  yes  |  |
 | status | Boolean? |  yes  |  |

---


 
 
 #### [SubscriberConfig](#SubscriberConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | Integer? |  yes  |  |
 | name | String? |  yes  |  |
 | webhookUrl | String? |  yes  |  |
 | association | [Association](#Association)? |  yes  |  |
 | status | [SubscriberStatus](#SubscriberStatus)? |  yes  |  |
 | emailId | String? |  yes  |  |
 | authMeta | [AuthMeta](#AuthMeta)? |  yes  |  |
 | eventId | ArrayList<Integer>? |  yes  |  |

---


 
 
 #### [SubscriberResponse](#SubscriberResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | Integer? |  yes  |  |
 | name | String? |  yes  |  |
 | webhookUrl | String? |  yes  |  |
 | association | [Association](#Association)? |  yes  |  |
 | status | [SubscriberStatus](#SubscriberStatus)? |  yes  |  |
 | authMeta | [AuthMeta](#AuthMeta)? |  yes  |  |
 | createdOn | String? |  yes  |  |
 | updatedOn | String? |  yes  |  |
 | eventConfigs | ArrayList<[EventConfig](#EventConfig)>? |  yes  |  |

---


 
 
 #### [SubscriberEvent](#SubscriberEvent)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | Integer? |  yes  |  |
 | subscriberId | Integer? |  yes  |  |
 | eventId | Integer? |  yes  |  |
 | createdDate | String? |  yes  |  |

---


 
 
 #### [AuthMeta](#AuthMeta)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | type | String? |  yes  |  |
 | secret | String? |  yes  |  |

---


 
 
 #### [Association](#Association)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | companyId | Integer? |  yes  |  |
 | applicationId | ArrayList<String>? |  yes  |  |
 | extensionId | String? |  yes  |  |
 | criteria | String? |  yes  |  |

---




### Enums





 #### [SubscriberStatus](#SubscriberStatus)
 Type : string

 | Name | Value | Description |
 | ---- | ----- | ----------- |
 | active | active | Status is active |
 | inactive | inactive | Status is inactive |

---





