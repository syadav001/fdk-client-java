package com.sdk.platform;

import com.fasterxml.jackson.annotation.*;
import com.sdk.application.*;
import lombok.*;

import java.util.*;

public class PlatformModels {


/*
    Model: LocationDefaultLanguage
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class LocationDefaultLanguage {
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
}

/*
    Model: LocationDefaultCurrency
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class LocationDefaultCurrency {
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("symbol")
    private String symbol;
    
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
}

/*
    Model: LocationCountry
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class LocationCountry {
    
    
    
    
    
    @JsonProperty("capital")
    private String capital;
    
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    
    @JsonProperty("iso2")
    private String iso2;
    
    
    
    
    
    @JsonProperty("iso3")
    private String iso3;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("parent")
    private String parent;
    
    
    
    
    
    @JsonProperty("phone_code")
    private String phoneCode;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    
    @JsonProperty("__v")
    private Integer v;
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("default_currency")
    private LocationDefaultCurrency defaultCurrency;
    
    
    
    
    
    @JsonProperty("default_language")
    private LocationDefaultLanguage defaultLanguage;
    
    
    
    
}

/*
    Model: Locations
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Locations {
    
    
    
    
    
    @JsonProperty("items")
    private List<Object> items;
    
    
    
    
}



/*
    Model: TicketList
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class TicketList {
    
    
    
    
    
    @JsonProperty("items")
    private List<Ticket> items;
    
    
    
    
    
    @JsonProperty("filters")
    private Filter filters;
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: Page
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Page {
    
    
    
    
    
    @JsonProperty("item_total")
    private Integer itemTotal;
    
    
    
    
    
    @JsonProperty("next_id")
    private String nextId;
    
    
    
    
    
    @JsonProperty("has_previous")
    private Boolean hasPrevious;
    
    
    
    
    
    @JsonProperty("has_next")
    private Boolean hasNext;
    
    
    
    
    
    @JsonProperty("current")
    private Integer current;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("size")
    private Integer size;
    
    
    
    
}

/*
    Model: TicketHistoryList
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class TicketHistoryList {
    
    
    
    
    
    @JsonProperty("items")
    private List<TicketHistory> items;
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: CustomFormList
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CustomFormList {
    
    
    
    
    
    @JsonProperty("items")
    private List<CustomForm> items;
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: CreateCustomFormPayload
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CreateCustomFormPayload {
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    
    @JsonProperty("inputs")
    private List<Object> inputs;
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    
    @JsonProperty("header_image")
    private String headerImage;
    
    
    
    
    
    @JsonProperty("priority")
    private PlatformClient.PriorityEnum priority;
    
    
    
    
    
    @JsonProperty("should_notify")
    private Boolean shouldNotify;
    
    
    
    
    
    @JsonProperty("success_message")
    private String successMessage;
    
    
    
    
    
    @JsonProperty("poll_for_assignment")
    private PollForAssignment pollForAssignment;
    
    
    
    
}

/*
    Model: EditCustomFormPayload
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class EditCustomFormPayload {
    
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    
    @JsonProperty("inputs")
    private List<Object> inputs;
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    
    @JsonProperty("priority")
    private PlatformClient.PriorityEnum priority;
    
    
    
    
    
    @JsonProperty("header_image")
    private String headerImage;
    
    
    
    
    
    @JsonProperty("should_notify")
    private Boolean shouldNotify;
    
    
    
    
    
    @JsonProperty("login_required")
    private Boolean loginRequired;
    
    
    
    
    
    @JsonProperty("success_message")
    private String successMessage;
    
    
    
    
    
    @JsonProperty("poll_for_assignment")
    private PollForAssignment pollForAssignment;
    
    
    
    
}

/*
    Model: EditTicketPayload
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class EditTicketPayload {
    
    
    
    
    
    @JsonProperty("content")
    private TicketContent content;
    
    
    
    
    
    @JsonProperty("category")
    private String category;
    
    
    
    
    
    @JsonProperty("sub_category")
    private String subCategory;
    
    
    
    
    
    @JsonProperty("source")
    private String source;
    
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    
    @JsonProperty("priority")
    private PlatformClient.PriorityEnum priority;
    
    
    
    
    
    @JsonProperty("assigned_to")
    private AgentChangePayload assignedTo;
    
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
}

/*
    Model: AgentChangePayload
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class AgentChangePayload {
    
    
    
    
    
    @JsonProperty("agent_id")
    private String agentId;
    
    
    
    
}

/*
    Model: CreateVideoRoomResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CreateVideoRoomResponse {
    
    
    
    
    
    @JsonProperty("unique_name")
    private String uniqueName;
    
    
    
    
}

/*
    Model: CloseVideoRoomResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CloseVideoRoomResponse {
    
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
}

/*
    Model: CreateVideoRoomPayload
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CreateVideoRoomPayload {
    
    
    
    
    
    @JsonProperty("unique_name")
    private String uniqueName;
    
    
    
    
    
    @JsonProperty("notify")
    private List<NotifyUser> notify;
    
    
    
    
}

/*
    Model: NotifyUser
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class NotifyUser {
    
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    
    @JsonProperty("phone_number")
    private String phoneNumber;
    
    
    
    
}

/*
    Model: Filter
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Filter {
    
    
    
    
    
    @JsonProperty("priorities")
    private List<Priority> priorities;
    
    
    
    
    
    @JsonProperty("categories")
    private List<TicketCategory> categories;
    
    
    
    
    
    @JsonProperty("statuses")
    private List<Status> statuses;
    
    
    
    
    
    @JsonProperty("assignees")
    private List<Object> assignees;
    
    
    
    
}

/*
    Model: TicketHistoryPayload
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class TicketHistoryPayload {
    
    
    
    
    
    @JsonProperty("value")
    private Object value;
    
    
    
    
    
    @JsonProperty("type")
    private PlatformClient.HistoryTypeEnum type;
    
    
    
    
}

/*
    Model: CustomFormSubmissionPayload
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CustomFormSubmissionPayload {
    
    
    
    
    
    @JsonProperty("response")
    private List<KeyValue> response;
    
    
    
    
    
    @JsonProperty("attachments")
    private List<TicketAsset> attachments;
    
    
    
    
}

/*
    Model: KeyValue
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class KeyValue {
    
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    
    @JsonProperty("value")
    private Object value;
    
    
    
    
}

/*
    Model: GetTokenForVideoRoomResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class GetTokenForVideoRoomResponse {
    
    
    
    
    
    @JsonProperty("access_token")
    private String accessToken;
    
    
    
    
}

/*
    Model: GetParticipantsInsideVideoRoomResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class GetParticipantsInsideVideoRoomResponse {
    
    
    
    
    
    @JsonProperty("participants")
    private List<Participant> participants;
    
    
    
    
}

/*
    Model: Participant
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Participant {
    
    
    
    
    
    @JsonProperty("user")
    private UserSchema user;
    
    
    
    
    
    @JsonProperty("identity")
    private String identity;
    
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
}

/*
    Model: PhoneNumber
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class PhoneNumber {
    
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    
    @JsonProperty("primary")
    private Boolean primary;
    
    
    
    
    
    @JsonProperty("verified")
    private Boolean verified;
    
    
    
    
    
    @JsonProperty("phone")
    private String phone;
    
    
    
    
    
    @JsonProperty("country_code")
    private Integer countryCode;
    
    
    
    
}

/*
    Model: Email
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Email {
    
    
    
    
    
    @JsonProperty("primary")
    private Boolean primary;
    
    
    
    
    
    @JsonProperty("verified")
    private Boolean verified;
    
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
}

/*
    Model: Debug
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Debug {
    
    
    
    
    
    @JsonProperty("source")
    private String source;
    
    
    
    
    
    @JsonProperty("platform")
    private String platform;
    
    
    
    
}

/*
    Model: SubmitCustomFormResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class SubmitCustomFormResponse {
    
    
    
    
    
    @JsonProperty("ticket")
    private Ticket ticket;
    
    
    
    
}

/*
    Model: TicketContext
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class TicketContext {
    
    
    
    
    
    @JsonProperty("application_id")
    private String applicationId;
    
    
    
    
    
    @JsonProperty("company_id")
    private String companyId;
    
    
    
    
}

/*
    Model: CreatedOn
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CreatedOn {
    
    
    
    
    
    @JsonProperty("user_agent")
    private String userAgent;
    
    
    
    
}

/*
    Model: TicketAsset
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class TicketAsset {
    
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
    
    @JsonProperty("type")
    private Object type;
    
    
    
    
}

/*
    Model: TicketContent
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class TicketContent {
    
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    
    @JsonProperty("description")
    @Getter(AccessLevel.NONE)
    private String description_b64;

    public String getDescription_b64() {
        return new String(Base64.getDecoder()
                         .decode(this.description_b64));
    }
    
    
    
    
    
    @JsonProperty("attachments")
    private List<TicketAsset> attachments;
    
    
    
    
}

/*
    Model: AddTicketPayload
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class AddTicketPayload {
    
    
    
    
    
    @JsonProperty("created_by")
    private Object createdBy;
    
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    
    @JsonProperty("priority")
    private PlatformClient.PriorityEnum priority;
    
    
    
    
    
    @JsonProperty("category")
    private String category;
    
    
    
    
    
    @JsonProperty("content")
    private TicketContent content;
    
    
    
    
}

/*
    Model: Priority
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Priority {
    
    
    
    
    
    @JsonProperty("key")
    private PlatformClient.PriorityEnum key;
    
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    
    @JsonProperty("color")
    private String color;
    
    
    
    
}

/*
    Model: Status
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Status {
    
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    
    @JsonProperty("color")
    private String color;
    
    
    
    
}

/*
    Model: TicketCategory
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class TicketCategory {
    
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    
    @JsonProperty("form")
    private CustomForm form;
    
    
    
    
    
    @JsonProperty("sub_categories")
    private List<TicketSubCategory> subCategories;
    
    
    
    
    
    @JsonProperty("feedback_form")
    private TicketFeedbackForm feedbackForm;
    
    
    
    
}

/*
    Model: TicketSubCategory
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class TicketSubCategory {
    
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
}

/*
    Model: TicketFeedbackForm
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class TicketFeedbackForm {
    
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    
    @JsonProperty("display")
    private List<Object> display;
    
    
    
    
}

/*
    Model: TicketFeedbackList
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class TicketFeedbackList {
    
    
    
    
    
    @JsonProperty("items")
    private List<TicketFeedback> items;
    
    
    
    
}

/*
    Model: TicketFeedbackPayload
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class TicketFeedbackPayload {
    
    
    
    
    
    @JsonProperty("form_response")
    private Object formResponse;
    
    
    
    
}

/*
    Model: SubmitButton
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class SubmitButton {
    
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    
    @JsonProperty("title_color")
    private String titleColor;
    
    
    
    
    
    @JsonProperty("background_color")
    private String backgroundColor;
    
    
    
    
}

/*
    Model: PollForAssignment
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class PollForAssignment {
    
    
    
    
    
    @JsonProperty("duration")
    private Double duration;
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    
    @JsonProperty("success_message")
    private String successMessage;
    
    
    
    
    
    @JsonProperty("failure_message")
    private String failureMessage;
    
    
    
    
}

/*
    Model: CustomForm
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CustomForm {
    
    
    
    
    
    @JsonProperty("application_id")
    private String applicationId;
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    
    @JsonProperty("header_image")
    private String headerImage;
    
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    
    @JsonProperty("priority")
    private Priority priority;
    
    
    
    
    
    @JsonProperty("login_required")
    private Boolean loginRequired;
    
    
    
    
    
    @JsonProperty("should_notify")
    private Boolean shouldNotify;
    
    
    
    
    
    @JsonProperty("success_message")
    private String successMessage;
    
    
    
    
    
    @JsonProperty("submit_button")
    private SubmitButton submitButton;
    
    
    
    
    
    @JsonProperty("inputs")
    private List<Object> inputs;
    
    
    
    
    
    @JsonProperty("created_on")
    private CreatedOn createdOn;
    
    
    
    
    
    @JsonProperty("created_by")
    private Object createdBy;
    
    
    
    
    
    @JsonProperty("poll_for_assignment")
    private PollForAssignment pollForAssignment;
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
}

/*
    Model: FeedbackResponseItem
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class FeedbackResponseItem {
    
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
}

/*
    Model: TicketFeedback
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class TicketFeedback {
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("ticket_id")
    private String ticketId;
    
    
    
    
    
    @JsonProperty("company_id")
    private String companyId;
    
    
    
    
    
    @JsonProperty("response")
    private List<FeedbackResponseItem> response;
    
    
    
    
    
    @JsonProperty("category")
    private String category;
    
    
    
    
    
    @JsonProperty("user")
    private Object user;
    
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
}

/*
    Model: TicketHistory
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class TicketHistory {
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("value")
    private Object value;
    
    
    
    
    
    @JsonProperty("ticket_id")
    private String ticketId;
    
    
    
    
    
    @JsonProperty("created_on")
    private CreatedOn createdOn;
    
    
    
    
    
    @JsonProperty("created_by")
    private Object createdBy;
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
}

/*
    Model: Ticket
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Ticket {
    
    
    
    
    
    @JsonProperty("context")
    private TicketContext context;
    
    
    
    
    
    @JsonProperty("created_on")
    private CreatedOn createdOn;
    
    
    
    
    
    @JsonProperty("response_id")
    private String responseId;
    
    
    
    
    
    @JsonProperty("content")
    private TicketContent content;
    
    
    
    
    
    @JsonProperty("ticket_id")
    private String ticketId;
    
    
    
    
    
    @JsonProperty("category")
    private TicketCategory category;
    
    
    
    
    
    @JsonProperty("sub_category")
    private TicketSubCategory subCategory;
    
    
    
    
    
    @JsonProperty("source")
    private PlatformClient.TicketSourceEnum source;
    
    
    
    
    
    @JsonProperty("status")
    private Status status;
    
    
    
    
    
    @JsonProperty("priority")
    private Priority priority;
    
    
    
    
    
    @JsonProperty("created_by")
    private Object createdBy;
    
    
    
    
    
    @JsonProperty("assigned_to")
    private Object assignedTo;
    
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    
    @JsonProperty("is_feedback_pending")
    private Boolean isFeedbackPending;
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
}



/*
    Model: Activity
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Activity {
    
    
    
    
    
    @JsonProperty("current_state")
    private Object currentState;
    
    
    
    
    
    @JsonProperty("document_id")
    private String documentId;
    
    
    
    
    
    @JsonProperty("previous_state")
    private Object previousState;
    
    
    
    
}

/*
    Model: ActivityDump
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ActivityDump {
    
    
    
    
    
    @JsonProperty("activity")
    private Activity activity;
    
    
    
    
    
    @JsonProperty("created_by")
    private CreatedBy createdBy;
    
    
    
    
    
    @JsonProperty("date_meta")
    private DateMeta dateMeta;
    
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
}

/*
    Model: AddMediaListRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class AddMediaListRequest {
    
    
    
    
    
    @JsonProperty("entity_id")
    private String entityId;
    
    
    
    
    
    @JsonProperty("entity_type")
    private String entityType;
    
    
    
    
    
    @JsonProperty("media_list")
    private List<AddMediaRequest> mediaList;
    
    
    
    
    
    @JsonProperty("ref_id")
    private String refId;
    
    
    
    
    
    @JsonProperty("ref_type")
    private String refType;
    
    
    
    
}

/*
    Model: AddMediaRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class AddMediaRequest {
    
    
    
    
    
    @JsonProperty("cloud_id")
    private String cloudId;
    
    
    
    
    
    @JsonProperty("cloud_name")
    private String cloudName;
    
    
    
    
    
    @JsonProperty("cloud_provider")
    private String cloudProvider;
    
    
    
    
    
    @JsonProperty("entity_id")
    private String entityId;
    
    
    
    
    
    @JsonProperty("entity_type")
    private String entityType;
    
    
    
    
    
    @JsonProperty("media_url")
    private String mediaUrl;
    
    
    
    
    
    @JsonProperty("ref_id")
    private String refId;
    
    
    
    
    
    @JsonProperty("ref_type")
    private String refType;
    
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    
    @JsonProperty("thumbnail_url")
    private String thumbnailUrl;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
}

/*
    Model: ApproveRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ApproveRequest {
    
    
    
    
    
    @JsonProperty("approve")
    private Boolean approve;
    
    
    
    
    
    @JsonProperty("entity_type")
    private String entityType;
    
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    
    @JsonProperty("reason")
    private String reason;
    
    
    
    
}

/*
    Model: Attribute
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Attribute {
    
    
    
    
    
    @JsonProperty("date_meta")
    private DateMeta dateMeta;
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    
    @JsonProperty("tags")
    private List<TagMeta> tags;
    
    
    
    
}

/*
    Model: AttributeObject
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class AttributeObject {
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("value")
    private Double value;
    
    
    
    
}

/*
    Model: CreatedBy
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CreatedBy {
    
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("tags")
    private List<TagMeta> tags;
    
    
    
    
}

/*
    Model: CursorGetResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CursorGetResponse {
    
    
    
    
    
    @JsonProperty("items")
    private List<Object> items;
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: DateMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class DateMeta {
    
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
}

/*
    Model: DeviceMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class DeviceMeta {
    
    
    
    
    
    @JsonProperty("app_version")
    private String appVersion;
    
    
    
    
    
    @JsonProperty("platform")
    private String platform;
    
    
    
    
}

/*
    Model: Entity
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Entity {
    
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
}

/*
    Model: EntityRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class EntityRequest {
    
    
    
    
    
    @JsonProperty("entity_id")
    private String entityId;
    
    
    
    
    
    @JsonProperty("entity_type")
    private String entityType;
    
    
    
    
}

/*
    Model: FeedbackAttributes
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class FeedbackAttributes {
    
    
    
    
    
    @JsonProperty("items")
    private List<Attribute> items;
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: FeedbackError
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class FeedbackError {
    
    
    
    
    
    @JsonProperty("code")
    private Object code;
    
    
    
    
    
    @JsonProperty("exception")
    private String exception;
    
    
    
    
    
    @JsonProperty("info")
    private String info;
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    
    @JsonProperty("request_id")
    private String requestId;
    
    
    
    
    
    @JsonProperty("stack_trace")
    private String stackTrace;
    
    
    
    
    
    @JsonProperty("status")
    private Integer status;
    
    
    
    
}

/*
    Model: FeedbackState
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class FeedbackState {
    
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    
    @JsonProperty("archive")
    private Boolean archive;
    
    
    
    
    
    @JsonProperty("media")
    private String media;
    
    
    
    
    
    @JsonProperty("qna")
    private Boolean qna;
    
    
    
    
    
    @JsonProperty("rating")
    private Boolean rating;
    
    
    
    
    
    @JsonProperty("review")
    private Boolean review;
    
    
    
    
}

/*
    Model: GetResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class GetResponse {
    
    
    
    
    
    @JsonProperty("data")
    private Object data;
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: GetReviewResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class GetReviewResponse {
    
    
    
    
    
    @JsonProperty("facets")
    private List<ReviewFacet> facets;
    
    
    
    
    
    @JsonProperty("items")
    private List<Object> items;
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    
    @JsonProperty("sort")
    private List<SortMethod> sort;
    
    
    
    
}

/*
    Model: InsertResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class InsertResponse {
    
    
    
    
    
    @JsonProperty("count")
    private Integer count;
    
    
    
    
}

/*
    Model: MediaMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class MediaMeta {
    
    
    
    
    
    @JsonProperty("max_count")
    private Integer maxCount;
    
    
    
    
    
    @JsonProperty("size")
    private Integer size;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
}

/*
    Model: MediaMetaRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class MediaMetaRequest {
    
    
    
    
    
    @JsonProperty("max_count")
    private Integer maxCount;
    
    
    
    
    
    @JsonProperty("size")
    private Integer size;
    
    
    
    
}

/*
    Model: NumberGetResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class NumberGetResponse {
    
    
    
    
    
    @JsonProperty("items")
    private List<Object> items;
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: PageCursor
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class PageCursor {
    
    
    
    
    
    @JsonProperty("current")
    private Integer current;
    
    
    
    
    
    @JsonProperty("has_next")
    private Boolean hasNext;
    
    
    
    
    
    @JsonProperty("has_previous")
    private Boolean hasPrevious;
    
    
    
    
    
    @JsonProperty("item_total")
    private Integer itemTotal;
    
    
    
    
    
    @JsonProperty("next_id")
    private String nextId;
    
    
    
    
    
    @JsonProperty("size")
    private Integer size;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
}

/*
    Model: PageNumber
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class PageNumber {
    
    
    
    
    
    @JsonProperty("current")
    private Integer current;
    
    
    
    
    
    @JsonProperty("has_next")
    private Boolean hasNext;
    
    
    
    
    
    @JsonProperty("item_total")
    private Integer itemTotal;
    
    
    
    
    
    @JsonProperty("size")
    private Integer size;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
}

/*
    Model: Rating
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Rating {
    
    
    
    
    
    @JsonProperty("attributes")
    private List<Attribute> attributes;
    
    
    
    
    
    @JsonProperty("attributes_slugs")
    private List<String> attributesSlugs;
    
    
    
    
    
    @JsonProperty("ui")
    private UI ui;
    
    
    
    
}

/*
    Model: RatingRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class RatingRequest {
    
    
    
    
    
    @JsonProperty("attributes")
    private List<String> attributes;
    
    
    
    
    
    @JsonProperty("ui")
    private UI ui;
    
    
    
    
}

/*
    Model: ReportAbuseRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ReportAbuseRequest {
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    
    @JsonProperty("entity_id")
    private String entityId;
    
    
    
    
    
    @JsonProperty("entity_type")
    private String entityType;
    
    
    
    
}

/*
    Model: Review
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Review {
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    
    @JsonProperty("header")
    private String header;
    
    
    
    
    
    @JsonProperty("image_meta")
    private MediaMeta imageMeta;
    
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    
    @JsonProperty("video_meta")
    private MediaMeta videoMeta;
    
    
    
    
    
    @JsonProperty("vote_allowed")
    private Boolean voteAllowed;
    
    
    
    
}

/*
    Model: ReviewFacet
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ReviewFacet {
    
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("selected")
    private Boolean selected;
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
}

/*
    Model: ReviewRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ReviewRequest {
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    
    @JsonProperty("header")
    private String header;
    
    
    
    
    
    @JsonProperty("image_meta")
    private MediaMetaRequest imageMeta;
    
    
    
    
    
    @JsonProperty("is_vote_allowed")
    private Boolean isVoteAllowed;
    
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    
    @JsonProperty("video_meta")
    private MediaMetaRequest videoMeta;
    
    
    
    
}

/*
    Model: SaveAttributeRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class SaveAttributeRequest {
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
}

/*
    Model: SortMethod
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class SortMethod {
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("selected")
    private Boolean selected;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
}

/*
    Model: TagMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class TagMeta {
    
    
    
    
    
    @JsonProperty("media")
    private List<MediaMeta> media;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
}

/*
    Model: Template
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Template {
    
    
    
    
    
    @JsonProperty("date_meta")
    private DateMeta dateMeta;
    
    
    
    
    
    @JsonProperty("entity")
    private Entity entity;
    
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("rating")
    private Rating rating;
    
    
    
    
    
    @JsonProperty("review")
    private Review review;
    
    
    
    
    
    @JsonProperty("state")
    private FeedbackState state;
    
    
    
    
    
    @JsonProperty("tags")
    private List<TagMeta> tags;
    
    
    
    
}

/*
    Model: TemplateGetResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class TemplateGetResponse {
    
    
    
    
    
    @JsonProperty("items")
    private List<Template> items;
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: TemplateRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class TemplateRequest {
    
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    
    @JsonProperty("enable_media_type")
    private String enableMediaType;
    
    
    
    
    
    @JsonProperty("enable_qna")
    private Boolean enableQna;
    
    
    
    
    
    @JsonProperty("enable_rating")
    private Boolean enableRating;
    
    
    
    
    
    @JsonProperty("enable_review")
    private Boolean enableReview;
    
    
    
    
    
    @JsonProperty("entity")
    private EntityRequest entity;
    
    
    
    
    
    @JsonProperty("rating")
    private RatingRequest rating;
    
    
    
    
    
    @JsonProperty("review")
    private ReviewRequest review;
    
    
    
    
}

/*
    Model: TemplateRequestList
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class TemplateRequestList {
    
    
    
    
    
    @JsonProperty("template_list")
    private List<TemplateRequest> templateList;
    
    
    
    
}

/*
    Model: UI
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class UI {
    
    
    
    
    
    @JsonProperty("feedback_question")
    private List<String> feedbackQuestion;
    
    
    
    
    
    @JsonProperty("icon")
    private UIIcon icon;
    
    
    
    
    
    @JsonProperty("text")
    private List<String> text;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
}

/*
    Model: UIIcon
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class UIIcon {
    
    
    
    
    
    @JsonProperty("active")
    private String active;
    
    
    
    
    
    @JsonProperty("inactive")
    private String inactive;
    
    
    
    
    
    @JsonProperty("selected")
    private List<String> selected;
    
    
    
    
}

/*
    Model: UpdateAttributeRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class UpdateAttributeRequest {
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
}

/*
    Model: UpdateResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class UpdateResponse {
    
    
    
    
    
    @JsonProperty("count")
    private Integer count;
    
    
    
    
}

/*
    Model: UpdateReviewRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class UpdateReviewRequest {
    
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    
    @JsonProperty("approve")
    private Boolean approve;
    
    
    
    
    
    @JsonProperty("archive")
    private Boolean archive;
    
    
    
    
    
    @JsonProperty("attributes_rating")
    private List<AttributeObject> attributesRating;
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    
    @JsonProperty("device_meta")
    private DeviceMeta deviceMeta;
    
    
    
    
    
    @JsonProperty("entity_id")
    private String entityId;
    
    
    
    
    
    @JsonProperty("entity_type")
    private String entityType;
    
    
    
    
    
    @JsonProperty("media_resource")
    private List<MediaMeta> mediaResource;
    
    
    
    
    
    @JsonProperty("rating")
    private Double rating;
    
    
    
    
    
    @JsonProperty("review_id")
    private String reviewId;
    
    
    
    
    
    @JsonProperty("template_id")
    private String templateId;
    
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
}

/*
    Model: UpdateTemplateRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class UpdateTemplateRequest {
    
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    
    @JsonProperty("enable_media_type")
    private String enableMediaType;
    
    
    
    
    
    @JsonProperty("enable_qna")
    private Boolean enableQna;
    
    
    
    
    
    @JsonProperty("enable_rating")
    private Boolean enableRating;
    
    
    
    
    
    @JsonProperty("enable_review")
    private Boolean enableReview;
    
    
    
    
    
    @JsonProperty("entity")
    private EntityRequest entity;
    
    
    
    
    
    @JsonProperty("rating")
    private RatingRequest rating;
    
    
    
    
    
    @JsonProperty("review")
    private ReviewRequest review;
    
    
    
    
}

/*
    Model: UpdateTemplateStatusRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class UpdateTemplateStatusRequest {
    
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    
    @JsonProperty("archive")
    private Boolean archive;
    
    
    
    
}



/*
    Model: AvailablePageSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class AvailablePageSchema {
    
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
    
    @JsonProperty("text")
    private String text;
    
    
    
    
    
    @JsonProperty("path")
    private String path;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("sections")
    private List<AvailablePageSchemaSections> sections;
    
    
    
    
    
    @JsonProperty("sections_meta")
    private List<AvailablePageSectionMetaAttributes> sectionsMeta;
    
    
    
    
    
    @JsonProperty("theme")
    private String theme;
    
    
    
    
    
    @JsonProperty("seo")
    private AvailablePageSeo seo;
    
    
    
    
    
    @JsonProperty("props")
    private List<Object> props;
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
}

/*
    Model: AvailablePageSectionMetaAttributes
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class AvailablePageSectionMetaAttributes {
    
    
    
    
    
    @JsonProperty("attributes")
    private Object attributes;
    
    
    
    
}

/*
    Model: AvailablePageSeo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class AvailablePageSeo {
    
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
}

/*
    Model: AvailablePageSchemaSections
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class AvailablePageSchemaSections {
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("label")
    private String label;
    
    
    
    
    
    @JsonProperty("props")
    private Object props;
    
    
    
    
    
    @JsonProperty("blocks")
    private List<Object> blocks;
    
    
    
    
    
    @JsonProperty("preset")
    private Object preset;
    
    
    
    
    
    @JsonProperty("predicate")
    private AvailablePagePredicate predicate;
    
    
    
    
}

/*
    Model: AvailablePageScreenPredicate
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class AvailablePageScreenPredicate {
    
    
    
    
    
    @JsonProperty("mobile")
    private Boolean mobile;
    
    
    
    
    
    @JsonProperty("desktop")
    private Boolean desktop;
    
    
    
    
    
    @JsonProperty("tablet")
    private Boolean tablet;
    
    
    
    
}

/*
    Model: AvailablePageUserPredicate
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class AvailablePageUserPredicate {
    
    
    
    
    
    @JsonProperty("authenticated")
    private Boolean authenticated;
    
    
    
    
    
    @JsonProperty("anonymous")
    private Boolean anonymous;
    
    
    
    
}

/*
    Model: AvailablePageRoutePredicate
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class AvailablePageRoutePredicate {
    
    
    
    
    
    @JsonProperty("selected")
    private String selected;
    
    
    
    
    
    @JsonProperty("exact_url")
    private String exactUrl;
    
    
    
    
    
    @JsonProperty("query")
    private Object query;
    
    
    
    
}

/*
    Model: AvailablePagePredicate
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class AvailablePagePredicate {
    
    
    
    
    
    @JsonProperty("screen")
    private AvailablePageScreenPredicate screen;
    
    
    
    
    
    @JsonProperty("user")
    private AvailablePageUserPredicate user;
    
    
    
    
    
    @JsonProperty("route")
    private AvailablePageRoutePredicate route;
    
    
    
    
}

/*
    Model: AllAvailablePageSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class AllAvailablePageSchema {
    
    
    
    
    
    @JsonProperty("pages")
    private List<AvailablePageSchema> pages;
    
    
    
    
}

/*
    Model: PaginationSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class PaginationSchema {
    
    
    
    
    
    @JsonProperty("size")
    private Integer size;
    
    
    
    
    
    @JsonProperty("item_total")
    private Integer itemTotal;
    
    
    
    
    
    @JsonProperty("has_next")
    private Boolean hasNext;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("current")
    private Integer current;
    
    
    
    
}

/*
    Model: ThemesListingResponseSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ThemesListingResponseSchema {
    
    
    
    
    
    @JsonProperty("items")
    private List<ThemesSchema> items;
    
    
    
    
    
    @JsonProperty("page")
    private PaginationSchema page;
    
    
    
    
}

/*
    Model: AddThemeRequestSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class AddThemeRequestSchema {
    
    
    
    
    
    @JsonProperty("theme_id")
    private String themeId;
    
    
    
    
}

/*
    Model: UpgradableThemeSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class UpgradableThemeSchema {
    
    
    
    
    
    @JsonProperty("parent_theme")
    private String parentTheme;
    
    
    
    
    
    @JsonProperty("applied_theme")
    private String appliedTheme;
    
    
    
    
    
    @JsonProperty("upgrade")
    private Boolean upgrade;
    
    
    
    
}

/*
    Model: FontsSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class FontsSchema {
    
    
    
    
    
    @JsonProperty("items")
    private FontsSchemaItems items;
    
    
    
    
    
    @JsonProperty("kind")
    private String kind;
    
    
    
    
}

/*
    Model: BlitzkriegApiErrorSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class BlitzkriegApiErrorSchema {
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
}

/*
    Model: BlitzkriegNotFoundSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class BlitzkriegNotFoundSchema {
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
}

/*
    Model: BlitzkriegInternalServerErrorSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class BlitzkriegInternalServerErrorSchema {
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
}

/*
    Model: FontsSchemaItems
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class FontsSchemaItems {
    
    
    
    
    
    @JsonProperty("family")
    private String family;
    
    
    
    
    
    @JsonProperty("variants")
    private List<String> variants;
    
    
    
    
    
    @JsonProperty("subsets")
    private List<String> subsets;
    
    
    
    
    
    @JsonProperty("version")
    private String version;
    
    
    
    
    
    @JsonProperty("last_modified")
    private String lastModified;
    
    
    
    
    
    @JsonProperty("files")
    private FontsSchemaItemsFiles files;
    
    
    
    
    
    @JsonProperty("category")
    private String category;
    
    
    
    
    
    @JsonProperty("kind")
    private String kind;
    
    
    
    
}

/*
    Model: FontsSchemaItemsFiles
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class FontsSchemaItemsFiles {
    
    
    
    
    
    @JsonProperty("regular")
    private String regular;
    
    
    
    
    
    @JsonProperty("italic")
    private String italic;
    
    
    
    
    
    @JsonProperty("bold")
    private String bold;
    
    
    
    
}

/*
    Model: ThemesSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ThemesSchema {
    
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    
    @JsonProperty("applied")
    private Boolean applied;
    
    
    
    
    
    @JsonProperty("customized")
    private Boolean customized;
    
    
    
    
    
    @JsonProperty("published")
    private Boolean published;
    
    
    
    
    
    @JsonProperty("archived")
    private Boolean archived;
    
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    
    @JsonProperty("version")
    private String version;
    
    
    
    
    
    @JsonProperty("parent_theme_version")
    private String parentThemeVersion;
    
    
    
    
    
    @JsonProperty("parent_theme")
    private String parentTheme;
    
    
    
    
    
    @JsonProperty("information")
    private Information information;
    
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    
    @JsonProperty("src")
    private Src src;
    
    
    
    
    
    @JsonProperty("assets")
    private AssetsSchema assets;
    
    
    
    
    
    @JsonProperty("available_sections")
    private List<availableSectionSchema> availableSections;
    
    
    
    
    
    @JsonProperty("constants")
    private Object constants;
    
    
    
    
    
    @JsonProperty("styles")
    private Object styles;
    
    
    
    
    
    @JsonProperty("config")
    private Config config;
    
    
    
    
    
    @JsonProperty("settings")
    private Object settings;
    
    
    
    
    
    @JsonProperty("font")
    private Font font;
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("__v")
    private Integer v;
    
    
    
    
    
    @JsonProperty("colors")
    private Colors colors;
    
    
    
    
}

/*
    Model: availableSectionSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class availableSectionSchema {
    
    
    
    
    
    @JsonProperty("blocks")
    private List<Blocks> blocks;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("label")
    private String label;
    
    
    
    
    
    @JsonProperty("props")
    private List<BlocksProps> props;
    
    
    
    
}

/*
    Model: Information
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Information {
    
    
    
    
    
    @JsonProperty("images")
    private Images images;
    
    
    
    
    
    @JsonProperty("features")
    private List<String> features;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
}

/*
    Model: Images
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Images {
    
    
    
    
    
    @JsonProperty("desktop")
    private List<String> desktop;
    
    
    
    
    
    @JsonProperty("android")
    private List<String> android;
    
    
    
    
    
    @JsonProperty("ios")
    private List<String> ios;
    
    
    
    
    
    @JsonProperty("thumbnail")
    private List<String> thumbnail;
    
    
    
    
}

/*
    Model: Src
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Src {
    
    
    
    
    
    @JsonProperty("link")
    private String link;
    
    
    
    
}

/*
    Model: AssetsSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class AssetsSchema {
    
    
    
    
    
    @JsonProperty("umd_js")
    private UmdJs umdJs;
    
    
    
    
    
    @JsonProperty("common_js")
    private CommonJs commonJs;
    
    
    
    
    
    @JsonProperty("css")
    private Css css;
    
    
    
    
}

/*
    Model: UmdJs
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class UmdJs {
    
    
    
    
    
    @JsonProperty("link")
    private String link;
    
    
    
    
}

/*
    Model: CommonJs
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CommonJs {
    
    
    
    
    
    @JsonProperty("link")
    private String link;
    
    
    
    
}

/*
    Model: Css
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Css {
    
    
    
    
    
    @JsonProperty("link")
    private String link;
    
    
    
    
}

/*
    Model: Sections
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Sections {
    
    
    
    
    
    @JsonProperty("attributes")
    private String attributes;
    
    
    
    
}

/*
    Model: Config
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Config {
    
    
    
    
    
    @JsonProperty("preset")
    private Preset preset;
    
    
    
    
    
    @JsonProperty("global_schema")
    private GlobalSchema globalSchema;
    
    
    
    
    
    @JsonProperty("current")
    private String current;
    
    
    
    
    
    @JsonProperty("list")
    private List<ListSchemaItem> list;
    
    
    
    
}

/*
    Model: Preset
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Preset {
    
    
    
    
    
    @JsonProperty("pages")
    private List<AvailablePageSchema> pages;
    
    
    
    
}

/*
    Model: GlobalSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class GlobalSchema {
    
    
    
    
    
    @JsonProperty("props")
    private List<GlobalSchemaProps> props;
    
    
    
    
}

/*
    Model: ListSchemaItem
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ListSchemaItem {
    
    
    
    
    
    @JsonProperty("global_config")
    private Object globalConfig;
    
    
    
    
    
    @JsonProperty("page")
    private List<ConfigPage> page;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
}

/*
    Model: Colors
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Colors {
    
    
    
    
    
    @JsonProperty("bg_color")
    private String bgColor;
    
    
    
    
    
    @JsonProperty("primary_color")
    private String primaryColor;
    
    
    
    
    
    @JsonProperty("secondary_color")
    private String secondaryColor;
    
    
    
    
    
    @JsonProperty("accent_color")
    private String accentColor;
    
    
    
    
    
    @JsonProperty("link_color")
    private String linkColor;
    
    
    
    
    
    @JsonProperty("button_secondary_color")
    private String buttonSecondaryColor;
    
    
    
    
}

/*
    Model: Custom
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Custom {
    
    
    
    
    
    @JsonProperty("props")
    private Object props;
    
    
    
    
}

/*
    Model: ConfigPage
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ConfigPage {
    
    
    
    
    
    @JsonProperty("settings")
    private Object settings;
    
    
    
    
    
    @JsonProperty("page")
    private String page;
    
    
    
    
}

/*
    Model: Font
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Font {
    
    
    
    
    
    @JsonProperty("family")
    private String family;
    
    
    
    
    
    @JsonProperty("variants")
    private Variants variants;
    
    
    
    
}

/*
    Model: Variants
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Variants {
    
    
    
    
    
    @JsonProperty("medium")
    private Medium medium;
    
    
    
    
    
    @JsonProperty("semi_bold")
    private SemiBold semiBold;
    
    
    
    
    
    @JsonProperty("bold")
    private Bold bold;
    
    
    
    
    
    @JsonProperty("light")
    private Light light;
    
    
    
    
    
    @JsonProperty("regular")
    private Regular regular;
    
    
    
    
}

/*
    Model: Medium
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Medium {
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("file")
    private String file;
    
    
    
    
}

/*
    Model: SemiBold
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class SemiBold {
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("file")
    private String file;
    
    
    
    
}

/*
    Model: Bold
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Bold {
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("file")
    private String file;
    
    
    
    
}

/*
    Model: Light
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Light {
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("file")
    private String file;
    
    
    
    
}

/*
    Model: Regular
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Regular {
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("file")
    private String file;
    
    
    
    
}

/*
    Model: Blocks
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Blocks {
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("props")
    private List<BlocksProps> props;
    
    
    
    
}

/*
    Model: GlobalSchemaProps
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class GlobalSchemaProps {
    
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    
    @JsonProperty("label")
    private String label;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("category")
    private String category;
    
    
    
    
}

/*
    Model: BlocksProps
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class BlocksProps {
    
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    
    @JsonProperty("label")
    private String label;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
}



/*
    Model: EditEmailRequestSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class EditEmailRequestSchema {
    
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
}

/*
    Model: SendVerificationLinkMobileRequestSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class SendVerificationLinkMobileRequestSchema {
    
    
    
    
    
    @JsonProperty("verified")
    private Boolean verified;
    
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    
    @JsonProperty("phone")
    private String phone;
    
    
    
    
    
    @JsonProperty("primary")
    private Boolean primary;
    
    
    
    
}

/*
    Model: EditMobileRequestSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class EditMobileRequestSchema {
    
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    
    @JsonProperty("phone")
    private String phone;
    
    
    
    
}

/*
    Model: EditProfileRequestSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class EditProfileRequestSchema {
    
    
    
    
    
    @JsonProperty("first_name")
    private String firstName;
    
    
    
    
    
    @JsonProperty("last_name")
    private String lastName;
    
    
    
    
    
    @JsonProperty("mobile")
    private EditProfileMobileSchema mobile;
    
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    
    @JsonProperty("gender")
    private String gender;
    
    
    
    
    
    @JsonProperty("dob")
    private String dob;
    
    
    
    
    
    @JsonProperty("profile_pic_url")
    private String profilePicUrl;
    
    
    
    
    
    @JsonProperty("android_hash")
    private String androidHash;
    
    
    
    
    
    @JsonProperty("sender")
    private String sender;
    
    
    
    
    
    @JsonProperty("register_token")
    private String registerToken;
    
    
    
    
}

/*
    Model: EditProfileMobileSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class EditProfileMobileSchema {
    
    
    
    
    
    @JsonProperty("phone")
    private String phone;
    
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
}

/*
    Model: SendEmailOtpRequestSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class SendEmailOtpRequestSchema {
    
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    
    @JsonProperty("action")
    private String action;
    
    
    
    
    
    @JsonProperty("token")
    private String token;
    
    
    
    
    
    @JsonProperty("register_token")
    private String registerToken;
    
    
    
    
}

/*
    Model: VerifyEmailOtpRequestSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class VerifyEmailOtpRequestSchema {
    
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    
    @JsonProperty("action")
    private String action;
    
    
    
    
    
    @JsonProperty("register_token")
    private String registerToken;
    
    
    
    
    
    @JsonProperty("otp")
    private String otp;
    
    
    
    
}

/*
    Model: VerifyOtpRequestSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class VerifyOtpRequestSchema {
    
    
    
    
    
    @JsonProperty("request_id")
    private String requestId;
    
    
    
    
    
    @JsonProperty("register_token")
    private String registerToken;
    
    
    
    
    
    @JsonProperty("otp")
    private String otp;
    
    
    
    
}

/*
    Model: SendMobileOtpRequestSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class SendMobileOtpRequestSchema {
    
    
    
    
    
    @JsonProperty("mobile")
    private String mobile;
    
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    
    @JsonProperty("action")
    private String action;
    
    
    
    
    
    @JsonProperty("token")
    private String token;
    
    
    
    
    
    @JsonProperty("android_hash")
    private String androidHash;
    
    
    
    
    
    @JsonProperty("force")
    private String force;
    
    
    
    
    
    @JsonProperty("captcha_code")
    private String captchaCode;
    
    
    
    
}

/*
    Model: UpdatePasswordRequestSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class UpdatePasswordRequestSchema {
    
    
    
    
    
    @JsonProperty("old_password")
    private String oldPassword;
    
    
    
    
    
    @JsonProperty("new_password")
    private String newPassword;
    
    
    
    
}

/*
    Model: FormRegisterRequestSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class FormRegisterRequestSchema {
    
    
    
    
    
    @JsonProperty("first_name")
    private String firstName;
    
    
    
    
    
    @JsonProperty("last_name")
    private String lastName;
    
    
    
    
    
    @JsonProperty("gender")
    private String gender;
    
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    
    @JsonProperty("password")
    private String password;
    
    
    
    
    
    @JsonProperty("phone")
    private FormRegisterRequestSchemaPhone phone;
    
    
    
    
    
    @JsonProperty("register_token")
    private String registerToken;
    
    
    
    
}

/*
    Model: TokenRequestBodySchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class TokenRequestBodySchema {
    
    
    
    
    
    @JsonProperty("token")
    private String token;
    
    
    
    
}

/*
    Model: ForgotPasswordRequestSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ForgotPasswordRequestSchema {
    
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    
    @JsonProperty("password")
    private String password;
    
    
    
    
}

/*
    Model: CodeRequestBodySchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CodeRequestBodySchema {
    
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
}

/*
    Model: SendResetPasswordEmailRequestSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class SendResetPasswordEmailRequestSchema {
    
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    
    @JsonProperty("captcha_code")
    private String captchaCode;
    
    
    
    
}

/*
    Model: PasswordLoginRequestSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class PasswordLoginRequestSchema {
    
    
    
    
    
    @JsonProperty("captcha_code")
    private String captchaCode;
    
    
    
    
    
    @JsonProperty("password")
    private String password;
    
    
    
    
    
    @JsonProperty("username")
    private String username;
    
    
    
    
}

/*
    Model: SendOtpRequestSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class SendOtpRequestSchema {
    
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    
    @JsonProperty("captcha_code")
    private String captchaCode;
    
    
    
    
    
    @JsonProperty("mobile")
    private String mobile;
    
    
    
    
}

/*
    Model: OAuthRequestSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class OAuthRequestSchema {
    
    
    
    
    
    @JsonProperty("is_signed_in")
    private Boolean isSignedIn;
    
    
    
    
    
    @JsonProperty("oauth2")
    private OAuthRequestSchemaOauth2 oauth2;
    
    
    
    
    
    @JsonProperty("profile")
    private OAuthRequestSchemaProfile profile;
    
    
    
    
}

/*
    Model: OAuthRequestAppleSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class OAuthRequestAppleSchema {
    
    
    
    
    
    @JsonProperty("user_identifier")
    private String userIdentifier;
    
    
    
    
    
    @JsonProperty("oauth")
    private OAuthRequestAppleSchemaOauth oauth;
    
    
    
    
    
    @JsonProperty("profile")
    private OAuthRequestAppleSchemaProfile profile;
    
    
    
    
}

/*
    Model: UserObjectSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class UserObjectSchema {
    
    
    
    
    
    @JsonProperty("user")
    private UserSchema user;
    
    
    
    
}

/*
    Model: AuthSuccess
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class AuthSuccess {
    
    
    
    
    
    @JsonProperty("register_token")
    private String registerToken;
    
    
    
    
    
    @JsonProperty("user_exists")
    private Boolean userExists;
    
    
    
    
    
    @JsonProperty("user")
    private UserSchema user;
    
    
    
    
}

/*
    Model: SendOtpResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class SendOtpResponse {
    
    
    
    
    
    @JsonProperty("resend_timer")
    private Integer resendTimer;
    
    
    
    
    
    @JsonProperty("resend_token")
    private String resendToken;
    
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    
    @JsonProperty("request_id")
    private String requestId;
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    
    @JsonProperty("mobile")
    private String mobile;
    
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    
    @JsonProperty("resend_email_token")
    private String resendEmailToken;
    
    
    
    
    
    @JsonProperty("register_token")
    private String registerToken;
    
    
    
    
    
    @JsonProperty("verify_email_otp")
    private Boolean verifyEmailOtp;
    
    
    
    
    
    @JsonProperty("verify_mobile_otp")
    private Boolean verifyMobileOtp;
    
    
    
    
    
    @JsonProperty("user_exists")
    private Boolean userExists;
    
    
    
    
}

/*
    Model: ProfileEditSuccess
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ProfileEditSuccess {
    
    
    
    
    
    @JsonProperty("user")
    private UserSchema user;
    
    
    
    
    
    @JsonProperty("register_token")
    private String registerToken;
    
    
    
    
    
    @JsonProperty("user_exists")
    private Boolean userExists;
    
    
    
    
    
    @JsonProperty("verify_email_link")
    private Boolean verifyEmailLink;
    
    
    
    
    
    @JsonProperty("verify_email_otp")
    private Boolean verifyEmailOtp;
    
    
    
    
    
    @JsonProperty("verify_mobile_otp")
    private Boolean verifyMobileOtp;
    
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    
    @JsonProperty("request_id")
    private String requestId;
    
    
    
    
}

/*
    Model: LoginSuccess
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class LoginSuccess {
    
    
    
    
    
    @JsonProperty("user")
    private UserSchema user;
    
    
    
    
    
    @JsonProperty("request_id")
    private String requestId;
    
    
    
    
    
    @JsonProperty("register_token")
    private String registerToken;
    
    
    
    
}

/*
    Model: VerifyOtpSuccess
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class VerifyOtpSuccess {
    
    
    
    
    
    @JsonProperty("user")
    private UserSchema user;
    
    
    
    
    
    @JsonProperty("user_exists")
    private Boolean userExists;
    
    
    
    
    
    @JsonProperty("register_token")
    private String registerToken;
    
    
    
    
}

/*
    Model: ResetPasswordSuccess
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ResetPasswordSuccess {
    
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
}

/*
    Model: RegisterFormSuccess
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class RegisterFormSuccess {
    
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    
    @JsonProperty("resend_timer")
    private Integer resendTimer;
    
    
    
    
    
    @JsonProperty("resend_token")
    private String resendToken;
    
    
    
    
    
    @JsonProperty("resend_email_token")
    private String resendEmailToken;
    
    
    
    
    
    @JsonProperty("register_token")
    private String registerToken;
    
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    
    @JsonProperty("request_id")
    private String requestId;
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    
    @JsonProperty("mobile")
    private String mobile;
    
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    
    @JsonProperty("verify_email_otp")
    private Boolean verifyEmailOtp;
    
    
    
    
    
    @JsonProperty("verify_mobile_otp")
    private Boolean verifyMobileOtp;
    
    
    
    
    
    @JsonProperty("user_exists")
    private Boolean userExists;
    
    
    
    
}

/*
    Model: VerifyEmailSuccess
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class VerifyEmailSuccess {
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
}

/*
    Model: HasPasswordSuccess
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class HasPasswordSuccess {
    
    
    
    
    
    @JsonProperty("result")
    private Boolean result;
    
    
    
    
}

/*
    Model: LogoutSuccess
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class LogoutSuccess {
    
    
    
    
    
    @JsonProperty("logout")
    private Boolean logout;
    
    
    
    
}

/*
    Model: OtpSuccess
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class OtpSuccess {
    
    
    
    
    
    @JsonProperty("resend_timer")
    private Integer resendTimer;
    
    
    
    
    
    @JsonProperty("resend_token")
    private String resendToken;
    
    
    
    
    
    @JsonProperty("register_token")
    private String registerToken;
    
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    
    @JsonProperty("request_id")
    private String requestId;
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    
    @JsonProperty("mobile")
    private String mobile;
    
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
}

/*
    Model: EmailOtpSuccess
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class EmailOtpSuccess {
    
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
}

/*
    Model: SessionListSuccess
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class SessionListSuccess {
    
    
    
    
    
    @JsonProperty("sessions")
    private List<String> sessions;
    
    
    
    
}

/*
    Model: VerifyMobileOTPSuccess
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class VerifyMobileOTPSuccess {
    
    
    
    
    
    @JsonProperty("user")
    private UserSchema user;
    
    
    
    
    
    @JsonProperty("verify_mobile_link")
    private Boolean verifyMobileLink;
    
    
    
    
}

/*
    Model: VerifyEmailOTPSuccess
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class VerifyEmailOTPSuccess {
    
    
    
    
    
    @JsonProperty("user")
    private UserSchema user;
    
    
    
    
    
    @JsonProperty("verify_email_link")
    private Boolean verifyEmailLink;
    
    
    
    
}

/*
    Model: SendMobileVerifyLinkSuccess
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class SendMobileVerifyLinkSuccess {
    
    
    
    
    
    @JsonProperty("verify_mobile_link")
    private Boolean verifyMobileLink;
    
    
    
    
}

/*
    Model: SendEmailVerifyLinkSuccess
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class SendEmailVerifyLinkSuccess {
    
    
    
    
    
    @JsonProperty("verify_email_link")
    private Boolean verifyEmailLink;
    
    
    
    
}

/*
    Model: UserSearchResponseSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class UserSearchResponseSchema {
    
    
    
    
    
    @JsonProperty("users")
    private List<UserSchema> users;
    
    
    
    
}

/*
    Model: CustomerListResponseSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CustomerListResponseSchema {
    
    
    
    
    
    @JsonProperty("items")
    private List<UserSchema> items;
    
    
    
    
    
    @JsonProperty("page")
    private PaginationSchema page;
    
    
    
    
}

/*
    Model: UnauthorizedSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class UnauthorizedSchema {
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
}

/*
    Model: UnauthenticatedSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class UnauthenticatedSchema {
    
    
    
    
    
    @JsonProperty("authenticated")
    private Boolean authenticated;
    
    
    
    
}

/*
    Model: NotFoundSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class NotFoundSchema {
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
}

/*
    Model: AuthenticationInternalServerErrorSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class AuthenticationInternalServerErrorSchema {
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
}

/*
    Model: AuthenticationApiErrorSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class AuthenticationApiErrorSchema {
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
}

/*
    Model: ProfileEditSuccessSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ProfileEditSuccessSchema {
    
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    
    @JsonProperty("verify_email_otp")
    private Boolean verifyEmailOtp;
    
    
    
    
    
    @JsonProperty("verify_email_link")
    private Boolean verifyEmailLink;
    
    
    
    
    
    @JsonProperty("verify_mobile_otp")
    private Boolean verifyMobileOtp;
    
    
    
    
    
    @JsonProperty("user")
    private String user;
    
    
    
    
    
    @JsonProperty("register_token")
    private String registerToken;
    
    
    
    
    
    @JsonProperty("user_exists")
    private Boolean userExists;
    
    
    
    
}

/*
    Model: FormRegisterRequestSchemaPhone
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class FormRegisterRequestSchemaPhone {
    
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    
    @JsonProperty("mobile")
    private String mobile;
    
    
    
    
}

/*
    Model: OAuthRequestSchemaOauth2
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class OAuthRequestSchemaOauth2 {
    
    
    
    
    
    @JsonProperty("access_token")
    private String accessToken;
    
    
    
    
    
    @JsonProperty("expiry")
    private Integer expiry;
    
    
    
    
    
    @JsonProperty("refresh_token")
    private String refreshToken;
    
    
    
    
}

/*
    Model: OAuthRequestSchemaProfile
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class OAuthRequestSchemaProfile {
    
    
    
    
    
    @JsonProperty("last_name")
    private String lastName;
    
    
    
    
    
    @JsonProperty("image")
    private String image;
    
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    
    @JsonProperty("full_name")
    private String fullName;
    
    
    
    
    
    @JsonProperty("first_name")
    private String firstName;
    
    
    
    
}

/*
    Model: OAuthRequestAppleSchemaOauth
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class OAuthRequestAppleSchemaOauth {
    
    
    
    
    
    @JsonProperty("identity_token")
    private String identityToken;
    
    
    
    
}

/*
    Model: OAuthRequestAppleSchemaProfile
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class OAuthRequestAppleSchemaProfile {
    
    
    
    
    
    @JsonProperty("last_name")
    private String lastName;
    
    
    
    
    
    @JsonProperty("full_name")
    private String fullName;
    
    
    
    
    
    @JsonProperty("first_name")
    private String firstName;
    
    
    
    
}

/*
    Model: AuthSuccessUser
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class AuthSuccessUser {
    
    
    
    
    
    @JsonProperty("first_name")
    private String firstName;
    
    
    
    
    
    @JsonProperty("last_name")
    private String lastName;
    
    
    
    
    
    @JsonProperty("debug")
    private AuthSuccessUserDebug debug;
    
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    
    @JsonProperty("emails")
    private AuthSuccessUserEmails emails;
    
    
    
    
}

/*
    Model: AuthSuccessUserDebug
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class AuthSuccessUserDebug {
    
    
    
    
    
    @JsonProperty("platform")
    private String platform;
    
    
    
    
}

/*
    Model: AuthSuccessUserEmails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class AuthSuccessUserEmails {
    
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    
    @JsonProperty("verified")
    private Boolean verified;
    
    
    
    
    
    @JsonProperty("primary")
    private Boolean primary;
    
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
}

/*
    Model: CreateUserRequestSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CreateUserRequestSchema {
    
    
    
    
    
    @JsonProperty("phone_number")
    private String phoneNumber;
    
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    
    @JsonProperty("first_name")
    private String firstName;
    
    
    
    
    
    @JsonProperty("last_name")
    private String lastName;
    
    
    
    
    
    @JsonProperty("gender")
    private String gender;
    
    
    
    
    
    @JsonProperty("username")
    private String username;
    
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
}

/*
    Model: CreateUserResponseSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CreateUserResponseSchema {
    
    
    
    
    
    @JsonProperty("user")
    private UserSchema user;
    
    
    
    
}

/*
    Model: CreateUserSessionRequestSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CreateUserSessionRequestSchema {
    
    
    
    
    
    @JsonProperty("domain")
    private String domain;
    
    
    
    
    
    @JsonProperty("max_age")
    private Double maxAge;
    
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
}

/*
    Model: CreateUserSessionResponseSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CreateUserSessionResponseSchema {
    
    
    
    
    
    @JsonProperty("domain")
    private String domain;
    
    
    
    
    
    @JsonProperty("max_age")
    private Double maxAge;
    
    
    
    
    
    @JsonProperty("secure")
    private Boolean secure;
    
    
    
    
    
    @JsonProperty("http_only")
    private Boolean httpOnly;
    
    
    
    
    
    @JsonProperty("cookie")
    private Object cookie;
    
    
    
    
}

/*
    Model: PlatformSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class PlatformSchema {
    
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    
    @JsonProperty("look_and_feel")
    private LookAndFeel lookAndFeel;
    
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    
    @JsonProperty("forgot_password")
    private Boolean forgotPassword;
    
    
    
    
    
    @JsonProperty("login")
    private Login login;
    
    
    
    
    
    @JsonProperty("skip_captcha")
    private Boolean skipCaptcha;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("meta")
    private MetaSchema meta;
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("social")
    private Social social;
    
    
    
    
    
    @JsonProperty("required_fields")
    private RequiredFields requiredFields;
    
    
    
    
    
    @JsonProperty("register_required_fields")
    private RegisterRequiredFields registerRequiredFields;
    
    
    
    
    
    @JsonProperty("skip_login")
    private Boolean skipLogin;
    
    
    
    
    
    @JsonProperty("flash_card")
    private FlashCard flashCard;
    
    
    
    
    
    @JsonProperty("subtext")
    private String subtext;
    
    
    
    
    
    @JsonProperty("social_tokens")
    private SocialTokens socialTokens;
    
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    
    @JsonProperty("register")
    private Boolean register;
    
    
    
    
    
    @JsonProperty("mobile_image")
    private String mobileImage;
    
    
    
    
    
    @JsonProperty("desktop_image")
    private String desktopImage;
    
    
    
    
}

/*
    Model: LookAndFeel
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class LookAndFeel {
    
    
    
    
    
    @JsonProperty("card_position")
    private String cardPosition;
    
    
    
    
    
    @JsonProperty("background_color")
    private String backgroundColor;
    
    
    
    
}

/*
    Model: Login
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Login {
    
    
    
    
    
    @JsonProperty("password")
    private Boolean password;
    
    
    
    
    
    @JsonProperty("otp")
    private Boolean otp;
    
    
    
    
}

/*
    Model: MetaSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class MetaSchema {
    
    
    
    
    
    @JsonProperty("fynd_default")
    private Boolean fyndDefault;
    
    
    
    
}

/*
    Model: Social
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Social {
    
    
    
    
    
    @JsonProperty("account_kit")
    private Boolean accountKit;
    
    
    
    
    
    @JsonProperty("facebook")
    private Boolean facebook;
    
    
    
    
    
    @JsonProperty("google")
    private Boolean google;
    
    
    
    
    
    @JsonProperty("apple")
    private Boolean apple;
    
    
    
    
}

/*
    Model: RequiredFields
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class RequiredFields {
    
    
    
    
    
    @JsonProperty("email")
    private PlatformEmail email;
    
    
    
    
    
    @JsonProperty("mobile")
    private PlatformMobile mobile;
    
    
    
    
}

/*
    Model: PlatformEmail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class PlatformEmail {
    
    
    
    
    
    @JsonProperty("is_required")
    private Boolean isRequired;
    
    
    
    
    
    @JsonProperty("level")
    private String level;
    
    
    
    
}

/*
    Model: PlatformMobile
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class PlatformMobile {
    
    
    
    
    
    @JsonProperty("is_required")
    private Boolean isRequired;
    
    
    
    
    
    @JsonProperty("level")
    private String level;
    
    
    
    
}

/*
    Model: RegisterRequiredFields
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class RegisterRequiredFields {
    
    
    
    
    
    @JsonProperty("email")
    private RegisterRequiredFieldsEmail email;
    
    
    
    
    
    @JsonProperty("mobile")
    private RegisterRequiredFieldsMobile mobile;
    
    
    
    
}

/*
    Model: RegisterRequiredFieldsEmail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class RegisterRequiredFieldsEmail {
    
    
    
    
    
    @JsonProperty("is_required")
    private Boolean isRequired;
    
    
    
    
    
    @JsonProperty("level")
    private String level;
    
    
    
    
}

/*
    Model: RegisterRequiredFieldsMobile
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class RegisterRequiredFieldsMobile {
    
    
    
    
    
    @JsonProperty("is_required")
    private Boolean isRequired;
    
    
    
    
    
    @JsonProperty("level")
    private String level;
    
    
    
    
}

/*
    Model: FlashCard
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class FlashCard {
    
    
    
    
    
    @JsonProperty("text")
    private String text;
    
    
    
    
    
    @JsonProperty("text_color")
    private String textColor;
    
    
    
    
    
    @JsonProperty("background_color")
    private String backgroundColor;
    
    
    
    
}

/*
    Model: SocialTokens
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class SocialTokens {
    
    
    
    
    
    @JsonProperty("facebook")
    private Facebook facebook;
    
    
    
    
    
    @JsonProperty("account_kit")
    private Accountkit accountKit;
    
    
    
    
    
    @JsonProperty("google")
    private Google google;
    
    
    
    
}

/*
    Model: Facebook
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Facebook {
    
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
}

/*
    Model: Accountkit
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Accountkit {
    
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
}

/*
    Model: Google
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Google {
    
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
}

/*
    Model: UpdateUserRequestSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class UpdateUserRequestSchema {
    
    
    
    
    
    @JsonProperty("first_name")
    private String firstName;
    
    
    
    
    
    @JsonProperty("last_name")
    private String lastName;
    
    
    
    
    
    @JsonProperty("gender")
    private String gender;
    
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
}

/*
    Model: UserSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class UserSchema {
    
    
    
    
    
    @JsonProperty("first_name")
    private String firstName;
    
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    
    @JsonProperty("last_name")
    private String lastName;
    
    
    
    
    
    @JsonProperty("phone_numbers")
    private List<PhoneNumber> phoneNumbers;
    
    
    
    
    
    @JsonProperty("emails")
    private List<Email> emails;
    
    
    
    
    
    @JsonProperty("gender")
    private String gender;
    
    
    
    
    
    @JsonProperty("dob")
    private String dob;
    
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    
    @JsonProperty("profile_pic_url")
    private String profilePicUrl;
    
    
    
    
    
    @JsonProperty("username")
    private String username;
    
    
    
    
    
    @JsonProperty("account_type")
    private String accountType;
    
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    
    @JsonProperty("debug")
    private Debug debug;
    
    
    
    
    
    @JsonProperty("has_old_password_hash")
    private Boolean hasOldPasswordHash;
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
}



/*
    Model: ApplicationLegal
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ApplicationLegal {
    
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    
    @JsonProperty("tnc")
    private String tnc;
    
    
    
    
    
    @JsonProperty("policy")
    private String policy;
    
    
    
    
    
    @JsonProperty("shipping")
    private String shipping;
    
    
    
    
    
    @JsonProperty("faq")
    private List<ApplicationLegalFAQ> faq;
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
}

/*
    Model: ApplicationLegalFAQ
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ApplicationLegalFAQ {
    
    
    
    
    
    @JsonProperty("question")
    private String question;
    
    
    
    
    
    @JsonProperty("answer")
    private String answer;
    
    
    
    
}

/*
    Model: PathMappingSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class PathMappingSchema {
    
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    
    @JsonProperty("redirections")
    private List<RedirectionSchema> redirections;
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
}

/*
    Model: RedirectionSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class RedirectionSchema {
    
    
    
    
    
    @JsonProperty("redirect_from")
    private String redirectFrom;
    
    
    
    
    
    @JsonProperty("redirect_to")
    private String redirectTo;
    
    
    
    
}

/*
    Model: SeoComponent
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class SeoComponent {
    
    
    
    
    
    @JsonProperty("seo")
    private SeoSchema seo;
    
    
    
    
}

/*
    Model: SeoSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class SeoSchema {
    
    
    
    
    
    @JsonProperty("app")
    private String app;
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("robots_txt")
    private String robotsTxt;
    
    
    
    
    
    @JsonProperty("sitemap_enabled")
    private Boolean sitemapEnabled;
    
    
    
    
    
    @JsonProperty("custom_meta_tags")
    private List<Object> customMetaTags;
    
    
    
    
    
    @JsonProperty("details")
    private Detail details;
    
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
}

/*
    Model: CustomMetaTag
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CustomMetaTag {
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("content")
    private String content;
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
}

/*
    Model: Detail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Detail {
    
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
}

/*
    Model: AnnouncementPageSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class AnnouncementPageSchema {
    
    
    
    
    
    @JsonProperty("page_slug")
    private String pageSlug;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
}

/*
    Model: EditorMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class EditorMeta {
    
    
    
    
    
    @JsonProperty("foreground_color")
    private String foregroundColor;
    
    
    
    
    
    @JsonProperty("background_color")
    private String backgroundColor;
    
    
    
    
    
    @JsonProperty("content_type")
    private String contentType;
    
    
    
    
    
    @JsonProperty("content")
    private String content;
    
    
    
    
}

/*
    Model: AnnouncementAuthorSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class AnnouncementAuthorSchema {
    
    
    
    
    
    @JsonProperty("created_by")
    private String createdBy;
    
    
    
    
    
    @JsonProperty("modified_by")
    private String modifiedBy;
    
    
    
    
}

/*
    Model: AdminAnnouncementSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class AdminAnnouncementSchema {
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("platforms")
    private List<String> platforms;
    
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    
    @JsonProperty("announcement")
    private String announcement;
    
    
    
    
    
    @JsonProperty("pages")
    private List<AnnouncementPageSchema> pages;
    
    
    
    
    
    @JsonProperty("editor_meta")
    private EditorMeta editorMeta;
    
    
    
    
    
    @JsonProperty("author")
    private AnnouncementAuthorSchema author;
    
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    
    @JsonProperty("app")
    private String app;
    
    
    
    
    
    @JsonProperty("modified_at")
    private String modifiedAt;
    
    
    
    
    
    @JsonProperty("_schedule")
    private ScheduleSchema schedule;
    
    
    
    
}

/*
    Model: ScheduleSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ScheduleSchema {
    
    
    
    
    
    @JsonProperty("cron")
    private String cron;
    
    
    
    
    
    @JsonProperty("start")
    private String start;
    
    
    
    
    
    @JsonProperty("end")
    private String end;
    
    
    
    
    
    @JsonProperty("duration")
    private Double duration;
    
    
    
    
    
    @JsonProperty("next_schedule")
    private List<Object> nextSchedule;
    
    
    
    
}

/*
    Model: NextSchedule
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class NextSchedule {
    
    
    
    
    
    @JsonProperty("start")
    private String start;
    
    
    
    
    
    @JsonProperty("end")
    private String end;
    
    
    
    
}

/*
    Model: AnnouncementSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class AnnouncementSchema {
    
    
    
    
    
    @JsonProperty("announcement")
    private String announcement;
    
    
    
    
    
    @JsonProperty("schedule")
    private ScheduleStartSchema schedule;
    
    
    
    
}

/*
    Model: ScheduleStartSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ScheduleStartSchema {
    
    
    
    
    
    @JsonProperty("start")
    private String start;
    
    
    
    
    
    @JsonProperty("end")
    private String end;
    
    
    
    
}

/*
    Model: BlogGetResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class BlogGetResponse {
    
    
    
    
    
    @JsonProperty("items")
    private List<BlogSchema> items;
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: ResourceContent
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ResourceContent {
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
}

/*
    Model: Asset
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Asset {
    
    
    
    
    
    @JsonProperty("aspect_ratio")
    private String aspectRatio;
    
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    
    @JsonProperty("secure_url")
    private String secureUrl;
    
    
    
    
}

/*
    Model: Author
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Author {
    
    
    
    
    
    @JsonProperty("designation")
    private String designation;
    
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
}

/*
    Model: BlogSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class BlogSchema {
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    
    @JsonProperty("archived")
    private Boolean archived;
    
    
    
    
    
    @JsonProperty("author")
    private Author author;
    
    
    
    
    
    @JsonProperty("content")
    private List<ResourceContent> content;
    
    
    
    
    
    @JsonProperty("feature_image")
    private Asset featureImage;
    
    
    
    
    
    @JsonProperty("published")
    private Boolean published;
    
    
    
    
    
    @JsonProperty("reading_time")
    private String readingTime;
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    
    @JsonProperty("seo")
    private SEO seo;
    
    
    
    
    
    @JsonProperty("_schedule")
    private CronSchedule schedule;
    
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    
    @JsonProperty("date_meta")
    private DateMeta dateMeta;
    
    
    
    
}

/*
    Model: SEO
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class SEO {
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    
    @JsonProperty("image")
    private SEOImage image;
    
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
}

/*
    Model: SEOImage
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class SEOImage {
    
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
}

/*
    Model: BlogRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class BlogRequest {
    
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    
    @JsonProperty("author")
    private Author author;
    
    
    
    
    
    @JsonProperty("content")
    private List<ResourceContent> content;
    
    
    
    
    
    @JsonProperty("feature_image")
    private Asset featureImage;
    
    
    
    
    
    @JsonProperty("published")
    private Boolean published;
    
    
    
    
    
    @JsonProperty("reading_time")
    private String readingTime;
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    
    @JsonProperty("seo")
    private SEO seo;
    
    
    
    
    
    @JsonProperty("_schedule")
    private CronSchedule schedule;
    
    
    
    
}

/*
    Model: GetAnnouncementListSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class GetAnnouncementListSchema {
    
    
    
    
    
    @JsonProperty("items")
    private List<AdminAnnouncementSchema> items;
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: CreateAnnouncementSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CreateAnnouncementSchema {
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    
    @JsonProperty("data")
    private AdminAnnouncementSchema data;
    
    
    
    
}

/*
    Model: DataLoaderResponseSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class DataLoaderResponseSchema {
    
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("service")
    private String service;
    
    
    
    
    
    @JsonProperty("operation_id")
    private String operationId;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
    
    @JsonProperty("content")
    private String content;
    
    
    
    
    
    @JsonProperty("__source")
    private DataLoaderSourceSchema source;
    
    
    
    
}

/*
    Model: Navigation
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Navigation {
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    
    @JsonProperty("orientation")
    private String orientation;
    
    
    
    
    
    @JsonProperty("created_by")
    private CreatedBySchema createdBy;
    
    
    
    
    
    @JsonProperty("date_meta")
    private DateMeta dateMeta;
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("position")
    private String position;
    
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    
    @JsonProperty("platform")
    private String platform;
    
    
    
    
    
    @JsonProperty("navigation")
    private NavigationReference navigation;
    
    
    
    
}

/*
    Model: LocaleLanguage
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class LocaleLanguage {
    
    
    
    
    
    @JsonProperty("hi")
    private Language hi;
    
    
    
    
    
    @JsonProperty("ar")
    private Language ar;
    
    
    
    
    
    @JsonProperty("en_us")
    private Language enUs;
    
    
    
    
}

/*
    Model: Language
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Language {
    
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
}

/*
    Model: Action
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Action {
    
    
    
    
    
    @JsonProperty("page")
    private ActionPage page;
    
    
    
    
    
    @JsonProperty("popup")
    private ActionPage popup;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
}

/*
    Model: ActionPage
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ActionPage {
    
    
    
    
    
    @JsonProperty("params")
    private HashMap<String,List<String>> params;
    
    
    
    
    
    @JsonProperty("query")
    private HashMap<String,List<String>> query;
    
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
    
    @JsonProperty("type")
    private PlatformClient.PageType type;
    
    
    
    
}

/*
    Model: NavigationReference
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class NavigationReference {
    
    
    
    
    
    @JsonProperty("acl")
    private List<String> acl;
    
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    
    @JsonProperty("_locale_language")
    private LocaleLanguage localeLanguage;
    
    
    
    
    
    @JsonProperty("image")
    private String image;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("action")
    private Action action;
    
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    
    @JsonProperty("sort_order")
    private Integer sortOrder;
    
    
    
    
    
    @JsonProperty("sub_navigation")
    private List<NavigationReference> subNavigation;
    
    
    
    
}

/*
    Model: LandingPage
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class LandingPage {
    
    
    
    
    
    @JsonProperty("data")
    private LandingPageSchema data;
    
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
}

/*
    Model: ConfigurationSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ConfigurationSchema {
    
    
    
    
    
    @JsonProperty("sleep_time")
    private Integer sleepTime;
    
    
    
    
    
    @JsonProperty("start_on_launch")
    private Boolean startOnLaunch;
    
    
    
    
    
    @JsonProperty("duration")
    private Integer duration;
    
    
    
    
    
    @JsonProperty("slide_direction")
    private String slideDirection;
    
    
    
    
}

/*
    Model: SlideshowMedia
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class SlideshowMedia {
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
    
    @JsonProperty("bg_color")
    private String bgColor;
    
    
    
    
    
    @JsonProperty("duration")
    private Integer duration;
    
    
    
    
    
    @JsonProperty("auto_decide_duration")
    private Boolean autoDecideDuration;
    
    
    
    
    
    @JsonProperty("action")
    private Action action;
    
    
    
    
}

/*
    Model: Slideshow
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Slideshow {
    
    
    
    
    
    @JsonProperty("data")
    private SlideshowSchema data;
    
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
}

/*
    Model: AnnouncementsResponseSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class AnnouncementsResponseSchema {
    
    
    
    
    
    @JsonProperty("announcements")
    private HashMap<String,List<AnnouncementSchema>> announcements;
    
    
    
    
    
    @JsonProperty("refresh_rate")
    private Integer refreshRate;
    
    
    
    
    
    @JsonProperty("refresh_pages")
    private List<String> refreshPages;
    
    
    
    
}

/*
    Model: FaqResponseSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class FaqResponseSchema {
    
    
    
    
    
    @JsonProperty("faqs")
    private List<FaqSchema> faqs;
    
    
    
    
}

/*
    Model: UpdateHandpickedSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class UpdateHandpickedSchema {
    
    
    
    
    
    @JsonProperty("tag")
    private HandpickedTagSchema tag;
    
    
    
    
}

/*
    Model: HandpickedTagSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class HandpickedTagSchema {
    
    
    
    
    
    @JsonProperty("position")
    private String position;
    
    
    
    
    
    @JsonProperty("attributes")
    private Object attributes;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("sub_type")
    private String subType;
    
    
    
    
    
    @JsonProperty("content")
    private String content;
    
    
    
    
}

/*
    Model: RemoveHandpickedSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class RemoveHandpickedSchema {
    
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
}

/*
    Model: CreateTagSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CreateTagSchema {
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("sub_type")
    private String subType;
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
    
    @JsonProperty("position")
    private String position;
    
    
    
    
    
    @JsonProperty("attributes")
    private Object attributes;
    
    
    
    
    
    @JsonProperty("content")
    private String content;
    
    
    
    
}

/*
    Model: CreateTagRequestSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CreateTagRequestSchema {
    
    
    
    
    
    @JsonProperty("tags")
    private List<CreateTagSchema> tags;
    
    
    
    
}

/*
    Model: DataLoaderSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class DataLoaderSchema {
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("service")
    private String service;
    
    
    
    
    
    @JsonProperty("operation_id")
    private String operationId;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
    
    @JsonProperty("content")
    private String content;
    
    
    
    
    
    @JsonProperty("__source")
    private DataLoaderSourceSchema source;
    
    
    
    
}

/*
    Model: DataLoaderSourceSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class DataLoaderSourceSchema {
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
}

/*
    Model: TagDeleteSuccessResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class TagDeleteSuccessResponse {
    
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
}

/*
    Model: ContentAPIError
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ContentAPIError {
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    
    @JsonProperty("status")
    private Double status;
    
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    
    @JsonProperty("exception")
    private String exception;
    
    
    
    
    
    @JsonProperty("info")
    private String info;
    
    
    
    
    
    @JsonProperty("request_id")
    private String requestId;
    
    
    
    
    
    @JsonProperty("stack_trace")
    private String stackTrace;
    
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
}

/*
    Model: CategorySchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CategorySchema {
    
    
    
    
    
    @JsonProperty("index")
    private Integer index;
    
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    
    @JsonProperty("children")
    private List<String> children;
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    
    @JsonProperty("icon_url")
    private String iconUrl;
    
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
}

/*
    Model: ChildrenSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ChildrenSchema {
    
    
    
    
    
    @JsonProperty("question")
    private String question;
    
    
    
    
    
    @JsonProperty("answer")
    private String answer;
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
}

/*
    Model: CategoryRequestSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CategoryRequestSchema {
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
}

/*
    Model: FAQCategorySchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class FAQCategorySchema {
    
    
    
    
    
    @JsonProperty("index")
    private Integer index;
    
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    
    @JsonProperty("children")
    private List<ChildrenSchema> children;
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    
    @JsonProperty("icon_url")
    private String iconUrl;
    
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
}

/*
    Model: FaqSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class FaqSchema {
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("question")
    private String question;
    
    
    
    
    
    @JsonProperty("answer")
    private String answer;
    
    
    
    
}

/*
    Model: FAQ
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class FAQ {
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    
    @JsonProperty("question")
    private String question;
    
    
    
    
    
    @JsonProperty("answer")
    private String answer;
    
    
    
    
}

/*
    Model: CreateFaqResponseSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CreateFaqResponseSchema {
    
    
    
    
    
    @JsonProperty("faq")
    private FaqSchema faq;
    
    
    
    
}

/*
    Model: CreateFaqSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CreateFaqSchema {
    
    
    
    
    
    @JsonProperty("faq")
    private FAQ faq;
    
    
    
    
}

/*
    Model: GetFaqSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class GetFaqSchema {
    
    
    
    
    
    @JsonProperty("faqs")
    private List<Object> faqs;
    
    
    
    
}

/*
    Model: UpdateFaqCategoryRequestSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class UpdateFaqCategoryRequestSchema {
    
    
    
    
    
    @JsonProperty("category")
    private CategorySchema category;
    
    
    
    
}

/*
    Model: CreateFaqCategoryRequestSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CreateFaqCategoryRequestSchema {
    
    
    
    
    
    @JsonProperty("category")
    private CategoryRequestSchema category;
    
    
    
    
}

/*
    Model: CreateFaqCategorySchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CreateFaqCategorySchema {
    
    
    
    
    
    @JsonProperty("category")
    private CategorySchema category;
    
    
    
    
}

/*
    Model: GetFaqCategoriesSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class GetFaqCategoriesSchema {
    
    
    
    
    
    @JsonProperty("categories")
    private List<CategorySchema> categories;
    
    
    
    
}

/*
    Model: GetFaqCategoryBySlugSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class GetFaqCategoryBySlugSchema {
    
    
    
    
    
    @JsonProperty("category")
    private FAQCategorySchema category;
    
    
    
    
}

/*
    Model: LandingPageGetResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class LandingPageGetResponse {
    
    
    
    
    
    @JsonProperty("items")
    private List<LandingPageSchema> items;
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: LandingPageSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class LandingPageSchema {
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    
    @JsonProperty("action")
    private Action action;
    
    
    
    
    
    @JsonProperty("platform")
    private List<String> platform;
    
    
    
    
    
    @JsonProperty("created_by")
    private CreatedBySchema createdBy;
    
    
    
    
    
    @JsonProperty("date_meta")
    private DateMeta dateMeta;
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    
    @JsonProperty("archived")
    private Boolean archived;
    
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
}

/*
    Model: DefaultNavigationResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class DefaultNavigationResponse {
    
    
    
    
    
    @JsonProperty("items")
    private List<NavigationSchema> items;
    
    
    
    
}

/*
    Model: NavigationGetResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class NavigationGetResponse {
    
    
    
    
    
    @JsonProperty("items")
    private List<NavigationSchema> items;
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: Orientation
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Orientation {
    
    
    
    
    
    @JsonProperty("portrait")
    private List<String> portrait;
    
    
    
    
    
    @JsonProperty("landscape")
    private List<String> landscape;
    
    
    
    
}

/*
    Model: NavigationSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class NavigationSchema {
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    
    @JsonProperty("archived")
    private Boolean archived;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    
    @JsonProperty("platform")
    private List<String> platform;
    
    
    
    
    
    @JsonProperty("created_by")
    private CreatedBySchema createdBy;
    
    
    
    
    
    @JsonProperty("date_meta")
    private DateMeta dateMeta;
    
    
    
    
    
    @JsonProperty("orientation")
    private Orientation orientation;
    
    
    
    
    
    @JsonProperty("version")
    private Double version;
    
    
    
    
    
    @JsonProperty("navigation")
    private List<NavigationReference> navigation;
    
    
    
    
}

/*
    Model: NavigationRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class NavigationRequest {
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    
    @JsonProperty("platform")
    private List<String> platform;
    
    
    
    
    
    @JsonProperty("orientation")
    private Orientation orientation;
    
    
    
    
    
    @JsonProperty("navigation")
    private List<NavigationReference> navigation;
    
    
    
    
}

/*
    Model: CustomPageSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CustomPageSchema {
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("platform")
    private String platform;
    
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("orientation")
    private String orientation;
    
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    
    @JsonProperty("published")
    private Boolean published;
    
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    
    @JsonProperty("content")
    private List<Object> content;
    
    
    
    
    
    @JsonProperty("created_by")
    private CreatedBySchema createdBy;
    
    
    
    
    
    @JsonProperty("date_meta")
    private DateMeta dateMeta;
    
    
    
    
    
    @JsonProperty("_schedule")
    private ScheduleSchema schedule;
    
    
    
    
}

/*
    Model: ContentSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ContentSchema {
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("value")
    private Object value;
    
    
    
    
}

/*
    Model: CustomPage
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CustomPage {
    
    
    
    
    
    @JsonProperty("data")
    private CustomPageSchema data;
    
    
    
    
}

/*
    Model: FeatureImage
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class FeatureImage {
    
    
    
    
    
    @JsonProperty("secure_url")
    private String secureUrl;
    
    
    
    
}

/*
    Model: PageGetResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class PageGetResponse {
    
    
    
    
    
    @JsonProperty("items")
    private List<PageSchema> items;
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: PageSpec
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class PageSpec {
    
    
    
    
    
    @JsonProperty("specifications")
    private List<Object> specifications;
    
    
    
    
}

/*
    Model: PageSpecParam
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class PageSpecParam {
    
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    
    @JsonProperty("required")
    private Boolean required;
    
    
    
    
}

/*
    Model: PageSpecItem
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class PageSpecItem {
    
    
    
    
    
    @JsonProperty("page_type")
    private String pageType;
    
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    
    @JsonProperty("params")
    private List<PageSpecParam> params;
    
    
    
    
    
    @JsonProperty("query")
    private List<PageSpecParam> query;
    
    
    
    
}

/*
    Model: PageSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class PageSchema {
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    
    @JsonProperty("component_ids")
    private List<String> componentIds;
    
    
    
    
    
    @JsonProperty("content")
    private List<Object> content;
    
    
    
    
    
    @JsonProperty("content_path")
    private String contentPath;
    
    
    
    
    
    @JsonProperty("created_by")
    private CreatedBySchema createdBy;
    
    
    
    
    
    @JsonProperty("date_meta")
    private DateMeta dateMeta;
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    
    @JsonProperty("feature_image")
    private Asset featureImage;
    
    
    
    
    
    @JsonProperty("page_meta")
    private List<Object> pageMeta;
    
    
    
    
    
    @JsonProperty("_schedule")
    private ScheduleSchema schedule;
    
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    
    @JsonProperty("orientation")
    private String orientation;
    
    
    
    
    
    @JsonProperty("platform")
    private String platform;
    
    
    
    
    
    @JsonProperty("published")
    private Boolean published;
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("seo")
    private SEO seo;
    
    
    
    
    
    @JsonProperty("visibility")
    private Object visibility;
    
    
    
    
    
    @JsonProperty("archived")
    private Boolean archived;
    
    
    
    
}

/*
    Model: CreatedBySchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CreatedBySchema {
    
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
}

/*
    Model: PageContent
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class PageContent {
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("value")
    private Object value;
    
    
    
    
}

/*
    Model: PageMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class PageMeta {
    
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    
    @JsonProperty("value")
    private Object value;
    
    
    
    
}

/*
    Model: PageRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class PageRequest {
    
    
    
    
    
    @JsonProperty("_schedule")
    private CronSchedule schedule;
    
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    
    @JsonProperty("author")
    private Author author;
    
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    
    @JsonProperty("orientation")
    private String orientation;
    
    
    
    
    
    @JsonProperty("content")
    private List<Object> content;
    
    
    
    
    
    @JsonProperty("feature_image")
    private Asset featureImage;
    
    
    
    
    
    @JsonProperty("published")
    private Boolean published;
    
    
    
    
    
    @JsonProperty("reading_time")
    private String readingTime;
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    
    @JsonProperty("seo")
    private SEO seo;
    
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
}

/*
    Model: CronSchedule
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CronSchedule {
    
    
    
    
    
    @JsonProperty("cron")
    private String cron;
    
    
    
    
    
    @JsonProperty("start")
    private String start;
    
    
    
    
    
    @JsonProperty("end")
    private String end;
    
    
    
    
    
    @JsonProperty("duration")
    private Double duration;
    
    
    
    
}

/*
    Model: PagePublishRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class PagePublishRequest {
    
    
    
    
    
    @JsonProperty("publish")
    private Boolean publish;
    
    
    
    
}

/*
    Model: PageMetaSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class PageMetaSchema {
    
    
    
    
    
    @JsonProperty("system_pages")
    private List<NavigationSchema> systemPages;
    
    
    
    
    
    @JsonProperty("custom_pages")
    private List<PageSchema> customPages;
    
    
    
    
    
    @JsonProperty("application_id")
    private String applicationId;
    
    
    
    
}

/*
    Model: SlideshowGetResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class SlideshowGetResponse {
    
    
    
    
    
    @JsonProperty("items")
    private List<SlideshowSchema> items;
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: SlideshowSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class SlideshowSchema {
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    
    @JsonProperty("date_meta")
    private DateMeta dateMeta;
    
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    
    @JsonProperty("platform")
    private String platform;
    
    
    
    
    
    @JsonProperty("configuration")
    private ConfigurationSchema configuration;
    
    
    
    
    
    @JsonProperty("media")
    private List<SlideshowMedia> media;
    
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    
    @JsonProperty("archived")
    private Boolean archived;
    
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
}

/*
    Model: SlideshowRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class SlideshowRequest {
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    
    @JsonProperty("platform")
    private String platform;
    
    
    
    
    
    @JsonProperty("configuration")
    private ConfigurationSchema configuration;
    
    
    
    
    
    @JsonProperty("media")
    private SlideshowMedia media;
    
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
}

/*
    Model: Support
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Support {
    
    
    
    
    
    @JsonProperty("created")
    private Boolean created;
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("config_type")
    private String configType;
    
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    
    @JsonProperty("contact")
    private ContactSchema contact;
    
    
    
    
}

/*
    Model: PhoneProperties
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class PhoneProperties {
    
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    
    @JsonProperty("number")
    private String number;
    
    
    
    
}

/*
    Model: PhoneSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class PhoneSchema {
    
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    
    @JsonProperty("phone")
    private List<PhoneProperties> phone;
    
    
    
    
}

/*
    Model: EmailProperties
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class EmailProperties {
    
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
}

/*
    Model: EmailSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class EmailSchema {
    
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    
    @JsonProperty("email")
    private List<EmailProperties> email;
    
    
    
    
}

/*
    Model: ContactSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ContactSchema {
    
    
    
    
    
    @JsonProperty("phone")
    private PhoneSchema phone;
    
    
    
    
    
    @JsonProperty("email")
    private EmailSchema email;
    
    
    
    
}

/*
    Model: TagsSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class TagsSchema {
    
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("tags")
    private List<TagSchema> tags;
    
    
    
    
}

/*
    Model: TagSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class TagSchema {
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("sub_type")
    private String subType;
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("position")
    private String position;
    
    
    
    
    
    @JsonProperty("attributes")
    private Object attributes;
    
    
    
    
    
    @JsonProperty("content")
    private String content;
    
    
    
    
    
    @JsonProperty("__source")
    private TagSourceSchema source;
    
    
    
    
}

/*
    Model: TagSourceSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class TagSourceSchema {
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
}



/*
    Model: UnauthenticatedUser
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class UnauthenticatedUser {
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
}

/*
    Model: UnauthenticatedApplication
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class UnauthenticatedApplication {
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
}

/*
    Model: BadRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class BadRequest {
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
}

/*
    Model: ResourceNotFound
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ResourceNotFound {
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
}

/*
    Model: InternalServerError
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class InternalServerError {
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
}

/*
    Model: PlanRecurring
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class PlanRecurring {
    
    
    
    
    
    @JsonProperty("interval")
    private String interval;
    
    
    
    
    
    @JsonProperty("interval_count")
    private Double intervalCount;
    
    
    
    
}

/*
    Model: Plan
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Plan {
    
    
    
    
    
    @JsonProperty("recurring")
    private PlanRecurring recurring;
    
    
    
    
    
    @JsonProperty("is_trial_plan")
    private Boolean isTrialPlan;
    
    
    
    
    
    @JsonProperty("plan_group")
    private String planGroup;
    
    
    
    
    
    @JsonProperty("tag_lines")
    private List<String> tagLines;
    
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    
    @JsonProperty("is_visible")
    private Boolean isVisible;
    
    
    
    
    
    @JsonProperty("trial_period")
    private Double trialPeriod;
    
    
    
    
    
    @JsonProperty("addons")
    private List<String> addons;
    
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    
    @JsonProperty("amount")
    private Double amount;
    
    
    
    
    
    @JsonProperty("product_suite_id")
    private String productSuiteId;
    
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    
    @JsonProperty("modified_at")
    private String modifiedAt;
    
    
    
    
}

/*
    Model: DetailedPlanComponents
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class DetailedPlanComponents {
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    
    @JsonProperty("group")
    private String group;
    
    
    
    
    
    @JsonProperty("icon")
    private String icon;
    
    
    
    
    
    @JsonProperty("links")
    private Object links;
    
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
    
    @JsonProperty("display_text")
    private String displayText;
    
    
    
    
}

/*
    Model: DetailedPlan
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class DetailedPlan {
    
    
    
    
    
    @JsonProperty("recurring")
    private PlanRecurring recurring;
    
    
    
    
    
    @JsonProperty("is_trial_plan")
    private Boolean isTrialPlan;
    
    
    
    
    
    @JsonProperty("plan_group")
    private String planGroup;
    
    
    
    
    
    @JsonProperty("tag_lines")
    private List<String> tagLines;
    
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    
    @JsonProperty("is_visible")
    private Boolean isVisible;
    
    
    
    
    
    @JsonProperty("trial_period")
    private Double trialPeriod;
    
    
    
    
    
    @JsonProperty("addons")
    private List<String> addons;
    
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    
    @JsonProperty("amount")
    private Double amount;
    
    
    
    
    
    @JsonProperty("product_suite_id")
    private String productSuiteId;
    
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    
    @JsonProperty("modified_at")
    private String modifiedAt;
    
    
    
    
    
    @JsonProperty("components")
    private List<DetailedPlanComponents> components;
    
    
    
    
}

/*
    Model: SubscriptionTrialPeriod
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class SubscriptionTrialPeriod {
    
    
    
    
    
    @JsonProperty("start_date")
    private String startDate;
    
    
    
    
    
    @JsonProperty("end_date")
    private String endDate;
    
    
    
    
}

/*
    Model: EntityChargePrice
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class EntityChargePrice {
    
    
    
    
    
    @JsonProperty("amount")
    private Double amount;
    
    
    
    
    
    @JsonProperty("currency_code")
    private String currencyCode;
    
    
    
    
}

/*
    Model: EntityChargeRecurring
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class EntityChargeRecurring {
    
    
    
    
    
    @JsonProperty("interval")
    private String interval;
    
    
    
    
}

/*
    Model: ChargeLineItem
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ChargeLineItem {
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("term")
    private String term;
    
    
    
    
    
    @JsonProperty("pricing_type")
    private String pricingType;
    
    
    
    
    
    @JsonProperty("price")
    private EntityChargePrice price;
    
    
    
    
    
    @JsonProperty("recurring")
    private EntityChargeRecurring recurring;
    
    
    
    
    
    @JsonProperty("capped_amount")
    private Double cappedAmount;
    
    
    
    
    
    @JsonProperty("trial_days")
    private Integer trialDays;
    
    
    
    
    
    @JsonProperty("is_test")
    private Boolean isTest;
    
    
    
    
    
    @JsonProperty("metadata")
    private Object metadata;
    
    
    
    
}

/*
    Model: CreateSubscriptionCharge
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CreateSubscriptionCharge {
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("trial_days")
    private Integer trialDays;
    
    
    
    
    
    @JsonProperty("line_items")
    private List<ChargeLineItem> lineItems;
    
    
    
    
    
    @JsonProperty("is_test")
    private Boolean isTest;
    
    
    
    
    
    @JsonProperty("return_url")
    private String returnUrl;
    
    
    
    
}

/*
    Model: CurrentPeriod
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CurrentPeriod {
    
    
    
    
    
    @JsonProperty("start_date")
    private String startDate;
    
    
    
    
    
    @JsonProperty("end_date")
    private String endDate;
    
    
    
    
}

/*
    Model: SubscriptionCharge
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class SubscriptionCharge {
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("term")
    private String term;
    
    
    
    
    
    @JsonProperty("pricing_type")
    private String pricingType;
    
    
    
    
    
    @JsonProperty("price")
    private EntityChargePrice price;
    
    
    
    
    
    @JsonProperty("recurring")
    private EntityChargeRecurring recurring;
    
    
    
    
    
    @JsonProperty("capped_amount")
    private Double cappedAmount;
    
    
    
    
    
    @JsonProperty("activated_on")
    private String activatedOn;
    
    
    
    
    
    @JsonProperty("cancelled_on")
    private String cancelledOn;
    
    
    
    
    
    @JsonProperty("billing_date")
    private String billingDate;
    
    
    
    
    
    @JsonProperty("current_period")
    private CurrentPeriod currentPeriod;
    
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    
    @JsonProperty("is_test")
    private Boolean isTest;
    
    
    
    
    
    @JsonProperty("metadata")
    private Object metadata;
    
    
    
    
}

/*
    Model: EntitySubscription
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class EntitySubscription {
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    
    @JsonProperty("activated_on")
    private String activatedOn;
    
    
    
    
    
    @JsonProperty("cancelled_on")
    private String cancelledOn;
    
    
    
    
    
    @JsonProperty("trial_days")
    private Integer trialDays;
    
    
    
    
    
    @JsonProperty("trial_period")
    private SubscriptionTrialPeriod trialPeriod;
    
    
    
    
    
    @JsonProperty("metadata")
    private Object metadata;
    
    
    
    
    
    @JsonProperty("line_items")
    private List<SubscriptionCharge> lineItems;
    
    
    
    
}

/*
    Model: CreateSubscriptionResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CreateSubscriptionResponse {
    
    
    
    
    
    @JsonProperty("subscription")
    private EntitySubscription subscription;
    
    
    
    
    
    @JsonProperty("confirm_url")
    private String confirmUrl;
    
    
    
    
}

/*
    Model: InvoiceDetailsPeriod
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class InvoiceDetailsPeriod {
    
    
    
    
    
    @JsonProperty("start")
    private String start;
    
    
    
    
    
    @JsonProperty("end")
    private String end;
    
    
    
    
}

/*
    Model: InvoiceDetailsClient
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class InvoiceDetailsClient {
    
    
    
    
    
    @JsonProperty("address_lines")
    private List<String> addressLines;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    
    @JsonProperty("phone")
    private String phone;
    
    
    
    
}

/*
    Model: InvoiceDetailsStatusTrail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class InvoiceDetailsStatusTrail {
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
    
    @JsonProperty("timestamp")
    private String timestamp;
    
    
    
    
}

/*
    Model: InvoiceDetailsPaymentMethodsDataChecks
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class InvoiceDetailsPaymentMethodsDataChecks {
    
    
    
    
    
    @JsonProperty("cvc_check")
    private String cvcCheck;
    
    
    
    
    
    @JsonProperty("address_line1_check")
    private String addressLine1Check;
    
    
    
    
    
    @JsonProperty("address_postal_code_check")
    private String addressPostalCodeCheck;
    
    
    
    
}

/*
    Model: InvoiceDetailsPaymentMethodsDataNetworks
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class InvoiceDetailsPaymentMethodsDataNetworks {
    
    
    
    
    
    @JsonProperty("available")
    private List<String> available;
    
    
    
    
    
    @JsonProperty("preferred")
    private String preferred;
    
    
    
    
}

/*
    Model: InvoiceDetailsPaymentMethodsDataThreeDSecureUsage
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class InvoiceDetailsPaymentMethodsDataThreeDSecureUsage {
    
    
    
    
    
    @JsonProperty("supported")
    private Boolean supported;
    
    
    
    
}

/*
    Model: InvoiceDetailsPaymentMethodsData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class InvoiceDetailsPaymentMethodsData {
    
    
    
    
    
    @JsonProperty("brand")
    private String brand;
    
    
    
    
    
    @JsonProperty("last4")
    private String last4;
    
    
    
    
    
    @JsonProperty("checks")
    private InvoiceDetailsPaymentMethodsDataChecks checks;
    
    
    
    
    
    @JsonProperty("wallet")
    private String wallet;
    
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    
    @JsonProperty("funding")
    private String funding;
    
    
    
    
    
    @JsonProperty("exp_year")
    private Integer expYear;
    
    
    
    
    
    @JsonProperty("networks")
    private InvoiceDetailsPaymentMethodsDataNetworks networks;
    
    
    
    
    
    @JsonProperty("exp_month")
    private Integer expMonth;
    
    
    
    
    
    @JsonProperty("fingerprint")
    private String fingerprint;
    
    
    
    
    
    @JsonProperty("generated_from")
    private String generatedFrom;
    
    
    
    
    
    @JsonProperty("three_d_secure_usage")
    private InvoiceDetailsPaymentMethodsDataThreeDSecureUsage threeDSecureUsage;
    
    
    
    
}

/*
    Model: InvoiceDetailsPaymentMethods
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class InvoiceDetailsPaymentMethods {
    
    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("pg_payment_method_id")
    private String pgPaymentMethodId;
    
    
    
    
    
    @JsonProperty("data")
    private InvoiceDetailsPaymentMethodsData data;
    
    
    
    
    
    @JsonProperty("is_default")
    private Boolean isDefault;
    
    
    
    
}

/*
    Model: InvoicePaymentMethod
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class InvoicePaymentMethod {
    
    
    
    
    
    @JsonProperty("pg_payment_method_id")
    private String pgPaymentMethodId;
    
    
    
    
}

/*
    Model: InvoiceDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class InvoiceDetails {
    
    
    
    
    
    @JsonProperty("period")
    private InvoiceDetailsPeriod period;
    
    
    
    
    
    @JsonProperty("client")
    private InvoiceDetailsClient client;
    
    
    
    
    
    @JsonProperty("auto_advance")
    private Boolean autoAdvance;
    
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    
    @JsonProperty("paid")
    private Boolean paid;
    
    
    
    
    
    @JsonProperty("attemp")
    private Integer attemp;
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("collection_method")
    private String collectionMethod;
    
    
    
    
    
    @JsonProperty("subscriber_id")
    private String subscriberId;
    
    
    
    
    
    @JsonProperty("invoice_url")
    private String invoiceUrl;
    
    
    
    
    
    @JsonProperty("number")
    private String number;
    
    
    
    
    
    @JsonProperty("pg_data")
    private Object pgData;
    
    
    
    
    
    @JsonProperty("receipt_number")
    private String receiptNumber;
    
    
    
    
    
    @JsonProperty("statement_descriptor")
    private String statementDescriptor;
    
    
    
    
    
    @JsonProperty("current_status")
    private String currentStatus;
    
    
    
    
    
    @JsonProperty("status_trail")
    private List<InvoiceDetailsStatusTrail> statusTrail;
    
    
    
    
    
    @JsonProperty("subtotal")
    private Double subtotal;
    
    
    
    
    
    @JsonProperty("total")
    private Double total;
    
    
    
    
    
    @JsonProperty("subscription")
    private String subscription;
    
    
    
    
    
    @JsonProperty("next_action_time")
    private String nextActionTime;
    
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    
    @JsonProperty("modified_at")
    private String modifiedAt;
    
    
    
    
    
    @JsonProperty("hash_identifier")
    private String hashIdentifier;
    
    
    
    
    
    @JsonProperty("payment_method")
    private InvoicePaymentMethod paymentMethod;
    
    
    
    
}

/*
    Model: InvoiceItemsPlanRecurring
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class InvoiceItemsPlanRecurring {
    
    
    
    
    
    @JsonProperty("interval")
    private String interval;
    
    
    
    
    
    @JsonProperty("interval_count")
    private Integer intervalCount;
    
    
    
    
}

/*
    Model: InvoiceItemsPlan
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class InvoiceItemsPlan {
    
    
    
    
    
    @JsonProperty("recurring")
    private InvoiceItemsPlanRecurring recurring;
    
    
    
    
    
    @JsonProperty("is_trial_plan")
    private Boolean isTrialPlan;
    
    
    
    
    
    @JsonProperty("plan_group")
    private String planGroup;
    
    
    
    
    
    @JsonProperty("tag_lines")
    private List<String> tagLines;
    
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    
    @JsonProperty("is_visible")
    private Boolean isVisible;
    
    
    
    
    
    @JsonProperty("trial_period")
    private Integer trialPeriod;
    
    
    
    
    
    @JsonProperty("addons")
    private List<String> addons;
    
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    
    @JsonProperty("amount")
    private Integer amount;
    
    
    
    
    
    @JsonProperty("product_suite_id")
    private String productSuiteId;
    
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    
    @JsonProperty("modified_at")
    private String modifiedAt;
    
    
    
    
}

/*
    Model: InvoiceItemsPeriod
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class InvoiceItemsPeriod {
    
    
    
    
    
    @JsonProperty("start")
    private String start;
    
    
    
    
    
    @JsonProperty("end")
    private String end;
    
    
    
    
}

/*
    Model: InvoiceItems
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class InvoiceItems {
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    
    @JsonProperty("plan")
    private InvoiceItemsPlan plan;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    
    @JsonProperty("period")
    private InvoiceItemsPeriod period;
    
    
    
    
    
    @JsonProperty("unit_amount")
    private Double unitAmount;
    
    
    
    
    
    @JsonProperty("amount")
    private Double amount;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("invoice_id")
    private String invoiceId;
    
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    
    @JsonProperty("modified_at")
    private String modifiedAt;
    
    
    
    
}

/*
    Model: Invoice
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Invoice {
    
    
    
    
    
    @JsonProperty("invoice")
    private InvoiceDetails invoice;
    
    
    
    
    
    @JsonProperty("invoice_items")
    private List<InvoiceItems> invoiceItems;
    
    
    
    
}

/*
    Model: InvoicesDataClient
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class InvoicesDataClient {
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    
    @JsonProperty("phone")
    private String phone;
    
    
    
    
    
    @JsonProperty("address_lines")
    private List<String> addressLines;
    
    
    
    
}

/*
    Model: InvoicesDataPeriod
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class InvoicesDataPeriod {
    
    
    
    
    
    @JsonProperty("start")
    private String start;
    
    
    
    
    
    @JsonProperty("end")
    private String end;
    
    
    
    
}

/*
    Model: InvoicesDataPaymentMethod
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class InvoicesDataPaymentMethod {
    
    
    
    
    
    @JsonProperty("pg_payment_method_id")
    private String pgPaymentMethodId;
    
    
    
    
}

/*
    Model: InvoicesData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class InvoicesData {
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("client")
    private InvoicesDataClient client;
    
    
    
    
    
    @JsonProperty("auto_advance")
    private Boolean autoAdvance;
    
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    
    @JsonProperty("paid")
    private Boolean paid;
    
    
    
    
    
    @JsonProperty("attemp")
    private Integer attemp;
    
    
    
    
    
    @JsonProperty("collection_method")
    private String collectionMethod;
    
    
    
    
    
    @JsonProperty("subscriber_id")
    private String subscriberId;
    
    
    
    
    
    @JsonProperty("invoice_url")
    private String invoiceUrl;
    
    
    
    
    
    @JsonProperty("number")
    private String number;
    
    
    
    
    
    @JsonProperty("pg_data")
    private Object pgData;
    
    
    
    
    
    @JsonProperty("period")
    private InvoicesDataPeriod period;
    
    
    
    
    
    @JsonProperty("receipt_number")
    private String receiptNumber;
    
    
    
    
    
    @JsonProperty("statement_descriptor")
    private String statementDescriptor;
    
    
    
    
    
    @JsonProperty("current_status")
    private String currentStatus;
    
    
    
    
    
    @JsonProperty("status_trail")
    private List<InvoiceDetailsStatusTrail> statusTrail;
    
    
    
    
    
    @JsonProperty("subtotal")
    private Double subtotal;
    
    
    
    
    
    @JsonProperty("total")
    private Double total;
    
    
    
    
    
    @JsonProperty("subscription")
    private String subscription;
    
    
    
    
    
    @JsonProperty("next_action_time")
    private String nextActionTime;
    
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    
    @JsonProperty("modified_at")
    private String modifiedAt;
    
    
    
    
    
    @JsonProperty("hash_identifier")
    private String hashIdentifier;
    
    
    
    
    
    @JsonProperty("payment_method")
    private InvoicesDataPaymentMethod paymentMethod;
    
    
    
    
    
    @JsonProperty("invoice_items")
    private List<InvoiceItems> invoiceItems;
    
    
    
    
}

/*
    Model: Invoices
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Invoices {
    
    
    
    
    
    @JsonProperty("data")
    private List<InvoicesData> data;
    
    
    
    
    
    @JsonProperty("start")
    private Integer start;
    
    
    
    
    
    @JsonProperty("end")
    private Integer end;
    
    
    
    
    
    @JsonProperty("limit")
    private Integer limit;
    
    
    
    
    
    @JsonProperty("page")
    private Integer page;
    
    
    
    
    
    @JsonProperty("total")
    private Integer total;
    
    
    
    
}

/*
    Model: Phone
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Phone {
    
    
    
    
    
    @JsonProperty("phone_number")
    private String phoneNumber;
    
    
    
    
    
    @JsonProperty("phone_country_code")
    private String phoneCountryCode;
    
    
    
    
}

/*
    Model: SubscriptionBillingAddress
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class SubscriptionBillingAddress {
    
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    
    @JsonProperty("line1")
    private String line1;
    
    
    
    
    
    @JsonProperty("line2")
    private String line2;
    
    
    
    
    
    @JsonProperty("postal_code")
    private String postalCode;
    
    
    
    
}

/*
    Model: SubscriptionCustomer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class SubscriptionCustomer {
    
    
    
    
    
    @JsonProperty("phone")
    private Phone phone;
    
    
    
    
    
    @JsonProperty("billing_address")
    private SubscriptionBillingAddress billingAddress;
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("unique_id")
    private String uniqueId;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    
    @JsonProperty("modified_at")
    private String modifiedAt;
    
    
    
    
    
    @JsonProperty("data")
    private Object data;
    
    
    
    
}

/*
    Model: SubscriptionCustomerCreate
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class SubscriptionCustomerCreate {
    
    
    
    
    
    @JsonProperty("phone")
    private Phone phone;
    
    
    
    
    
    @JsonProperty("billing_address")
    private SubscriptionBillingAddress billingAddress;
    
    
    
    
    
    @JsonProperty("unique_id")
    private String uniqueId;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
}

/*
    Model: SubscriptionCurrentPeriod
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class SubscriptionCurrentPeriod {
    
    
    
    
    
    @JsonProperty("start")
    private String start;
    
    
    
    
    
    @JsonProperty("end")
    private String end;
    
    
    
    
}

/*
    Model: SubscriptionPauseCollection
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class SubscriptionPauseCollection {
    
    
    
    
    
    @JsonProperty("behavior")
    private String behavior;
    
    
    
    
    
    @JsonProperty("resume_at")
    private String resumeAt;
    
    
    
    
}

/*
    Model: SubscriptionTrial
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class SubscriptionTrial {
    
    
    
    
    
    @JsonProperty("start")
    private String start;
    
    
    
    
    
    @JsonProperty("end")
    private String end;
    
    
    
    
}

/*
    Model: SubscriptionInvoiceSettings
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class SubscriptionInvoiceSettings {
    
    
    
    
    
    @JsonProperty("generation")
    private Boolean generation;
    
    
    
    
    
    @JsonProperty("charging")
    private Boolean charging;
    
    
    
    
}

/*
    Model: Subscription
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Subscription {
    
    
    
    
    
    @JsonProperty("current_period")
    private SubscriptionCurrentPeriod currentPeriod;
    
    
    
    
    
    @JsonProperty("pause_collection")
    private SubscriptionPauseCollection pauseCollection;
    
    
    
    
    
    @JsonProperty("trial")
    private SubscriptionTrial trial;
    
    
    
    
    
    @JsonProperty("invoice_settings")
    private SubscriptionInvoiceSettings invoiceSettings;
    
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    
    @JsonProperty("cancel_at_period_end")
    private Boolean cancelAtPeriodEnd;
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("subscriber_id")
    private String subscriberId;
    
    
    
    
    
    @JsonProperty("plan_id")
    private String planId;
    
    
    
    
    
    @JsonProperty("product_suite_id")
    private String productSuiteId;
    
    
    
    
    
    @JsonProperty("plan_data")
    private Plan planData;
    
    
    
    
    
    @JsonProperty("current_status")
    private String currentStatus;
    
    
    
    
    
    @JsonProperty("collection_method")
    private String collectionMethod;
    
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    
    @JsonProperty("modified_at")
    private String modifiedAt;
    
    
    
    
    
    @JsonProperty("latest_invoice")
    private String latestInvoice;
    
    
    
    
}

/*
    Model: SubscriptionStatus
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class SubscriptionStatus {
    
    
    
    
    
    @JsonProperty("is_enabled")
    private Boolean isEnabled;
    
    
    
    
    
    @JsonProperty("subscription")
    private Subscription subscription;
    
    
    
    
}

/*
    Model: SubscriptionLimitApplication
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class SubscriptionLimitApplication {
    
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
    
    @JsonProperty("hard_limit")
    private Integer hardLimit;
    
    
    
    
    
    @JsonProperty("soft_limit")
    private Integer softLimit;
    
    
    
    
}

/*
    Model: SubscriptionLimitMarketplace
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class SubscriptionLimitMarketplace {
    
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
}

/*
    Model: SubscriptionLimitOtherPlatform
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class SubscriptionLimitOtherPlatform {
    
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
}

/*
    Model: SubscriptionLimitTeam
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class SubscriptionLimitTeam {
    
    
    
    
    
    @JsonProperty("limit")
    private Integer limit;
    
    
    
    
}

/*
    Model: SubscriptionLimitProducts
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class SubscriptionLimitProducts {
    
    
    
    
    
    @JsonProperty("bulk")
    private Boolean bulk;
    
    
    
    
    
    @JsonProperty("limit")
    private Integer limit;
    
    
    
    
}

/*
    Model: SubscriptionLimitExtensions
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class SubscriptionLimitExtensions {
    
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
    
    @JsonProperty("limit")
    private Integer limit;
    
    
    
    
}

/*
    Model: SubscriptionLimitIntegrations
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class SubscriptionLimitIntegrations {
    
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
    
    @JsonProperty("limit")
    private Integer limit;
    
    
    
    
}

/*
    Model: SubscriptionLimit
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class SubscriptionLimit {
    
    
    
    
    
    @JsonProperty("application")
    private SubscriptionLimitApplication application;
    
    
    
    
    
    @JsonProperty("marketplace")
    private SubscriptionLimitMarketplace marketplace;
    
    
    
    
    
    @JsonProperty("other_platform")
    private SubscriptionLimitOtherPlatform otherPlatform;
    
    
    
    
    
    @JsonProperty("team")
    private SubscriptionLimitTeam team;
    
    
    
    
    
    @JsonProperty("products")
    private SubscriptionLimitProducts products;
    
    
    
    
    
    @JsonProperty("extensions")
    private SubscriptionLimitExtensions extensions;
    
    
    
    
    
    @JsonProperty("integrations")
    private SubscriptionLimitIntegrations integrations;
    
    
    
    
    
    @JsonProperty("is_trial_plan")
    private Boolean isTrialPlan;
    
    
    
    
}

/*
    Model: SubscriptionActivateReq
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class SubscriptionActivateReq {
    
    
    
    
    
    @JsonProperty("unique_id")
    private String uniqueId;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("product_suite")
    private String productSuite;
    
    
    
    
    
    @JsonProperty("plan_id")
    private String planId;
    
    
    
    
    
    @JsonProperty("payment_method")
    private String paymentMethod;
    
    
    
    
}

/*
    Model: SubscriptionActivateRes
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class SubscriptionActivateRes {
    
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    
    @JsonProperty("data")
    private Subscription data;
    
    
    
    
}

/*
    Model: CancelSubscriptionReq
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CancelSubscriptionReq {
    
    
    
    
    
    @JsonProperty("unique_id")
    private String uniqueId;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("product_suite")
    private String productSuite;
    
    
    
    
    
    @JsonProperty("subscription_id")
    private String subscriptionId;
    
    
    
    
}

/*
    Model: CancelSubscriptionRes
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CancelSubscriptionRes {
    
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    
    @JsonProperty("data")
    private Subscription data;
    
    
    
    
}



/*
    Model: StatsImported
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class StatsImported {
    
    
    
    
    
    @JsonProperty("count")
    private Integer count;
    
    
    
    
}

/*
    Model: StatsProcessedEmail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class StatsProcessedEmail {
    
    
    
    
    
    @JsonProperty("success")
    private Integer success;
    
    
    
    
    
    @JsonProperty("failed")
    private Integer failed;
    
    
    
    
    
    @JsonProperty("suppressed")
    private Integer suppressed;
    
    
    
    
}

/*
    Model: StatsProcessedSms
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class StatsProcessedSms {
    
    
    
    
    
    @JsonProperty("success")
    private Integer success;
    
    
    
    
    
    @JsonProperty("failed")
    private Integer failed;
    
    
    
    
    
    @JsonProperty("suppressed")
    private Integer suppressed;
    
    
    
    
}

/*
    Model: StatsProcessed
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class StatsProcessed {
    
    
    
    
    
    @JsonProperty("email")
    private StatsProcessedEmail email;
    
    
    
    
    
    @JsonProperty("sms")
    private StatsProcessedSms sms;
    
    
    
    
}

/*
    Model: Stats
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Stats {
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("imported")
    private Object imported;
    
    
    
    
    
    @JsonProperty("processed")
    private Object processed;
    
    
    
    
}

/*
    Model: GetStats
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class GetStats {
    
    
    
    
    
    @JsonProperty("items")
    private List<Stats> items;
    
    
    
    
}

/*
    Model: CampaignReq
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CampaignReq {
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    
    @JsonProperty("headers")
    private List<String> headers;
    
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("file_url")
    private String fileUrl;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("records_count")
    private Integer recordsCount;
    
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
}

/*
    Model: RecipientHeaders
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class RecipientHeaders {
    
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
}

/*
    Model: CampaignEmailTemplate
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CampaignEmailTemplate {
    
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
}

/*
    Model: CampignEmailProvider
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CampignEmailProvider {
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("from_name")
    private String fromName;
    
    
    
    
    
    @JsonProperty("from_email")
    private String fromEmail;
    
    
    
    
}

/*
    Model: CampaignEmail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CampaignEmail {
    
    
    
    
    
    @JsonProperty("template")
    private CampaignEmailTemplate template;
    
    
    
    
    
    @JsonProperty("provider")
    private CampignEmailProvider provider;
    
    
    
    
}

/*
    Model: Campaign
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Campaign {
    
    
    
    
    
    @JsonProperty("recipient_headers")
    private RecipientHeaders recipientHeaders;
    
    
    
    
    
    @JsonProperty("email")
    private CampaignEmail email;
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    
    @JsonProperty("tags")
    private List<Object> tags;
    
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("datasource")
    private String datasource;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    
    @JsonProperty("__v")
    private Integer v;
    
    
    
    
}

/*
    Model: Campaigns
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Campaigns {
    
    
    
    
    
    @JsonProperty("items")
    private List<Campaign> items;
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: BigqueryHeadersReq
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class BigqueryHeadersReq {
    
    
    
    
    
    @JsonProperty("query")
    private String query;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
}

/*
    Model: BigqueryHeadersResHeaders
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class BigqueryHeadersResHeaders {
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
}

/*
    Model: BigqueryHeadersRes
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class BigqueryHeadersRes {
    
    
    
    
    
    @JsonProperty("headers")
    private List<BigqueryHeadersResHeaders> headers;
    
    
    
    
}

/*
    Model: GetNRecordsCsvReq
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class GetNRecordsCsvReq {
    
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
    
    @JsonProperty("header")
    private Boolean header;
    
    
    
    
    
    @JsonProperty("count")
    private Integer count;
    
    
    
    
}

/*
    Model: GetNRecordsCsvResItems
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class GetNRecordsCsvResItems {
    
    
    
    
    
    @JsonProperty("phone_number")
    private String phoneNumber;
    
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    
    @JsonProperty("firstname")
    private String firstname;
    
    
    
    
    
    @JsonProperty("lastname")
    private String lastname;
    
    
    
    
    
    @JsonProperty("orderid")
    private String orderid;
    
    
    
    
}

/*
    Model: GetNRecordsCsvRes
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class GetNRecordsCsvRes {
    
    
    
    
    
    @JsonProperty("items")
    private List<GetNRecordsCsvResItems> items;
    
    
    
    
}

/*
    Model: AudienceReq
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class AudienceReq {
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    
    @JsonProperty("headers")
    private List<String> headers;
    
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("file_url")
    private String fileUrl;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("records_count")
    private Integer recordsCount;
    
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
}

/*
    Model: Audience
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Audience {
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    
    @JsonProperty("headers")
    private List<String> headers;
    
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("file_url")
    private String fileUrl;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("records_count")
    private Integer recordsCount;
    
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    
    @JsonProperty("__v")
    private Integer v;
    
    
    
    
}

/*
    Model: Audiences
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Audiences {
    
    
    
    
    
    @JsonProperty("items")
    private List<Audience> items;
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: EmailProviderReqFrom
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class EmailProviderReqFrom {
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    
    @JsonProperty("is_default")
    private Boolean isDefault;
    
    
    
    
}

/*
    Model: EmailProviderReq
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class EmailProviderReq {
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    
    @JsonProperty("api_key")
    private String apiKey;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("provider")
    private String provider;
    
    
    
    
    
    @JsonProperty("from")
    private List<EmailProviderReqFrom> from;
    
    
    
    
}

/*
    Model: EmailProvider
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class EmailProvider {
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("provider")
    private String provider;
    
    
    
    
    
    @JsonProperty("from")
    private List<EmailProviderReqFrom> from;
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    
    @JsonProperty("api_key")
    private String apiKey;
    
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    
    @JsonProperty("__v")
    private Integer v;
    
    
    
    
}

/*
    Model: EmailProviders
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class EmailProviders {
    
    
    
    
    
    @JsonProperty("items")
    private List<EmailProvider> items;
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: EmailTemplateDeleteSuccessRes
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class EmailTemplateDeleteSuccessRes {
    
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
}

/*
    Model: EmailTemplateDeleteFailureRes
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class EmailTemplateDeleteFailureRes {
    
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
}

/*
    Model: EmailTemplateKeys
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class EmailTemplateKeys {
    
    
    
    
    
    @JsonProperty("to")
    private String to;
    
    
    
    
    
    @JsonProperty("cc")
    private String cc;
    
    
    
    
    
    @JsonProperty("bcc")
    private String bcc;
    
    
    
    
}

/*
    Model: EmailTemplateHeaders
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class EmailTemplateHeaders {
    
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
}

/*
    Model: EmailTemplateReq
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class EmailTemplateReq {
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    
    @JsonProperty("keys")
    private EmailTemplateKeys keys;
    
    
    
    
    
    @JsonProperty("from")
    private String from;
    
    
    
    
    
    @JsonProperty("static_to")
    private List<String> staticTo;
    
    
    
    
    
    @JsonProperty("static_cc")
    private List<String> staticCc;
    
    
    
    
    
    @JsonProperty("static_bcc")
    private List<String> staticBcc;
    
    
    
    
    
    @JsonProperty("reply_to")
    private String replyTo;
    
    
    
    
    
    @JsonProperty("headers")
    private List<EmailTemplateHeaders> headers;
    
    
    
    
    
    @JsonProperty("subject")
    private TemplateAndType subject;
    
    
    
    
    
    @JsonProperty("html")
    private TemplateAndType html;
    
    
    
    
    
    @JsonProperty("text")
    private TemplateAndType text;
    
    
    
    
    
    @JsonProperty("attachments")
    private List<Object> attachments;
    
    
    
    
    
    @JsonProperty("priority")
    private String priority;
    
    
    
    
}

/*
    Model: TemplateAndType
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class TemplateAndType {
    
    
    
    
    
    @JsonProperty("template_type")
    private String templateType;
    
    
    
    
    
    @JsonProperty("template")
    private String template;
    
    
    
    
}

/*
    Model: EmailTemplateRes
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class EmailTemplateRes {
    
    
    
    
    
    @JsonProperty("is_system")
    private Boolean isSystem;
    
    
    
    
    
    @JsonProperty("is_internal")
    private Boolean isInternal;
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    
    @JsonProperty("static_to")
    private List<String> staticTo;
    
    
    
    
    
    @JsonProperty("static_cc")
    private List<String> staticCc;
    
    
    
    
    
    @JsonProperty("static_bcc")
    private List<String> staticBcc;
    
    
    
    
    
    @JsonProperty("tags")
    private List<Object> tags;
    
    
    
    
    
    @JsonProperty("priority")
    private String priority;
    
    
    
    
    
    @JsonProperty("published")
    private Boolean published;
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("keys")
    private EmailTemplateKeys keys;
    
    
    
    
    
    @JsonProperty("from")
    private String from;
    
    
    
    
    
    @JsonProperty("reply_to")
    private String replyTo;
    
    
    
    
    
    @JsonProperty("headers")
    private List<EmailTemplateHeaders> headers;
    
    
    
    
    
    @JsonProperty("subject")
    private TemplateAndType subject;
    
    
    
    
    
    @JsonProperty("html")
    private TemplateAndType html;
    
    
    
    
    
    @JsonProperty("text")
    private TemplateAndType text;
    
    
    
    
    
    @JsonProperty("attachments")
    private List<Object> attachments;
    
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    
    @JsonProperty("__v")
    private Integer v;
    
    
    
    
}

/*
    Model: EmailTemplate
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class EmailTemplate {
    
    
    
    
    
    @JsonProperty("is_system")
    private Boolean isSystem;
    
    
    
    
    
    @JsonProperty("is_internal")
    private Boolean isInternal;
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    
    @JsonProperty("static_to")
    private List<Object> staticTo;
    
    
    
    
    
    @JsonProperty("static_cc")
    private List<Object> staticCc;
    
    
    
    
    
    @JsonProperty("static_bcc")
    private List<Object> staticBcc;
    
    
    
    
    
    @JsonProperty("tags")
    private List<Object> tags;
    
    
    
    
    
    @JsonProperty("priority")
    private String priority;
    
    
    
    
    
    @JsonProperty("published")
    private Boolean published;
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("from")
    private String from;
    
    
    
    
    
    @JsonProperty("from_name")
    private String fromName;
    
    
    
    
    
    @JsonProperty("subject")
    private TemplateAndType subject;
    
    
    
    
    
    @JsonProperty("html")
    private TemplateAndType html;
    
    
    
    
    
    @JsonProperty("text")
    private TemplateAndType text;
    
    
    
    
    
    @JsonProperty("headers")
    private List<Object> headers;
    
    
    
    
    
    @JsonProperty("attachments")
    private List<Object> attachments;
    
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    
    @JsonProperty("__v")
    private Integer v;
    
    
    
    
}

/*
    Model: SystemEmailTemplate
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class SystemEmailTemplate {
    
    
    
    
    
    @JsonProperty("is_system")
    private Boolean isSystem;
    
    
    
    
    
    @JsonProperty("is_internal")
    private Boolean isInternal;
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    
    @JsonProperty("static_to")
    private List<Object> staticTo;
    
    
    
    
    
    @JsonProperty("static_cc")
    private List<Object> staticCc;
    
    
    
    
    
    @JsonProperty("static_bcc")
    private List<Object> staticBcc;
    
    
    
    
    
    @JsonProperty("tags")
    private List<Object> tags;
    
    
    
    
    
    @JsonProperty("priority")
    private String priority;
    
    
    
    
    
    @JsonProperty("published")
    private Boolean published;
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("from")
    private String from;
    
    
    
    
    
    @JsonProperty("from_name")
    private String fromName;
    
    
    
    
    
    @JsonProperty("subject")
    private TemplateAndType subject;
    
    
    
    
    
    @JsonProperty("html")
    private TemplateAndType html;
    
    
    
    
    
    @JsonProperty("text")
    private TemplateAndType text;
    
    
    
    
    
    @JsonProperty("headers")
    private List<Object> headers;
    
    
    
    
    
    @JsonProperty("attachments")
    private List<Object> attachments;
    
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    
    @JsonProperty("__v")
    private Integer v;
    
    
    
    
}

/*
    Model: EmailTemplates
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class EmailTemplates {
    
    
    
    
    
    @JsonProperty("items")
    private List<EmailTemplate> items;
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: SystemEmailTemplates
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class SystemEmailTemplates {
    
    
    
    
    
    @JsonProperty("items")
    private List<SystemEmailTemplate> items;
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: EventSubscriptionTemplateSms
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class EventSubscriptionTemplateSms {
    
    
    
    
    
    @JsonProperty("subscribed")
    private Boolean subscribed;
    
    
    
    
    
    @JsonProperty("template")
    private String template;
    
    
    
    
}

/*
    Model: EventSubscriptionTemplateEmail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class EventSubscriptionTemplateEmail {
    
    
    
    
    
    @JsonProperty("subscribed")
    private Boolean subscribed;
    
    
    
    
    
    @JsonProperty("template")
    private String template;
    
    
    
    
}

/*
    Model: EventSubscriptionTemplate
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class EventSubscriptionTemplate {
    
    
    
    
    
    @JsonProperty("sms")
    private EventSubscriptionTemplateSms sms;
    
    
    
    
    
    @JsonProperty("email")
    private EventSubscriptionTemplateEmail email;
    
    
    
    
}

/*
    Model: EventSubscription
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class EventSubscription {
    
    
    
    
    
    @JsonProperty("template")
    private EventSubscriptionTemplate template;
    
    
    
    
    
    @JsonProperty("is_default")
    private Boolean isDefault;
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    
    @JsonProperty("event")
    private String event;
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    
    @JsonProperty("__v")
    private Integer v;
    
    
    
    
}

/*
    Model: EventSubscriptions
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class EventSubscriptions {
    
    
    
    
    
    @JsonProperty("items")
    private List<EventSubscription> items;
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: TriggerJobResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class TriggerJobResponse {
    
    
    
    
    
    @JsonProperty("status")
    private Integer status;
    
    
    
    
}

/*
    Model: TriggerJobRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class TriggerJobRequest {
    
    
    
    
    
    @JsonProperty("job_id")
    private String jobId;
    
    
    
    
}

/*
    Model: Job
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Job {
    
    
    
    
    
    @JsonProperty("completed")
    private Boolean completed;
    
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("campaign")
    private String campaign;
    
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    
    @JsonProperty("__v")
    private Integer v;
    
    
    
    
}

/*
    Model: Jobs
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Jobs {
    
    
    
    
    
    @JsonProperty("items")
    private List<Job> items;
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: JobLog
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class JobLog {
    
    
    
    
    
    @JsonProperty("imported")
    private Object imported;
    
    
    
    
    
    @JsonProperty("processed")
    private Object processed;
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("job")
    private String job;
    
    
    
    
    
    @JsonProperty("campaign")
    private String campaign;
    
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    
    @JsonProperty("__v")
    private Integer v;
    
    
    
    
}

/*
    Model: JobLogs
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class JobLogs {
    
    
    
    
    
    @JsonProperty("items")
    private List<JobLog> items;
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: LogEmail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class LogEmail {
    
    
    
    
    
    @JsonProperty("template")
    private String template;
    
    
    
    
}

/*
    Model: LogPushnotification
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class LogPushnotification {
    
    
    
    
    
    @JsonProperty("pushtokens")
    private List<String> pushtokens;
    
    
    
    
}

/*
    Model: LogMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class LogMeta {
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("identifier")
    private String identifier;
    
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    
    @JsonProperty("offset")
    private String offset;
    
    
    
    
    
    @JsonProperty("partition")
    private String partition;
    
    
    
    
    
    @JsonProperty("topic")
    private String topic;
    
    
    
    
}

/*
    Model: Log
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Log {
    
    
    
    
    
    @JsonProperty("email")
    private LogEmail email;
    
    
    
    
    
    @JsonProperty("pushnotification")
    private LogPushnotification pushnotification;
    
    
    
    
    
    @JsonProperty("meta")
    private LogMeta meta;
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    
    @JsonProperty("service")
    private String service;
    
    
    
    
    
    @JsonProperty("step")
    private String step;
    
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    
    @JsonProperty("data")
    private Object data;
    
    
    
    
    
    @JsonProperty("expire_at")
    private String expireAt;
    
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
}

/*
    Model: Logs
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Logs {
    
    
    
    
    
    @JsonProperty("items")
    private List<Log> items;
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: PushtokenReq
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class PushtokenReq {
    
    
    
    
    
    @JsonProperty("action")
    private String action;
    
    
    
    
    
    @JsonProperty("bundle_identifier")
    private String bundleIdentifier;
    
    
    
    
    
    @JsonProperty("push_token")
    private String pushToken;
    
    
    
    
    
    @JsonProperty("unique_device_id")
    private String uniqueDeviceId;
    
    
    
    
}

/*
    Model: PushtokenRes
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class PushtokenRes {
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("bundle_identifier")
    private String bundleIdentifier;
    
    
    
    
    
    @JsonProperty("push_token")
    private String pushToken;
    
    
    
    
    
    @JsonProperty("unique_device_id")
    private String uniqueDeviceId;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("platform")
    private String platform;
    
    
    
    
    
    @JsonProperty("application_id")
    private String applicationId;
    
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    
    @JsonProperty("expired_at")
    private String expiredAt;
    
    
    
    
}

/*
    Model: SmsProviderReq
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class SmsProviderReq {
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    
    @JsonProperty("sender")
    private String sender;
    
    
    
    
    
    @JsonProperty("username")
    private String username;
    
    
    
    
    
    @JsonProperty("authkey")
    private String authkey;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("provider")
    private String provider;
    
    
    
    
}

/*
    Model: SmsProvider
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class SmsProvider {
    
    
    
    
    
    @JsonProperty("rpt")
    private Integer rpt;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("provider")
    private String provider;
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    
    @JsonProperty("sender")
    private String sender;
    
    
    
    
    
    @JsonProperty("username")
    private String username;
    
    
    
    
    
    @JsonProperty("authkey")
    private String authkey;
    
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    
    @JsonProperty("__v")
    private Integer v;
    
    
    
    
}

/*
    Model: SmsProviders
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class SmsProviders {
    
    
    
    
    
    @JsonProperty("items")
    private List<SmsProvider> items;
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: SmsTemplateDeleteSuccessRes
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class SmsTemplateDeleteSuccessRes {
    
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
}

/*
    Model: SmsTemplateDeleteFailureRes
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class SmsTemplateDeleteFailureRes {
    
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
}

/*
    Model: SmsTemplateMessage
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class SmsTemplateMessage {
    
    
    
    
    
    @JsonProperty("template_type")
    private String templateType;
    
    
    
    
    
    @JsonProperty("template")
    private String template;
    
    
    
    
}

/*
    Model: SmsTemplateReq
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class SmsTemplateReq {
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    
    @JsonProperty("message")
    private SmsTemplateMessage message;
    
    
    
    
    
    @JsonProperty("template_variables")
    private Object templateVariables;
    
    
    
    
    
    @JsonProperty("attachments")
    private List<Object> attachments;
    
    
    
    
    
    @JsonProperty("priority")
    private String priority;
    
    
    
    
}

/*
    Model: SmsTemplateRes
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class SmsTemplateRes {
    
    
    
    
    
    @JsonProperty("is_system")
    private Boolean isSystem;
    
    
    
    
    
    @JsonProperty("is_internal")
    private Boolean isInternal;
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    
    @JsonProperty("tags")
    private List<Object> tags;
    
    
    
    
    
    @JsonProperty("priority")
    private String priority;
    
    
    
    
    
    @JsonProperty("published")
    private Boolean published;
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("message")
    private SmsTemplateMessage message;
    
    
    
    
    
    @JsonProperty("template_variables")
    private Object templateVariables;
    
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    
    @JsonProperty("__v")
    private Integer v;
    
    
    
    
}

/*
    Model: SmsTemplate
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class SmsTemplate {
    
    
    
    
    
    @JsonProperty("is_system")
    private Boolean isSystem;
    
    
    
    
    
    @JsonProperty("is_internal")
    private Boolean isInternal;
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    
    @JsonProperty("priority")
    private String priority;
    
    
    
    
    
    @JsonProperty("tags")
    private List<Object> tags;
    
    
    
    
    
    @JsonProperty("published")
    private Boolean published;
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("message")
    private SmsTemplateMessage message;
    
    
    
    
    
    @JsonProperty("template_variables")
    private Object templateVariables;
    
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    
    @JsonProperty("__v")
    private Integer v;
    
    
    
    
}

/*
    Model: SystemSmsTemplate
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class SystemSmsTemplate {
    
    
    
    
    
    @JsonProperty("is_system")
    private Boolean isSystem;
    
    
    
    
    
    @JsonProperty("is_internal")
    private Boolean isInternal;
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    
    @JsonProperty("tags")
    private List<Object> tags;
    
    
    
    
    
    @JsonProperty("priority")
    private String priority;
    
    
    
    
    
    @JsonProperty("published")
    private Boolean published;
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("message")
    private SmsTemplateMessage message;
    
    
    
    
    
    @JsonProperty("template_variables")
    private Object templateVariables;
    
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    
    @JsonProperty("__v")
    private Integer v;
    
    
    
    
}

/*
    Model: SmsTemplates
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class SmsTemplates {
    
    
    
    
    
    @JsonProperty("items")
    private List<SmsTemplate> items;
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: SystemSmsTemplates
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class SystemSmsTemplates {
    
    
    
    
    
    @JsonProperty("items")
    private List<SystemSmsTemplate> items;
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: Notification
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Notification {
    
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    
    @JsonProperty("body")
    private String body;
    
    
    
    
    
    @JsonProperty("subtitle")
    private String subtitle;
    
    
    
    
    
    @JsonProperty("icon")
    private String icon;
    
    
    
    
    
    @JsonProperty("deeplink")
    private String deeplink;
    
    
    
    
    
    @JsonProperty("click_action")
    private String clickAction;
    
    
    
    
}

/*
    Model: SystemNotificationUser
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class SystemNotificationUser {
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
}

/*
    Model: SystemNotificationSettings
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class SystemNotificationSettings {
    
    
    
    
    
    @JsonProperty("sound")
    private Boolean sound;
    
    
    
    
    
    @JsonProperty("priority")
    private String priority;
    
    
    
    
    
    @JsonProperty("time_to_live")
    private String timeToLive;
    
    
    
    
}

/*
    Model: SystemNotification
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class SystemNotification {
    
    
    
    
    
    @JsonProperty("notification")
    private Notification notification;
    
    
    
    
    
    @JsonProperty("user")
    private SystemNotificationUser user;
    
    
    
    
    
    @JsonProperty("settings")
    private SystemNotificationUser settings;
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("group")
    private String group;
    
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
}

/*
    Model: SystemNotificationsPage
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class SystemNotificationsPage {
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("current")
    private Integer current;
    
    
    
    
    
    @JsonProperty("size")
    private Integer size;
    
    
    
    
    
    @JsonProperty("item_total")
    private Integer itemTotal;
    
    
    
    
    
    @JsonProperty("has_next")
    private Boolean hasNext;
    
    
    
    
}

/*
    Model: SystemNotifications
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class SystemNotifications {
    
    
    
    
    
    @JsonProperty("items")
    private List<SystemNotification> items;
    
    
    
    
    
    @JsonProperty("last_read_anchor")
    private Integer lastReadAnchor;
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}



/*
    Model: PaymentGatewayConfigResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class PaymentGatewayConfigResponse {
    
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
    
    @JsonProperty("aggregators")
    private List<Object> aggregators;
    
    
    
    
    
    @JsonProperty("excluded_fields")
    private List<String> excludedFields;
    
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    
    @JsonProperty("created")
    private Boolean created;
    
    
    
    
    
    @JsonProperty("display_fields")
    private List<String> displayFields;
    
    
    
    
}

/*
    Model: ErrorCodeDescription
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ErrorCodeDescription {
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
}

/*
    Model: PaymentGatewayConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class PaymentGatewayConfig {
    
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    
    @JsonProperty("config_type")
    private String configType;
    
    
    
    
    
    @JsonProperty("merchant_salt")
    private String merchantSalt;
    
    
    
    
    
    @JsonProperty("secret")
    private String secret;
    
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
}

/*
    Model: PaymentGatewayConfigRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class PaymentGatewayConfigRequest {
    
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    
    @JsonProperty("aggregator_name")
    private PaymentGatewayConfig aggregatorName;
    
    
    
    
}

/*
    Model: PaymentGatewayToBeReviewed
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class PaymentGatewayToBeReviewed {
    
    
    
    
    
    @JsonProperty("aggregator")
    private List<String> aggregator;
    
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
}

/*
    Model: ErrorCodeAndDescription
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ErrorCodeAndDescription {
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
}

/*
    Model: HttpErrorCodeAndResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class HttpErrorCodeAndResponse {
    
    
    
    
    
    @JsonProperty("error")
    private ErrorCodeAndDescription error;
    
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
}

/*
    Model: PaymentModeLogo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class PaymentModeLogo {
    
    
    
    
    
    @JsonProperty("large")
    private String large;
    
    
    
    
    
    @JsonProperty("small")
    private String small;
    
    
    
    
}

/*
    Model: PaymentModeList
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class PaymentModeList {
    
    
    
    
    
    @JsonProperty("nickname")
    private String nickname;
    
    
    
    
    
    @JsonProperty("card_isin")
    private String cardIsin;
    
    
    
    
    
    @JsonProperty("exp_month")
    private Integer expMonth;
    
    
    
    
    
    @JsonProperty("card_reference")
    private String cardReference;
    
    
    
    
    
    @JsonProperty("card_fingerprint")
    private String cardFingerprint;
    
    
    
    
    
    @JsonProperty("aggregator_name")
    private String aggregatorName;
    
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    
    @JsonProperty("card_id")
    private String cardId;
    
    
    
    
    
    @JsonProperty("fynd_vpa")
    private String fyndVpa;
    
    
    
    
    
    @JsonProperty("card_brand_image")
    private String cardBrandImage;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("card_token")
    private String cardToken;
    
    
    
    
    
    @JsonProperty("retry_count")
    private Integer retryCount;
    
    
    
    
    
    @JsonProperty("expired")
    private Boolean expired;
    
    
    
    
    
    @JsonProperty("merchant_code")
    private String merchantCode;
    
    
    
    
    
    @JsonProperty("card_issuer")
    private String cardIssuer;
    
    
    
    
    
    @JsonProperty("exp_year")
    private Integer expYear;
    
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    
    @JsonProperty("card_number")
    private String cardNumber;
    
    
    
    
    
    @JsonProperty("card_type")
    private String cardType;
    
    
    
    
    
    @JsonProperty("timeout")
    private Integer timeout;
    
    
    
    
    
    @JsonProperty("intent_app_error_list")
    private List<String> intentAppErrorList;
    
    
    
    
    
    @JsonProperty("intent_flow")
    private Boolean intentFlow;
    
    
    
    
    
    @JsonProperty("card_name")
    private String cardName;
    
    
    
    
    
    @JsonProperty("logo_url")
    private PaymentModeLogo logoUrl;
    
    
    
    
    
    @JsonProperty("card_brand")
    private String cardBrand;
    
    
    
    
    
    @JsonProperty("display_priority")
    private Integer displayPriority;
    
    
    
    
}

/*
    Model: RootPaymentMode
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class RootPaymentMode {
    
    
    
    
    
    @JsonProperty("add_card_enabled")
    private Boolean addCardEnabled;
    
    
    
    
    
    @JsonProperty("anonymous_enable")
    private Boolean anonymousEnable;
    
    
    
    
    
    @JsonProperty("list")
    private List<PaymentModeList> list;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("aggregator_name")
    private String aggregatorName;
    
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    
    @JsonProperty("display_priority")
    private Integer displayPriority;
    
    
    
    
}

/*
    Model: PaymentOptions
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class PaymentOptions {
    
    
    
    
    
    @JsonProperty("payment_option")
    private List<RootPaymentMode> paymentOption;
    
    
    
    
}

/*
    Model: PaymentOptionsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class PaymentOptionsResponse {
    
    
    
    
    
    @JsonProperty("payment_options")
    private PaymentOptions paymentOptions;
    
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
}

/*
    Model: PayoutsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class PayoutsResponse {
    
    
    
    
    
    @JsonProperty("transfer_type")
    private String transferType;
    
    
    
    
    
    @JsonProperty("payouts_aggregators")
    private List<Object> payoutsAggregators;
    
    
    
    
    
    @JsonProperty("more_attributes")
    private Object moreAttributes;
    
    
    
    
    
    @JsonProperty("unique_transfer_no")
    private Object uniqueTransferNo;
    
    
    
    
    
    @JsonProperty("customers")
    private Object customers;
    
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    
    @JsonProperty("is_default")
    private Boolean isDefault;
    
    
    
    
}

/*
    Model: PayoutBankDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class PayoutBankDetails {
    
    
    
    
    
    @JsonProperty("pincode")
    private Integer pincode;
    
    
    
    
    
    @JsonProperty("bank_name")
    private String bankName;
    
    
    
    
    
    @JsonProperty("account_no")
    private String accountNo;
    
    
    
    
    
    @JsonProperty("account_type")
    private String accountType;
    
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    
    @JsonProperty("branch_name")
    private String branchName;
    
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    
    @JsonProperty("account_holder")
    private String accountHolder;
    
    
    
    
    
    @JsonProperty("ifsc_code")
    private String ifscCode;
    
    
    
    
}

/*
    Model: PayoutRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class PayoutRequest {
    
    
    
    
    
    @JsonProperty("aggregator")
    private String aggregator;
    
    
    
    
    
    @JsonProperty("bank_details")
    private PayoutBankDetails bankDetails;
    
    
    
    
    
    @JsonProperty("transfer_type")
    private String transferType;
    
    
    
    
    
    @JsonProperty("users")
    private Object users;
    
    
    
    
    
    @JsonProperty("unique_external_id")
    private String uniqueExternalId;
    
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
}

/*
    Model: PayoutResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class PayoutResponse {
    
    
    
    
    
    @JsonProperty("aggregator")
    private String aggregator;
    
    
    
    
    
    @JsonProperty("bank_details")
    private Object bankDetails;
    
    
    
    
    
    @JsonProperty("payouts")
    private Object payouts;
    
    
    
    
    
    @JsonProperty("transfer_type")
    private String transferType;
    
    
    
    
    
    @JsonProperty("payment_status")
    private String paymentStatus;
    
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    
    @JsonProperty("users")
    private Object users;
    
    
    
    
    
    @JsonProperty("unique_transfer_no")
    private String uniqueTransferNo;
    
    
    
    
    
    @JsonProperty("created")
    private Boolean created;
    
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
}

/*
    Model: UpdatePayoutResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class UpdatePayoutResponse {
    
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    
    @JsonProperty("is_default")
    private Boolean isDefault;
    
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
}

/*
    Model: UpdatePayoutRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class UpdatePayoutRequest {
    
    
    
    
    
    @JsonProperty("unique_external_id")
    private String uniqueExternalId;
    
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    
    @JsonProperty("is_default")
    private Boolean isDefault;
    
    
    
    
}

/*
    Model: DeletePayoutResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class DeletePayoutResponse {
    
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
}

/*
    Model: SubscriptionPaymentMethodResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class SubscriptionPaymentMethodResponse {
    
    
    
    
    
    @JsonProperty("data")
    private List<Object> data;
    
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
}

/*
    Model: DeleteSubscriptionPaymentMethodResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class DeleteSubscriptionPaymentMethodResponse {
    
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
}

/*
    Model: SubscriptionConfigResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class SubscriptionConfigResponse {
    
    
    
    
    
    @JsonProperty("config")
    private Object config;
    
    
    
    
    
    @JsonProperty("aggregator")
    private String aggregator;
    
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
}

/*
    Model: SaveSubscriptionSetupIntentRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class SaveSubscriptionSetupIntentRequest {
    
    
    
    
    
    @JsonProperty("unique_external_id")
    private String uniqueExternalId;
    
    
    
    
}

/*
    Model: SaveSubscriptionSetupIntentResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class SaveSubscriptionSetupIntentResponse {
    
    
    
    
    
    @JsonProperty("data")
    private Object data;
    
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
}

/*
    Model: BeneficiaryModeDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class BeneficiaryModeDetails {
    
    
    
    
    
    @JsonProperty("comment")
    private String comment;
    
    
    
    
    
    @JsonProperty("bank_name")
    private String bankName;
    
    
    
    
    
    @JsonProperty("account_no")
    private String accountNo;
    
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    
    @JsonProperty("wallet")
    private String wallet;
    
    
    
    
    
    @JsonProperty("mobile")
    private String mobile;
    
    
    
    
    
    @JsonProperty("branch_name")
    private String branchName;
    
    
    
    
    
    @JsonProperty("address")
    private String address;
    
    
    
    
    
    @JsonProperty("vpa")
    private String vpa;
    
    
    
    
    
    @JsonProperty("account_holder")
    private String accountHolder;
    
    
    
    
    
    @JsonProperty("ifsc_code")
    private String ifscCode;
    
    
    
    
}

/*
    Model: AddBeneficiaryDetailsRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class AddBeneficiaryDetailsRequest {
    
    
    
    
    
    @JsonProperty("details")
    private BeneficiaryModeDetails details;
    
    
    
    
    
    @JsonProperty("shipment_id")
    private String shipmentId;
    
    
    
    
    
    @JsonProperty("transfer_mode")
    private String transferMode;
    
    
    
    
    
    @JsonProperty("otp")
    private String otp;
    
    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
    
    
    @JsonProperty("delights")
    private Boolean delights;
    
    
    
    
    
    @JsonProperty("request_id")
    private String requestId;
    
    
    
    
}

/*
    Model: RefundAccountResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class RefundAccountResponse {
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    
    @JsonProperty("data")
    private Object data;
    
    
    
    
    
    @JsonProperty("is_verified_flag")
    private Boolean isVerifiedFlag;
    
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
}

/*
    Model: NotFoundResourceError
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class NotFoundResourceError {
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
}

/*
    Model: IfscCodeResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class IfscCodeResponse {
    
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    
    @JsonProperty("bank_name")
    private String bankName;
    
    
    
    
    
    @JsonProperty("branch_name")
    private String branchName;
    
    
    
    
}

/*
    Model: OrderBeneficiaryDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class OrderBeneficiaryDetails {
    
    
    
    
    
    @JsonProperty("account_no")
    private String accountNo;
    
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    
    @JsonProperty("branch_name")
    private Boolean branchName;
    
    
    
    
    
    @JsonProperty("comment")
    private Boolean comment;
    
    
    
    
    
    @JsonProperty("subtitle")
    private String subtitle;
    
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    
    @JsonProperty("beneficiary_id")
    private String beneficiaryId;
    
    
    
    
    
    @JsonProperty("bank_name")
    private String bankName;
    
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    
    @JsonProperty("mobile")
    private Boolean mobile;
    
    
    
    
    
    @JsonProperty("transfer_mode")
    private String transferMode;
    
    
    
    
    
    @JsonProperty("account_holder")
    private String accountHolder;
    
    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    
    @JsonProperty("ifsc_code")
    private String ifscCode;
    
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    
    @JsonProperty("delights_user_name")
    private String delightsUserName;
    
    
    
    
    
    @JsonProperty("address")
    private String address;
    
    
    
    
}

/*
    Model: OrderBeneficiaryResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class OrderBeneficiaryResponse {
    
    
    
    
    
    @JsonProperty("show_beneficiary_details")
    private Boolean showBeneficiaryDetails;
    
    
    
    
    
    @JsonProperty("beneficiaries")
    private List<OrderBeneficiaryDetails> beneficiaries;
    
    
    
    
}

/*
    Model: MultiTenderPaymentMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class MultiTenderPaymentMeta {
    
    
    
    
    
    @JsonProperty("current_status")
    private String currentStatus;
    
    
    
    
    
    @JsonProperty("payment_id")
    private String paymentId;
    
    
    
    
    
    @JsonProperty("extra_meta")
    private Object extraMeta;
    
    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
    
    
    @JsonProperty("payment_gateway")
    private String paymentGateway;
    
    
    
    
}

/*
    Model: MultiTenderPaymentMethod
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class MultiTenderPaymentMethod {
    
    
    
    
    
    @JsonProperty("amount")
    private Double amount;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("mode")
    private String mode;
    
    
    
    
    
    @JsonProperty("meta")
    private MultiTenderPaymentMeta meta;
    
    
    
    
}

/*
    Model: PaymentConfirmationRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class PaymentConfirmationRequest {
    
    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
    
    
    @JsonProperty("payment_methods")
    private List<MultiTenderPaymentMethod> paymentMethods;
    
    
    
    
}

/*
    Model: PaymentConfirmationResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class PaymentConfirmationResponse {
    
    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
}



/*
    Model: DeleteResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class DeleteResponse {
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
}

/*
    Model: ErrorResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ErrorResponse {
    
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    
    @JsonProperty("status")
    private Integer status;
    
    
    
    
}

/*
    Model: GetSearchWordsData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class GetSearchWordsData {
    
    
    
    
    
    @JsonProperty("words")
    private List<String> words;
    
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
    
    @JsonProperty("result")
    private Object result;
    
    
    
    
}

/*
    Model: GetSearchWordsDetailResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class GetSearchWordsDetailResponse {
    
    
    
    
    
    @JsonProperty("items")
    private GetSearchWordsData items;
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: SearchKeywordResult
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class SearchKeywordResult {
    
    
    
    
    
    @JsonProperty("query")
    private Object query;
    
    
    
    
    
    @JsonProperty("sort_on")
    private String sortOn;
    
    
    
    
}

/*
    Model: CreateSearchKeyword
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CreateSearchKeyword {
    
    
    
    
    
    @JsonProperty("words")
    private List<String> words;
    
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    
    @JsonProperty("result")
    private SearchKeywordResult result;
    
    
    
    
}

/*
    Model: GetSearchWordsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class GetSearchWordsResponse {
    
    
    
    
    
    @JsonProperty("items")
    private List<GetSearchWordsData> items;
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: GetAutocompleteWordsData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class GetAutocompleteWordsData {
    
    
    
    
    
    @JsonProperty("words")
    private List<String> words;
    
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
    
    @JsonProperty("results")
    private List<Object> results;
    
    
    
    
}

/*
    Model: GetAutocompleteWordsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class GetAutocompleteWordsResponse {
    
    
    
    
    
    @JsonProperty("items")
    private List<GetAutocompleteWordsData> items;
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: Media
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Media {
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
}

/*
    Model: AutocompletePageAction
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class AutocompletePageAction {
    
    
    
    
    
    @JsonProperty("query")
    private Object query;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("params")
    private Object params;
    
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
}

/*
    Model: AutocompleteAction
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class AutocompleteAction {
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("page")
    private AutocompletePageAction page;
    
    
    
    
}

/*
    Model: AutocompleteResult
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class AutocompleteResult {
    
    
    
    
    
    @JsonProperty("logo")
    private Media logo;
    
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    
    @JsonProperty("action")
    private AutocompleteAction action;
    
    
    
    
}

/*
    Model: CreateAutocompleteKeyword
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CreateAutocompleteKeyword {
    
    
    
    
    
    @JsonProperty("words")
    private List<String> words;
    
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
    
    @JsonProperty("results")
    private List<AutocompleteResult> results;
    
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
}

/*
    Model: CreateAutocompleteWordsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CreateAutocompleteWordsResponse {
    
    
    
    
    
    @JsonProperty("words")
    private List<String> words;
    
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
    
    @JsonProperty("results")
    private List<Object> results;
    
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
}

/*
    Model: ProductBundleItem
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ProductBundleItem {
    
    
    
    
    
    @JsonProperty("min_quantity")
    private Integer minQuantity;
    
    
    
    
    
    @JsonProperty("auto_add_to_cart")
    private Boolean autoAddToCart;
    
    
    
    
    
    @JsonProperty("max_quantity")
    private Integer maxQuantity;
    
    
    
    
    
    @JsonProperty("product_uid")
    private Integer productUid;
    
    
    
    
    
    @JsonProperty("auto_select")
    private Boolean autoSelect;
    
    
    
    
    
    @JsonProperty("allow_remove")
    private Boolean allowRemove;
    
    
    
    
}

/*
    Model: GetProductBundleCreateResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class GetProductBundleCreateResponse {
    
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    
    @JsonProperty("page_visibility")
    private List<String> pageVisibility;
    
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    
    @JsonProperty("modified_by")
    private Object modifiedBy;
    
    
    
    
    
    @JsonProperty("choice")
    private String choice;
    
    
    
    
    
    @JsonProperty("created_by")
    private Object createdBy;
    
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    
    @JsonProperty("same_store_assignment")
    private Boolean sameStoreAssignment;
    
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    
    @JsonProperty("products")
    private List<ProductBundleItem> products;
    
    
    
    
}

/*
    Model: GetProductBundleListingResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class GetProductBundleListingResponse {
    
    
    
    
    
    @JsonProperty("items")
    private List<GetProductBundleCreateResponse> items;
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: ProductBundleRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ProductBundleRequest {
    
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    
    @JsonProperty("page_visibility")
    private List<String> pageVisibility;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    
    @JsonProperty("modified_by")
    private Object modifiedBy;
    
    
    
    
    
    @JsonProperty("choice")
    private String choice;
    
    
    
    
    
    @JsonProperty("created_by")
    private Object createdBy;
    
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    
    @JsonProperty("same_store_assignment")
    private Boolean sameStoreAssignment;
    
    
    
    
    
    @JsonProperty("products")
    private List<ProductBundleItem> products;
    
    
    
    
}

/*
    Model: Size
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Size {
    
    
    
    
    
    @JsonProperty("is_available")
    private Boolean isAvailable;
    
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
}

/*
    Model: Price
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Price {
    
    
    
    
    
    @JsonProperty("max_effective")
    private Double maxEffective;
    
    
    
    
    
    @JsonProperty("min_marked")
    private Double minMarked;
    
    
    
    
    
    @JsonProperty("min_effective")
    private Double minEffective;
    
    
    
    
    
    @JsonProperty("max_marked")
    private Double maxMarked;
    
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
}

/*
    Model: LimitedProductData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class LimitedProductData {
    
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    
    @JsonProperty("price")
    private Object price;
    
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    
    @JsonProperty("sizes")
    private List<String> sizes;
    
    
    
    
    
    @JsonProperty("attributes")
    private Object attributes;
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    
    @JsonProperty("country_of_origin")
    private String countryOfOrigin;
    
    
    
    
    
    @JsonProperty("images")
    private List<String> images;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("short_description")
    private String shortDescription;
    
    
    
    
    
    @JsonProperty("item_code")
    private String itemCode;
    
    
    
    
    
    @JsonProperty("identifier")
    private Object identifier;
    
    
    
    
}

/*
    Model: GetProducts
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class GetProducts {
    
    
    
    
    
    @JsonProperty("min_quantity")
    private Integer minQuantity;
    
    
    
    
    
    @JsonProperty("auto_add_to_cart")
    private Boolean autoAddToCart;
    
    
    
    
    
    @JsonProperty("sizes")
    private List<Size> sizes;
    
    
    
    
    
    @JsonProperty("price")
    private Price price;
    
    
    
    
    
    @JsonProperty("product_details")
    private LimitedProductData productDetails;
    
    
    
    
    
    @JsonProperty("max_quantity")
    private Integer maxQuantity;
    
    
    
    
    
    @JsonProperty("product_uid")
    private Integer productUid;
    
    
    
    
    
    @JsonProperty("auto_select")
    private Boolean autoSelect;
    
    
    
    
    
    @JsonProperty("allow_remove")
    private Boolean allowRemove;
    
    
    
    
}

/*
    Model: GetProductBundleResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class GetProductBundleResponse {
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    
    @JsonProperty("choice")
    private String choice;
    
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    
    @JsonProperty("page_visibility")
    private List<String> pageVisibility;
    
    
    
    
    
    @JsonProperty("same_store_assignment")
    private Boolean sameStoreAssignment;
    
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    
    @JsonProperty("products")
    private List<GetProducts> products;
    
    
    
    
}

/*
    Model: ProductBundleUpdateRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ProductBundleUpdateRequest {
    
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    
    @JsonProperty("page_visibility")
    private List<String> pageVisibility;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    
    @JsonProperty("modified_by")
    private Object modifiedBy;
    
    
    
    
    
    @JsonProperty("choice")
    private String choice;
    
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    
    @JsonProperty("same_store_assignment")
    private Boolean sameStoreAssignment;
    
    
    
    
    
    @JsonProperty("products")
    private List<ProductBundleItem> products;
    
    
    
    
}

/*
    Model: ListSizeGuide
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ListSizeGuide {
    
    
    
    
    
    @JsonProperty("items")
    private List<Object> items;
    
    
    
    
    
    @JsonProperty("page")
    private Object page;
    
    
    
    
}

/*
    Model: Meta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Meta {
    
    
    
    
    
    @JsonProperty("unit")
    private String unit;
    
    
    
    
    
    @JsonProperty("headers")
    private Object headers;
    
    
    
    
    
    @JsonProperty("values")
    private List<Object> values;
    
    
    
    
}

/*
    Model: Guide
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Guide {
    
    
    
    
    
    @JsonProperty("meta")
    private Meta meta;
    
    
    
    
}

/*
    Model: ValidateSizeGuide
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ValidateSizeGuide {
    
    
    
    
    
    @JsonProperty("image")
    private String image;
    
    
    
    
    
    @JsonProperty("brand_id")
    private Integer brandId;
    
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    
    @JsonProperty("subtitle")
    private String subtitle;
    
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("tag")
    private String tag;
    
    
    
    
    
    @JsonProperty("guide")
    private Guide guide;
    
    
    
    
    
    @JsonProperty("modified_by")
    private Object modifiedBy;
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    
    @JsonProperty("created_by")
    private Object createdBy;
    
    
    
    
}

/*
    Model: SuccessResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class SuccessResponse {
    
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
}

/*
    Model: SizeGuideResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class SizeGuideResponse {
    
    
    
    
    
    @JsonProperty("brand_id")
    private Integer brandId;
    
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    
    @JsonProperty("subtitle")
    private String subtitle;
    
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("tag")
    private String tag;
    
    
    
    
    
    @JsonProperty("guide")
    private Object guide;
    
    
    
    
    
    @JsonProperty("modified_by")
    private Object modifiedBy;
    
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    
    @JsonProperty("created_by")
    private Object createdBy;
    
    
    
    
}

/*
    Model: MetaDataListingSortMetaResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class MetaDataListingSortMetaResponse {
    
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
}

/*
    Model: MetaDataListingSortResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class MetaDataListingSortResponse {
    
    
    
    
    
    @JsonProperty("data")
    private List<MetaDataListingSortMetaResponse> data;
    
    
    
    
}

/*
    Model: MetaDataListingFilterMetaResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class MetaDataListingFilterMetaResponse {
    
    
    
    
    
    @JsonProperty("filter_types")
    private List<String> filterTypes;
    
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    
    @JsonProperty("units")
    private List<Object> units;
    
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
}

/*
    Model: MetaDataListingFilterResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class MetaDataListingFilterResponse {
    
    
    
    
    
    @JsonProperty("data")
    private List<MetaDataListingFilterMetaResponse> data;
    
    
    
    
}

/*
    Model: MetaDataListingResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class MetaDataListingResponse {
    
    
    
    
    
    @JsonProperty("sort")
    private MetaDataListingSortResponse sort;
    
    
    
    
    
    @JsonProperty("filter")
    private MetaDataListingFilterResponse filter;
    
    
    
    
}

/*
    Model: GetCatalogConfigurationDetailsProduct
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class GetCatalogConfigurationDetailsProduct {
    
    
    
    
    
    @JsonProperty("compare")
    private Object compare;
    
    
    
    
    
    @JsonProperty("detail")
    private Object detail;
    
    
    
    
    
    @JsonProperty("similar")
    private Object similar;
    
    
    
    
    
    @JsonProperty("variant")
    private Object variant;
    
    
    
    
}

/*
    Model: GetCatalogConfigurationMetaData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class GetCatalogConfigurationMetaData {
    
    
    
    
    
    @JsonProperty("listing")
    private MetaDataListingResponse listing;
    
    
    
    
    
    @JsonProperty("product")
    private GetCatalogConfigurationDetailsProduct product;
    
    
    
    
}

/*
    Model: ConfigurationListingSortConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ConfigurationListingSortConfig {
    
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    
    @JsonProperty("priority")
    private Integer priority;
    
    
    
    
}

/*
    Model: ConfigurationListingSort
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ConfigurationListingSort {
    
    
    
    
    
    @JsonProperty("default_key")
    private String defaultKey;
    
    
    
    
    
    @JsonProperty("config")
    private List<ConfigurationListingSortConfig> config;
    
    
    
    
}

/*
    Model: ConfigurationBucketPoints
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ConfigurationBucketPoints {
    
    
    
    
    
    @JsonProperty("start")
    private Double start;
    
    
    
    
    
    @JsonProperty("end")
    private Double end;
    
    
    
    
}

/*
    Model: ConfigurationListingFilterValue
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ConfigurationListingFilterValue {
    
    
    
    
    
    @JsonProperty("sort")
    private String sort;
    
    
    
    
    
    @JsonProperty("map")
    private Object map;
    
    
    
    
    
    @JsonProperty("bucket_points")
    private List<ConfigurationBucketPoints> bucketPoints;
    
    
    
    
    
    @JsonProperty("condition")
    private String condition;
    
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
}

/*
    Model: ConfigurationListingFilterConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ConfigurationListingFilterConfig {
    
    
    
    
    
    @JsonProperty("value_config")
    private ConfigurationListingFilterValue valueConfig;
    
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("priority")
    private Integer priority;
    
    
    
    
}

/*
    Model: ConfigurationListingFilter
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ConfigurationListingFilter {
    
    
    
    
    
    @JsonProperty("attribute_config")
    private List<ConfigurationListingFilterConfig> attributeConfig;
    
    
    
    
    
    @JsonProperty("allow_single")
    private Boolean allowSingle;
    
    
    
    
}

/*
    Model: ConfigurationListing
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ConfigurationListing {
    
    
    
    
    
    @JsonProperty("sort")
    private ConfigurationListingSort sort;
    
    
    
    
    
    @JsonProperty("filter")
    private ConfigurationListingFilter filter;
    
    
    
    
}

/*
    Model: ProductSize
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ProductSize {
    
    
    
    
    
    @JsonProperty("min")
    private Integer min;
    
    
    
    
    
    @JsonProperty("max")
    private Integer max;
    
    
    
    
}

/*
    Model: ConfigurationProductConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ConfigurationProductConfig {
    
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    
    @JsonProperty("subtitle")
    private String subtitle;
    
    
    
    
    
    @JsonProperty("size")
    private ProductSize size;
    
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    
    @JsonProperty("priority")
    private Integer priority;
    
    
    
    
}

/*
    Model: ConfigurationProductSimilar
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ConfigurationProductSimilar {
    
    
    
    
    
    @JsonProperty("config")
    private List<ConfigurationProductConfig> config;
    
    
    
    
}

/*
    Model: ConfigurationProductVariantConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ConfigurationProductVariantConfig {
    
    
    
    
    
    @JsonProperty("size")
    private ProductSize size;
    
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    
    @JsonProperty("display_type")
    private String displayType;
    
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    
    @JsonProperty("priority")
    private Integer priority;
    
    
    
    
}

/*
    Model: ConfigurationProductVariant
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ConfigurationProductVariant {
    
    
    
    
    
    @JsonProperty("config")
    private List<ConfigurationProductVariantConfig> config;
    
    
    
    
}

/*
    Model: ConfigurationProduct
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ConfigurationProduct {
    
    
    
    
    
    @JsonProperty("similar")
    private ConfigurationProductSimilar similar;
    
    
    
    
    
    @JsonProperty("variant")
    private ConfigurationProductVariant variant;
    
    
    
    
}

/*
    Model: AppCatalogConfiguration
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class AppCatalogConfiguration {
    
    
    
    
    
    @JsonProperty("listing")
    private ConfigurationListing listing;
    
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
    
    @JsonProperty("config_id")
    private String configId;
    
    
    
    
    
    @JsonProperty("config_type")
    private String configType;
    
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    
    @JsonProperty("product")
    private ConfigurationProduct product;
    
    
    
    
}

/*
    Model: GetAppCatalogConfiguration
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class GetAppCatalogConfiguration {
    
    
    
    
    
    @JsonProperty("is_default")
    private Boolean isDefault;
    
    
    
    
    
    @JsonProperty("data")
    private AppCatalogConfiguration data;
    
    
    
    
}

/*
    Model: AppConfiguration
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class AppConfiguration {
    
    
    
    
    
    @JsonProperty("listing")
    private ConfigurationListing listing;
    
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
    
    @JsonProperty("config_id")
    private String configId;
    
    
    
    
    
    @JsonProperty("config_type")
    private String configType;
    
    
    
    
    
    @JsonProperty("product")
    private ConfigurationProduct product;
    
    
    
    
}

/*
    Model: GetCatalogConfigurationDetailsSchemaListing
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class GetCatalogConfigurationDetailsSchemaListing {
    
    
    
    
    
    @JsonProperty("sort")
    private Object sort;
    
    
    
    
    
    @JsonProperty("filter")
    private Object filter;
    
    
    
    
}

/*
    Model: EntityConfiguration
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class EntityConfiguration {
    
    
    
    
    
    @JsonProperty("listing")
    private GetCatalogConfigurationDetailsSchemaListing listing;
    
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
    
    @JsonProperty("config_id")
    private String configId;
    
    
    
    
    
    @JsonProperty("config_type")
    private String configType;
    
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    
    @JsonProperty("product")
    private GetCatalogConfigurationDetailsProduct product;
    
    
    
    
}

/*
    Model: GetAppCatalogEntityConfiguration
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class GetAppCatalogEntityConfiguration {
    
    
    
    
    
    @JsonProperty("is_default")
    private Boolean isDefault;
    
    
    
    
    
    @JsonProperty("data")
    private EntityConfiguration data;
    
    
    
    
}

/*
    Model: ProductFiltersValue
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ProductFiltersValue {
    
    
    
    
    
    @JsonProperty("max")
    private Integer max;
    
    
    
    
    
    @JsonProperty("currency_symbol")
    private String currencySymbol;
    
    
    
    
    
    @JsonProperty("count")
    private Integer count;
    
    
    
    
    
    @JsonProperty("selected_max")
    private Integer selectedMax;
    
    
    
    
    
    @JsonProperty("query_format")
    private String queryFormat;
    
    
    
    
    
    @JsonProperty("display_format")
    private String displayFormat;
    
    
    
    
    
    @JsonProperty("currency_code")
    private String currencyCode;
    
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    
    @JsonProperty("selected_min")
    private Integer selectedMin;
    
    
    
    
    
    @JsonProperty("is_selected")
    private Boolean isSelected;
    
    
    
    
    
    @JsonProperty("min")
    private Integer min;
    
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
}

/*
    Model: ProductFiltersKey
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ProductFiltersKey {
    
    
    
    
    
    @JsonProperty("kind")
    private String kind;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
}

/*
    Model: ProductFilters
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ProductFilters {
    
    
    
    
    
    @JsonProperty("values")
    private List<ProductFiltersValue> values;
    
    
    
    
    
    @JsonProperty("key")
    private ProductFiltersKey key;
    
    
    
    
}

/*
    Model: ProductSortOn
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ProductSortOn {
    
    
    
    
    
    @JsonProperty("is_selected")
    private Boolean isSelected;
    
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
}

/*
    Model: GetCollectionQueryOptionResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class GetCollectionQueryOptionResponse {
    
    
    
    
    
    @JsonProperty("filters")
    private List<ProductFilters> filters;
    
    
    
    
    
    @JsonProperty("sort_on")
    private List<ProductSortOn> sortOn;
    
    
    
    
}

/*
    Model: Media1
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Media1 {
    
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
}

/*
    Model: BannerImage
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class BannerImage {
    
    
    
    
    
    @JsonProperty("aspect_ratio")
    private String aspectRatio;
    
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
}

/*
    Model: ImageUrls
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ImageUrls {
    
    
    
    
    
    @JsonProperty("portrait")
    private BannerImage portrait;
    
    
    
    
    
    @JsonProperty("landscape")
    private BannerImage landscape;
    
    
    
    
}

/*
    Model: GetCollectionDetailNest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class GetCollectionDetailNest {
    
    
    
    
    
    @JsonProperty("badge")
    private Object badge;
    
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    
    @JsonProperty("allow_facets")
    private Boolean allowFacets;
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
    
    @JsonProperty("logo")
    private Media1 logo;
    
    
    
    
    
    @JsonProperty("visible_facets_keys")
    private List<String> visibleFacetsKeys;
    
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    
    @JsonProperty("query")
    private Object query;
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    
    @JsonProperty("banners")
    private ImageUrls banners;
    
    
    
    
    
    @JsonProperty("tag")
    private List<String> tag;
    
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("_schedule")
    private Object schedule;
    
    
    
    
    
    @JsonProperty("allow_sort")
    private Boolean allowSort;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("action")
    private Action action;
    
    
    
    
    
    @JsonProperty("cron")
    private Object cron;
    
    
    
    
}

/*
    Model: CollectionListingFilterType
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CollectionListingFilterType {
    
    
    
    
    
    @JsonProperty("is_selected")
    private Boolean isSelected;
    
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
}

/*
    Model: CollectionListingFilterTag
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CollectionListingFilterTag {
    
    
    
    
    
    @JsonProperty("is_selected")
    private Boolean isSelected;
    
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
}

/*
    Model: CollectionListingFilter
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CollectionListingFilter {
    
    
    
    
    
    @JsonProperty("type")
    private List<CollectionListingFilterType> type;
    
    
    
    
    
    @JsonProperty("tags")
    private List<CollectionListingFilterTag> tags;
    
    
    
    
}

/*
    Model: GetCollectionListingResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class GetCollectionListingResponse {
    
    
    
    
    
    @JsonProperty("items")
    private List<GetCollectionDetailNest> items;
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    
    @JsonProperty("filters")
    private CollectionListingFilter filters;
    
    
    
    
}

/*
    Model: CollectionBadge
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CollectionBadge {
    
    
    
    
    
    @JsonProperty("text")
    private String text;
    
    
    
    
    
    @JsonProperty("color")
    private String color;
    
    
    
    
}

/*
    Model: SeoDetail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class SeoDetail {
    
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
}

/*
    Model: CollectionImage
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CollectionImage {
    
    
    
    
    
    @JsonProperty("aspect_ratio")
    private String aspectRatio;
    
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
}

/*
    Model: CollectionBanner
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CollectionBanner {
    
    
    
    
    
    @JsonProperty("portrait")
    private CollectionImage portrait;
    
    
    
    
    
    @JsonProperty("landscape")
    private CollectionImage landscape;
    
    
    
    
}

/*
    Model: UserInfo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class UserInfo {
    
    
    
    
    
    @JsonProperty("username")
    private String username;
    
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
}

/*
    Model: Schedule
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Schedule {
    
    
    
    
    
    @JsonProperty("cron")
    private String cron;
    
    
    
    
    
    @JsonProperty("start")
    private String start;
    
    
    
    
    
    @JsonProperty("end")
    private String end;
    
    
    
    
    
    @JsonProperty("duration")
    private Integer duration;
    
    
    
    
}

/*
    Model: CreateCollection
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CreateCollection {
    
    
    
    
    
    @JsonProperty("badge")
    private CollectionBadge badge;
    
    
    
    
    
    @JsonProperty("allow_facets")
    private Boolean allowFacets;
    
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    
    @JsonProperty("seo")
    private SeoDetail seo;
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
    
    @JsonProperty("logo")
    private CollectionImage logo;
    
    
    
    
    
    @JsonProperty("visible_facets_keys")
    private List<String> visibleFacetsKeys;
    
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    
    @JsonProperty("query")
    private Object query;
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    
    @JsonProperty("sort_on")
    private String sortOn;
    
    
    
    
    
    @JsonProperty("banners")
    private CollectionBanner banners;
    
    
    
    
    
    @JsonProperty("_locale_language")
    private Object localeLanguage;
    
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("created_by")
    private UserInfo createdBy;
    
    
    
    
    
    @JsonProperty("_schedule")
    private Schedule schedule;
    
    
    
    
    
    @JsonProperty("allow_sort")
    private Boolean allowSort;
    
    
    
    
    
    @JsonProperty("is_visible")
    private Boolean isVisible;
    
    
    
    
    
    @JsonProperty("published")
    private Boolean published;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("modified_by")
    private UserInfo modifiedBy;
    
    
    
    
}

/*
    Model: CollectionCreateResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CollectionCreateResponse {
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("badge")
    private Object badge;
    
    
    
    
    
    @JsonProperty("allow_facets")
    private Boolean allowFacets;
    
    
    
    
    
    @JsonProperty("banners")
    private ImageUrls banners;
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
    
    @JsonProperty("logo")
    private BannerImage logo;
    
    
    
    
    
    @JsonProperty("visible_facets_keys")
    private List<String> visibleFacetsKeys;
    
    
    
    
    
    @JsonProperty("_schedule")
    private Object schedule;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    
    @JsonProperty("cron")
    private Object cron;
    
    
    
    
    
    @JsonProperty("tag")
    private List<String> tag;
    
    
    
    
    
    @JsonProperty("query")
    private Object query;
    
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    
    @JsonProperty("allow_sort")
    private Boolean allowSort;
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
}

/*
    Model: CollectionDetailResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CollectionDetailResponse {
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("badge")
    private Object badge;
    
    
    
    
    
    @JsonProperty("allow_facets")
    private Boolean allowFacets;
    
    
    
    
    
    @JsonProperty("banners")
    private ImageUrls banners;
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
    
    @JsonProperty("logo")
    private Media1 logo;
    
    
    
    
    
    @JsonProperty("visible_facets_keys")
    private List<String> visibleFacetsKeys;
    
    
    
    
    
    @JsonProperty("_schedule")
    private Object schedule;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    
    @JsonProperty("cron")
    private Object cron;
    
    
    
    
    
    @JsonProperty("tag")
    private List<String> tag;
    
    
    
    
    
    @JsonProperty("query")
    private Object query;
    
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    
    @JsonProperty("allow_sort")
    private Boolean allowSort;
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
}

/*
    Model: UpdateCollection
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class UpdateCollection {
    
    
    
    
    
    @JsonProperty("badge")
    private CollectionBadge badge;
    
    
    
    
    
    @JsonProperty("allow_facets")
    private Boolean allowFacets;
    
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    
    @JsonProperty("seo")
    private SeoDetail seo;
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    
    @JsonProperty("logo")
    private CollectionImage logo;
    
    
    
    
    
    @JsonProperty("visible_facets_keys")
    private List<String> visibleFacetsKeys;
    
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    
    @JsonProperty("query")
    private Object query;
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    
    @JsonProperty("sort_on")
    private String sortOn;
    
    
    
    
    
    @JsonProperty("banners")
    private CollectionBanner banners;
    
    
    
    
    
    @JsonProperty("_locale_language")
    private Object localeLanguage;
    
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    
    @JsonProperty("_schedule")
    private Schedule schedule;
    
    
    
    
    
    @JsonProperty("allow_sort")
    private Boolean allowSort;
    
    
    
    
    
    @JsonProperty("is_visible")
    private Boolean isVisible;
    
    
    
    
    
    @JsonProperty("published")
    private Boolean published;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("modified_by")
    private UserInfo modifiedBy;
    
    
    
    
}

/*
    Model: Price1
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Price1 {
    
    
    
    
    
    @JsonProperty("min")
    private Double min;
    
    
    
    
    
    @JsonProperty("currency_symbol")
    private String currencySymbol;
    
    
    
    
    
    @JsonProperty("max")
    private Double max;
    
    
    
    
    
    @JsonProperty("currency_code")
    private String currencyCode;
    
    
    
    
}

/*
    Model: ProductListingPrice
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ProductListingPrice {
    
    
    
    
    
    @JsonProperty("marked")
    private Price1 marked;
    
    
    
    
    
    @JsonProperty("effective")
    private Price1 effective;
    
    
    
    
}

/*
    Model: ProductBrand
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ProductBrand {
    
    
    
    
    
    @JsonProperty("logo")
    private Media1 logo;
    
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("action")
    private Action action;
    
    
    
    
}

/*
    Model: ProductDetailAttribute
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ProductDetailAttribute {
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
}

/*
    Model: ProductDetailGroupedAttribute
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ProductDetailGroupedAttribute {
    
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    
    @JsonProperty("details")
    private List<ProductDetailAttribute> details;
    
    
    
    
}

/*
    Model: ProductListingDetail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ProductListingDetail {
    
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    
    @JsonProperty("image_nature")
    private String imageNature;
    
    
    
    
    
    @JsonProperty("highlights")
    private List<String> highlights;
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    
    @JsonProperty("promo_meta")
    private Object promoMeta;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("sellable")
    private Boolean sellable;
    
    
    
    
    
    @JsonProperty("similars")
    private List<String> similars;
    
    
    
    
    
    @JsonProperty("item_type")
    private String itemType;
    
    
    
    
    
    @JsonProperty("item_code")
    private String itemCode;
    
    
    
    
    
    @JsonProperty("price")
    private ProductListingPrice price;
    
    
    
    
    
    @JsonProperty("brand")
    private ProductBrand brand;
    
    
    
    
    
    @JsonProperty("grouped_attributes")
    private List<ProductDetailGroupedAttribute> groupedAttributes;
    
    
    
    
    
    @JsonProperty("short_description")
    private String shortDescription;
    
    
    
    
    
    @JsonProperty("discount")
    private String discount;
    
    
    
    
    
    @JsonProperty("medias")
    private List<Media1> medias;
    
    
    
    
    
    @JsonProperty("color")
    private String color;
    
    
    
    
    
    @JsonProperty("rating_count")
    private Integer ratingCount;
    
    
    
    
    
    @JsonProperty("teaser_tag")
    private Object teaserTag;
    
    
    
    
    
    @JsonProperty("has_variant")
    private Boolean hasVariant;
    
    
    
    
    
    @JsonProperty("attributes")
    private Object attributes;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("rating")
    private Double rating;
    
    
    
    
    
    @JsonProperty("tryouts")
    private List<String> tryouts;
    
    
    
    
    
    @JsonProperty("product_online_date")
    private String productOnlineDate;
    
    
    
    
}

/*
    Model: GetCollectionItemsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class GetCollectionItemsResponse {
    
    
    
    
    
    @JsonProperty("items")
    private List<ProductListingDetail> items;
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    
    @JsonProperty("filters")
    private List<ProductFilters> filters;
    
    
    
    
    
    @JsonProperty("sort_on")
    private List<ProductSortOn> sortOn;
    
    
    
    
}

/*
    Model: CollectionItemRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CollectionItemRequest {
    
    
    
    
    
    @JsonProperty("page_size")
    private Integer pageSize;
    
    
    
    
    
    @JsonProperty("page_no")
    private Integer pageNo;
    
    
    
    
}

/*
    Model: UpdatedResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class UpdatedResponse {
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
}

/*
    Model: CatalogInsightItem
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CatalogInsightItem {
    
    
    
    
    
    @JsonProperty("count")
    private Integer count;
    
    
    
    
    
    @JsonProperty("out_of_stock_count")
    private Integer outOfStockCount;
    
    
    
    
    
    @JsonProperty("sellable_count")
    private Integer sellableCount;
    
    
    
    
}

/*
    Model: CatalogInsightBrand
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CatalogInsightBrand {
    
    
    
    
    
    @JsonProperty("total_sizes")
    private Integer totalSizes;
    
    
    
    
    
    @JsonProperty("available_sizes")
    private Integer availableSizes;
    
    
    
    
    
    @JsonProperty("article_freshness")
    private Integer articleFreshness;
    
    
    
    
    
    @JsonProperty("total_articles")
    private Integer totalArticles;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("available_articles")
    private Integer availableArticles;
    
    
    
    
}

/*
    Model: CatalogInsightResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CatalogInsightResponse {
    
    
    
    
    
    @JsonProperty("item")
    private CatalogInsightItem item;
    
    
    
    
    
    @JsonProperty("brand_distribution")
    private CatalogInsightBrand brandDistribution;
    
    
    
    
}

/*
    Model: CrossSellingData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CrossSellingData {
    
    
    
    
    
    @JsonProperty("products")
    private Integer products;
    
    
    
    
    
    @JsonProperty("articles")
    private Integer articles;
    
    
    
    
}

/*
    Model: CrossSellingResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CrossSellingResponse {
    
    
    
    
    
    @JsonProperty("data")
    private CrossSellingData data;
    
    
    
    
    
    @JsonProperty("brand_distribution")
    private CatalogInsightBrand brandDistribution;
    
    
    
    
}

/*
    Model: OptInPostRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class OptInPostRequest {
    
    
    
    
    
    @JsonProperty("store_ids")
    private List<Integer> storeIds;
    
    
    
    
    
    @JsonProperty("opt_level")
    private String optLevel;
    
    
    
    
    
    @JsonProperty("brand_ids")
    private List<Integer> brandIds;
    
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
}

/*
    Model: CompanyOptIn
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CompanyOptIn {
    
    
    
    
    
    @JsonProperty("store_ids")
    private List<Integer> storeIds;
    
    
    
    
    
    @JsonProperty("brand_ids")
    private List<Integer> brandIds;
    
    
    
    
    
    @JsonProperty("modified_on")
    private Integer modifiedOn;
    
    
    
    
    
    @JsonProperty("created_on")
    private Integer createdOn;
    
    
    
    
    
    @JsonProperty("opt_level")
    private String optLevel;
    
    
    
    
    
    @JsonProperty("modified_by")
    private Object modifiedBy;
    
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    
    @JsonProperty("created_by")
    private Object createdBy;
    
    
    
    
    
    @JsonProperty("platform")
    private String platform;
    
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
}

/*
    Model: GetOptInPlatform
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class GetOptInPlatform {
    
    
    
    
    
    @JsonProperty("items")
    private List<CompanyOptIn> items;
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: OptinCompanyDetail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class OptinCompanyDetail {
    
    
    
    
    
    @JsonProperty("business_type")
    private String businessType;
    
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    
    @JsonProperty("company_type")
    private String companyType;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
}

/*
    Model: CompanyBrandDetail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CompanyBrandDetail {
    
    
    
    
    
    @JsonProperty("brand_id")
    private Integer brandId;
    
    
    
    
    
    @JsonProperty("total_article")
    private Integer totalArticle;
    
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    
    @JsonProperty("brand_name")
    private String brandName;
    
    
    
    
}

/*
    Model: OptinCompanyBrandDetailsView
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class OptinCompanyBrandDetailsView {
    
    
    
    
    
    @JsonProperty("items")
    private List<CompanyBrandDetail> items;
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: OptinCompanyMetrics
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class OptinCompanyMetrics {
    
    
    
    
    
    @JsonProperty("store")
    private Integer store;
    
    
    
    
    
    @JsonProperty("brand")
    private Integer brand;
    
    
    
    
    
    @JsonProperty("company")
    private String company;
    
    
    
    
}

/*
    Model: StoreDetail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class StoreDetail {
    
    
    
    
    
    @JsonProperty("additional_contacts")
    private List<Object> additionalContacts;
    
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    
    @JsonProperty("store_type")
    private String storeType;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("store_code")
    private String storeCode;
    
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    
    @JsonProperty("timing")
    private Object timing;
    
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    
    @JsonProperty("documents")
    private List<Object> documents;
    
    
    
    
}

/*
    Model: OptinStoreDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class OptinStoreDetails {
    
    
    
    
    
    @JsonProperty("items")
    private List<StoreDetail> items;
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: AttributeSchemaRange
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class AttributeSchemaRange {
    
    
    
    
    
    @JsonProperty("min")
    private Integer min;
    
    
    
    
    
    @JsonProperty("max")
    private Integer max;
    
    
    
    
}

/*
    Model: AttributeMaster
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class AttributeMaster {
    
    
    
    
    
    @JsonProperty("allowed_values")
    private List<String> allowedValues;
    
    
    
    
    
    @JsonProperty("multi")
    private Boolean multi;
    
    
    
    
    
    @JsonProperty("mandatory")
    private Boolean mandatory;
    
    
    
    
    
    @JsonProperty("range")
    private AttributeSchemaRange range;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("format")
    private String format;
    
    
    
    
}

/*
    Model: AttributeMasterFilter
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class AttributeMasterFilter {
    
    
    
    
    
    @JsonProperty("depends_on")
    private List<String> dependsOn;
    
    
    
    
    
    @JsonProperty("indexing")
    private Boolean indexing;
    
    
    
    
    
    @JsonProperty("priority")
    private Integer priority;
    
    
    
    
}

/*
    Model: AttributeMasterMandatoryDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class AttributeMasterMandatoryDetails {
    
    
    
    
    
    @JsonProperty("l3_keys")
    private List<String> l3Keys;
    
    
    
    
}

/*
    Model: AttributeMasterMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class AttributeMasterMeta {
    
    
    
    
    
    @JsonProperty("mandatory_details")
    private AttributeMasterMandatoryDetails mandatoryDetails;
    
    
    
    
    
    @JsonProperty("enriched")
    private Boolean enriched;
    
    
    
    
}

/*
    Model: AttributeMasterDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class AttributeMasterDetails {
    
    
    
    
    
    @JsonProperty("display_type")
    private String displayType;
    
    
    
    
}

/*
    Model: GenderDetail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class GenderDetail {
    
    
    
    
    
    @JsonProperty("is_nested")
    private Boolean isNested;
    
    
    
    
    
    @JsonProperty("schema")
    private AttributeMaster schema;
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    
    @JsonProperty("filters")
    private AttributeMasterFilter filters;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("meta")
    private AttributeMasterMeta meta;
    
    
    
    
    
    @JsonProperty("details")
    private AttributeMasterDetails details;
    
    
    
    
    
    @JsonProperty("departments")
    private List<String> departments;
    
    
    
    
    
    @JsonProperty("enabled_for_end_consumer")
    private Boolean enabledForEndConsumer;
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
}

/*
    Model: ProdcutTemplateCategoriesResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ProdcutTemplateCategoriesResponse {
    
    
    
    
    
    @JsonProperty("items")
    private List<Object> items;
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: PTErrorResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class PTErrorResponse {
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    
    @JsonProperty("errors")
    private Object errors;
    
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    
    @JsonProperty("status")
    private Integer status;
    
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
}

/*
    Model: UserSerializer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class UserSerializer {
    
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
    
    @JsonProperty("username")
    private String username;
    
    
    
    
    
    @JsonProperty("contact")
    private String contact;
    
    
    
    
}

/*
    Model: GetDepartment
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class GetDepartment {
    
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    
    @JsonProperty("priority_order")
    private Integer priorityOrder;
    
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    
    @JsonProperty("page_size")
    private Integer pageSize;
    
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    
    @JsonProperty("item_type")
    private String itemType;
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    
    @JsonProperty("search")
    private String search;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("page_no")
    private Integer pageNo;
    
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    
    @JsonProperty("modified_by")
    private UserSerializer modifiedBy;
    
    
    
    
    
    @JsonProperty("created_by")
    private UserSerializer createdBy;
    
    
    
    
    
    @JsonProperty("synonyms")
    private List<String> synonyms;
    
    
    
    
}

/*
    Model: DepartmentsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class DepartmentsResponse {
    
    
    
    
    
    @JsonProperty("items")
    private List<GetDepartment> items;
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: DepartmentErrorResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class DepartmentErrorResponse {
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    
    @JsonProperty("errors")
    private Object errors;
    
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    
    @JsonProperty("status")
    private Integer status;
    
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
}

/*
    Model: ProductTemplate
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ProductTemplate {
    
    
    
    
    
    @JsonProperty("is_archived")
    private Boolean isArchived;
    
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    
    @JsonProperty("attributes")
    private List<String> attributes;
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    
    @JsonProperty("is_expirable")
    private Boolean isExpirable;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("is_physical")
    private Boolean isPhysical;
    
    
    
    
    
    @JsonProperty("tag")
    private String tag;
    
    
    
    
    
    @JsonProperty("modified_by")
    private Object modifiedBy;
    
    
    
    
    
    @JsonProperty("departments")
    private List<String> departments;
    
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    
    @JsonProperty("categories")
    private List<String> categories;
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    
    @JsonProperty("created_by")
    private Object createdBy;
    
    
    
    
}

/*
    Model: TemplatesResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class TemplatesResponse {
    
    
    
    
    
    @JsonProperty("items")
    private ProductTemplate items;
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: Properties
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Properties {
    
    
    
    
    
    @JsonProperty("trader_type")
    private Object traderType;
    
    
    
    
    
    @JsonProperty("no_of_boxes")
    private Object noOfBoxes;
    
    
    
    
    
    @JsonProperty("custom_order")
    private Object customOrder;
    
    
    
    
    
    @JsonProperty("multi_size")
    private Object multiSize;
    
    
    
    
    
    @JsonProperty("slug")
    private Object slug;
    
    
    
    
    
    @JsonProperty("media")
    private Object media;
    
    
    
    
    
    @JsonProperty("size_guide")
    private Object sizeGuide;
    
    
    
    
    
    @JsonProperty("product_publish")
    private Object productPublish;
    
    
    
    
    
    @JsonProperty("highlights")
    private Object highlights;
    
    
    
    
    
    @JsonProperty("description")
    private Object description;
    
    
    
    
    
    @JsonProperty("return_config")
    private Object returnConfig;
    
    
    
    
    
    @JsonProperty("command")
    private Object command;
    
    
    
    
    
    @JsonProperty("brand_uid")
    private Object brandUid;
    
    
    
    
    
    @JsonProperty("hsn_code")
    private Object hsnCode;
    
    
    
    
    
    @JsonProperty("tags")
    private Object tags;
    
    
    
    
    
    @JsonProperty("is_active")
    private Object isActive;
    
    
    
    
    
    @JsonProperty("is_dependent")
    private Object isDependent;
    
    
    
    
    
    @JsonProperty("trader")
    private Object trader;
    
    
    
    
    
    @JsonProperty("item_code")
    private Object itemCode;
    
    
    
    
    
    @JsonProperty("item_type")
    private Object itemType;
    
    
    
    
    
    @JsonProperty("short_description")
    private Object shortDescription;
    
    
    
    
    
    @JsonProperty("variants")
    private Object variants;
    
    
    
    
    
    @JsonProperty("moq")
    private Object moq;
    
    
    
    
    
    @JsonProperty("teaser_tag")
    private Object teaserTag;
    
    
    
    
    
    @JsonProperty("product_group_tag")
    private Object productGroupTag;
    
    
    
    
    
    @JsonProperty("sizes")
    private Object sizes;
    
    
    
    
    
    @JsonProperty("country_of_origin")
    private Object countryOfOrigin;
    
    
    
    
    
    @JsonProperty("name")
    private Object name;
    
    
    
    
    
    @JsonProperty("category_slug")
    private Object categorySlug;
    
    
    
    
    
    @JsonProperty("currency")
    private Object currency;
    
    
    
    
}

/*
    Model: GlobalValidation
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class GlobalValidation {
    
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    
    @JsonProperty("definitions")
    private Object definitions;
    
    
    
    
    
    @JsonProperty("required")
    private List<String> required;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    
    @JsonProperty("properties")
    private Properties properties;
    
    
    
    
}

/*
    Model: TemplateValidationData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class TemplateValidationData {
    
    
    
    
    
    @JsonProperty("template_validation")
    private Object templateValidation;
    
    
    
    
    
    @JsonProperty("global_validation")
    private GlobalValidation globalValidation;
    
    
    
    
}

/*
    Model: TemplateDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class TemplateDetails {
    
    
    
    
    
    @JsonProperty("is_archived")
    private Boolean isArchived;
    
    
    
    
    
    @JsonProperty("attributes")
    private List<String> attributes;
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    
    @JsonProperty("is_expirable")
    private Boolean isExpirable;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("is_physical")
    private Boolean isPhysical;
    
    
    
    
    
    @JsonProperty("tag")
    private String tag;
    
    
    
    
    
    @JsonProperty("departments")
    private List<String> departments;
    
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    
    @JsonProperty("categories")
    private List<String> categories;
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
}

/*
    Model: TemplatesValidationResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class TemplatesValidationResponse {
    
    
    
    
    
    @JsonProperty("data")
    private TemplateValidationData data;
    
    
    
    
    
    @JsonProperty("template_details")
    private TemplateDetails templateDetails;
    
    
    
    
}

/*
    Model: InventoryValidationResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class InventoryValidationResponse {
    
    
    
    
    
    @JsonProperty("data")
    private Object data;
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
}

/*
    Model: HSNData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class HSNData {
    
    
    
    
    
    @JsonProperty("hsn_code")
    private List<String> hsnCode;
    
    
    
    
    
    @JsonProperty("country_of_origin")
    private List<String> countryOfOrigin;
    
    
    
    
}

/*
    Model: HSNCodesResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class HSNCodesResponse {
    
    
    
    
    
    @JsonProperty("data")
    private HSNData data;
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
}

/*
    Model: ProductDownloadItemsData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ProductDownloadItemsData {
    
    
    
    
    
    @JsonProperty("templates")
    private List<String> templates;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("brand")
    private List<String> brand;
    
    
    
    
}

/*
    Model: VerifiedBy
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class VerifiedBy {
    
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
    
    @JsonProperty("username")
    private String username;
    
    
    
    
}

/*
    Model: ProductDownloadsItems
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ProductDownloadsItems {
    
    
    
    
    
    @JsonProperty("data")
    private ProductDownloadItemsData data;
    
    
    
    
    
    @JsonProperty("template_tags")
    private Object templateTags;
    
    
    
    
    
    @JsonProperty("seller_id")
    private Double sellerId;
    
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    
    @JsonProperty("trigger_on")
    private String triggerOn;
    
    
    
    
    
    @JsonProperty("completed_on")
    private String completedOn;
    
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
    
    @JsonProperty("task_id")
    private String taskId;
    
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    
    @JsonProperty("created_by")
    private VerifiedBy createdBy;
    
    
    
    
}

/*
    Model: ProductDownloadsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ProductDownloadsResponse {
    
    
    
    
    
    @JsonProperty("items")
    private ProductDownloadsItems items;
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: ProductConfigurationDownloads
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ProductConfigurationDownloads {
    
    
    
    
    
    @JsonProperty("data")
    private List<Object> data;
    
    
    
    
    
    @JsonProperty("multivalue")
    private Boolean multivalue;
    
    
    
    
}

/*
    Model: Media2
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Media2 {
    
    
    
    
    
    @JsonProperty("portrait")
    private String portrait;
    
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    
    @JsonProperty("landscape")
    private String landscape;
    
    
    
    
}

/*
    Model: CategoryMappingValues
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CategoryMappingValues {
    
    
    
    
    
    @JsonProperty("catalog_id")
    private Integer catalogId;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
}

/*
    Model: CategoryMapping
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CategoryMapping {
    
    
    
    
    
    @JsonProperty("ajio")
    private CategoryMappingValues ajio;
    
    
    
    
    
    @JsonProperty("google")
    private CategoryMappingValues google;
    
    
    
    
    
    @JsonProperty("facebook")
    private CategoryMappingValues facebook;
    
    
    
    
}

/*
    Model: Hierarchy
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Hierarchy {
    
    
    
    
    
    @JsonProperty("l2")
    private Integer l2;
    
    
    
    
    
    @JsonProperty("department")
    private Integer department;
    
    
    
    
    
    @JsonProperty("l1")
    private Integer l1;
    
    
    
    
}

/*
    Model: Category
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Category {
    
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    
    @JsonProperty("media")
    private Media2 media;
    
    
    
    
    
    @JsonProperty("marketplaces")
    private CategoryMapping marketplaces;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("departments")
    private List<Integer> departments;
    
    
    
    
    
    @JsonProperty("level")
    private Integer level;
    
    
    
    
    
    @JsonProperty("hierarchy")
    private List<Hierarchy> hierarchy;
    
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    
    @JsonProperty("modified_by")
    private Object modifiedBy;
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("tryouts")
    private List<String> tryouts;
    
    
    
    
    
    @JsonProperty("created_by")
    private Object createdBy;
    
    
    
    
    
    @JsonProperty("priority")
    private Integer priority;
    
    
    
    
    
    @JsonProperty("synonyms")
    private List<String> synonyms;
    
    
    
    
}

/*
    Model: CategoryResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CategoryResponse {
    
    
    
    
    
    @JsonProperty("items")
    private List<Category> items;
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: CategoryRequestBody
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CategoryRequestBody {
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    
    @JsonProperty("media")
    private Media2 media;
    
    
    
    
    
    @JsonProperty("marketplaces")
    private CategoryMapping marketplaces;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("departments")
    private List<Integer> departments;
    
    
    
    
    
    @JsonProperty("level")
    private Integer level;
    
    
    
    
    
    @JsonProperty("hierarchy")
    private List<Hierarchy> hierarchy;
    
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    
    @JsonProperty("tryouts")
    private List<String> tryouts;
    
    
    
    
    
    @JsonProperty("priority")
    private Integer priority;
    
    
    
    
    
    @JsonProperty("synonyms")
    private List<String> synonyms;
    
    
    
    
}

/*
    Model: CategoryCreateResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CategoryCreateResponse {
    
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
}

/*
    Model: SingleCategoryResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class SingleCategoryResponse {
    
    
    
    
    
    @JsonProperty("data")
    private Category data;
    
    
    
    
}

/*
    Model: CategoryUpdateResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CategoryUpdateResponse {
    
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
}

/*
    Model: Image
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Image {
    
    
    
    
    
    @JsonProperty("aspect_ratio")
    private String aspectRatio;
    
    
    
    
    
    @JsonProperty("secure_url")
    private String secureUrl;
    
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
    
    @JsonProperty("aspect_ratio_f")
    private Double aspectRatioF;
    
    
    
    
}

/*
    Model: ProductPublished
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ProductPublished {
    
    
    
    
    
    @JsonProperty("product_online_date")
    private Integer productOnlineDate;
    
    
    
    
    
    @JsonProperty("is_set")
    private Boolean isSet;
    
    
    
    
}

/*
    Model: Logo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Logo {
    
    
    
    
    
    @JsonProperty("aspect_ratio")
    private String aspectRatio;
    
    
    
    
    
    @JsonProperty("secure_url")
    private String secureUrl;
    
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
    
    @JsonProperty("aspect_ratio_f")
    private Integer aspectRatioF;
    
    
    
    
}

/*
    Model: Brand
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Brand {
    
    
    
    
    
    @JsonProperty("logo")
    private Logo logo;
    
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
}

/*
    Model: Product
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Product {
    
    
    
    
    
    @JsonProperty("multi_size")
    private Boolean multiSize;
    
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    
    @JsonProperty("custom_order")
    private Object customOrder;
    
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    
    @JsonProperty("media")
    private List<Media1> media;
    
    
    
    
    
    @JsonProperty("images")
    private List<Image> images;
    
    
    
    
    
    @JsonProperty("is_physical")
    private Boolean isPhysical;
    
    
    
    
    
    @JsonProperty("size_guide")
    private String sizeGuide;
    
    
    
    
    
    @JsonProperty("image_nature")
    private String imageNature;
    
    
    
    
    
    @JsonProperty("product_publish")
    private ProductPublished productPublish;
    
    
    
    
    
    @JsonProperty("highlights")
    private List<String> highlights;
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    
    @JsonProperty("brand_uid")
    private Integer brandUid;
    
    
    
    
    
    @JsonProperty("hsn_code")
    private String hsnCode;
    
    
    
    
    
    @JsonProperty("primary_color")
    private String primaryColor;
    
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    
    @JsonProperty("is_dependent")
    private Boolean isDependent;
    
    
    
    
    
    @JsonProperty("item_code")
    private String itemCode;
    
    
    
    
    
    @JsonProperty("item_type")
    private String itemType;
    
    
    
    
    
    @JsonProperty("category_uid")
    private Integer categoryUid;
    
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    
    @JsonProperty("brand")
    private Brand brand;
    
    
    
    
    
    @JsonProperty("short_description")
    private String shortDescription;
    
    
    
    
    
    @JsonProperty("template_tag")
    private String templateTag;
    
    
    
    
    
    @JsonProperty("l3_mapping")
    private List<String> l3Mapping;
    
    
    
    
    
    @JsonProperty("departments")
    private List<Integer> departments;
    
    
    
    
    
    @JsonProperty("color")
    private String color;
    
    
    
    
    
    @JsonProperty("variants")
    private Object variants;
    
    
    
    
    
    @JsonProperty("moq")
    private Object moq;
    
    
    
    
    
    @JsonProperty("sizes")
    private List<Object> sizes;
    
    
    
    
    
    @JsonProperty("country_of_origin")
    private String countryOfOrigin;
    
    
    
    
    
    @JsonProperty("all_sizes")
    private List<Object> allSizes;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("category_slug")
    private String categorySlug;
    
    
    
    
    
    @JsonProperty("is_set")
    private Boolean isSet;
    
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
}

/*
    Model: ProductListingResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ProductListingResponse {
    
    
    
    
    
    @JsonProperty("items")
    private List<Product> items;
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: CustomOrder
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CustomOrder {
    
    
    
    
    
    @JsonProperty("manufacturing_time_unit")
    private String manufacturingTimeUnit;
    
    
    
    
    
    @JsonProperty("is_custom_order")
    private Boolean isCustomOrder;
    
    
    
    
    
    @JsonProperty("manufacturing_time")
    private Integer manufacturingTime;
    
    
    
    
}

/*
    Model: ProductPublish
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ProductPublish {
    
    
    
    
    
    @JsonProperty("product_online_date")
    private String productOnlineDate;
    
    
    
    
    
    @JsonProperty("is_set")
    private Boolean isSet;
    
    
    
    
}

/*
    Model: ReturnConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ReturnConfig {
    
    
    
    
    
    @JsonProperty("returnable")
    private Boolean returnable;
    
    
    
    
    
    @JsonProperty("unit")
    private String unit;
    
    
    
    
    
    @JsonProperty("time")
    private Integer time;
    
    
    
    
}

/*
    Model: Trader
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Trader {
    
    
    
    
    
    @JsonProperty("address")
    private String address;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
}

/*
    Model: OrderQuantity
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class OrderQuantity {
    
    
    
    
    
    @JsonProperty("minimum")
    private Integer minimum;
    
    
    
    
    
    @JsonProperty("is_set")
    private Boolean isSet;
    
    
    
    
    
    @JsonProperty("maximum")
    private Integer maximum;
    
    
    
    
}

/*
    Model: TeaserTag
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class TeaserTag {
    
    
    
    
    
    @JsonProperty("tag")
    private String tag;
    
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
}

/*
    Model: ProductCreateUpdate
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ProductCreateUpdate {
    
    
    
    
    
    @JsonProperty("trader_type")
    private String traderType;
    
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    
    @JsonProperty("no_of_boxes")
    private Integer noOfBoxes;
    
    
    
    
    
    @JsonProperty("custom_order")
    private CustomOrder customOrder;
    
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    
    @JsonProperty("multi_size")
    private Boolean multiSize;
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    
    @JsonProperty("media")
    private List<Media1> media;
    
    
    
    
    
    @JsonProperty("is_image_less_product")
    private Boolean isImageLessProduct;
    
    
    
    
    
    @JsonProperty("size_guide")
    private String sizeGuide;
    
    
    
    
    
    @JsonProperty("product_publish")
    private ProductPublish productPublish;
    
    
    
    
    
    @JsonProperty("highlights")
    private List<String> highlights;
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    
    @JsonProperty("change_request_id")
    private String changeRequestId;
    
    
    
    
    
    @JsonProperty("return_config")
    private ReturnConfig returnConfig;
    
    
    
    
    
    @JsonProperty("requester")
    private String requester;
    
    
    
    
    
    @JsonProperty("brand_uid")
    private Integer brandUid;
    
    
    
    
    
    @JsonProperty("hsn_code")
    private String hsnCode;
    
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    
    @JsonProperty("bulk_job_id")
    private String bulkJobId;
    
    
    
    
    
    @JsonProperty("is_dependent")
    private Boolean isDependent;
    
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    
    @JsonProperty("trader")
    private Trader trader;
    
    
    
    
    
    @JsonProperty("item_code")
    private String itemCode;
    
    
    
    
    
    @JsonProperty("item_type")
    private String itemType;
    
    
    
    
    
    @JsonProperty("short_description")
    private String shortDescription;
    
    
    
    
    
    @JsonProperty("template_tag")
    private String templateTag;
    
    
    
    
    
    @JsonProperty("departments")
    private List<Integer> departments;
    
    
    
    
    
    @JsonProperty("variants")
    private Object variants;
    
    
    
    
    
    @JsonProperty("moq")
    private OrderQuantity moq;
    
    
    
    
    
    @JsonProperty("teaser_tag")
    private TeaserTag teaserTag;
    
    
    
    
    
    @JsonProperty("product_group_tag")
    private List<String> productGroupTag;
    
    
    
    
    
    @JsonProperty("country_of_origin")
    private String countryOfOrigin;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("category_slug")
    private String categorySlug;
    
    
    
    
    
    @JsonProperty("action")
    private String action;
    
    
    
    
    
    @JsonProperty("is_set")
    private Boolean isSet;
    
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
}

/*
    Model: ValidateProduct
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ValidateProduct {
    
    
    
    
    
    @JsonProperty("valid")
    private Boolean valid;
    
    
    
    
}

/*
    Model: UserDetail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class UserDetail {
    
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
    
    @JsonProperty("username")
    private String username;
    
    
    
    
    
    @JsonProperty("full_name")
    private String fullName;
    
    
    
    
}

/*
    Model: ProductBulkRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ProductBulkRequest {
    
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    
    @JsonProperty("cancelled")
    private Integer cancelled;
    
    
    
    
    
    @JsonProperty("failed_records")
    private List<String> failedRecords;
    
    
    
    
    
    @JsonProperty("file_path")
    private String filePath;
    
    
    
    
    
    @JsonProperty("succeed")
    private Integer succeed;
    
    
    
    
    
    @JsonProperty("template_tag")
    private String templateTag;
    
    
    
    
    
    @JsonProperty("cancelled_records")
    private List<String> cancelledRecords;
    
    
    
    
    
    @JsonProperty("total")
    private Integer total;
    
    
    
    
    
    @JsonProperty("template")
    private ProductTemplate template;
    
    
    
    
    
    @JsonProperty("stage")
    private String stage;
    
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    
    @JsonProperty("modified_by")
    private UserDetail modifiedBy;
    
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    
    @JsonProperty("created_by")
    private UserDetail createdBy;
    
    
    
    
    
    @JsonProperty("failed")
    private Integer failed;
    
    
    
    
}

/*
    Model: ProductBulkRequestList
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ProductBulkRequestList {
    
    
    
    
    
    @JsonProperty("items")
    private ProductBulkRequest items;
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: UserInfo1
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class UserInfo1 {
    
    
    
    
    
    @JsonProperty("username")
    private String username;
    
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
}

/*
    Model: BulkJob
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class BulkJob {
    
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    
    @JsonProperty("cancelled")
    private Integer cancelled;
    
    
    
    
    
    @JsonProperty("custom_template_tag")
    private String customTemplateTag;
    
    
    
    
    
    @JsonProperty("failed_records")
    private List<Object> failedRecords;
    
    
    
    
    
    @JsonProperty("succeed")
    private Integer succeed;
    
    
    
    
    
    @JsonProperty("file_path")
    private String filePath;
    
    
    
    
    
    @JsonProperty("template_tag")
    private String templateTag;
    
    
    
    
    
    @JsonProperty("total")
    private Integer total;
    
    
    
    
    
    @JsonProperty("cancelled_records")
    private List<Object> cancelledRecords;
    
    
    
    
    
    @JsonProperty("tracking_url")
    private String trackingUrl;
    
    
    
    
    
    @JsonProperty("stage")
    private String stage;
    
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    
    @JsonProperty("modified_by")
    private UserInfo1 modifiedBy;
    
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    
    @JsonProperty("created_by")
    private UserInfo1 createdBy;
    
    
    
    
    
    @JsonProperty("failed")
    private Integer failed;
    
    
    
    
}

/*
    Model: BulkProductRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class BulkProductRequest {
    
    
    
    
    
    @JsonProperty("template_tag")
    private String templateTag;
    
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    
    @JsonProperty("batch_id")
    private String batchId;
    
    
    
    
    
    @JsonProperty("data")
    private List<Object> data;
    
    
    
    
}

/*
    Model: NestedTags
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class NestedTags {
    
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
}

/*
    Model: ProductTagsViewResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ProductTagsViewResponse {
    
    
    
    
    
    @JsonProperty("items")
    private NestedTags items;
    
    
    
    
}

/*
    Model: UserCommon
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class UserCommon {
    
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
    
    @JsonProperty("username")
    private String username;
    
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
}

/*
    Model: Items
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Items {
    
    
    
    
    
    @JsonProperty("retry")
    private Integer retry;
    
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    
    @JsonProperty("cancelled")
    private Integer cancelled;
    
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    
    @JsonProperty("failed_records")
    private List<String> failedRecords;
    
    
    
    
    
    @JsonProperty("succeed")
    private Integer succeed;
    
    
    
    
    
    @JsonProperty("tracking_url")
    private String trackingUrl;
    
    
    
    
    
    @JsonProperty("created_by")
    private UserCommon createdBy;
    
    
    
    
    
    @JsonProperty("cancelled_records")
    private List<String> cancelledRecords;
    
    
    
    
    
    @JsonProperty("stage")
    private String stage;
    
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    
    @JsonProperty("modified_by")
    private UserCommon modifiedBy;
    
    
    
    
    
    @JsonProperty("total")
    private Integer total;
    
    
    
    
    
    @JsonProperty("file_path")
    private String filePath;
    
    
    
    
    
    @JsonProperty("failed")
    private Integer failed;
    
    
    
    
}

/*
    Model: BulkAssetResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class BulkAssetResponse {
    
    
    
    
    
    @JsonProperty("items")
    private List<Items> items;
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: ProductBulkAssets
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ProductBulkAssets {
    
    
    
    
    
    @JsonProperty("user")
    private Object user;
    
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
}

/*
    Model: ProductSizeDeleteDataResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ProductSizeDeleteDataResponse {
    
    
    
    
    
    @JsonProperty("size")
    private String size;
    
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    
    @JsonProperty("item_id")
    private Integer itemId;
    
    
    
    
}

/*
    Model: ProductSizeDeleteResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ProductSizeDeleteResponse {
    
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    
    @JsonProperty("data")
    private ProductSizeDeleteDataResponse data;
    
    
    
    
}

/*
    Model: InventoryResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class InventoryResponse {
    
    
    
    
    
    @JsonProperty("price_transfer")
    private Integer priceTransfer;
    
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    
    @JsonProperty("store")
    private Object store;
    
    
    
    
    
    @JsonProperty("price")
    private Integer price;
    
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    
    @JsonProperty("size")
    private String size;
    
    
    
    
    
    @JsonProperty("price_effective")
    private Integer priceEffective;
    
    
    
    
    
    @JsonProperty("item_id")
    private Integer itemId;
    
    
    
    
    
    @JsonProperty("seller_identifier")
    private Integer sellerIdentifier;
    
    
    
    
    
    @JsonProperty("sellable_quantity")
    private Integer sellableQuantity;
    
    
    
    
    
    @JsonProperty("identifiers")
    private Object identifiers;
    
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    
    @JsonProperty("inventory_updated_on")
    private String inventoryUpdatedOn;
    
    
    
    
}

/*
    Model: ItemQuery
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ItemQuery {
    
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    
    @JsonProperty("item_code")
    private String itemCode;
    
    
    
    
    
    @JsonProperty("brand_uid")
    private Integer brandUid;
    
    
    
    
}

/*
    Model: GTIN
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class GTIN {
    
    
    
    
    
    @JsonProperty("primary")
    private Boolean primary;
    
    
    
    
    
    @JsonProperty("gtin_type")
    private String gtinType;
    
    
    
    
    
    @JsonProperty("gtin_value")
    private String gtinValue;
    
    
    
    
}

/*
    Model: SetSize
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class SetSize {
    
    
    
    
    
    @JsonProperty("size")
    private String size;
    
    
    
    
    
    @JsonProperty("pieces")
    private Integer pieces;
    
    
    
    
}

/*
    Model: SizeDistribution
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class SizeDistribution {
    
    
    
    
    
    @JsonProperty("sizes")
    private List<SetSize> sizes;
    
    
    
    
}

/*
    Model: InventorySet
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class InventorySet {
    
    
    
    
    
    @JsonProperty("size_distribution")
    private SizeDistribution sizeDistribution;
    
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
}

/*
    Model: InvSize
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class InvSize {
    
    
    
    
    
    @JsonProperty("price_transfer")
    private Double priceTransfer;
    
    
    
    
    
    @JsonProperty("expiration_date")
    private String expirationDate;
    
    
    
    
    
    @JsonProperty("price")
    private Double price;
    
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    
    @JsonProperty("item_length")
    private Double itemLength;
    
    
    
    
    
    @JsonProperty("size")
    private String size;
    
    
    
    
    
    @JsonProperty("price_effective")
    private Double priceEffective;
    
    
    
    
    
    @JsonProperty("item_dimensions_unit_of_measure")
    private String itemDimensionsUnitOfMeasure;
    
    
    
    
    
    @JsonProperty("item_weight")
    private Double itemWeight;
    
    
    
    
    
    @JsonProperty("item_weight_unit_of_measure")
    private String itemWeightUnitOfMeasure;
    
    
    
    
    
    @JsonProperty("store_code")
    private String storeCode;
    
    
    
    
    
    @JsonProperty("is_set")
    private Boolean isSet;
    
    
    
    
    
    @JsonProperty("item_height")
    private Double itemHeight;
    
    
    
    
    
    @JsonProperty("item_width")
    private Double itemWidth;
    
    
    
    
    
    @JsonProperty("identifiers")
    private List<GTIN> identifiers;
    
    
    
    
    
    @JsonProperty("set")
    private InventorySet set;
    
    
    
    
}

/*
    Model: InventoryRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class InventoryRequest {
    
    
    
    
    
    @JsonProperty("item")
    private ItemQuery item;
    
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    
    @JsonProperty("sizes")
    private List<InvSize> sizes;
    
    
    
    
}

/*
    Model: InventoryDeleteData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class InventoryDeleteData {
    
    
    
    
    
    @JsonProperty("location_id")
    private Integer locationId;
    
    
    
    
    
    @JsonProperty("size")
    private String size;
    
    
    
    
    
    @JsonProperty("item_id")
    private Integer itemId;
    
    
    
    
}

/*
    Model: InventoryDelete
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class InventoryDelete {
    
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    
    @JsonProperty("data")
    private InventoryDeleteData data;
    
    
    
    
}

/*
    Model: BulkInventoryGetItems
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class BulkInventoryGetItems {
    
    
    
    
    
    @JsonProperty("cancelled")
    private Integer cancelled;
    
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    
    @JsonProperty("failed_records")
    private List<String> failedRecords;
    
    
    
    
    
    @JsonProperty("file_path")
    private String filePath;
    
    
    
    
    
    @JsonProperty("succeed")
    private Integer succeed;
    
    
    
    
    
    @JsonProperty("cancelled_records")
    private List<String> cancelledRecords;
    
    
    
    
    
    @JsonProperty("total")
    private Integer total;
    
    
    
    
    
    @JsonProperty("stage")
    private String stage;
    
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    
    @JsonProperty("modified_by")
    private Object modifiedBy;
    
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    
    @JsonProperty("created_by")
    private Object createdBy;
    
    
    
    
    
    @JsonProperty("failed")
    private Integer failed;
    
    
    
    
}

/*
    Model: BulkInventoryGet
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class BulkInventoryGet {
    
    
    
    
    
    @JsonProperty("items")
    private List<BulkInventoryGetItems> items;
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: CommonResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CommonResponse {
    
    
    
    
    
    @JsonProperty("success")
    private String success;
    
    
    
    
}

/*
    Model: Size1
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Size1 {
    
    
    
    
    
    @JsonProperty("price_transfer")
    private Double priceTransfer;
    
    
    
    
    
    @JsonProperty("expiration_date")
    private String expirationDate;
    
    
    
    
    
    @JsonProperty("seller_identifier")
    private String sellerIdentifier;
    
    
    
    
    
    @JsonProperty("price")
    private Double price;
    
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    
    @JsonProperty("item_length")
    private Double itemLength;
    
    
    
    
    
    @JsonProperty("size")
    private String size;
    
    
    
    
    
    @JsonProperty("price_effective")
    private Double priceEffective;
    
    
    
    
    
    @JsonProperty("item_dimensions_unit_of_measure")
    private String itemDimensionsUnitOfMeasure;
    
    
    
    
    
    @JsonProperty("item_weight")
    private Double itemWeight;
    
    
    
    
    
    @JsonProperty("item_weight_unit_of_measure")
    private String itemWeightUnitOfMeasure;
    
    
    
    
    
    @JsonProperty("store_code")
    private String storeCode;
    
    
    
    
    
    @JsonProperty("is_set")
    private Boolean isSet;
    
    
    
    
    
    @JsonProperty("item_height")
    private Double itemHeight;
    
    
    
    
    
    @JsonProperty("item_width")
    private Double itemWidth;
    
    
    
    
    
    @JsonProperty("identifiers")
    private List<Object> identifiers;
    
    
    
    
    
    @JsonProperty("set")
    private InventorySet set;
    
    
    
    
}

/*
    Model: InventoryBulkRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class InventoryBulkRequest {
    
    
    
    
    
    @JsonProperty("batch_id")
    private String batchId;
    
    
    
    
    
    @JsonProperty("user")
    private Object user;
    
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    
    @JsonProperty("sizes")
    private List<Size1> sizes;
    
    
    
    
}

/*
    Model: InventoryExportJob
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class InventoryExportJob {
    
    
    
    
    
    @JsonProperty("seller_id")
    private Integer sellerId;
    
    
    
    
    
    @JsonProperty("request_params")
    private Object requestParams;
    
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
    
    @JsonProperty("trigger_on")
    private String triggerOn;
    
    
    
    
    
    @JsonProperty("completed_on")
    private String completedOn;
    
    
    
    
    
    @JsonProperty("task_id")
    private String taskId;
    
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
}

/*
    Model: InventoryExportRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class InventoryExportRequest {
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("store")
    private List<Integer> store;
    
    
    
    
    
    @JsonProperty("brand")
    private List<Integer> brand;
    
    
    
    
}

/*
    Model: FilerList
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class FilerList {
    
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
}

/*
    Model: InventoryConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class InventoryConfig {
    
    
    
    
    
    @JsonProperty("multivalues")
    private Boolean multivalues;
    
    
    
    
    
    @JsonProperty("data")
    private List<FilerList> data;
    
    
    
    
}

/*
    Model: HsnCodesObject
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class HsnCodesObject {
    
    
    
    
    
    @JsonProperty("tax2")
    private Double tax2;
    
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    
    @JsonProperty("hs2_code")
    private String hs2Code;
    
    
    
    
    
    @JsonProperty("tax1")
    private Double tax1;
    
    
    
    
    
    @JsonProperty("threshold2")
    private Double threshold2;
    
    
    
    
    
    @JsonProperty("tax_on_esp")
    private Boolean taxOnEsp;
    
    
    
    
    
    @JsonProperty("hsn_code")
    private String hsnCode;
    
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    
    @JsonProperty("threshold1")
    private Double threshold1;
    
    
    
    
    
    @JsonProperty("tax_on_mrp")
    private Boolean taxOnMrp;
    
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
}

/*
    Model: PageResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class PageResponse {
    
    
    
    
    
    @JsonProperty("has_next")
    private Boolean hasNext;
    
    
    
    
    
    @JsonProperty("has_previous")
    private Boolean hasPrevious;
    
    
    
    
    
    @JsonProperty("size")
    private Integer size;
    
    
    
    
    
    @JsonProperty("current")
    private String current;
    
    
    
    
    
    @JsonProperty("item_total")
    private Integer itemTotal;
    
    
    
    
}

/*
    Model: HsnCodesListingResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class HsnCodesListingResponse {
    
    
    
    
    
    @JsonProperty("items")
    private List<HsnCodesObject> items;
    
    
    
    
    
    @JsonProperty("page")
    private PageResponse page;
    
    
    
    
}

/*
    Model: HsnUpsert
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class HsnUpsert {
    
    
    
    
    
    @JsonProperty("tax2")
    private Double tax2;
    
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    
    @JsonProperty("hs2_code")
    private String hs2Code;
    
    
    
    
    
    @JsonProperty("tax1")
    private Double tax1;
    
    
    
    
    
    @JsonProperty("threshold2")
    private Double threshold2;
    
    
    
    
    
    @JsonProperty("tax_on_esp")
    private Boolean taxOnEsp;
    
    
    
    
    
    @JsonProperty("hsn_code")
    private String hsnCode;
    
    
    
    
    
    @JsonProperty("threshold1")
    private Double threshold1;
    
    
    
    
    
    @JsonProperty("tax_on_mrp")
    private Boolean taxOnMrp;
    
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
}

/*
    Model: HsnCode
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class HsnCode {
    
    
    
    
    
    @JsonProperty("data")
    private HsnCodesObject data;
    
    
    
    
}

/*
    Model: BulkHsnUpsert
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class BulkHsnUpsert {
    
    
    
    
    
    @JsonProperty("data")
    private List<HsnUpsert> data;
    
    
    
    
}

/*
    Model: BulkHsnResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class BulkHsnResponse {
    
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
}

/*
    Model: BrandItem
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class BrandItem {
    
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    
    @JsonProperty("banners")
    private ImageUrls banners;
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    
    @JsonProperty("logo")
    private Media logo;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("action")
    private Action action;
    
    
    
    
    
    @JsonProperty("discount")
    private String discount;
    
    
    
    
    
    @JsonProperty("departments")
    private List<String> departments;
    
    
    
    
}

/*
    Model: BrandListingResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class BrandListingResponse {
    
    
    
    
    
    @JsonProperty("items")
    private List<BrandItem> items;
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: Department
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Department {
    
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    
    @JsonProperty("priority_order")
    private Integer priorityOrder;
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    
    @JsonProperty("logo")
    private Media logo;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
}

/*
    Model: DepartmentResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class DepartmentResponse {
    
    
    
    
    
    @JsonProperty("items")
    private List<Department> items;
    
    
    
    
}

/*
    Model: ThirdLevelChild
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ThirdLevelChild {
    
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    
    @JsonProperty("banners")
    private ImageUrls banners;
    
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    
    @JsonProperty("childs")
    private List<Object> childs;
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("action")
    private Action action;
    
    
    
    
}

/*
    Model: SecondLevelChild
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class SecondLevelChild {
    
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    
    @JsonProperty("banners")
    private ImageUrls banners;
    
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    
    @JsonProperty("childs")
    private List<ThirdLevelChild> childs;
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("action")
    private Action action;
    
    
    
    
}

/*
    Model: Child
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Child {
    
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    
    @JsonProperty("banners")
    private ImageUrls banners;
    
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    
    @JsonProperty("childs")
    private List<SecondLevelChild> childs;
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("action")
    private Action action;
    
    
    
    
}

/*
    Model: CategoryItems
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CategoryItems {
    
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    
    @JsonProperty("banners")
    private ImageUrls banners;
    
    
    
    
    
    @JsonProperty("childs")
    private List<Child> childs;
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("action")
    private Action action;
    
    
    
    
}

/*
    Model: DepartmentCategoryTree
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class DepartmentCategoryTree {
    
    
    
    
    
    @JsonProperty("department")
    private String department;
    
    
    
    
    
    @JsonProperty("items")
    private List<CategoryItems> items;
    
    
    
    
}

/*
    Model: DepartmentIdentifier
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class DepartmentIdentifier {
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
}

/*
    Model: CategoryListingResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CategoryListingResponse {
    
    
    
    
    
    @JsonProperty("data")
    private List<DepartmentCategoryTree> data;
    
    
    
    
    
    @JsonProperty("departments")
    private List<DepartmentIdentifier> departments;
    
    
    
    
}

/*
    Model: ApplicationProductListingResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ApplicationProductListingResponse {
    
    
    
    
    
    @JsonProperty("items")
    private List<ProductListingDetail> items;
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    
    @JsonProperty("filters")
    private List<ProductFilters> filters;
    
    
    
    
    
    @JsonProperty("sort_on")
    private List<ProductSortOn> sortOn;
    
    
    
    
}

/*
    Model: ProductDetail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ProductDetail {
    
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    
    @JsonProperty("image_nature")
    private String imageNature;
    
    
    
    
    
    @JsonProperty("highlights")
    private List<String> highlights;
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    
    @JsonProperty("promo_meta")
    private Object promoMeta;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("similars")
    private List<String> similars;
    
    
    
    
    
    @JsonProperty("item_type")
    private String itemType;
    
    
    
    
    
    @JsonProperty("item_code")
    private String itemCode;
    
    
    
    
    
    @JsonProperty("brand")
    private ProductBrand brand;
    
    
    
    
    
    @JsonProperty("grouped_attributes")
    private List<ProductDetailGroupedAttribute> groupedAttributes;
    
    
    
    
    
    @JsonProperty("short_description")
    private String shortDescription;
    
    
    
    
    
    @JsonProperty("medias")
    private List<Media1> medias;
    
    
    
    
    
    @JsonProperty("color")
    private String color;
    
    
    
    
    
    @JsonProperty("rating_count")
    private Integer ratingCount;
    
    
    
    
    
    @JsonProperty("teaser_tag")
    private Object teaserTag;
    
    
    
    
    
    @JsonProperty("has_variant")
    private Boolean hasVariant;
    
    
    
    
    
    @JsonProperty("attributes")
    private Object attributes;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("rating")
    private Double rating;
    
    
    
    
    
    @JsonProperty("tryouts")
    private List<String> tryouts;
    
    
    
    
    
    @JsonProperty("product_online_date")
    private String productOnlineDate;
    
    
    
    
}

/*
    Model: ArticleAssignment
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ArticleAssignment {
    
    
    
    
    
    @JsonProperty("strategy")
    private String strategy;
    
    
    
    
    
    @JsonProperty("level")
    private String level;
    
    
    
    
}

/*
    Model: ArticleQuery
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ArticleQuery {
    
    
    
    
    
    @JsonProperty("size")
    private String size;
    
    
    
    
    
    @JsonProperty("ignored_stores")
    private List<Integer> ignoredStores;
    
    
    
    
    
    @JsonProperty("item_id")
    private Integer itemId;
    
    
    
    
}

/*
    Model: AssignStoreArticle
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class AssignStoreArticle {
    
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    
    @JsonProperty("article_assignment")
    private ArticleAssignment articleAssignment;
    
    
    
    
    
    @JsonProperty("query")
    private ArticleQuery query;
    
    
    
    
    
    @JsonProperty("group_id")
    private String groupId;
    
    
    
    
}

/*
    Model: AssignStore
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class AssignStore {
    
    
    
    
    
    @JsonProperty("store_ids")
    private List<Integer> storeIds;
    
    
    
    
    
    @JsonProperty("channel_identifier")
    private String channelIdentifier;
    
    
    
    
    
    @JsonProperty("channel_type")
    private String channelType;
    
    
    
    
    
    @JsonProperty("pincode")
    private String pincode;
    
    
    
    
    
    @JsonProperty("articles")
    private List<AssignStoreArticle> articles;
    
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
}

/*
    Model: ArticleAssignment1
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ArticleAssignment1 {
    
    
    
    
    
    @JsonProperty("strategy")
    private String strategy;
    
    
    
    
    
    @JsonProperty("level")
    private String level;
    
    
    
    
}

/*
    Model: StoreAssignResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class StoreAssignResponse {
    
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    
    @JsonProperty("store_id")
    private Integer storeId;
    
    
    
    
    
    @JsonProperty("price_marked")
    private Integer priceMarked;
    
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    
    @JsonProperty("strategy_wise_listing")
    private List<Object> strategyWiseListing;
    
    
    
    
    
    @JsonProperty("size")
    private String size;
    
    
    
    
    
    @JsonProperty("price_effective")
    private Integer priceEffective;
    
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    
    @JsonProperty("article_assignment")
    private ArticleAssignment1 articleAssignment;
    
    
    
    
    
    @JsonProperty("s_city")
    private String sCity;
    
    
    
    
    
    @JsonProperty("item_id")
    private Integer itemId;
    
    
    
    
    
    @JsonProperty("index")
    private Integer index;
    
    
    
    
    
    @JsonProperty("status")
    private Boolean status;
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    
    @JsonProperty("group_id")
    private String groupId;
    
    
    
    
    
    @JsonProperty("store_pincode")
    private Integer storePincode;
    
    
    
    
}



/*
    Model: Document
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Document {
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("legal_name")
    private String legalName;
    
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
    
    @JsonProperty("verified")
    private Boolean verified;
    
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
}

/*
    Model: GetAddressSerializer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class GetAddressSerializer {
    
    
    
    
    
    @JsonProperty("address_type")
    private String addressType;
    
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    
    @JsonProperty("landmark")
    private String landmark;
    
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    
    @JsonProperty("pincode")
    private Integer pincode;
    
    
    
    
    
    @JsonProperty("address1")
    private String address1;
    
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    
    @JsonProperty("address2")
    private String address2;
    
    
    
    
    
    @JsonProperty("latitude")
    private Double latitude;
    
    
    
    
    
    @JsonProperty("longitude")
    private Double longitude;
    
    
    
    
}

/*
    Model: SellerPhoneNumber
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class SellerPhoneNumber {
    
    
    
    
    
    @JsonProperty("number")
    private String number;
    
    
    
    
    
    @JsonProperty("country_code")
    private Integer countryCode;
    
    
    
    
}

/*
    Model: ContactDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ContactDetails {
    
    
    
    
    
    @JsonProperty("emails")
    private List<String> emails;
    
    
    
    
    
    @JsonProperty("phone")
    private List<SellerPhoneNumber> phone;
    
    
    
    
}

/*
    Model: BusinessCountryInfo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class BusinessCountryInfo {
    
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
}

/*
    Model: Website
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Website {
    
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
}

/*
    Model: BusinessDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class BusinessDetails {
    
    
    
    
    
    @JsonProperty("website")
    private Website website;
    
    
    
    
}

/*
    Model: GetCompanyProfileSerializerResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class GetCompanyProfileSerializerResponse {
    
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    
    @JsonProperty("created_by")
    private UserSerializer createdBy;
    
    
    
    
    
    @JsonProperty("documents")
    private List<Document> documents;
    
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    
    @JsonProperty("business_type")
    private String businessType;
    
    
    
    
    
    @JsonProperty("addresses")
    private List<GetAddressSerializer> addresses;
    
    
    
    
    
    @JsonProperty("modified_by")
    private UserSerializer modifiedBy;
    
    
    
    
    
    @JsonProperty("company_type")
    private String companyType;
    
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    
    @JsonProperty("contact_details")
    private ContactDetails contactDetails;
    
    
    
    
    
    @JsonProperty("mode")
    private String mode;
    
    
    
    
    
    @JsonProperty("notification_emails")
    private List<String> notificationEmails;
    
    
    
    
    
    @JsonProperty("business_country_info")
    private BusinessCountryInfo businessCountryInfo;
    
    
    
    
    
    @JsonProperty("verified_on")
    private String verifiedOn;
    
    
    
    
    
    @JsonProperty("business_details")
    private BusinessDetails businessDetails;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("franchise_enabled")
    private Boolean franchiseEnabled;
    
    
    
    
    
    @JsonProperty("warnings")
    private Object warnings;
    
    
    
    
    
    @JsonProperty("verified_by")
    private UserSerializer verifiedBy;
    
    
    
    
    
    @JsonProperty("stage")
    private String stage;
    
    
    
    
    
    @JsonProperty("business_info")
    private String businessInfo;
    
    
    
    
}

/*
    Model: CreateUpdateAddressSerializer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CreateUpdateAddressSerializer {
    
    
    
    
    
    @JsonProperty("address_type")
    private String addressType;
    
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    
    @JsonProperty("landmark")
    private String landmark;
    
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    
    @JsonProperty("pincode")
    private Integer pincode;
    
    
    
    
    
    @JsonProperty("address1")
    private String address1;
    
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    
    @JsonProperty("address2")
    private String address2;
    
    
    
    
    
    @JsonProperty("latitude")
    private Double latitude;
    
    
    
    
    
    @JsonProperty("longitude")
    private Double longitude;
    
    
    
    
}

/*
    Model: UpdateCompany
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class UpdateCompany {
    
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    
    @JsonProperty("reject_reason")
    private String rejectReason;
    
    
    
    
    
    @JsonProperty("notification_emails")
    private List<String> notificationEmails;
    
    
    
    
    
    @JsonProperty("company_type")
    private String companyType;
    
    
    
    
    
    @JsonProperty("warnings")
    private Object warnings;
    
    
    
    
    
    @JsonProperty("franchise_enabled")
    private Boolean franchiseEnabled;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("contact_details")
    private ContactDetails contactDetails;
    
    
    
    
    
    @JsonProperty("documents")
    private List<Document> documents;
    
    
    
    
    
    @JsonProperty("addresses")
    private List<CreateUpdateAddressSerializer> addresses;
    
    
    
    
    
    @JsonProperty("business_details")
    private BusinessDetails businessDetails;
    
    
    
    
    
    @JsonProperty("business_info")
    private String businessInfo;
    
    
    
    
    
    @JsonProperty("business_type")
    private String businessType;
    
    
    
    
}

/*
    Model: DocumentsObj
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class DocumentsObj {
    
    
    
    
    
    @JsonProperty("pending")
    private Integer pending;
    
    
    
    
    
    @JsonProperty("verified")
    private Integer verified;
    
    
    
    
}

/*
    Model: MetricsSerializer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class MetricsSerializer {
    
    
    
    
    
    @JsonProperty("product")
    private DocumentsObj product;
    
    
    
    
    
    @JsonProperty("store_documents")
    private DocumentsObj storeDocuments;
    
    
    
    
    
    @JsonProperty("company_documents")
    private DocumentsObj companyDocuments;
    
    
    
    
    
    @JsonProperty("store")
    private DocumentsObj store;
    
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    
    @JsonProperty("stage")
    private String stage;
    
    
    
    
    
    @JsonProperty("brand")
    private DocumentsObj brand;
    
    
    
    
}

/*
    Model: BrandBannerSerializer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class BrandBannerSerializer {
    
    
    
    
    
    @JsonProperty("landscape")
    private String landscape;
    
    
    
    
    
    @JsonProperty("portrait")
    private String portrait;
    
    
    
    
}

/*
    Model: CreateUpdateBrandRequestSerializer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CreateUpdateBrandRequestSerializer {
    
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    
    @JsonProperty("synonyms")
    private List<String> synonyms;
    
    
    
    
    
    @JsonProperty("brand_tier")
    private String brandTier;
    
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    
    @JsonProperty("banner")
    private BrandBannerSerializer banner;
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    
    @JsonProperty("_locale_language")
    private Object localeLanguage;
    
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
}

/*
    Model: UserSerializer1
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class UserSerializer1 {
    
    
    
    
    
    @JsonProperty("username")
    private String username;
    
    
    
    
    
    @JsonProperty("contact")
    private String contact;
    
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
}

/*
    Model: GetBrandResponseSerializer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class GetBrandResponseSerializer {
    
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    
    @JsonProperty("created_by")
    private UserSerializer1 createdBy;
    
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    
    @JsonProperty("modified_by")
    private UserSerializer1 modifiedBy;
    
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    
    @JsonProperty("_locale_language")
    private Object localeLanguage;
    
    
    
    
    
    @JsonProperty("mode")
    private String mode;
    
    
    
    
    
    @JsonProperty("reject_reason")
    private String rejectReason;
    
    
    
    
    
    @JsonProperty("slug_key")
    private String slugKey;
    
    
    
    
    
    @JsonProperty("verified_on")
    private String verifiedOn;
    
    
    
    
    
    @JsonProperty("banner")
    private BrandBannerSerializer banner;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    
    @JsonProperty("synonyms")
    private List<String> synonyms;
    
    
    
    
    
    @JsonProperty("warnings")
    private Object warnings;
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    
    @JsonProperty("verified_by")
    private UserSerializer1 verifiedBy;
    
    
    
    
    
    @JsonProperty("stage")
    private String stage;
    
    
    
    
}

/*
    Model: CompanyBrandPostRequestSerializer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CompanyBrandPostRequestSerializer {
    
    
    
    
    
    @JsonProperty("brands")
    private List<Integer> brands;
    
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    
    @JsonProperty("company")
    private Integer company;
    
    
    
    
}

/*
    Model: GetCompanySerializer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class GetCompanySerializer {
    
    
    
    
    
    @JsonProperty("modified_by")
    private UserSerializer modifiedBy;
    
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    
    @JsonProperty("reject_reason")
    private String rejectReason;
    
    
    
    
    
    @JsonProperty("company_type")
    private String companyType;
    
    
    
    
    
    @JsonProperty("created_by")
    private UserSerializer createdBy;
    
    
    
    
    
    @JsonProperty("business_type")
    private String businessType;
    
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    
    @JsonProperty("verified_on")
    private String verifiedOn;
    
    
    
    
    
    @JsonProperty("addresses")
    private List<GetAddressSerializer> addresses;
    
    
    
    
    
    @JsonProperty("verified_by")
    private UserSerializer verifiedBy;
    
    
    
    
    
    @JsonProperty("stage")
    private String stage;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
}

/*
    Model: CompanyBrandSerializer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CompanyBrandSerializer {
    
    
    
    
    
    @JsonProperty("modified_by")
    private UserSerializer1 modifiedBy;
    
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    
    @JsonProperty("reject_reason")
    private String rejectReason;
    
    
    
    
    
    @JsonProperty("warnings")
    private Object warnings;
    
    
    
    
    
    @JsonProperty("created_by")
    private UserSerializer1 createdBy;
    
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    
    @JsonProperty("verified_on")
    private String verifiedOn;
    
    
    
    
    
    @JsonProperty("verified_by")
    private UserSerializer1 verifiedBy;
    
    
    
    
    
    @JsonProperty("stage")
    private String stage;
    
    
    
    
    
    @JsonProperty("brand")
    private GetBrandResponseSerializer brand;
    
    
    
    
    
    @JsonProperty("company")
    private GetCompanySerializer company;
    
    
    
    
}

/*
    Model: CompanyBrandListSerializer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CompanyBrandListSerializer {
    
    
    
    
    
    @JsonProperty("items")
    private List<CompanyBrandSerializer> items;
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: GetAddressSerializer1
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class GetAddressSerializer1 {
    
    
    
    
    
    @JsonProperty("address_type")
    private String addressType;
    
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    
    @JsonProperty("landmark")
    private String landmark;
    
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    
    @JsonProperty("pincode")
    private Integer pincode;
    
    
    
    
    
    @JsonProperty("address1")
    private String address1;
    
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    
    @JsonProperty("address2")
    private String address2;
    
    
    
    
    
    @JsonProperty("latitude")
    private Double latitude;
    
    
    
    
    
    @JsonProperty("longitude")
    private Double longitude;
    
    
    
    
}

/*
    Model: LocationTimingSerializer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class LocationTimingSerializer {
    
    
    
    
    
    @JsonProperty("minute")
    private Integer minute;
    
    
    
    
    
    @JsonProperty("hour")
    private Integer hour;
    
    
    
    
}

/*
    Model: LocationDayWiseSerializer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class LocationDayWiseSerializer {
    
    
    
    
    
    @JsonProperty("opening")
    private LocationTimingSerializer opening;
    
    
    
    
    
    @JsonProperty("open")
    private Boolean open;
    
    
    
    
    
    @JsonProperty("closing")
    private LocationTimingSerializer closing;
    
    
    
    
    
    @JsonProperty("weekday")
    private String weekday;
    
    
    
    
}

/*
    Model: ProductReturnConfigSerializer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ProductReturnConfigSerializer {
    
    
    
    
    
    @JsonProperty("on_same_store")
    private Boolean onSameStore;
    
    
    
    
    
    @JsonProperty("store_uid")
    private Integer storeUid;
    
    
    
    
}

/*
    Model: LocationManagerSerializer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class LocationManagerSerializer {
    
    
    
    
    
    @JsonProperty("mobile_no")
    private SellerPhoneNumber mobileNo;
    
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
}

/*
    Model: InvoiceCredSerializer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class InvoiceCredSerializer {
    
    
    
    
    
    @JsonProperty("username")
    private String username;
    
    
    
    
    
    @JsonProperty("password")
    private String password;
    
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
}

/*
    Model: InvoiceDetailsSerializer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class InvoiceDetailsSerializer {
    
    
    
    
    
    @JsonProperty("e_invoice")
    private InvoiceCredSerializer eInvoice;
    
    
    
    
    
    @JsonProperty("e_waybill")
    private InvoiceCredSerializer eWaybill;
    
    
    
    
}

/*
    Model: LocationSerializer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class LocationSerializer {
    
    
    
    
    
    @JsonProperty("address")
    private GetAddressSerializer1 address;
    
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    
    @JsonProperty("contact_numbers")
    private List<SellerPhoneNumber> contactNumbers;
    
    
    
    
    
    @JsonProperty("notification_emails")
    private List<String> notificationEmails;
    
    
    
    
    
    @JsonProperty("warnings")
    private Object warnings;
    
    
    
    
    
    @JsonProperty("store_type")
    private String storeType;
    
    
    
    
    
    @JsonProperty("timing")
    private List<LocationDayWiseSerializer> timing;
    
    
    
    
    
    @JsonProperty("product_return_config")
    private ProductReturnConfigSerializer productReturnConfig;
    
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    
    @JsonProperty("manager")
    private LocationManagerSerializer manager;
    
    
    
    
    
    @JsonProperty("documents")
    private List<Document> documents;
    
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    
    @JsonProperty("gst_credentials")
    private InvoiceDetailsSerializer gstCredentials;
    
    
    
    
    
    @JsonProperty("stage")
    private String stage;
    
    
    
    
    
    @JsonProperty("company")
    private Integer company;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
}

/*
    Model: LocationIntegrationType
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class LocationIntegrationType {
    
    
    
    
    
    @JsonProperty("order")
    private String order;
    
    
    
    
    
    @JsonProperty("inventory")
    private String inventory;
    
    
    
    
}

/*
    Model: GetLocationSerializer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class GetLocationSerializer {
    
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    
    @JsonProperty("created_by")
    private UserSerializer1 createdBy;
    
    
    
    
    
    @JsonProperty("manager")
    private LocationManagerSerializer manager;
    
    
    
    
    
    @JsonProperty("documents")
    private List<Document> documents;
    
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    
    @JsonProperty("address")
    private GetAddressSerializer address;
    
    
    
    
    
    @JsonProperty("modified_by")
    private UserSerializer1 modifiedBy;
    
    
    
    
    
    @JsonProperty("integration_type")
    private LocationIntegrationType integrationType;
    
    
    
    
    
    @JsonProperty("product_return_config")
    private ProductReturnConfigSerializer productReturnConfig;
    
    
    
    
    
    @JsonProperty("timing")
    private List<LocationDayWiseSerializer> timing;
    
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    
    @JsonProperty("gst_credentials")
    private InvoiceDetailsSerializer gstCredentials;
    
    
    
    
    
    @JsonProperty("contact_numbers")
    private List<SellerPhoneNumber> contactNumbers;
    
    
    
    
    
    @JsonProperty("notification_emails")
    private List<String> notificationEmails;
    
    
    
    
    
    @JsonProperty("store_type")
    private String storeType;
    
    
    
    
    
    @JsonProperty("verified_on")
    private String verifiedOn;
    
    
    
    
    
    @JsonProperty("phone_number")
    private String phoneNumber;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    
    @JsonProperty("warnings")
    private Object warnings;
    
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    
    @JsonProperty("verified_by")
    private UserSerializer1 verifiedBy;
    
    
    
    
    
    @JsonProperty("stage")
    private String stage;
    
    
    
    
    
    @JsonProperty("company")
    private GetCompanySerializer company;
    
    
    
    
}

/*
    Model: LocationListSerializer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class LocationListSerializer {
    
    
    
    
    
    @JsonProperty("items")
    private List<GetLocationSerializer> items;
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: BulkLocationSerializer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class BulkLocationSerializer {
    
    
    
    
    
    @JsonProperty("data")
    private List<LocationSerializer> data;
    
    
    
    
}



/*
    Model: FailedResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class FailedResponse {
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
}

/*
    Model: CDN
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CDN {
    
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
}

/*
    Model: Upload
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Upload {
    
    
    
    
    
    @JsonProperty("expiry")
    private Integer expiry;
    
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
}

/*
    Model: StartResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class StartResponse {
    
    
    
    
    
    @JsonProperty("file_name")
    private String fileName;
    
    
    
    
    
    @JsonProperty("file_path")
    private String filePath;
    
    
    
    
    
    @JsonProperty("content_type")
    private String contentType;
    
    
    
    
    
    @JsonProperty("method")
    private String method;
    
    
    
    
    
    @JsonProperty("namespace")
    private String namespace;
    
    
    
    
    
    @JsonProperty("operation")
    private String operation;
    
    
    
    
    
    @JsonProperty("size")
    private Integer size;
    
    
    
    
    
    @JsonProperty("upload")
    private Upload upload;
    
    
    
    
    
    @JsonProperty("cdn")
    private CDN cdn;
    
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
}

/*
    Model: StartRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class StartRequest {
    
    
    
    
    
    @JsonProperty("file_name")
    private String fileName;
    
    
    
    
    
    @JsonProperty("content_type")
    private String contentType;
    
    
    
    
    
    @JsonProperty("size")
    private Integer size;
    
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    
    @JsonProperty("params")
    private Object params;
    
    
    
    
}

/*
    Model: CompleteResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CompleteResponse {
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("file_name")
    private String fileName;
    
    
    
    
    
    @JsonProperty("file_path")
    private String filePath;
    
    
    
    
    
    @JsonProperty("content_type")
    private String contentType;
    
    
    
    
    
    @JsonProperty("method")
    private String method;
    
    
    
    
    
    @JsonProperty("namespace")
    private String namespace;
    
    
    
    
    
    @JsonProperty("operation")
    private String operation;
    
    
    
    
    
    @JsonProperty("size")
    private Integer size;
    
    
    
    
    
    @JsonProperty("upload")
    private Upload upload;
    
    
    
    
    
    @JsonProperty("cdn")
    private CDN cdn;
    
    
    
    
    
    @JsonProperty("success")
    private String success;
    
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
}

/*
    Model: Opts
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Opts {
    
    
    
    
    
    @JsonProperty("attempts")
    private Integer attempts;
    
    
    
    
    
    @JsonProperty("timestamp")
    private Integer timestamp;
    
    
    
    
    
    @JsonProperty("delay")
    private Integer delay;
    
    
    
    
}

/*
    Model: CopyFileTask
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CopyFileTask {
    
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("data")
    private BulkRequest data;
    
    
    
    
    
    @JsonProperty("opts")
    private Opts opts;
    
    
    
    
    
    @JsonProperty("progress")
    private Integer progress;
    
    
    
    
    
    @JsonProperty("delay")
    private Integer delay;
    
    
    
    
    
    @JsonProperty("timestamp")
    private Integer timestamp;
    
    
    
    
    
    @JsonProperty("attempts_made")
    private Integer attemptsMade;
    
    
    
    
    
    @JsonProperty("stacktrace")
    private List<String> stacktrace;
    
    
    
    
    
    @JsonProperty("finished_on")
    private Integer finishedOn;
    
    
    
    
    
    @JsonProperty("processed_on")
    private Integer processedOn;
    
    
    
    
}

/*
    Model: BulkResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class BulkResponse {
    
    
    
    
    
    @JsonProperty("tracking_url")
    private String trackingUrl;
    
    
    
    
    
    @JsonProperty("task")
    private CopyFileTask task;
    
    
    
    
}

/*
    Model: ReqConfiguration
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ReqConfiguration {
    
    
    
    
    
    @JsonProperty("concurrency")
    private Integer concurrency;
    
    
    
    
}

/*
    Model: Destination
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Destination {
    
    
    
    
    
    @JsonProperty("namespace")
    private String namespace;
    
    
    
    
    
    @JsonProperty("rewrite")
    private String rewrite;
    
    
    
    
    
    @JsonProperty("basepath")
    private String basepath;
    
    
    
    
}

/*
    Model: BulkRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class BulkRequest {
    
    
    
    
    
    @JsonProperty("urls")
    private List<String> urls;
    
    
    
    
    
    @JsonProperty("destination")
    private Destination destination;
    
    
    
    
    
    @JsonProperty("configuration")
    private ReqConfiguration configuration;
    
    
    
    
}

/*
    Model: Urls
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Urls {
    
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
    
    @JsonProperty("signed_url")
    private String signedUrl;
    
    
    
    
    
    @JsonProperty("expiry")
    private Integer expiry;
    
    
    
    
}

/*
    Model: SignUrlResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class SignUrlResponse {
    
    
    
    
    
    @JsonProperty("urls")
    private List<Urls> urls;
    
    
    
    
}

/*
    Model: SignUrlRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class SignUrlRequest {
    
    
    
    
    
    @JsonProperty("expiry")
    private Integer expiry;
    
    
    
    
    
    @JsonProperty("urls")
    private List<String> urls;
    
    
    
    
}

/*
    Model: DbRecord
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class DbRecord {
    
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("file_name")
    private String fileName;
    
    
    
    
    
    @JsonProperty("operation")
    private String operation;
    
    
    
    
    
    @JsonProperty("namespace")
    private String namespace;
    
    
    
    
    
    @JsonProperty("content_type")
    private String contentType;
    
    
    
    
    
    @JsonProperty("file_path")
    private String filePath;
    
    
    
    
    
    @JsonProperty("upload")
    private Upload upload;
    
    
    
    
    
    @JsonProperty("cdn")
    private CDN cdn;
    
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
}

/*
    Model: BrowseResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class BrowseResponse {
    
    
    
    
    
    @JsonProperty("items")
    private List<DbRecord> items;
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}



/*
    Model: RedirectDevice
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class RedirectDevice {
    
    
    
    
    
    @JsonProperty("link")
    private String link;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
}

/*
    Model: WebRedirect
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class WebRedirect {
    
    
    
    
    
    @JsonProperty("link")
    private String link;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
}

/*
    Model: Redirects
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Redirects {
    
    
    
    
    
    @JsonProperty("ios")
    private RedirectDevice ios;
    
    
    
    
    
    @JsonProperty("android")
    private RedirectDevice android;
    
    
    
    
    
    @JsonProperty("web")
    private WebRedirect web;
    
    
    
    
    
    @JsonProperty("force_web")
    private Boolean forceWeb;
    
    
    
    
}

/*
    Model: CampaignShortLink
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CampaignShortLink {
    
    
    
    
    
    @JsonProperty("source")
    private String source;
    
    
    
    
    
    @JsonProperty("medium")
    private String medium;
    
    
    
    
}

/*
    Model: Attribution
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Attribution {
    
    
    
    
    
    @JsonProperty("campaign_cookie_expiry")
    private String campaignCookieExpiry;
    
    
    
    
}

/*
    Model: SocialMediaTags
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class SocialMediaTags {
    
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    
    @JsonProperty("image")
    private String image;
    
    
    
    
}

/*
    Model: ShortLinkReq
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ShortLinkReq {
    
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
    
    @JsonProperty("hash")
    private String hash;
    
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    
    @JsonProperty("expire_at")
    private String expireAt;
    
    
    
    
    
    @JsonProperty("enable_tracking")
    private Boolean enableTracking;
    
    
    
    
    
    @JsonProperty("personalized")
    private Boolean personalized;
    
    
    
    
    
    @JsonProperty("campaign")
    private CampaignShortLink campaign;
    
    
    
    
    
    @JsonProperty("redirects")
    private Redirects redirects;
    
    
    
    
    
    @JsonProperty("attribution")
    private Attribution attribution;
    
    
    
    
    
    @JsonProperty("social_media_tags")
    private SocialMediaTags socialMediaTags;
    
    
    
    
    
    @JsonProperty("count")
    private Integer count;
    
    
    
    
}

/*
    Model: UrlInfo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class UrlInfo {
    
    
    
    
    
    @JsonProperty("original")
    private String original;
    
    
    
    
    
    @JsonProperty("short")
    private String shortName;
    
    
    
    
    
    @JsonProperty("hash")
    private String hash;
    
    
    
    
}

/*
    Model: ShortLinkRes
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ShortLinkRes {
    
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    
    @JsonProperty("url")
    private UrlInfo url;
    
    
    
    
    
    @JsonProperty("created_by")
    private String createdBy;
    
    
    
    
    
    @JsonProperty("app_redirect")
    private Boolean appRedirect;
    
    
    
    
    
    @JsonProperty("fallback")
    private String fallback;
    
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("enable_tracking")
    private Boolean enableTracking;
    
    
    
    
    
    @JsonProperty("expire_at")
    private String expireAt;
    
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    
    @JsonProperty("personalized")
    private Boolean personalized;
    
    
    
    
    
    @JsonProperty("campaign")
    private CampaignShortLink campaign;
    
    
    
    
    
    @JsonProperty("redirects")
    private Redirects redirects;
    
    
    
    
    
    @JsonProperty("attribution")
    private Attribution attribution;
    
    
    
    
    
    @JsonProperty("social_media_tags")
    private SocialMediaTags socialMediaTags;
    
    
    
    
    
    @JsonProperty("count")
    private Integer count;
    
    
    
    
}

/*
    Model: ShortLinkList
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ShortLinkList {
    
    
    
    
    
    @JsonProperty("items")
    private List<ShortLinkRes> items;
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: ErrorRes
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ErrorRes {
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
}



/*
    Model: DataTresholdDTO
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class DataTresholdDTO {
    
    
    
    
    
    @JsonProperty("min_price")
    private Double minPrice;
    
    
    
    
    
    @JsonProperty("safe_stock")
    private Integer safeStock;
    
    
    
    
    
    @JsonProperty("period_threshold")
    private Integer periodThreshold;
    
    
    
    
    
    @JsonProperty("period_threshold_type")
    private String periodThresholdType;
    
    
    
    
    
    @JsonProperty("period_type_list")
    private List<GenericDTO> periodTypeList;
    
    
    
    
}

/*
    Model: GenericDTO
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class GenericDTO {
    
    
    
    
    
    @JsonProperty("text")
    private String text;
    
    
    
    
    
    @JsonProperty("value")
    private Object value;
    
    
    
    
}

/*
    Model: JobConfigDTO
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class JobConfigDTO {
    
    
    
    
    
    @JsonProperty("integration")
    private String integration;
    
    
    
    
    
    @JsonProperty("integration_data")
    private HashMap<String,Object> integrationData;
    
    
    
    
    
    @JsonProperty("company_name")
    private String companyName;
    
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    
    @JsonProperty("task_details")
    private TaskDTO taskDetails;
    
    
    
    
    
    @JsonProperty("threshold_details")
    private DataTresholdDTO thresholdDetails;
    
    
    
    
    
    @JsonProperty("job_code")
    private String jobCode;
    
    
    
    
    
    @JsonProperty("alias")
    private String alias;
    
    
    
    
}

/*
    Model: TaskDTO
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class TaskDTO {
    
    
    
    
    
    @JsonProperty("type")
    private Integer type;
    
    
    
    
    
    @JsonProperty("group_list")
    private List<GenericDTO> groupList;
    
    
    
    
}

/*
    Model: ResponseEnvelopeString
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ResponseEnvelopeString {
    
    
    
    
    
    @JsonProperty("timestamp")
    private String timestamp;
    
    
    
    
    
    @JsonProperty("status")
    private Integer status;
    
    
    
    
    
    @JsonProperty("error")
    private String error;
    
    
    
    
    
    @JsonProperty("exception")
    private String exception;
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    
    @JsonProperty("total_time_taken_in_millis")
    private Integer totalTimeTakenInMillis;
    
    
    
    
    
    @JsonProperty("http_status")
    private String httpStatus;
    
    
    
    
    
    @JsonProperty("items")
    private String items;
    
    
    
    
    
    @JsonProperty("payload")
    private String payload;
    
    
    
    
    
    @JsonProperty("trace_id")
    private String traceId;
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: AWSS3config
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class AWSS3config {
    
    
    
    
    
    @JsonProperty("bucket")
    private String bucket;
    
    
    
    
    
    @JsonProperty("region")
    private String region;
    
    
    
    
    
    @JsonProperty("dir")
    private String dir;
    
    
    
    
    
    @JsonProperty("access_key")
    private String accessKey;
    
    
    
    
    
    @JsonProperty("secret_key")
    private String secretKey;
    
    
    
    
    
    @JsonProperty("local_file_path")
    private String localFilePath;
    
    
    
    
    
    @JsonProperty("archive_path")
    private String archivePath;
    
    
    
    
    
    @JsonProperty("archive")
    private Boolean archive;
    
    
    
    
    
    @JsonProperty("delete")
    private Boolean delete;
    
    
    
    
    
    @JsonProperty("unzip")
    private Boolean unzip;
    
    
    
    
    
    @JsonProperty("zip_format")
    private String zipFormat;
    
    
    
    
    
    @JsonProperty("file_regex")
    private String fileRegex;
    
    
    
    
    
    @JsonProperty("archive_config")
    private ArchiveConfig archiveConfig;
    
    
    
    
}

/*
    Model: ArchiveConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ArchiveConfig {
    
    
    
    
    
    @JsonProperty("delete")
    private Boolean delete;
    
    
    
    
    
    @JsonProperty("archive")
    private Boolean archive;
    
    
    
    
    
    @JsonProperty("archive_dir")
    private String archiveDir;
    
    
    
    
}

/*
    Model: Audit
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Audit {
    
    
    
    
    
    @JsonProperty("created_by")
    private String createdBy;
    
    
    
    
    
    @JsonProperty("modified_by")
    private String modifiedBy;
    
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
}

/*
    Model: CatalogMasterConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CatalogMasterConfig {
    
    
    
    
    
    @JsonProperty("source_slug")
    private String sourceSlug;
    
    
    
    
}

/*
    Model: CompanyConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CompanyConfig {
    
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    
    @JsonProperty("exclude_steps")
    private List<Integer> excludeSteps;
    
    
    
    
    
    @JsonProperty("hidden_closet_keys")
    private List<String> hiddenClosetKeys;
    
    
    
    
    
    @JsonProperty("open_tags")
    private HashMap<String,Object> openTags;
    
    
    
    
    
    @JsonProperty("tax_identifiers")
    private List<String> taxIdentifiers;
    
    
    
    
    
    @JsonProperty("delete_quantity_threshold")
    private Integer deleteQuantityThreshold;
    
    
    
    
}

/*
    Model: DBConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class DBConfig {
    
    
    
    
    
    @JsonProperty("vendor")
    private String vendor;
    
    
    
    
    
    @JsonProperty("host")
    private String host;
    
    
    
    
    
    @JsonProperty("port")
    private Integer port;
    
    
    
    
    
    @JsonProperty("username")
    private String username;
    
    
    
    
    
    @JsonProperty("password")
    private String password;
    
    
    
    
    
    @JsonProperty("dbname")
    private String dbname;
    
    
    
    
    
    @JsonProperty("query")
    private String query;
    
    
    
    
    
    @JsonProperty("procedure")
    private Boolean procedure;
    
    
    
    
    
    @JsonProperty("driver_class")
    private String driverClass;
    
    
    
    
    
    @JsonProperty("jdbc_url")
    private String jdbcUrl;
    
    
    
    
    
    @JsonProperty("optional_properties")
    private HashMap<String,String> optionalProperties;
    
    
    
    
}

/*
    Model: DBConnectionProfile
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class DBConnectionProfile {
    
    
    
    
    
    @JsonProperty("inventory")
    private String inventory;
    
    
    
    
}

/*
    Model: DBParamConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class DBParamConfig {
    
    
    
    
    
    @JsonProperty("params")
    private HashMap<String,Object> params;
    
    
    
    
}

/*
    Model: DefaultHeadersDTO
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class DefaultHeadersDTO {
    
    
    
    
    
    @JsonProperty("store")
    private PropBeanDTO store;
    
    
    
    
    
    @JsonProperty("intf_article_id")
    private PropBeanDTO intfArticleId;
    
    
    
    
    
    @JsonProperty("price_effective")
    private PropBeanDTO priceEffective;
    
    
    
    
    
    @JsonProperty("quantity")
    private PropBeanDTO quantity;
    
    
    
    
}

/*
    Model: DocMappingConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class DocMappingConfig {
    
    
    
    
    
    @JsonProperty("properties")
    private HashMap<String,Object> properties;
    
    
    
    
    
    @JsonProperty("junk_data_threshold_count")
    private Integer junkDataThresholdCount;
    
    
    
    
    
    @JsonProperty("prop_bean_configs")
    private List<PropBeanConfig> propBeanConfigs;
    
    
    
    
    
    @JsonProperty("unwind_field")
    private String unwindField;
    
    
    
    
    
    @JsonProperty("default_headers")
    private DefaultHeadersDTO defaultHeaders;
    
    
    
    
}

/*
    Model: EmailConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class EmailConfig {
    
    
    
    
    
    @JsonProperty("recepient")
    private String recepient;
    
    
    
    
    
    @JsonProperty("host")
    private String host;
    
    
    
    
    
    @JsonProperty("username")
    private String username;
    
    
    
    
    
    @JsonProperty("password")
    private String password;
    
    
    
    
    
    @JsonProperty("unzip")
    private Boolean unzip;
    
    
    
    
    
    @JsonProperty("read_from_content")
    private Boolean readFromContent;
    
    
    
    
    
    @JsonProperty("filter_based_on_recepients")
    private Boolean filterBasedOnRecepients;
    
    
    
    
    
    @JsonProperty("pcol")
    private String pcol;
    
    
    
    
    
    @JsonProperty("subject_line_regex")
    private String subjectLineRegex;
    
    
    
    
    
    @JsonProperty("sender_address")
    private String senderAddress;
    
    
    
    
    
    @JsonProperty("local_dir")
    private String localDir;
    
    
    
    
    
    @JsonProperty("folder_name_hierarchies")
    private List<String> folderNameHierarchies;
    
    
    
    
    
    @JsonProperty("attachment_regex")
    private String attachmentRegex;
    
    
    
    
    
    @JsonProperty("body_content_regex")
    private String bodyContentRegex;
    
    
    
    
    
    @JsonProperty("password_protected")
    private Boolean passwordProtected;
    
    
    
    
    
    @JsonProperty("zip_format")
    private String zipFormat;
    
    
    
    
    
    @JsonProperty("attachment_mandate")
    private Boolean attachmentMandate;
    
    
    
    
    
    @JsonProperty("filter_files_after_extraction")
    private Boolean filterFilesAfterExtraction;
    
    
    
    
    
    @JsonProperty("archive_config")
    private ArchiveConfig archiveConfig;
    
    
    
    
    
    @JsonProperty("read_all_unread_mails")
    private Boolean readAllUnreadMails;
    
    
    
    
    
    @JsonProperty("content_type")
    private String contentType;
    
    
    
    
    
    @JsonProperty("downloadable_link")
    private Boolean downloadableLink;
    
    
    
    
    
    @JsonProperty("properties")
    private HashMap<String,String> properties;
    
    
    
    
}

/*
    Model: FTPConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class FTPConfig {
    
    
    
    
    
    @JsonProperty("host")
    private String host;
    
    
    
    
    
    @JsonProperty("port")
    private Integer port;
    
    
    
    
    
    @JsonProperty("username")
    private String username;
    
    
    
    
    
    @JsonProperty("password")
    private String password;
    
    
    
    
    
    @JsonProperty("unzip")
    private Boolean unzip;
    
    
    
    
    
    @JsonProperty("retries")
    private Integer retries;
    
    
    
    
    
    @JsonProperty("interval")
    private Integer interval;
    
    
    
    
    
    @JsonProperty("local_dir")
    private String localDir;
    
    
    
    
    
    @JsonProperty("remote_dir")
    private String remoteDir;
    
    
    
    
    
    @JsonProperty("zip_file_regex")
    private String zipFileRegex;
    
    
    
    
    
    @JsonProperty("archive_config")
    private ArchiveConfig archiveConfig;
    
    
    
    
    
    @JsonProperty("file_regex")
    private String fileRegex;
    
    
    
    
    
    @JsonProperty("zip_format")
    private String zipFormat;
    
    
    
    
    
    @JsonProperty("read_all_files")
    private Boolean readAllFiles;
    
    
    
    
}

/*
    Model: FileConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class FileConfig {
    
    
    
    
    
    @JsonProperty("delimiter")
    private String delimiter;
    
    
    
    
    
    @JsonProperty("charset")
    private String charset;
    
    
    
    
    
    @JsonProperty("properties")
    private HashMap<String,Object> properties;
    
    
    
    
    
    @JsonProperty("file_has_header")
    private Boolean fileHasHeader;
    
    
    
    
    
    @JsonProperty("header_index")
    private Integer headerIndex;
    
    
    
    
    
    @JsonProperty("header_array")
    private List<String> headerArray;
    
    
    
    
    
    @JsonProperty("data_start_index")
    private Integer dataStartIndex;
    
    
    
    
    
    @JsonProperty("prop_bean_configs")
    private List<PropBeanConfig> propBeanConfigs;
    
    
    
    
    
    @JsonProperty("junk_data_threshold_count")
    private Integer junkDataThresholdCount;
    
    
    
    
    
    @JsonProperty("file_type")
    private String fileType;
    
    
    
    
    
    @JsonProperty("line_validity_check")
    private Boolean lineValidityCheck;
    
    
    
    
    
    @JsonProperty("sheet_names")
    private List<String> sheetNames;
    
    
    
    
    
    @JsonProperty("read_all_sheets")
    private Boolean readAllSheets;
    
    
    
    
    
    @JsonProperty("quote_char")
    private String quoteChar;
    
    
    
    
    
    @JsonProperty("escape_char")
    private String escapeChar;
    
    
    
    
    
    @JsonProperty("default_headers")
    private DefaultHeadersDTO defaultHeaders;
    
    
    
    
}

/*
    Model: GoogleSpreadSheetConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class GoogleSpreadSheetConfig {
    
    
    
    
    
    @JsonProperty("range")
    private String range;
    
    
    
    
    
    @JsonProperty("sheet_id")
    private String sheetId;
    
    
    
    
    
    @JsonProperty("client_secret_location")
    private String clientSecretLocation;
    
    
    
    
    
    @JsonProperty("cred_storage_directory")
    private String credStorageDirectory;
    
    
    
    
    
    @JsonProperty("local_dir")
    private String localDir;
    
    
    
    
    
    @JsonProperty("archive_config")
    private ArchiveConfig archiveConfig;
    
    
    
    
}

/*
    Model: HttpConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class HttpConfig {
    
    
    
    
    
    @JsonProperty("hosturl")
    private String hosturl;
    
    
    
    
    
    @JsonProperty("username")
    private String username;
    
    
    
    
    
    @JsonProperty("password")
    private String password;
    
    
    
    
    
    @JsonProperty("request_params")
    private HashMap<String,String> requestParams;
    
    
    
    
    
    @JsonProperty("http_method")
    private String httpMethod;
    
    
    
    
    
    @JsonProperty("request_payload")
    private String requestPayload;
    
    
    
    
    
    @JsonProperty("local_path")
    private String localPath;
    
    
    
    
    
    @JsonProperty("archive_config")
    private ArchiveConfig archiveConfig;
    
    
    
    
}

/*
    Model: JobConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class JobConfig {
    
    
    
    
    
    @JsonProperty("_id")
    private Integer id;
    
    
    
    
    
    @JsonProperty("job_code")
    private String jobCode;
    
    
    
    
    
    @JsonProperty("task_type")
    private String taskType;
    
    
    
    
    
    @JsonProperty("sync_delay")
    private Integer syncDelay;
    
    
    
    
    
    @JsonProperty("cron_expression")
    private String cronExpression;
    
    
    
    
    
    @JsonProperty("store_filter")
    private StoreFilter storeFilter;
    
    
    
    
    
    @JsonProperty("process_config")
    private ProcessConfig processConfig;
    
    
    
    
    
    @JsonProperty("store_config")
    private List<StoreConfig> storeConfig;
    
    
    
    
    
    @JsonProperty("properties")
    private HashMap<String,String> properties;
    
    
    
    
    
    @JsonProperty("immediate_first_run")
    private Boolean immediateFirstRun;
    
    
    
    
    
    @JsonProperty("disable")
    private Boolean disable;
    
    
    
    
    
    @JsonProperty("dependent_job_codes")
    private List<String> dependentJobCodes;
    
    
    
    
    
    @JsonProperty("company_config")
    private List<CompanyConfig> companyConfig;
    
    
    
    
    
    @JsonProperty("company_ids")
    private List<Integer> companyIds;
    
    
    
    
    
    @JsonProperty("tax_identifiers")
    private List<String> taxIdentifiers;
    
    
    
    
    
    @JsonProperty("priority")
    private String priority;
    
    
    
    
    
    @JsonProperty("period_threshold")
    private Integer periodThreshold;
    
    
    
    
    
    @JsonProperty("period_threshold_type")
    private String periodThresholdType;
    
    
    
    
    
    @JsonProperty("db_connection_profile")
    private DBConnectionProfile dbConnectionProfile;
    
    
    
    
    
    @JsonProperty("params")
    private HashMap<String,Object> params;
    
    
    
    
    
    @JsonProperty("open_tags")
    private HashMap<String,Object> openTags;
    
    
    
    
    
    @JsonProperty("delete_quantity_threshold")
    private Integer deleteQuantityThreshold;
    
    
    
    
    
    @JsonProperty("catalog_master_config")
    private CatalogMasterConfig catalogMasterConfig;
    
    
    
    
    
    @JsonProperty("aggregator_types")
    private List<String> aggregatorTypes;
    
    
    
    
    
    @JsonProperty("integration_type")
    private String integrationType;
    
    
    
    
    
    @JsonProperty("min_price")
    private Double minPrice;
    
    
    
    
    
    @JsonProperty("audit")
    private Audit audit;
    
    
    
    
    
    @JsonProperty("version")
    private Integer version;
    
    
    
    
    
    @JsonProperty("alias")
    private String alias;
    
    
    
    
}

/*
    Model: JobConfigRawDTO
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class JobConfigRawDTO {
    
    
    
    
    
    @JsonProperty("integration")
    private String integration;
    
    
    
    
    
    @JsonProperty("company_name")
    private String companyName;
    
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    
    @JsonProperty("data")
    private JobConfig data;
    
    
    
    
}

/*
    Model: JsonDocConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class JsonDocConfig {
    
    
    
    
    
    @JsonProperty("prop_bean_configs")
    private List<PropBeanConfig> propBeanConfigs;
    
    
    
    
}

/*
    Model: LocalFileConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class LocalFileConfig {
    
    
    
    
    
    @JsonProperty("retries")
    private Integer retries;
    
    
    
    
    
    @JsonProperty("interval")
    private Integer interval;
    
    
    
    
    
    @JsonProperty("local_dir")
    private String localDir;
    
    
    
    
    
    @JsonProperty("working_dir")
    private String workingDir;
    
    
    
    
    
    @JsonProperty("unzip")
    private Boolean unzip;
    
    
    
    
    
    @JsonProperty("zip_file_regex")
    private String zipFileRegex;
    
    
    
    
    
    @JsonProperty("file_regex")
    private String fileRegex;
    
    
    
    
    
    @JsonProperty("zip_format")
    private String zipFormat;
    
    
    
    
    
    @JsonProperty("archive_config")
    private ArchiveConfig archiveConfig;
    
    
    
    
    
    @JsonProperty("read_all_files")
    private Boolean readAllFiles;
    
    
    
    
}

/*
    Model: MongoDocConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class MongoDocConfig {
    
    
    
    
    
    @JsonProperty("collection_name")
    private String collectionName;
    
    
    
    
    
    @JsonProperty("find_query")
    private HashMap<String,Object> findQuery;
    
    
    
    
    
    @JsonProperty("projection_query")
    private HashMap<String,Object> projectionQuery;
    
    
    
    
    
    @JsonProperty("prop_bean_configs")
    private List<PropBeanConfig> propBeanConfigs;
    
    
    
    
    
    @JsonProperty("aggregate_pipeline")
    private List<HashMap<String,Object>> aggregatePipeline;
    
    
    
    
    
    @JsonProperty("skip_save")
    private Boolean skipSave;
    
    
    
    
}

/*
    Model: OAuthConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class OAuthConfig {
    
    
    
    
    
    @JsonProperty("limit")
    private Integer limit;
    
    
    
    
    
    @JsonProperty("pages")
    private Integer pages;
    
    
    
    
    
    @JsonProperty("interval")
    private Integer interval;
    
    
    
    
    
    @JsonProperty("consumer_key")
    private String consumerKey;
    
    
    
    
    
    @JsonProperty("consumer_secret")
    private String consumerSecret;
    
    
    
    
    
    @JsonProperty("token")
    private String token;
    
    
    
    
    
    @JsonProperty("token_secret")
    private String tokenSecret;
    
    
    
    
    
    @JsonProperty("rest_url")
    private String restUrl;
    
    
    
    
    
    @JsonProperty("rest_base_url")
    private String restBaseUrl;
    
    
    
    
    
    @JsonProperty("function_name")
    private String functionName;
    
    
    
    
}

/*
    Model: ProcessConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ProcessConfig {
    
    
    
    
    
    @JsonProperty("db_config")
    private DBConfig dbConfig;
    
    
    
    
    
    @JsonProperty("db_param_config")
    private DBParamConfig dbParamConfig;
    
    
    
    
    
    @JsonProperty("sftp_config")
    private SFTPConfig sftpConfig;
    
    
    
    
    
    @JsonProperty("aws_s3_config")
    private AWSS3config awsS3Config;
    
    
    
    
    
    @JsonProperty("mongo_doc_config")
    private MongoDocConfig mongoDocConfig;
    
    
    
    
    
    @JsonProperty("ftp_config")
    private FTPConfig ftpConfig;
    
    
    
    
    
    @JsonProperty("email_config")
    private EmailConfig emailConfig;
    
    
    
    
    
    @JsonProperty("file_config")
    private FileConfig fileConfig;
    
    
    
    
    
    @JsonProperty("json_doc_config")
    private JsonDocConfig jsonDocConfig;
    
    
    
    
    
    @JsonProperty("doc_mapping_config")
    private DocMappingConfig docMappingConfig;
    
    
    
    
    
    @JsonProperty("task_step_config")
    private TaskStepConfig taskStepConfig;
    
    
    
    
    
    @JsonProperty("http_config")
    private HttpConfig httpConfig;
    
    
    
    
    
    @JsonProperty("local_file_config")
    private LocalFileConfig localFileConfig;
    
    
    
    
    
    @JsonProperty("oauth_config")
    private OAuthConfig oauthConfig;
    
    
    
    
    
    @JsonProperty("google_spreadsheet_config")
    private GoogleSpreadSheetConfig googleSpreadsheetConfig;
    
    
    
    
}

/*
    Model: PropBeanConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class PropBeanConfig {
    
    
    
    
    
    @JsonProperty("required")
    private Boolean required;
    
    
    
    
    
    @JsonProperty("mapping")
    private HashMap<String,PropBeanConfig> mapping;
    
    
    
    
    
    @JsonProperty("optional")
    private Boolean optional;
    
    
    
    
    
    @JsonProperty("send")
    private Send send;
    
    
    
    
    
    @JsonProperty("validations")
    private List<HashMap<String,Object>> validations;
    
    
    
    
    
    @JsonProperty("values")
    private List<String> values;
    
    
    
    
    
    @JsonProperty("include")
    private Boolean include;
    
    
    
    
    
    @JsonProperty("source_field")
    private String sourceField;
    
    
    
    
    
    @JsonProperty("source_fields")
    private List<String> sourceFields;
    
    
    
    
    
    @JsonProperty("destination_field")
    private String destinationField;
    
    
    
    
    
    @JsonProperty("data_type")
    private String dataType;
    
    
    
    
    
    @JsonProperty("default_value")
    private Object defaultValue;
    
    
    
    
    
    @JsonProperty("const_value")
    private Object constValue;
    
    
    
    
    
    @JsonProperty("concat_str")
    private String concatStr;
    
    
    
    
    
    @JsonProperty("function_name")
    private String functionName;
    
    
    
    
    
    @JsonProperty("transformer_name")
    private String transformerName;
    
    
    
    
    
    @JsonProperty("all_param_function_name")
    private String allParamFunctionName;
    
    
    
    
    
    @JsonProperty("sub_separator")
    private String subSeparator;
    
    
    
    
    
    @JsonProperty("index_field")
    private String indexField;
    
    
    
    
    
    @JsonProperty("ignore_if_not_exists")
    private Boolean ignoreIfNotExists;
    
    
    
    
    
    @JsonProperty("identifier_type")
    private String identifierType;
    
    
    
    
    
    @JsonProperty("projection_query")
    private HashMap<String,Object> projectionQuery;
    
    
    
    
    
    @JsonProperty("enrich_from_master")
    private Boolean enrichFromMaster;
    
    
    
    
}

/*
    Model: PropBeanDTO
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class PropBeanDTO {
    
    
    
    
    
    @JsonProperty("required")
    private Boolean required;
    
    
    
    
    
    @JsonProperty("optional")
    private Boolean optional;
    
    
    
    
    
    @JsonProperty("include")
    private Boolean include;
    
    
    
    
    
    @JsonProperty("source_field")
    private String sourceField;
    
    
    
    
    
    @JsonProperty("source_fields")
    private List<String> sourceFields;
    
    
    
    
    
    @JsonProperty("destination_field")
    private String destinationField;
    
    
    
    
    
    @JsonProperty("data_type")
    private String dataType;
    
    
    
    
    
    @JsonProperty("default_value")
    private Object defaultValue;
    
    
    
    
    
    @JsonProperty("const_value")
    private Object constValue;
    
    
    
    
    
    @JsonProperty("concat_str")
    private String concatStr;
    
    
    
    
    
    @JsonProperty("function_name")
    private String functionName;
    
    
    
    
    
    @JsonProperty("transformer_name")
    private String transformerName;
    
    
    
    
    
    @JsonProperty("all_param_function_name")
    private String allParamFunctionName;
    
    
    
    
    
    @JsonProperty("sub_separator")
    private String subSeparator;
    
    
    
    
    
    @JsonProperty("index_field")
    private String indexField;
    
    
    
    
    
    @JsonProperty("ignore_if_not_exists")
    private Boolean ignoreIfNotExists;
    
    
    
    
    
    @JsonProperty("identifier_type")
    private String identifierType;
    
    
    
    
    
    @JsonProperty("projection_query")
    private HashMap<String,Object> projectionQuery;
    
    
    
    
    
    @JsonProperty("enrich_from_master")
    private Boolean enrichFromMaster;
    
    
    
    
}

/*
    Model: ResponseEnvelopeListJobConfigRawDTO
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ResponseEnvelopeListJobConfigRawDTO {
    
    
    
    
    
    @JsonProperty("timestamp")
    private String timestamp;
    
    
    
    
    
    @JsonProperty("status")
    private Integer status;
    
    
    
    
    
    @JsonProperty("error")
    private String error;
    
    
    
    
    
    @JsonProperty("exception")
    private String exception;
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    
    @JsonProperty("total_time_taken_in_millis")
    private Integer totalTimeTakenInMillis;
    
    
    
    
    
    @JsonProperty("http_status")
    private String httpStatus;
    
    
    
    
    
    @JsonProperty("items")
    private List<JobConfigRawDTO> items;
    
    
    
    
    
    @JsonProperty("payload")
    private List<JobConfigRawDTO> payload;
    
    
    
    
    
    @JsonProperty("trace_id")
    private String traceId;
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: SFTPConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class SFTPConfig {
    
    
    
    
    
    @JsonProperty("host")
    private String host;
    
    
    
    
    
    @JsonProperty("port")
    private Integer port;
    
    
    
    
    
    @JsonProperty("username")
    private String username;
    
    
    
    
    
    @JsonProperty("password")
    private String password;
    
    
    
    
    
    @JsonProperty("unzip")
    private Boolean unzip;
    
    
    
    
    
    @JsonProperty("retries")
    private Integer retries;
    
    
    
    
    
    @JsonProperty("interval")
    private Integer interval;
    
    
    
    
    
    @JsonProperty("private_key_path")
    private String privateKeyPath;
    
    
    
    
    
    @JsonProperty("strict_host_key_checking")
    private Boolean strictHostKeyChecking;
    
    
    
    
    
    @JsonProperty("local_dir")
    private String localDir;
    
    
    
    
    
    @JsonProperty("remote_dir")
    private String remoteDir;
    
    
    
    
    
    @JsonProperty("password_protected")
    private Boolean passwordProtected;
    
    
    
    
    
    @JsonProperty("zip_file_regex")
    private String zipFileRegex;
    
    
    
    
    
    @JsonProperty("file_regex")
    private String fileRegex;
    
    
    
    
    
    @JsonProperty("zip_format")
    private String zipFormat;
    
    
    
    
    
    @JsonProperty("archive_config")
    private ArchiveConfig archiveConfig;
    
    
    
    
    
    @JsonProperty("read_all_files")
    private Boolean readAllFiles;
    
    
    
    
}

/*
    Model: Send
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Send {
    
    
    
    
    
    @JsonProperty("raw")
    private Boolean raw;
    
    
    
    
    
    @JsonProperty("processed")
    private Boolean processed;
    
    
    
    
}

/*
    Model: StoreConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class StoreConfig {
    
    
    
    
    
    @JsonProperty("job_code")
    private String jobCode;
    
    
    
    
    
    @JsonProperty("storeid")
    private String storeid;
    
    
    
    
    
    @JsonProperty("store_alias")
    private String storeAlias;
    
    
    
    
    
    @JsonProperty("store_file_regex")
    private String storeFileRegex;
    
    
    
    
    
    @JsonProperty("store_file_name")
    private String storeFileName;
    
    
    
    
    
    @JsonProperty("process_config")
    private ProcessConfig processConfig;
    
    
    
    
    
    @JsonProperty("properties")
    private HashMap<String,String> properties;
    
    
    
    
}

/*
    Model: StoreFilter
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class StoreFilter {
    
    
    
    
    
    @JsonProperty("include_tags")
    private List<String> includeTags;
    
    
    
    
    
    @JsonProperty("exclude_tags")
    private List<String> excludeTags;
    
    
    
    
    
    @JsonProperty("query")
    private HashMap<String,Object> query;
    
    
    
    
}

/*
    Model: TaskConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class TaskConfig {
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("task_config_id")
    private Integer taskConfigId;
    
    
    
    
    
    @JsonProperty("task_params")
    private List<TaskParam> taskParams;
    
    
    
    
}

/*
    Model: TaskParam
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class TaskParam {
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("value")
    private Object value;
    
    
    
    
}

/*
    Model: TaskStepConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class TaskStepConfig {
    
    
    
    
    
    @JsonProperty("task_configs")
    private List<TaskConfig> taskConfigs;
    
    
    
    
    
    @JsonProperty("task_config_ids")
    private List<Integer> taskConfigIds;
    
    
    
    
    
    @JsonProperty("task_config_group_ids")
    private List<Integer> taskConfigGroupIds;
    
    
    
    
}

/*
    Model: JobStepsDTO
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class JobStepsDTO {
    
    
    
    
    
    @JsonProperty("step_name")
    private String stepName;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("step_execution_time")
    private Integer stepExecutionTime;
    
    
    
    
    
    @JsonProperty("start_count")
    private Integer startCount;
    
    
    
    
    
    @JsonProperty("end_count")
    private Integer endCount;
    
    
    
    
    
    @JsonProperty("deleted_count")
    private Integer deletedCount;
    
    
    
    
    
    @JsonProperty("processed_start_time")
    private String processedStartTime;
    
    
    
    
    
    @JsonProperty("processed_at")
    private String processedAt;
    
    
    
    
}

/*
    Model: ResponseEnvelopeListJobStepsDTO
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ResponseEnvelopeListJobStepsDTO {
    
    
    
    
    
    @JsonProperty("timestamp")
    private String timestamp;
    
    
    
    
    
    @JsonProperty("status")
    private Integer status;
    
    
    
    
    
    @JsonProperty("error")
    private String error;
    
    
    
    
    
    @JsonProperty("exception")
    private String exception;
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    
    @JsonProperty("total_time_taken_in_millis")
    private Integer totalTimeTakenInMillis;
    
    
    
    
    
    @JsonProperty("http_status")
    private String httpStatus;
    
    
    
    
    
    @JsonProperty("items")
    private List<JobStepsDTO> items;
    
    
    
    
    
    @JsonProperty("payload")
    private List<JobStepsDTO> payload;
    
    
    
    
    
    @JsonProperty("trace_id")
    private String traceId;
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: ResponseEnvelopeListJobConfigDTO
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ResponseEnvelopeListJobConfigDTO {
    
    
    
    
    
    @JsonProperty("timestamp")
    private String timestamp;
    
    
    
    
    
    @JsonProperty("status")
    private Integer status;
    
    
    
    
    
    @JsonProperty("error")
    private String error;
    
    
    
    
    
    @JsonProperty("exception")
    private String exception;
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    
    @JsonProperty("total_time_taken_in_millis")
    private Integer totalTimeTakenInMillis;
    
    
    
    
    
    @JsonProperty("http_status")
    private String httpStatus;
    
    
    
    
    
    @JsonProperty("items")
    private List<JobConfigDTO> items;
    
    
    
    
    
    @JsonProperty("payload")
    private List<JobConfigDTO> payload;
    
    
    
    
    
    @JsonProperty("trace_id")
    private String traceId;
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: ResponseEnvelopeJobConfigDTO
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ResponseEnvelopeJobConfigDTO {
    
    
    
    
    
    @JsonProperty("timestamp")
    private String timestamp;
    
    
    
    
    
    @JsonProperty("status")
    private Integer status;
    
    
    
    
    
    @JsonProperty("error")
    private String error;
    
    
    
    
    
    @JsonProperty("exception")
    private String exception;
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    
    @JsonProperty("total_time_taken_in_millis")
    private Integer totalTimeTakenInMillis;
    
    
    
    
    
    @JsonProperty("http_status")
    private String httpStatus;
    
    
    
    
    
    @JsonProperty("items")
    private JobConfigDTO items;
    
    
    
    
    
    @JsonProperty("payload")
    private JobConfigDTO payload;
    
    
    
    
    
    @JsonProperty("trace_id")
    private String traceId;
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: JobHistoryDto
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class JobHistoryDto {
    
    
    
    
    
    @JsonProperty("total_added_count")
    private Integer totalAddedCount;
    
    
    
    
    
    @JsonProperty("total_updated_count")
    private Integer totalUpdatedCount;
    
    
    
    
    
    @JsonProperty("total_suppressed_count")
    private Integer totalSuppressedCount;
    
    
    
    
    
    @JsonProperty("total_initial_count")
    private Integer totalInitialCount;
    
    
    
    
    
    @JsonProperty("job_id")
    private Integer jobId;
    
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    
    @JsonProperty("job_code")
    private String jobCode;
    
    
    
    
    
    @JsonProperty("processed_on")
    private String processedOn;
    
    
    
    
    
    @JsonProperty("filename")
    private List<String> filename;
    
    
    
    
    
    @JsonProperty("error_type")
    private String errorType;
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
}

/*
    Model: JobMetricsDto
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class JobMetricsDto {
    
    
    
    
    
    @JsonProperty("job_code")
    private String jobCode;
    
    
    
    
    
    @JsonProperty("is_run_more_than_usual")
    private String isRunMoreThanUsual;
    
    
    
    
    
    @JsonProperty("job_history")
    private List<JobHistoryDto> jobHistory;
    
    
    
    
    
    @JsonProperty("total_success_count")
    private Integer totalSuccessCount;
    
    
    
    
    
    @JsonProperty("total_failure_count")
    private Integer totalFailureCount;
    
    
    
    
    
    @JsonProperty("total_warning_count")
    private Integer totalWarningCount;
    
    
    
    
    
    @JsonProperty("total_suppressed_count")
    private Integer totalSuppressedCount;
    
    
    
    
    
    @JsonProperty("total_job_runs")
    private Integer totalJobRuns;
    
    
    
    
}

/*
    Model: ResponseEnvelopeJobMetricsDto
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ResponseEnvelopeJobMetricsDto {
    
    
    
    
    
    @JsonProperty("timestamp")
    private String timestamp;
    
    
    
    
    
    @JsonProperty("status")
    private Integer status;
    
    
    
    
    
    @JsonProperty("error")
    private String error;
    
    
    
    
    
    @JsonProperty("exception")
    private String exception;
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    
    @JsonProperty("total_time_taken_in_millis")
    private Integer totalTimeTakenInMillis;
    
    
    
    
    
    @JsonProperty("http_status")
    private String httpStatus;
    
    
    
    
    
    @JsonProperty("items")
    private JobMetricsDto items;
    
    
    
    
    
    @JsonProperty("payload")
    private JobMetricsDto payload;
    
    
    
    
    
    @JsonProperty("trace_id")
    private String traceId;
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: JobConfigListDTO
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class JobConfigListDTO {
    
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    
    @JsonProperty("alias")
    private String alias;
    
    
    
    
    
    @JsonProperty("modified_by")
    private String modifiedBy;
    
    
    
    
    
    @JsonProperty("created_by")
    private String createdBy;
    
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
}

/*
    Model: ResponseEnvelopeListJobConfigListDTO
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ResponseEnvelopeListJobConfigListDTO {
    
    
    
    
    
    @JsonProperty("timestamp")
    private String timestamp;
    
    
    
    
    
    @JsonProperty("status")
    private Integer status;
    
    
    
    
    
    @JsonProperty("error")
    private String error;
    
    
    
    
    
    @JsonProperty("exception")
    private String exception;
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    
    @JsonProperty("total_time_taken_in_millis")
    private Integer totalTimeTakenInMillis;
    
    
    
    
    
    @JsonProperty("http_status")
    private String httpStatus;
    
    
    
    
    
    @JsonProperty("items")
    private List<JobConfigListDTO> items;
    
    
    
    
    
    @JsonProperty("payload")
    private List<JobConfigListDTO> payload;
    
    
    
    
    
    @JsonProperty("trace_id")
    private String traceId;
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}



/*
    Model: ApplicationInventory
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ApplicationInventory {
    
    
    
    
    
    @JsonProperty("inventory")
    private AppInventoryConfig inventory;
    
    
    
    
    
    @JsonProperty("authentication")
    private AuthenticationConfig authentication;
    
    
    
    
    
    @JsonProperty("article_assignment")
    private ArticleAssignmentConfig articleAssignment;
    
    
    
    
    
    @JsonProperty("reward_points")
    private RewardPointsConfig rewardPoints;
    
    
    
    
    
    @JsonProperty("cart")
    private AppCartConfig cart;
    
    
    
    
    
    @JsonProperty("payment")
    private AppPaymentConfig payment;
    
    
    
    
    
    @JsonProperty("order")
    private AppOrderConfig order;
    
    
    
    
    
    @JsonProperty("logistics")
    private AppLogisticsConfig logistics;
    
    
    
    
    
    @JsonProperty("business")
    private String business;
    
    
    
    
    
    @JsonProperty("comms_enabled")
    private Boolean commsEnabled;
    
    
    
    
    
    @JsonProperty("platforms")
    private List<String> platforms;
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("loyalty_points")
    private LoyaltyPointsConfig loyaltyPoints;
    
    
    
    
    
    @JsonProperty("app")
    private String app;
    
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    
    @JsonProperty("modified_by")
    private String modifiedBy;
    
    
    
    
}

/*
    Model: AppInventoryConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class AppInventoryConfig {
    
    
    
    
    
    @JsonProperty("brand")
    private InventoryBrand brand;
    
    
    
    
    
    @JsonProperty("store")
    private InventoryStore store;
    
    
    
    
    
    @JsonProperty("category")
    private InventoryCategory category;
    
    
    
    
    
    @JsonProperty("price")
    private InventoryPrice price;
    
    
    
    
    
    @JsonProperty("discount")
    private InventoryDiscount discount;
    
    
    
    
    
    @JsonProperty("out_of_stock")
    private Boolean outOfStock;
    
    
    
    
    
    @JsonProperty("franchise_enabled")
    private Boolean franchiseEnabled;
    
    
    
    
    
    @JsonProperty("exclude_category")
    private List<Object> excludeCategory;
    
    
    
    
    
    @JsonProperty("image")
    private List<String> image;
    
    
    
    
    
    @JsonProperty("company_store")
    private List<Object> companyStore;
    
    
    
    
}

/*
    Model: InventoryBrand
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class InventoryBrand {
    
    
    
    
    
    @JsonProperty("criteria")
    private String criteria;
    
    
    
    
    
    @JsonProperty("brands")
    private List<Object> brands;
    
    
    
    
}

/*
    Model: InventoryStore
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class InventoryStore {
    
    
    
    
    
    @JsonProperty("criteria")
    private String criteria;
    
    
    
    
    
    @JsonProperty("stores")
    private List<Object> stores;
    
    
    
    
    
    @JsonProperty("rules")
    private AppStoreRules rules;
    
    
    
    
}

/*
    Model: AppStoreRules
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class AppStoreRules {
    
    
    
    
    
    @JsonProperty("companies")
    private List<Integer> companies;
    
    
    
    
    
    @JsonProperty("brands")
    private List<Object> brands;
    
    
    
    
}

/*
    Model: InventoryCategory
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class InventoryCategory {
    
    
    
    
    
    @JsonProperty("criteria")
    private String criteria;
    
    
    
    
    
    @JsonProperty("categories")
    private List<Object> categories;
    
    
    
    
}

/*
    Model: InventoryPrice
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class InventoryPrice {
    
    
    
    
    
    @JsonProperty("min")
    private Double min;
    
    
    
    
    
    @JsonProperty("max")
    private Double max;
    
    
    
    
}

/*
    Model: InventoryDiscount
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class InventoryDiscount {
    
    
    
    
    
    @JsonProperty("min")
    private Double min;
    
    
    
    
    
    @JsonProperty("max")
    private Double max;
    
    
    
    
}

/*
    Model: AuthenticationConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class AuthenticationConfig {
    
    
    
    
    
    @JsonProperty("required")
    private Boolean required;
    
    
    
    
    
    @JsonProperty("provider")
    private String provider;
    
    
    
    
}

/*
    Model: ArticleAssignmentConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ArticleAssignmentConfig {
    
    
    
    
    
    @JsonProperty("rules")
    private ArticleAssignmentRules rules;
    
    
    
    
    
    @JsonProperty("post_order_reassignment")
    private Boolean postOrderReassignment;
    
    
    
    
}

/*
    Model: ArticleAssignmentRules
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ArticleAssignmentRules {
    
    
    
    
    
    @JsonProperty("store_priority")
    private StorePriority storePriority;
    
    
    
    
}

/*
    Model: StorePriority
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class StorePriority {
    
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
    
    @JsonProperty("storetype_order")
    private List<Object> storetypeOrder;
    
    
    
    
}

/*
    Model: AppCartConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class AppCartConfig {
    
    
    
    
    
    @JsonProperty("delivery_charges")
    private DeliveryCharges deliveryCharges;
    
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
    
    @JsonProperty("max_cart_items")
    private Integer maxCartItems;
    
    
    
    
    
    @JsonProperty("min_cart_value")
    private Double minCartValue;
    
    
    
    
    
    @JsonProperty("bulk_coupons")
    private Boolean bulkCoupons;
    
    
    
    
    
    @JsonProperty("revenue_engine_coupon")
    private Boolean revenueEngineCoupon;
    
    
    
    
}

/*
    Model: DeliveryCharges
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class DeliveryCharges {
    
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
    
    @JsonProperty("charges")
    private Charges charges;
    
    
    
    
}

/*
    Model: Charges
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Charges {
    
    
    
    
    
    @JsonProperty("threshold")
    private Double threshold;
    
    
    
    
    
    @JsonProperty("charges")
    private Double charges;
    
    
    
    
}

/*
    Model: AppPaymentConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class AppPaymentConfig {
    
    
    
    
    
    @JsonProperty("callback_url")
    private CallbackUrl callbackUrl;
    
    
    
    
    
    @JsonProperty("methods")
    private Methods methods;
    
    
    
    
    
    @JsonProperty("payment_selection_lock")
    private PaymentSelectionLock paymentSelectionLock;
    
    
    
    
    
    @JsonProperty("mode_of_payment")
    private String modeOfPayment;
    
    
    
    
    
    @JsonProperty("source")
    private String source;
    
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
    
    @JsonProperty("cod_amount_limit")
    private Double codAmountLimit;
    
    
    
    
    
    @JsonProperty("cod_charges")
    private Double codCharges;
    
    
    
    
}

/*
    Model: CallbackUrl
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CallbackUrl {
    
    
    
    
    
    @JsonProperty("app")
    private String app;
    
    
    
    
    
    @JsonProperty("web")
    private String web;
    
    
    
    
}

/*
    Model: Methods
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Methods {
    
    
    
    
    
    @JsonProperty("pl")
    private PaymentModeConfig pl;
    
    
    
    
    
    @JsonProperty("card")
    private PaymentModeConfig card;
    
    
    
    
    
    @JsonProperty("nb")
    private PaymentModeConfig nb;
    
    
    
    
    
    @JsonProperty("wl")
    private PaymentModeConfig wl;
    
    
    
    
    
    @JsonProperty("ps")
    private PaymentModeConfig ps;
    
    
    
    
    
    @JsonProperty("upi")
    private PaymentModeConfig upi;
    
    
    
    
    
    @JsonProperty("qr")
    private PaymentModeConfig qr;
    
    
    
    
    
    @JsonProperty("cod")
    private PaymentModeConfig cod;
    
    
    
    
    
    @JsonProperty("pp")
    private PaymentModeConfig pp;
    
    
    
    
    
    @JsonProperty("jp")
    private PaymentModeConfig jp;
    
    
    
    
    
    @JsonProperty("pac")
    private PaymentModeConfig pac;
    
    
    
    
    
    @JsonProperty("fc")
    private PaymentModeConfig fc;
    
    
    
    
    
    @JsonProperty("jiopp")
    private PaymentModeConfig jiopp;
    
    
    
    
    
    @JsonProperty("stripepg")
    private PaymentModeConfig stripepg;
    
    
    
    
    
    @JsonProperty("juspaypg")
    private PaymentModeConfig juspaypg;
    
    
    
    
    
    @JsonProperty("payubizpg")
    private PaymentModeConfig payubizpg;
    
    
    
    
    
    @JsonProperty("payumoneypg")
    private PaymentModeConfig payumoneypg;
    
    
    
    
    
    @JsonProperty("rupifipg")
    private PaymentModeConfig rupifipg;
    
    
    
    
    
    @JsonProperty("simpl")
    private PaymentModeConfig simpl;
    
    
    
    
}

/*
    Model: PaymentModeConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class PaymentModeConfig {
    
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
}

/*
    Model: PaymentSelectionLock
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class PaymentSelectionLock {
    
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
    
    @JsonProperty("default_options")
    private String defaultOptions;
    
    
    
    
    
    @JsonProperty("payment_identifier")
    private String paymentIdentifier;
    
    
    
    
}

/*
    Model: AppOrderConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class AppOrderConfig {
    
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
    
    @JsonProperty("force_reassignment")
    private Boolean forceReassignment;
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
}

/*
    Model: AppLogisticsConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class AppLogisticsConfig {
    
    
    
    
    
    @JsonProperty("logistics_by_seller")
    private Boolean logisticsBySeller;
    
    
    
    
    
    @JsonProperty("serviceability_check")
    private Boolean serviceabilityCheck;
    
    
    
    
    
    @JsonProperty("same_day_delivery")
    private Boolean sameDayDelivery;
    
    
    
    
    
    @JsonProperty("dp_assignment")
    private Boolean dpAssignment;
    
    
    
    
}

/*
    Model: LoyaltyPointsConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class LoyaltyPointsConfig {
    
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
    
    @JsonProperty("auto_apply")
    private Boolean autoApply;
    
    
    
    
}

/*
    Model: AppInventoryPartialUpdate
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class AppInventoryPartialUpdate {
    
    
    
    
    
    @JsonProperty("reward_points")
    private RewardPointsConfig rewardPoints;
    
    
    
    
    
    @JsonProperty("cart")
    private AppCartConfig cart;
    
    
    
    
    
    @JsonProperty("payment")
    private AppPaymentConfig payment;
    
    
    
    
    
    @JsonProperty("loyalty_points")
    private LoyaltyPointsConfig loyaltyPoints;
    
    
    
    
    
    @JsonProperty("comms_enabled")
    private Boolean commsEnabled;
    
    
    
    
}

/*
    Model: BrandCompanyInfo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class BrandCompanyInfo {
    
    
    
    
    
    @JsonProperty("company_name")
    private String companyName;
    
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
}

/*
    Model: CompanyByBrandsRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CompanyByBrandsRequest {
    
    
    
    
    
    @JsonProperty("brands")
    private Integer brands;
    
    
    
    
    
    @JsonProperty("search_text")
    private String searchText;
    
    
    
    
}

/*
    Model: CompanyByBrandsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CompanyByBrandsResponse {
    
    
    
    
    
    @JsonProperty("items")
    private List<BrandCompanyInfo> items;
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: StoreByBrandsRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class StoreByBrandsRequest {
    
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    
    @JsonProperty("brands")
    private Integer brands;
    
    
    
    
    
    @JsonProperty("search_text")
    private String searchText;
    
    
    
    
}

/*
    Model: StoreByBrandsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class StoreByBrandsResponse {
    
    
    
    
    
    @JsonProperty("items")
    private List<BrandStoreInfo> items;
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: BrandStoreInfo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class BrandStoreInfo {
    
    
    
    
    
    @JsonProperty("store_name")
    private String storeName;
    
    
    
    
    
    @JsonProperty("store_id")
    private Integer storeId;
    
    
    
    
    
    @JsonProperty("store_type")
    private String storeType;
    
    
    
    
    
    @JsonProperty("store_code")
    private String storeCode;
    
    
    
    
    
    @JsonProperty("store_address")
    private OptedStoreAddress storeAddress;
    
    
    
    
    
    @JsonProperty("company")
    private OptedCompany company;
    
    
    
    
}

/*
    Model: CompanyBrandInfo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CompanyBrandInfo {
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("value")
    private Integer value;
    
    
    
    
    
    @JsonProperty("brand_logo_url")
    private String brandLogoUrl;
    
    
    
    
    
    @JsonProperty("brand_banner_url")
    private String brandBannerUrl;
    
    
    
    
    
    @JsonProperty("brand_banner_portrait_url")
    private String brandBannerPortraitUrl;
    
    
    
    
}

/*
    Model: BrandsByCompanyResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class BrandsByCompanyResponse {
    
    
    
    
    
    @JsonProperty("brands")
    private CompanyBrandInfo brands;
    
    
    
    
}

/*
    Model: CreateApplicationRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CreateApplicationRequest {
    
    
    
    
    
    @JsonProperty("app")
    private App app;
    
    
    
    
    
    @JsonProperty("configuration")
    private AppInventory configuration;
    
    
    
    
    
    @JsonProperty("domain")
    private AppDomain domain;
    
    
    
    
}

/*
    Model: CreateAppResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CreateAppResponse {
    
    
    
    
    
    @JsonProperty("app")
    private Application app;
    
    
    
    
    
    @JsonProperty("configuration")
    private ApplicationInventory configuration;
    
    
    
    
}

/*
    Model: ApplicationsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ApplicationsResponse {
    
    
    
    
    
    @JsonProperty("items")
    private List<Application> items;
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: MobileAppConfiguration
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class MobileAppConfiguration {
    
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("app_name")
    private String appName;
    
    
    
    
    
    @JsonProperty("landing_image")
    private LandingImage landingImage;
    
    
    
    
    
    @JsonProperty("splash_image")
    private SplashImage splashImage;
    
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    
    @JsonProperty("platform_type")
    private String platformType;
    
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    
    @JsonProperty("__v")
    private Integer v;
    
    
    
    
    
    @JsonProperty("package_name")
    private String packageName;
    
    
    
    
}

/*
    Model: LandingImage
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class LandingImage {
    
    
    
    
    
    @JsonProperty("aspect_ratio")
    private String aspectRatio;
    
    
    
    
    
    @JsonProperty("secure_url")
    private String secureUrl;
    
    
    
    
}

/*
    Model: SplashImage
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class SplashImage {
    
    
    
    
    
    @JsonProperty("aspect_ratio")
    private String aspectRatio;
    
    
    
    
    
    @JsonProperty("secure_url")
    private String secureUrl;
    
    
    
    
}

/*
    Model: MobileAppConfigRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class MobileAppConfigRequest {
    
    
    
    
    
    @JsonProperty("app_name")
    private String appName;
    
    
    
    
    
    @JsonProperty("landing_image")
    private LandingImage landingImage;
    
    
    
    
    
    @JsonProperty("splash_image")
    private SplashImage splashImage;
    
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
}

/*
    Model: BuildVersionHistory
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class BuildVersionHistory {
    
    
    
    
    
    @JsonProperty("versions")
    private BuildVersion versions;
    
    
    
    
    
    @JsonProperty("latest_available_version_name")
    private String latestAvailableVersionName;
    
    
    
    
}

/*
    Model: BuildVersion
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class BuildVersion {
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    
    @JsonProperty("platform_type")
    private String platformType;
    
    
    
    
    
    @JsonProperty("build_status")
    private String buildStatus;
    
    
    
    
    
    @JsonProperty("version_name")
    private String versionName;
    
    
    
    
    
    @JsonProperty("version_code")
    private Integer versionCode;
    
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    
    @JsonProperty("__v")
    private Integer v;
    
    
    
    
}

/*
    Model: AppSupportedCurrency
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class AppSupportedCurrency {
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("supported_currency")
    private List<String> supportedCurrency;
    
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    
    @JsonProperty("default_currency")
    private DefaultCurrency defaultCurrency;
    
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
}

/*
    Model: DefaultCurrency
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class DefaultCurrency {
    
    
    
    
    
    @JsonProperty("ref")
    private String ref;
    
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
}

/*
    Model: CurrencyConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CurrencyConfig {
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    
    @JsonProperty("decimal_digits")
    private Integer decimalDigits;
    
    
    
    
    
    @JsonProperty("symbol")
    private String symbol;
    
    
    
    
}

/*
    Model: DomainAdd
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class DomainAdd {
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
}

/*
    Model: DomainAddRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class DomainAddRequest {
    
    
    
    
    
    @JsonProperty("domain")
    private DomainAdd domain;
    
    
    
    
}

/*
    Model: DomainsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class DomainsResponse {
    
    
    
    
    
    @JsonProperty("domains")
    private List<Domain> domains;
    
    
    
    
}

/*
    Model: UpdateDomain
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class UpdateDomain {
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
}

/*
    Model: UpdateDomainTypeRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class UpdateDomainTypeRequest {
    
    
    
    
    
    @JsonProperty("domain")
    private UpdateDomain domain;
    
    
    
    
    
    @JsonProperty("action")
    private String action;
    
    
    
    
}

/*
    Model: DomainStatusRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class DomainStatusRequest {
    
    
    
    
    
    @JsonProperty("domain_url")
    private String domainUrl;
    
    
    
    
}

/*
    Model: DomainStatus
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class DomainStatus {
    
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    
    @JsonProperty("status")
    private Boolean status;
    
    
    
    
}

/*
    Model: DomainStatusResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class DomainStatusResponse {
    
    
    
    
    
    @JsonProperty("connected")
    private Boolean connected;
    
    
    
    
    
    @JsonProperty("status")
    private List<DomainStatus> status;
    
    
    
    
}

/*
    Model: DomainSuggestionsRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class DomainSuggestionsRequest {
    
    
    
    
    
    @JsonProperty("domain_url")
    private String domainUrl;
    
    
    
    
    
    @JsonProperty("custom")
    private Boolean custom;
    
    
    
    
}

/*
    Model: DomainSuggestion
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class DomainSuggestion {
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("unsupported")
    private Boolean unsupported;
    
    
    
    
    
    @JsonProperty("is_available")
    private Boolean isAvailable;
    
    
    
    
    
    @JsonProperty("price")
    private Double price;
    
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
}

/*
    Model: DomainSuggestionsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class DomainSuggestionsResponse {
    
    
    
    
    
    @JsonProperty("domains")
    private List<DomainSuggestion> domains;
    
    
    
    
}

/*
    Model: GetIntegrationsOptInsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class GetIntegrationsOptInsResponse {
    
    
    
    
    
    @JsonProperty("items")
    private List<IntegrationOptIn> items;
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: IntegrationOptIn
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class IntegrationOptIn {
    
    
    
    
    
    @JsonProperty("validators")
    private Validators validators;
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    
    @JsonProperty("description_html")
    private String descriptionHtml;
    
    
    
    
    
    @JsonProperty("constants")
    private String constants;
    
    
    
    
    
    @JsonProperty("companies")
    private List<Object> companies;
    
    
    
    
    
    @JsonProperty("support")
    private List<String> support;
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("meta")
    private List<IntegrationMeta> meta;
    
    
    
    
    
    @JsonProperty("icon")
    private String icon;
    
    
    
    
    
    @JsonProperty("owner")
    private String owner;
    
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    
    @JsonProperty("token")
    private String token;
    
    
    
    
    
    @JsonProperty("secret")
    private String secret;
    
    
    
    
    
    @JsonProperty("__v")
    private Integer v;
    
    
    
    
}

/*
    Model: Validators
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Validators {
    
    
    
    
    
    @JsonProperty("company")
    private CompanyValidator company;
    
    
    
    
    
    @JsonProperty("store")
    private StoreValidator store;
    
    
    
    
    
    @JsonProperty("inventory")
    private InventoryValidator inventory;
    
    
    
    
    
    @JsonProperty("order")
    private OrderValidator order;
    
    
    
    
}

/*
    Model: CompanyValidator
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CompanyValidator {
    
    
    
    
    
    @JsonProperty("json_schema")
    private List<JsonSchema> jsonSchema;
    
    
    
    
    
    @JsonProperty("browser_script")
    private String browserScript;
    
    
    
    
}

/*
    Model: JsonSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class JsonSchema {
    
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("tooltip")
    private String tooltip;
    
    
    
    
}

/*
    Model: StoreValidator
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class StoreValidator {
    
    
    
    
    
    @JsonProperty("json_schema")
    private List<JsonSchema> jsonSchema;
    
    
    
    
    
    @JsonProperty("browser_script")
    private String browserScript;
    
    
    
    
}

/*
    Model: InventoryValidator
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class InventoryValidator {
    
    
    
    
    
    @JsonProperty("json_schema")
    private List<JsonSchema> jsonSchema;
    
    
    
    
    
    @JsonProperty("browser_script")
    private String browserScript;
    
    
    
    
}

/*
    Model: OrderValidator
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class OrderValidator {
    
    
    
    
    
    @JsonProperty("json_schema")
    private List<JsonSchema> jsonSchema;
    
    
    
    
    
    @JsonProperty("browser_script")
    private String browserScript;
    
    
    
    
}

/*
    Model: IntegrationMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class IntegrationMeta {
    
    
    
    
    
    @JsonProperty("is_public")
    private Boolean isPublic;
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
}

/*
    Model: Integration
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Integration {
    
    
    
    
    
    @JsonProperty("validators")
    private Validators validators;
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    
    @JsonProperty("description_html")
    private String descriptionHtml;
    
    
    
    
    
    @JsonProperty("constants")
    private Object constants;
    
    
    
    
    
    @JsonProperty("companies")
    private List<Object> companies;
    
    
    
    
    
    @JsonProperty("support")
    private List<String> support;
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("meta")
    private List<IntegrationMeta> meta;
    
    
    
    
    
    @JsonProperty("icon")
    private String icon;
    
    
    
    
    
    @JsonProperty("owner")
    private String owner;
    
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    
    @JsonProperty("token")
    private String token;
    
    
    
    
    
    @JsonProperty("secret")
    private String secret;
    
    
    
    
    
    @JsonProperty("__v")
    private Integer v;
    
    
    
    
}

/*
    Model: IntegrationConfigResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class IntegrationConfigResponse {
    
    
    
    
    
    @JsonProperty("items")
    private List<IntegrationLevel> items;
    
    
    
    
}

/*
    Model: IntegrationLevel
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class IntegrationLevel {
    
    
    
    
    
    @JsonProperty("opted")
    private Boolean opted;
    
    
    
    
    
    @JsonProperty("permissions")
    private List<Object> permissions;
    
    
    
    
    
    @JsonProperty("last_patch")
    private List<LastPatch> lastPatch;
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("integration")
    private String integration;
    
    
    
    
    
    @JsonProperty("level")
    private String level;
    
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    
    @JsonProperty("meta")
    private List<IntegrationMeta> meta;
    
    
    
    
    
    @JsonProperty("token")
    private String token;
    
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    
    @JsonProperty("__v")
    private Integer v;
    
    
    
    
    
    @JsonProperty("data")
    private Object data;
    
    
    
    
}

/*
    Model: UpdateIntegrationLevelRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class UpdateIntegrationLevelRequest {
    
    
    
    
    
    @JsonProperty("items")
    private List<IntegrationLevel> items;
    
    
    
    
}

/*
    Model: OptedStoreIntegration
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class OptedStoreIntegration {
    
    
    
    
    
    @JsonProperty("other_opted")
    private Boolean otherOpted;
    
    
    
    
    
    @JsonProperty("other_integration")
    private IntegrationOptIn otherIntegration;
    
    
    
    
    
    @JsonProperty("other_entity")
    private OtherEntity otherEntity;
    
    
    
    
}

/*
    Model: OtherEntity
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class OtherEntity {
    
    
    
    
    
    @JsonProperty("opted")
    private Boolean opted;
    
    
    
    
    
    @JsonProperty("permissions")
    private List<String> permissions;
    
    
    
    
    
    @JsonProperty("last_patch")
    private List<LastPatch> lastPatch;
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("integration")
    private String integration;
    
    
    
    
    
    @JsonProperty("level")
    private String level;
    
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    
    @JsonProperty("data")
    private OtherEntityData data;
    
    
    
    
    
    @JsonProperty("meta")
    private List<Object> meta;
    
    
    
    
    
    @JsonProperty("token")
    private String token;
    
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    
    @JsonProperty("__v")
    private Integer v;
    
    
    
    
}

/*
    Model: LastPatch
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class LastPatch {
    
    
    
    
    
    @JsonProperty("op")
    private String op;
    
    
    
    
    
    @JsonProperty("path")
    private String path;
    
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
}

/*
    Model: OtherEntityData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class OtherEntityData {
    
    
    
    
    
    @JsonProperty("article_identifier")
    private String articleIdentifier;
    
    
    
    
}

/*
    Model: App
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class App {
    
    
    
    
    
    @JsonProperty("company_id")
    private String companyId;
    
    
    
    
    
    @JsonProperty("channel_type")
    private String channelType;
    
    
    
    
    
    @JsonProperty("auth")
    private ApplicationAuth auth;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("desc")
    private String desc;
    
    
    
    
}

/*
    Model: AppInventory
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class AppInventory {
    
    
    
    
    
    @JsonProperty("brand")
    private InventoryBrandRule brand;
    
    
    
    
    
    @JsonProperty("store")
    private InventoryStoreRule store;
    
    
    
    
    
    @JsonProperty("image")
    private List<String> image;
    
    
    
    
    
    @JsonProperty("franchise_enabled")
    private Boolean franchiseEnabled;
    
    
    
    
    
    @JsonProperty("out_of_stock")
    private Boolean outOfStock;
    
    
    
    
    
    @JsonProperty("payment")
    private InventoryPaymentConfig payment;
    
    
    
    
    
    @JsonProperty("article_assignment")
    private InventoryArticleAssignment articleAssignment;
    
    
    
    
}

/*
    Model: AppDomain
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class AppDomain {
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
}

/*
    Model: CompaniesResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CompaniesResponse {
    
    
    
    
    
    @JsonProperty("items")
    private AppInventoryCompanies items;
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: AppInventoryCompanies
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class AppInventoryCompanies {
    
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("company_type")
    private String companyType;
    
    
    
    
}

/*
    Model: StoresResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class StoresResponse {
    
    
    
    
    
    @JsonProperty("items")
    private AppInventoryStores items;
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: AppInventoryStores
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class AppInventoryStores {
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    
    @JsonProperty("store_type")
    private String storeType;
    
    
    
    
    
    @JsonProperty("store_code")
    private String storeCode;
    
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
}

/*
    Model: FilterOrderingStoreRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class FilterOrderingStoreRequest {
    
    
    
    
    
    @JsonProperty("all_stores")
    private Boolean allStores;
    
    
    
    
    
    @JsonProperty("deployed_stores")
    private List<Integer> deployedStores;
    
    
    
    
    
    @JsonProperty("q")
    private String q;
    
    
    
    
    
    @JsonProperty("only_deployed")
    private Boolean onlyDeployed;
    
    
    
    
}

/*
    Model: DeploymentMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class DeploymentMeta {
    
    
    
    
    
    @JsonProperty("deployed_stores")
    private List<Integer> deployedStores;
    
    
    
    
    
    @JsonProperty("all_stores")
    private Boolean allStores;
    
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("app")
    private String app;
    
    
    
    
}

/*
    Model: OrderingStoreConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class OrderingStoreConfig {
    
    
    
    
    
    @JsonProperty("deployment_meta")
    private DeploymentMeta deploymentMeta;
    
    
    
    
}

/*
    Model: OtherSellerCompany
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class OtherSellerCompany {
    
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
}

/*
    Model: OtherSellerApplication
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class OtherSellerApplication {
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("domain")
    private String domain;
    
    
    
    
    
    @JsonProperty("company")
    private OtherSellerCompany company;
    
    
    
    
    
    @JsonProperty("opt_type")
    private String optType;
    
    
    
    
}

/*
    Model: OtherSellerApplications
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class OtherSellerApplications {
    
    
    
    
    
    @JsonProperty("items")
    private List<OtherSellerApplication> items;
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: OptedApplicationResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class OptedApplicationResponse {
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("domain")
    private String domain;
    
    
    
    
    
    @JsonProperty("company")
    private OptedCompany company;
    
    
    
    
    
    @JsonProperty("opted_inventory")
    private OptedInventory optedInventory;
    
    
    
    
    
    @JsonProperty("opt_out_inventory")
    private OptOutInventory optOutInventory;
    
    
    
    
}

/*
    Model: OptedCompany
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class OptedCompany {
    
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
}

/*
    Model: OptedInventory
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class OptedInventory {
    
    
    
    
    
    @JsonProperty("opt_type")
    private OptType optType;
    
    
    
    
    
    @JsonProperty("items")
    private Object items;
    
    
    
    
}

/*
    Model: OptType
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class OptType {
    
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
}

/*
    Model: OptedStore
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class OptedStore {
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("store_code")
    private String storeCode;
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    
    @JsonProperty("address")
    private OptedStoreAddress address;
    
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    
    @JsonProperty("store_type")
    private String storeType;
    
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
}

/*
    Model: OptOutInventory
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class OptOutInventory {
    
    
    
    
    
    @JsonProperty("store")
    private List<Integer> store;
    
    
    
    
    
    @JsonProperty("company")
    private List<Integer> company;
    
    
    
    
}

/*
    Model: TokenResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class TokenResponse {
    
    
    
    
    
    @JsonProperty("tokens")
    private Tokens tokens;
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    
    @JsonProperty("__v")
    private Integer v;
    
    
    
    
}

/*
    Model: Tokens
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Tokens {
    
    
    
    
    
    @JsonProperty("firebase")
    private Firebase firebase;
    
    
    
    
    
    @JsonProperty("moengage")
    private Moengage moengage;
    
    
    
    
    
    @JsonProperty("segment")
    private Segment segment;
    
    
    
    
    
    @JsonProperty("gtm")
    private Gtm gtm;
    
    
    
    
    
    @JsonProperty("freshchat")
    private Freshchat freshchat;
    
    
    
    
    
    @JsonProperty("safetynet")
    private Safetynet safetynet;
    
    
    
    
    
    @JsonProperty("fynd_rewards")
    private FyndRewards fyndRewards;
    
    
    
    
    
    @JsonProperty("google_map")
    private GoogleMap googleMap;
    
    
    
    
}

/*
    Model: Firebase
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Firebase {
    
    
    
    
    
    @JsonProperty("credentials")
    private Credentials credentials;
    
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
}

/*
    Model: Credentials
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Credentials {
    
    
    
    
    
    @JsonProperty("ios")
    private Ios ios;
    
    
    
    
    
    @JsonProperty("android")
    private Android android;
    
    
    
    
    
    @JsonProperty("project_id")
    private String projectId;
    
    
    
    
    
    @JsonProperty("gcm_sender_id")
    private String gcmSenderId;
    
    
    
    
    
    @JsonProperty("application_id")
    private String applicationId;
    
    
    
    
    
    @JsonProperty("api_key")
    private String apiKey;
    
    
    
    
}

/*
    Model: Ios
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Ios {
    
    
    
    
    
    @JsonProperty("application_id")
    private String applicationId;
    
    
    
    
    
    @JsonProperty("api_key")
    private String apiKey;
    
    
    
    
}

/*
    Model: Android
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Android {
    
    
    
    
    
    @JsonProperty("application_id")
    private String applicationId;
    
    
    
    
    
    @JsonProperty("api_key")
    private String apiKey;
    
    
    
    
}

/*
    Model: Moengage
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Moengage {
    
    
    
    
    
    @JsonProperty("credentials")
    private MoengageCredentials credentials;
    
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
}

/*
    Model: MoengageCredentials
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class MoengageCredentials {
    
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
}

/*
    Model: Segment
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Segment {
    
    
    
    
    
    @JsonProperty("credentials")
    private SegmentCredentials credentials;
    
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
}

/*
    Model: SegmentCredentials
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class SegmentCredentials {
    
    
    
    
    
    @JsonProperty("write_key")
    private String writeKey;
    
    
    
    
}

/*
    Model: Gtm
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Gtm {
    
    
    
    
    
    @JsonProperty("credentials")
    private GtmCredentials credentials;
    
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
}

/*
    Model: GtmCredentials
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class GtmCredentials {
    
    
    
    
    
    @JsonProperty("api_key")
    private String apiKey;
    
    
    
    
}

/*
    Model: Freshchat
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Freshchat {
    
    
    
    
    
    @JsonProperty("credentials")
    private FreshchatCredentials credentials;
    
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
}

/*
    Model: FreshchatCredentials
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class FreshchatCredentials {
    
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
    
    @JsonProperty("app_key")
    private String appKey;
    
    
    
    
    
    @JsonProperty("web_token")
    private String webToken;
    
    
    
    
}

/*
    Model: Safetynet
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Safetynet {
    
    
    
    
    
    @JsonProperty("credentials")
    private SafetynetCredentials credentials;
    
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
}

/*
    Model: SafetynetCredentials
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class SafetynetCredentials {
    
    
    
    
    
    @JsonProperty("api_key")
    private String apiKey;
    
    
    
    
}

/*
    Model: FyndRewards
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class FyndRewards {
    
    
    
    
    
    @JsonProperty("credentials")
    private FyndRewardsCredentials credentials;
    
    
    
    
}

/*
    Model: FyndRewardsCredentials
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class FyndRewardsCredentials {
    
    
    
    
    
    @JsonProperty("public_key")
    private String publicKey;
    
    
    
    
}

/*
    Model: GoogleMap
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class GoogleMap {
    
    
    
    
    
    @JsonProperty("credentials")
    private GoogleMapCredentials credentials;
    
    
    
    
}

/*
    Model: GoogleMapCredentials
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class GoogleMapCredentials {
    
    
    
    
    
    @JsonProperty("api_key")
    private String apiKey;
    
    
    
    
}

/*
    Model: RewardPointsConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class RewardPointsConfig {
    
    
    
    
    
    @JsonProperty("credit")
    private Credit credit;
    
    
    
    
    
    @JsonProperty("debit")
    private Debit debit;
    
    
    
    
}

/*
    Model: Credit
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Credit {
    
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
}

/*
    Model: Debit
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Debit {
    
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
    
    @JsonProperty("auto_apply")
    private Boolean autoApply;
    
    
    
    
    
    @JsonProperty("strategy_channel")
    private String strategyChannel;
    
    
    
    
}

/*
    Model: ProductDetailFeature
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ProductDetailFeature {
    
    
    
    
    
    @JsonProperty("similar")
    private List<String> similar;
    
    
    
    
    
    @JsonProperty("seller_selection")
    private Boolean sellerSelection;
    
    
    
    
    
    @JsonProperty("update_product_meta")
    private Boolean updateProductMeta;
    
    
    
    
    
    @JsonProperty("request_product")
    private Boolean requestProduct;
    
    
    
    
}

/*
    Model: LaunchPage
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class LaunchPage {
    
    
    
    
    
    @JsonProperty("page_type")
    private String pageType;
    
    
    
    
    
    @JsonProperty("params")
    private Object params;
    
    
    
    
    
    @JsonProperty("query")
    private Object query;
    
    
    
    
}

/*
    Model: LandingPageFeature
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class LandingPageFeature {
    
    
    
    
    
    @JsonProperty("launch_page")
    private LaunchPage launchPage;
    
    
    
    
    
    @JsonProperty("continue_as_guest")
    private Boolean continueAsGuest;
    
    
    
    
    
    @JsonProperty("login_btn_text")
    private String loginBtnText;
    
    
    
    
    
    @JsonProperty("show_domain_textbox")
    private Boolean showDomainTextbox;
    
    
    
    
    
    @JsonProperty("show_register_btn")
    private Boolean showRegisterBtn;
    
    
    
    
}

/*
    Model: RegistrationPageFeature
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class RegistrationPageFeature {
    
    
    
    
    
    @JsonProperty("ask_store_address")
    private Boolean askStoreAddress;
    
    
    
    
}

/*
    Model: AppFeature
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class AppFeature {
    
    
    
    
    
    @JsonProperty("product_detail")
    private ProductDetailFeature productDetail;
    
    
    
    
    
    @JsonProperty("landing_page")
    private LandingPageFeature landingPage;
    
    
    
    
    
    @JsonProperty("registration_page")
    private RegistrationPageFeature registrationPage;
    
    
    
    
    
    @JsonProperty("home_page")
    private HomePageFeature homePage;
    
    
    
    
    
    @JsonProperty("common")
    private CommonFeature common;
    
    
    
    
    
    @JsonProperty("cart")
    private CartFeature cart;
    
    
    
    
    
    @JsonProperty("qr")
    private QrFeature qr;
    
    
    
    
    
    @JsonProperty("pcr")
    private PcrFeature pcr;
    
    
    
    
    
    @JsonProperty("order")
    private OrderFeature order;
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("app")
    private String app;
    
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    
    @JsonProperty("__v")
    private Integer v;
    
    
    
    
}

/*
    Model: HomePageFeature
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class HomePageFeature {
    
    
    
    
    
    @JsonProperty("order_processing")
    private Boolean orderProcessing;
    
    
    
    
}

/*
    Model: CommonFeature
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CommonFeature {
    
    
    
    
    
    @JsonProperty("communication_optin_dialog")
    private CommunicationOptinDialogFeature communicationOptinDialog;
    
    
    
    
    
    @JsonProperty("deployment_store_selection")
    private DeploymentStoreSelectionFeature deploymentStoreSelection;
    
    
    
    
    
    @JsonProperty("listing_price")
    private ListingPriceFeature listingPrice;
    
    
    
    
    
    @JsonProperty("currency")
    private CurrencyFeature currency;
    
    
    
    
    
    @JsonProperty("revenue_engine")
    private RevenueEngineFeature revenueEngine;
    
    
    
    
    
    @JsonProperty("feedback")
    private FeedbackFeature feedback;
    
    
    
    
    
    @JsonProperty("compare_products")
    private CompareProductsFeature compareProducts;
    
    
    
    
    
    @JsonProperty("reward_points")
    private RewardPointsConfig rewardPoints;
    
    
    
    
}

/*
    Model: CommunicationOptinDialogFeature
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CommunicationOptinDialogFeature {
    
    
    
    
    
    @JsonProperty("visibility")
    private Boolean visibility;
    
    
    
    
}

/*
    Model: DeploymentStoreSelectionFeature
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class DeploymentStoreSelectionFeature {
    
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
}

/*
    Model: ListingPriceFeature
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ListingPriceFeature {
    
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
}

/*
    Model: CurrencyFeature
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CurrencyFeature {
    
    
    
    
    
    @JsonProperty("value")
    private List<String> value;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("default_currency")
    private String defaultCurrency;
    
    
    
    
}

/*
    Model: RevenueEngineFeature
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class RevenueEngineFeature {
    
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
}

/*
    Model: FeedbackFeature
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class FeedbackFeature {
    
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
}

/*
    Model: CompareProductsFeature
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CompareProductsFeature {
    
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
}

/*
    Model: CartFeature
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CartFeature {
    
    
    
    
    
    @JsonProperty("gst_input")
    private Boolean gstInput;
    
    
    
    
    
    @JsonProperty("staff_selection")
    private Boolean staffSelection;
    
    
    
    
    
    @JsonProperty("placing_for_customer")
    private Boolean placingForCustomer;
    
    
    
    
    
    @JsonProperty("google_map")
    private Boolean googleMap;
    
    
    
    
    
    @JsonProperty("revenue_engine_coupon")
    private Boolean revenueEngineCoupon;
    
    
    
    
}

/*
    Model: QrFeature
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class QrFeature {
    
    
    
    
    
    @JsonProperty("application")
    private Boolean application;
    
    
    
    
    
    @JsonProperty("products")
    private Boolean products;
    
    
    
    
    
    @JsonProperty("collections")
    private Boolean collections;
    
    
    
    
}

/*
    Model: PcrFeature
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class PcrFeature {
    
    
    
    
    
    @JsonProperty("staff_selection")
    private Boolean staffSelection;
    
    
    
    
}

/*
    Model: OrderFeature
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class OrderFeature {
    
    
    
    
    
    @JsonProperty("buy_again")
    private Boolean buyAgain;
    
    
    
    
}

/*
    Model: AppFeatureRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class AppFeatureRequest {
    
    
    
    
    
    @JsonProperty("feature")
    private AppFeature feature;
    
    
    
    
}

/*
    Model: AppFeatureResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class AppFeatureResponse {
    
    
    
    
    
    @JsonProperty("feature")
    private AppFeature feature;
    
    
    
    
}

/*
    Model: Currency
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Currency {
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    
    @JsonProperty("decimal_digits")
    private Integer decimalDigits;
    
    
    
    
    
    @JsonProperty("symbol")
    private String symbol;
    
    
    
    
}

/*
    Model: Domain
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Domain {
    
    
    
    
    
    @JsonProperty("verified")
    private Boolean verified;
    
    
    
    
    
    @JsonProperty("is_primary")
    private Boolean isPrimary;
    
    
    
    
    
    @JsonProperty("is_shortlink")
    private Boolean isShortlink;
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
}

/*
    Model: ApplicationWebsite
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ApplicationWebsite {
    
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
    
    @JsonProperty("basepath")
    private String basepath;
    
    
    
    
}

/*
    Model: ApplicationCors
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ApplicationCors {
    
    
    
    
    
    @JsonProperty("domains")
    private List<String> domains;
    
    
    
    
}

/*
    Model: ApplicationAuth
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ApplicationAuth {
    
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
}

/*
    Model: ApplicationRedirections
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ApplicationRedirections {
    
    
    
    
    
    @JsonProperty("redirect_from")
    private String redirectFrom;
    
    
    
    
    
    @JsonProperty("redirect_to")
    private String redirectTo;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
}

/*
    Model: ApplicationMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ApplicationMeta {
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
}

/*
    Model: SecureUrl
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class SecureUrl {
    
    
    
    
    
    @JsonProperty("secure_url")
    private String secureUrl;
    
    
    
    
}

/*
    Model: Application
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Application {
    
    
    
    
    
    @JsonProperty("website")
    private ApplicationWebsite website;
    
    
    
    
    
    @JsonProperty("cors")
    private ApplicationCors cors;
    
    
    
    
    
    @JsonProperty("auth")
    private ApplicationAuth auth;
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    
    @JsonProperty("channel_type")
    private String channelType;
    
    
    
    
    
    @JsonProperty("cache_ttl")
    private Integer cacheTtl;
    
    
    
    
    
    @JsonProperty("is_internal")
    private Boolean isInternal;
    
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("owner")
    private String owner;
    
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    
    @JsonProperty("token")
    private String token;
    
    
    
    
    
    @JsonProperty("redirections")
    private List<ApplicationRedirections> redirections;
    
    
    
    
    
    @JsonProperty("meta")
    private List<ApplicationMeta> meta;
    
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    
    @JsonProperty("__v")
    private Integer v;
    
    
    
    
    
    @JsonProperty("banner")
    private SecureUrl banner;
    
    
    
    
    
    @JsonProperty("logo")
    private SecureUrl logo;
    
    
    
    
    
    @JsonProperty("favicon")
    private SecureUrl favicon;
    
    
    
    
    
    @JsonProperty("domains")
    private List<Domain> domains;
    
    
    
    
    
    @JsonProperty("app_type")
    private String appType;
    
    
    
    
    
    @JsonProperty("mobile_logo")
    private SecureUrl mobileLogo;
    
    
    
    
    
    @JsonProperty("domain")
    private Domain domain;
    
    
    
    
}

/*
    Model: NotFound
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class NotFound {
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
}

/*
    Model: UnhandledError
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class UnhandledError {
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
}

/*
    Model: InvalidPayloadRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class InvalidPayloadRequest {
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
}

/*
    Model: SuccessMessageResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class SuccessMessageResponse {
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
}

/*
    Model: InventoryBrandRule
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class InventoryBrandRule {
    
    
    
    
    
    @JsonProperty("criteria")
    private String criteria;
    
    
    
    
    
    @JsonProperty("brands")
    private List<Integer> brands;
    
    
    
    
}

/*
    Model: StoreCriteriaRule
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class StoreCriteriaRule {
    
    
    
    
    
    @JsonProperty("companies")
    private List<Integer> companies;
    
    
    
    
    
    @JsonProperty("brands")
    private List<Integer> brands;
    
    
    
    
}

/*
    Model: InventoryStoreRule
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class InventoryStoreRule {
    
    
    
    
    
    @JsonProperty("criteria")
    private String criteria;
    
    
    
    
    
    @JsonProperty("rules")
    private List<StoreCriteriaRule> rules;
    
    
    
    
    
    @JsonProperty("stores")
    private List<Integer> stores;
    
    
    
    
}

/*
    Model: InventoryPaymentConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class InventoryPaymentConfig {
    
    
    
    
    
    @JsonProperty("mode_of_payment")
    private String modeOfPayment;
    
    
    
    
    
    @JsonProperty("source")
    private String source;
    
    
    
    
}

/*
    Model: StorePriorityRule
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class StorePriorityRule {
    
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
    
    @JsonProperty("storetype_order")
    private List<String> storetypeOrder;
    
    
    
    
}

/*
    Model: ArticleAssignmentRule
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ArticleAssignmentRule {
    
    
    
    
    
    @JsonProperty("store_priority")
    private StorePriorityRule storePriority;
    
    
    
    
}

/*
    Model: InventoryArticleAssignment
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class InventoryArticleAssignment {
    
    
    
    
    
    @JsonProperty("post_order_reassignment")
    private Boolean postOrderReassignment;
    
    
    
    
    
    @JsonProperty("rules")
    private ArticleAssignmentRule rules;
    
    
    
    
}

/*
    Model: CompanyAboutAddress
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CompanyAboutAddress {
    
    
    
    
    
    @JsonProperty("pincode")
    private Integer pincode;
    
    
    
    
    
    @JsonProperty("address1")
    private String address1;
    
    
    
    
    
    @JsonProperty("address2")
    private String address2;
    
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    
    @JsonProperty("address_type")
    private String addressType;
    
    
    
    
}

/*
    Model: UserEmail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class UserEmail {
    
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    
    @JsonProperty("primary")
    private Boolean primary;
    
    
    
    
    
    @JsonProperty("verified")
    private Boolean verified;
    
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
}

/*
    Model: UserPhoneNumber
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class UserPhoneNumber {
    
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    
    @JsonProperty("primary")
    private Boolean primary;
    
    
    
    
    
    @JsonProperty("verified")
    private Boolean verified;
    
    
    
    
    
    @JsonProperty("country_code")
    private Integer countryCode;
    
    
    
    
    
    @JsonProperty("phone")
    private String phone;
    
    
    
    
}

/*
    Model: ApplicationInformation
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ApplicationInformation {
    
    
    
    
    
    @JsonProperty("address")
    private InformationAddress address;
    
    
    
    
    
    @JsonProperty("support")
    private InformationSupport support;
    
    
    
    
    
    @JsonProperty("social_links")
    private SocialLinks socialLinks;
    
    
    
    
    
    @JsonProperty("links")
    private Links links;
    
    
    
    
    
    @JsonProperty("copyright_text")
    private String copyrightText;
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("business_highlights")
    private BusinessHighlights businessHighlights;
    
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    
    @JsonProperty("__v")
    private Integer v;
    
    
    
    
}

/*
    Model: InformationAddress
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class InformationAddress {
    
    
    
    
    
    @JsonProperty("loc")
    private String loc;
    
    
    
    
    
    @JsonProperty("address_line")
    private List<String> addressLine;
    
    
    
    
    
    @JsonProperty("phone")
    private InformationPhone phone;
    
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    
    @JsonProperty("pincode")
    private Integer pincode;
    
    
    
    
}

/*
    Model: InformationPhone
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class InformationPhone {
    
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    
    @JsonProperty("number")
    private String number;
    
    
    
    
}

/*
    Model: InformationSupport
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class InformationSupport {
    
    
    
    
    
    @JsonProperty("phone")
    private List<String> phone;
    
    
    
    
    
    @JsonProperty("email")
    private List<String> email;
    
    
    
    
    
    @JsonProperty("timing")
    private String timing;
    
    
    
    
}

/*
    Model: SocialLinks
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class SocialLinks {
    
    
    
    
    
    @JsonProperty("facebook")
    private FacebookLink facebook;
    
    
    
    
    
    @JsonProperty("instagram")
    private InstagramLink instagram;
    
    
    
    
    
    @JsonProperty("twitter")
    private TwitterLink twitter;
    
    
    
    
    
    @JsonProperty("pinterest")
    private PinterestLink pinterest;
    
    
    
    
    
    @JsonProperty("google_plus")
    private GooglePlusLink googlePlus;
    
    
    
    
    
    @JsonProperty("youtube")
    private YoutubeLink youtube;
    
    
    
    
    
    @JsonProperty("linked_in")
    private LinkedInLink linkedIn;
    
    
    
    
    
    @JsonProperty("vimeo")
    private VimeoLink vimeo;
    
    
    
    
    
    @JsonProperty("blog_link")
    private BlogLink blogLink;
    
    
    
    
}

/*
    Model: FacebookLink
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class FacebookLink {
    
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    
    @JsonProperty("icon")
    private String icon;
    
    
    
    
    
    @JsonProperty("link")
    private String link;
    
    
    
    
}

/*
    Model: InstagramLink
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class InstagramLink {
    
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    
    @JsonProperty("icon")
    private String icon;
    
    
    
    
    
    @JsonProperty("link")
    private String link;
    
    
    
    
}

/*
    Model: TwitterLink
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class TwitterLink {
    
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    
    @JsonProperty("icon")
    private String icon;
    
    
    
    
    
    @JsonProperty("link")
    private String link;
    
    
    
    
}

/*
    Model: PinterestLink
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class PinterestLink {
    
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    
    @JsonProperty("icon")
    private String icon;
    
    
    
    
    
    @JsonProperty("link")
    private String link;
    
    
    
    
}

/*
    Model: GooglePlusLink
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class GooglePlusLink {
    
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    
    @JsonProperty("icon")
    private String icon;
    
    
    
    
    
    @JsonProperty("link")
    private String link;
    
    
    
    
}

/*
    Model: YoutubeLink
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class YoutubeLink {
    
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    
    @JsonProperty("icon")
    private String icon;
    
    
    
    
    
    @JsonProperty("link")
    private String link;
    
    
    
    
}

/*
    Model: LinkedInLink
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class LinkedInLink {
    
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    
    @JsonProperty("icon")
    private String icon;
    
    
    
    
    
    @JsonProperty("link")
    private String link;
    
    
    
    
}

/*
    Model: VimeoLink
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class VimeoLink {
    
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    
    @JsonProperty("icon")
    private String icon;
    
    
    
    
    
    @JsonProperty("link")
    private String link;
    
    
    
    
}

/*
    Model: BlogLink
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class BlogLink {
    
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    
    @JsonProperty("icon")
    private String icon;
    
    
    
    
    
    @JsonProperty("link")
    private String link;
    
    
    
    
}

/*
    Model: Links
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Links {
    
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    
    @JsonProperty("link")
    private String link;
    
    
    
    
}

/*
    Model: BusinessHighlights
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class BusinessHighlights {
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    
    @JsonProperty("icon")
    private String icon;
    
    
    
    
    
    @JsonProperty("sub_title")
    private String subTitle;
    
    
    
    
}

/*
    Model: ApplicationDetail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ApplicationDetail {
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    
    @JsonProperty("logo")
    private SecureUrl logo;
    
    
    
    
    
    @JsonProperty("mobile_logo")
    private SecureUrl mobileLogo;
    
    
    
    
    
    @JsonProperty("favicon")
    private SecureUrl favicon;
    
    
    
    
    
    @JsonProperty("banner")
    private SecureUrl banner;
    
    
    
    
    
    @JsonProperty("domain")
    private Domain domain;
    
    
    
    
    
    @JsonProperty("domains")
    private List<Domain> domains;
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
}

/*
    Model: CurrenciesResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CurrenciesResponse {
    
    
    
    
    
    @JsonProperty("items")
    private List<Currency> items;
    
    
    
    
}

/*
    Model: AppCurrencyResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class AppCurrencyResponse {
    
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    
    @JsonProperty("default_currency")
    private DefaultCurrency defaultCurrency;
    
    
    
    
    
    @JsonProperty("supported_currency")
    private List<Currency> supportedCurrency;
    
    
    
    
}

/*
    Model: StoreLatLong
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class StoreLatLong {
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("coordinates")
    private List<Double> coordinates;
    
    
    
    
}

/*
    Model: OptedStoreAddress
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class OptedStoreAddress {
    
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    
    @JsonProperty("address1")
    private String address1;
    
    
    
    
    
    @JsonProperty("lat_long")
    private StoreLatLong latLong;
    
    
    
    
    
    @JsonProperty("address2")
    private String address2;
    
    
    
    
    
    @JsonProperty("pincode")
    private Integer pincode;
    
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
}

/*
    Model: OrderingStore
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class OrderingStore {
    
    
    
    
    
    @JsonProperty("address")
    private OptedStoreAddress address;
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    
    @JsonProperty("store_type")
    private String storeType;
    
    
    
    
    
    @JsonProperty("store_code")
    private String storeCode;
    
    
    
    
    
    @JsonProperty("pincode")
    private Integer pincode;
    
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
}

/*
    Model: OrderingStores
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class OrderingStores {
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    
    @JsonProperty("items")
    private List<OrderingStore> items;
    
    
    
    
    
    @JsonProperty("deployed_stores")
    private List<Integer> deployedStores;
    
    
    
    
    
    @JsonProperty("all_stores")
    private Boolean allStores;
    
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("app")
    private String app;
    
    
    
    
    
    @JsonProperty("__v")
    private Integer v;
    
    
    
    
}

/*
    Model: OrderingStoresResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class OrderingStoresResponse {
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    
    @JsonProperty("items")
    private List<OrderingStore> items;
    
    
    
    
}



/*
    Model: Rule
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Rule {
    
    
    
    
    
    @JsonProperty("min")
    private Double min;
    
    
    
    
    
    @JsonProperty("value")
    private Double value;
    
    
    
    
    
    @JsonProperty("discount_qty")
    private Double discountQty;
    
    
    
    
    
    @JsonProperty("max")
    private Double max;
    
    
    
    
    
    @JsonProperty("key")
    private Double key;
    
    
    
    
}

/*
    Model: Identifier
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Identifier {
    
    
    
    
    
    @JsonProperty("collection_id")
    private List<String> collectionId;
    
    
    
    
    
    @JsonProperty("item_id")
    private List<Integer> itemId;
    
    
    
    
    
    @JsonProperty("user_id")
    private List<String> userId;
    
    
    
    
    
    @JsonProperty("brand_id")
    private List<Integer> brandId;
    
    
    
    
    
    @JsonProperty("company_id")
    private List<Integer> companyId;
    
    
    
    
    
    @JsonProperty("store_id")
    private List<Integer> storeId;
    
    
    
    
    
    @JsonProperty("article_id")
    private List<String> articleId;
    
    
    
    
    
    @JsonProperty("category_id")
    private List<Integer> categoryId;
    
    
    
    
}

/*
    Model: PaymentAllowValue
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class PaymentAllowValue {
    
    
    
    
    
    @JsonProperty("max")
    private Integer max;
    
    
    
    
}

/*
    Model: PaymentModes
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class PaymentModes {
    
    
    
    
    
    @JsonProperty("uses")
    private PaymentAllowValue uses;
    
    
    
    
    
    @JsonProperty("types")
    private List<String> types;
    
    
    
    
    
    @JsonProperty("codes")
    private List<String> codes;
    
    
    
    
    
    @JsonProperty("networks")
    private List<String> networks;
    
    
    
    
}

/*
    Model: PostOrder
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class PostOrder {
    
    
    
    
    
    @JsonProperty("return_allowed")
    private Boolean returnAllowed;
    
    
    
    
    
    @JsonProperty("cancellation_allowed")
    private Boolean cancellationAllowed;
    
    
    
    
}

/*
    Model: UsesRemaining
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class UsesRemaining {
    
    
    
    
    
    @JsonProperty("total")
    private Integer total;
    
    
    
    
    
    @JsonProperty("app")
    private Integer app;
    
    
    
    
    
    @JsonProperty("user")
    private Integer user;
    
    
    
    
}

/*
    Model: UsesRestriction
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class UsesRestriction {
    
    
    
    
    
    @JsonProperty("remaining")
    private UsesRemaining remaining;
    
    
    
    
    
    @JsonProperty("maximum")
    private UsesRemaining maximum;
    
    
    
    
}

/*
    Model: PriceRange
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class PriceRange {
    
    
    
    
    
    @JsonProperty("min")
    private Integer min;
    
    
    
    
    
    @JsonProperty("max")
    private Integer max;
    
    
    
    
}

/*
    Model: BulkBundleRestriction
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class BulkBundleRestriction {
    
    
    
    
    
    @JsonProperty("multi_store_allowed")
    private Boolean multiStoreAllowed;
    
    
    
    
}

/*
    Model: Restrictions
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Restrictions {
    
    
    
    
    
    @JsonProperty("coupon_allowed")
    private Boolean couponAllowed;
    
    
    
    
    
    @JsonProperty("payments")
    private HashMap<String,PaymentModes> payments;
    
    
    
    
    
    @JsonProperty("post_order")
    private PostOrder postOrder;
    
    
    
    
    
    @JsonProperty("ordering_stores")
    private List<Integer> orderingStores;
    
    
    
    
    
    @JsonProperty("uses")
    private UsesRestriction uses;
    
    
    
    
    
    @JsonProperty("platforms")
    private List<String> platforms;
    
    
    
    
    
    @JsonProperty("price_range")
    private PriceRange priceRange;
    
    
    
    
    
    @JsonProperty("bulk_bundle")
    private BulkBundleRestriction bulkBundle;
    
    
    
    
}

/*
    Model: CouponDateMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CouponDateMeta {
    
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
}

/*
    Model: State
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class State {
    
    
    
    
    
    @JsonProperty("is_public")
    private Boolean isPublic;
    
    
    
    
    
    @JsonProperty("is_archived")
    private Boolean isArchived;
    
    
    
    
    
    @JsonProperty("is_display")
    private Boolean isDisplay;
    
    
    
    
}

/*
    Model: Validation
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Validation {
    
    
    
    
    
    @JsonProperty("user_registered_after")
    private String userRegisteredAfter;
    
    
    
    
    
    @JsonProperty("anonymous")
    private Boolean anonymous;
    
    
    
    
    
    @JsonProperty("app_id")
    private List<String> appId;
    
    
    
    
}

/*
    Model: Validity
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Validity {
    
    
    
    
    
    @JsonProperty("priority")
    private Integer priority;
    
    
    
    
}

/*
    Model: CouponSchedule
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CouponSchedule {
    
    
    
    
    
    @JsonProperty("duration")
    private Integer duration;
    
    
    
    
    
    @JsonProperty("cron")
    private String cron;
    
    
    
    
    
    @JsonProperty("next_schedule")
    private List<Object> nextSchedule;
    
    
    
    
    
    @JsonProperty("start")
    private String start;
    
    
    
    
    
    @JsonProperty("end")
    private String end;
    
    
    
    
}

/*
    Model: Ownership
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Ownership {
    
    
    
    
    
    @JsonProperty("payable_category")
    private String payableCategory;
    
    
    
    
    
    @JsonProperty("payable_by")
    private String payableBy;
    
    
    
    
}

/*
    Model: CouponAction
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CouponAction {
    
    
    
    
    
    @JsonProperty("txn_mode")
    private String txnMode;
    
    
    
    
    
    @JsonProperty("action_date")
    private String actionDate;
    
    
    
    
}

/*
    Model: DisplayMetaDict
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class DisplayMetaDict {
    
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    
    @JsonProperty("subtitle")
    private String subtitle;
    
    
    
    
}

/*
    Model: DisplayMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class DisplayMeta {
    
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    
    @JsonProperty("remove")
    private DisplayMetaDict remove;
    
    
    
    
    
    @JsonProperty("auto")
    private DisplayMetaDict auto;
    
    
    
    
    
    @JsonProperty("apply")
    private DisplayMetaDict apply;
    
    
    
    
    
    @JsonProperty("subtitle")
    private String subtitle;
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
}

/*
    Model: CouponAuthor
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CouponAuthor {
    
    
    
    
    
    @JsonProperty("created_by")
    private String createdBy;
    
    
    
    
    
    @JsonProperty("modified_by")
    private String modifiedBy;
    
    
    
    
}

/*
    Model: RuleDefinition
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class RuleDefinition {
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("calculate_on")
    private String calculateOn;
    
    
    
    
    
    @JsonProperty("auto_apply")
    private Boolean autoApply;
    
    
    
    
    
    @JsonProperty("value_type")
    private String valueType;
    
    
    
    
    
    @JsonProperty("is_exact")
    private Boolean isExact;
    
    
    
    
    
    @JsonProperty("applicable_on")
    private String applicableOn;
    
    
    
    
    
    @JsonProperty("currency_code")
    private String currencyCode;
    
    
    
    
    
    @JsonProperty("scope")
    private List<String> scope;
    
    
    
    
}

/*
    Model: CouponAdd
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CouponAdd {
    
    
    
    
    
    @JsonProperty("rule")
    private List<Rule> rule;
    
    
    
    
    
    @JsonProperty("identifiers")
    private Identifier identifiers;
    
    
    
    
    
    @JsonProperty("restrictions")
    private Restrictions restrictions;
    
    
    
    
    
    @JsonProperty("type_slug")
    private String typeSlug;
    
    
    
    
    
    @JsonProperty("date_meta")
    private CouponDateMeta dateMeta;
    
    
    
    
    
    @JsonProperty("state")
    private State state;
    
    
    
    
    
    @JsonProperty("validation")
    private Validation validation;
    
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    
    @JsonProperty("validity")
    private Validity validity;
    
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    
    @JsonProperty("_schedule")
    private CouponSchedule schedule;
    
    
    
    
    
    @JsonProperty("ownership")
    private Ownership ownership;
    
    
    
    
    
    @JsonProperty("action")
    private CouponAction action;
    
    
    
    
    
    @JsonProperty("display_meta")
    private DisplayMeta displayMeta;
    
    
    
    
    
    @JsonProperty("author")
    private CouponAuthor author;
    
    
    
    
    
    @JsonProperty("rule_definition")
    private RuleDefinition ruleDefinition;
    
    
    
    
}

/*
    Model: CouponsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CouponsResponse {
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    
    @JsonProperty("items")
    private CouponAdd items;
    
    
    
    
}

/*
    Model: SuccessMessage
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class SuccessMessage {
    
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
}

/*
    Model: OperationErrorResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class OperationErrorResponse {
    
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
}

/*
    Model: CouponUpdate
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CouponUpdate {
    
    
    
    
    
    @JsonProperty("rule")
    private List<Rule> rule;
    
    
    
    
    
    @JsonProperty("identifiers")
    private Identifier identifiers;
    
    
    
    
    
    @JsonProperty("restrictions")
    private Restrictions restrictions;
    
    
    
    
    
    @JsonProperty("type_slug")
    private String typeSlug;
    
    
    
    
    
    @JsonProperty("date_meta")
    private CouponDateMeta dateMeta;
    
    
    
    
    
    @JsonProperty("state")
    private State state;
    
    
    
    
    
    @JsonProperty("validation")
    private Validation validation;
    
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    
    @JsonProperty("validity")
    private Validity validity;
    
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    
    @JsonProperty("_schedule")
    private CouponSchedule schedule;
    
    
    
    
    
    @JsonProperty("ownership")
    private Ownership ownership;
    
    
    
    
    
    @JsonProperty("action")
    private CouponAction action;
    
    
    
    
    
    @JsonProperty("display_meta")
    private DisplayMeta displayMeta;
    
    
    
    
    
    @JsonProperty("author")
    private CouponAuthor author;
    
    
    
    
    
    @JsonProperty("rule_definition")
    private RuleDefinition ruleDefinition;
    
    
    
    
}

/*
    Model: CouponPartialUpdate
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CouponPartialUpdate {
    
    
    
    
    
    @JsonProperty("schedule")
    private CouponSchedule schedule;
    
    
    
    
    
    @JsonProperty("archive")
    private Boolean archive;
    
    
    
    
}

/*
    Model: CartItem
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CartItem {
    
    
    
    
    
    @JsonProperty("size")
    private String size;
    
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    
    @JsonProperty("product_id")
    private String productId;
    
    
    
    
}

/*
    Model: OpenapiCartDetailsRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class OpenapiCartDetailsRequest {
    
    
    
    
    
    @JsonProperty("cart_items")
    private CartItem cartItems;
    
    
    
    
}

/*
    Model: RawBreakup
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class RawBreakup {
    
    
    
    
    
    @JsonProperty("delivery_charge")
    private Double deliveryCharge;
    
    
    
    
    
    @JsonProperty("fynd_cash")
    private Double fyndCash;
    
    
    
    
    
    @JsonProperty("total")
    private Double total;
    
    
    
    
    
    @JsonProperty("coupon")
    private Double coupon;
    
    
    
    
    
    @JsonProperty("vog")
    private Double vog;
    
    
    
    
    
    @JsonProperty("discount")
    private Double discount;
    
    
    
    
    
    @JsonProperty("you_saved")
    private Double youSaved;
    
    
    
    
    
    @JsonProperty("subtotal")
    private Double subtotal;
    
    
    
    
    
    @JsonProperty("mrp_total")
    private Double mrpTotal;
    
    
    
    
    
    @JsonProperty("convenience_fee")
    private Double convenienceFee;
    
    
    
    
    
    @JsonProperty("cod_charge")
    private Double codCharge;
    
    
    
    
    
    @JsonProperty("gst_charges")
    private Double gstCharges;
    
    
    
    
}

/*
    Model: CouponBreakup
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CouponBreakup {
    
    
    
    
    
    @JsonProperty("value")
    private Double value;
    
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    
    @JsonProperty("is_applied")
    private Boolean isApplied;
    
    
    
    
}

/*
    Model: DisplayBreakup
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class DisplayBreakup {
    
    
    
    
    
    @JsonProperty("currency_symbol")
    private String currencySymbol;
    
    
    
    
    
    @JsonProperty("value")
    private Double value;
    
    
    
    
    
    @JsonProperty("message")
    private List<String> message;
    
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    
    @JsonProperty("currency_code")
    private String currencyCode;
    
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
}

/*
    Model: LoyaltyPoints
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class LoyaltyPoints {
    
    
    
    
    
    @JsonProperty("total")
    private Double total;
    
    
    
    
    
    @JsonProperty("applicable")
    private Double applicable;
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    
    @JsonProperty("is_applied")
    private Boolean isApplied;
    
    
    
    
}

/*
    Model: CartBreakup
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CartBreakup {
    
    
    
    
    
    @JsonProperty("raw")
    private RawBreakup raw;
    
    
    
    
    
    @JsonProperty("coupon")
    private CouponBreakup coupon;
    
    
    
    
    
    @JsonProperty("display")
    private List<DisplayBreakup> display;
    
    
    
    
    
    @JsonProperty("loyalty_points")
    private LoyaltyPoints loyaltyPoints;
    
    
    
    
}

/*
    Model: CartProductIdentifer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CartProductIdentifer {
    
    
    
    
    
    @JsonProperty("identifier")
    private String identifier;
    
    
    
    
}

/*
    Model: BaseInfo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class BaseInfo {
    
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
}

/*
    Model: BasePrice
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class BasePrice {
    
    
    
    
    
    @JsonProperty("currency_symbol")
    private String currencySymbol;
    
    
    
    
    
    @JsonProperty("effective")
    private Double effective;
    
    
    
    
    
    @JsonProperty("currency_code")
    private String currencyCode;
    
    
    
    
    
    @JsonProperty("marked")
    private Double marked;
    
    
    
    
}

/*
    Model: ArticlePriceInfo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ArticlePriceInfo {
    
    
    
    
    
    @JsonProperty("base")
    private BasePrice base;
    
    
    
    
    
    @JsonProperty("converted")
    private BasePrice converted;
    
    
    
    
}

/*
    Model: ProductArticle
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ProductArticle {
    
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    
    @JsonProperty("store")
    private BaseInfo store;
    
    
    
    
    
    @JsonProperty("seller")
    private BaseInfo seller;
    
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("price")
    private ArticlePriceInfo price;
    
    
    
    
    
    @JsonProperty("extra_meta")
    private Object extraMeta;
    
    
    
    
    
    @JsonProperty("size")
    private String size;
    
    
    
    
}

/*
    Model: PromoMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class PromoMeta {
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
}

/*
    Model: ProductPrice
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ProductPrice {
    
    
    
    
    
    @JsonProperty("currency_symbol")
    private String currencySymbol;
    
    
    
    
    
    @JsonProperty("add_on")
    private Double addOn;
    
    
    
    
    
    @JsonProperty("effective")
    private Double effective;
    
    
    
    
    
    @JsonProperty("currency_code")
    private String currencyCode;
    
    
    
    
    
    @JsonProperty("selling")
    private Double selling;
    
    
    
    
    
    @JsonProperty("marked")
    private Double marked;
    
    
    
    
}

/*
    Model: ProductPriceInfo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ProductPriceInfo {
    
    
    
    
    
    @JsonProperty("base")
    private ProductPrice base;
    
    
    
    
    
    @JsonProperty("converted")
    private ProductPrice converted;
    
    
    
    
}

/*
    Model: ProductAvailability
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ProductAvailability {
    
    
    
    
    
    @JsonProperty("other_store_quantity")
    private Integer otherStoreQuantity;
    
    
    
    
    
    @JsonProperty("out_of_stock")
    private Boolean outOfStock;
    
    
    
    
    
    @JsonProperty("deliverable")
    private Boolean deliverable;
    
    
    
    
    
    @JsonProperty("sizes")
    private List<String> sizes;
    
    
    
    
    
    @JsonProperty("is_valid")
    private Boolean isValid;
    
    
    
    
}

/*
    Model: ActionQuery
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ActionQuery {
    
    
    
    
    
    @JsonProperty("product_slug")
    private List<String> productSlug;
    
    
    
    
}

/*
    Model: ProductAction
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ProductAction {
    
    
    
    
    
    @JsonProperty("query")
    private ActionQuery query;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
}

/*
    Model: ProductImage
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ProductImage {
    
    
    
    
    
    @JsonProperty("secure_url")
    private String secureUrl;
    
    
    
    
    
    @JsonProperty("aspect_ratio")
    private String aspectRatio;
    
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
}

/*
    Model: CategoryInfo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CategoryInfo {
    
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
}

/*
    Model: CartProduct
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CartProduct {
    
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("action")
    private ProductAction action;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("images")
    private List<ProductImage> images;
    
    
    
    
    
    @JsonProperty("categories")
    private List<CategoryInfo> categories;
    
    
    
    
    
    @JsonProperty("brand")
    private BaseInfo brand;
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
}

/*
    Model: CartProductInfo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CartProductInfo {
    
    
    
    
    
    @JsonProperty("identifiers")
    private CartProductIdentifer identifiers;
    
    
    
    
    
    @JsonProperty("article")
    private ProductArticle article;
    
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    
    @JsonProperty("promo_meta")
    private PromoMeta promoMeta;
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    
    @JsonProperty("coupon_message")
    private String couponMessage;
    
    
    
    
    
    @JsonProperty("price")
    private ProductPriceInfo price;
    
    
    
    
    
    @JsonProperty("discount")
    private String discount;
    
    
    
    
    
    @JsonProperty("is_set")
    private Boolean isSet;
    
    
    
    
    
    @JsonProperty("availability")
    private ProductAvailability availability;
    
    
    
    
    
    @JsonProperty("price_per_unit")
    private ProductPriceInfo pricePerUnit;
    
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    
    @JsonProperty("product")
    private CartProduct product;
    
    
    
    
    
    @JsonProperty("bulk_offer")
    private Object bulkOffer;
    
    
    
    
}

/*
    Model: OpenapiCartDetailsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class OpenapiCartDetailsResponse {
    
    
    
    
    
    @JsonProperty("breakup_values")
    private CartBreakup breakupValues;
    
    
    
    
    
    @JsonProperty("items")
    private List<CartProductInfo> items;
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    
    @JsonProperty("is_valid")
    private Boolean isValid;
    
    
    
    
}

/*
    Model: OpenApiErrorResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class OpenApiErrorResponse {
    
    
    
    
    
    @JsonProperty("errors")
    private Object errors;
    
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
}

/*
    Model: ShippingAddress
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ShippingAddress {
    
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    
    @JsonProperty("phone")
    private Integer phone;
    
    
    
    
    
    @JsonProperty("area_code")
    private String areaCode;
    
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    
    @JsonProperty("area_code_slug")
    private String areaCodeSlug;
    
    
    
    
    
    @JsonProperty("landmark")
    private String landmark;
    
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("pincode")
    private Integer pincode;
    
    
    
    
    
    @JsonProperty("address_type")
    private String addressType;
    
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    
    @JsonProperty("area")
    private String area;
    
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    
    @JsonProperty("address")
    private String address;
    
    
    
    
}

/*
    Model: OpenApiCartServiceabilityRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class OpenApiCartServiceabilityRequest {
    
    
    
    
    
    @JsonProperty("cart_items")
    private CartItem cartItems;
    
    
    
    
    
    @JsonProperty("shipping_address")
    private ShippingAddress shippingAddress;
    
    
    
    
}

/*
    Model: PromiseFormatted
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class PromiseFormatted {
    
    
    
    
    
    @JsonProperty("min")
    private String min;
    
    
    
    
    
    @JsonProperty("max")
    private String max;
    
    
    
    
}

/*
    Model: PromiseTimestamp
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class PromiseTimestamp {
    
    
    
    
    
    @JsonProperty("min")
    private Double min;
    
    
    
    
    
    @JsonProperty("max")
    private Double max;
    
    
    
    
}

/*
    Model: ShipmentPromise
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ShipmentPromise {
    
    
    
    
    
    @JsonProperty("formatted")
    private PromiseFormatted formatted;
    
    
    
    
    
    @JsonProperty("timestamp")
    private PromiseTimestamp timestamp;
    
    
    
    
}

/*
    Model: OpenApiCartServiceabilityResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class OpenApiCartServiceabilityResponse {
    
    
    
    
    
    @JsonProperty("breakup_values")
    private CartBreakup breakupValues;
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    
    @JsonProperty("delivery_promise")
    private ShipmentPromise deliveryPromise;
    
    
    
    
    
    @JsonProperty("items")
    private List<CartProductInfo> items;
    
    
    
    
    
    @JsonProperty("is_valid")
    private Boolean isValid;
    
    
    
    
}

/*
    Model: OpenApiFiles
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class OpenApiFiles {
    
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    
    @JsonProperty("values")
    private List<String> values;
    
    
    
    
}

/*
    Model: CartItemMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CartItemMeta {
    
    
    
    
    
    @JsonProperty("primary_item")
    private Boolean primaryItem;
    
    
    
    
    
    @JsonProperty("group_id")
    private String groupId;
    
    
    
    
}

/*
    Model: OpenApiOrderItem
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class OpenApiOrderItem {
    
    
    
    
    
    @JsonProperty("files")
    private List<OpenApiFiles> files;
    
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    
    @JsonProperty("product_id")
    private Integer productId;
    
    
    
    
    
    @JsonProperty("cod_charges")
    private Double codCharges;
    
    
    
    
    
    @JsonProperty("delivery_charges")
    private Double deliveryCharges;
    
    
    
    
    
    @JsonProperty("payment_methods")
    private List<MultiTenderPaymentMethod> paymentMethods;
    
    
    
    
    
    @JsonProperty("loyalty_discount")
    private Double loyaltyDiscount;
    
    
    
    
    
    @JsonProperty("size")
    private String size;
    
    
    
    
    
    @JsonProperty("discount")
    private Double discount;
    
    
    
    
    
    @JsonProperty("meta")
    private CartItemMeta meta;
    
    
    
    
    
    @JsonProperty("cashback_applied")
    private Double cashbackApplied;
    
    
    
    
    
    @JsonProperty("price_effective")
    private Double priceEffective;
    
    
    
    
    
    @JsonProperty("coupon_effective_discount")
    private Double couponEffectiveDiscount;
    
    
    
    
    
    @JsonProperty("extra_meta")
    private Object extraMeta;
    
    
    
    
    
    @JsonProperty("employee_discount")
    private Double employeeDiscount;
    
    
    
    
    
    @JsonProperty("price_marked")
    private Double priceMarked;
    
    
    
    
    
    @JsonProperty("amount_paid")
    private Double amountPaid;
    
    
    
    
}

/*
    Model: OpenApiPlatformCheckoutReq
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class OpenApiPlatformCheckoutReq {
    
    
    
    
    
    @JsonProperty("shipping_address")
    private ShippingAddress shippingAddress;
    
    
    
    
    
    @JsonProperty("delivery_charges")
    private Double deliveryCharges;
    
    
    
    
    
    @JsonProperty("payment_methods")
    private List<MultiTenderPaymentMethod> paymentMethods;
    
    
    
    
    
    @JsonProperty("cod_charges")
    private Double codCharges;
    
    
    
    
    
    @JsonProperty("loyalty_discount")
    private Double loyaltyDiscount;
    
    
    
    
    
    @JsonProperty("cashback_applied")
    private Double cashbackApplied;
    
    
    
    
    
    @JsonProperty("coupon_code")
    private String couponCode;
    
    
    
    
    
    @JsonProperty("employee_discount")
    private Object employeeDiscount;
    
    
    
    
    
    @JsonProperty("billing_address")
    private ShippingAddress billingAddress;
    
    
    
    
    
    @JsonProperty("files")
    private List<OpenApiFiles> files;
    
    
    
    
    
    @JsonProperty("coupon_value")
    private Double couponValue;
    
    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
    
    
    @JsonProperty("coupon")
    private String coupon;
    
    
    
    
    
    @JsonProperty("cart_value")
    private Double cartValue;
    
    
    
    
    
    @JsonProperty("payment_mode")
    private String paymentMode;
    
    
    
    
    
    @JsonProperty("cart_items")
    private List<OpenApiOrderItem> cartItems;
    
    
    
    
    
    @JsonProperty("currency_code")
    private String currencyCode;
    
    
    
    
    
    @JsonProperty("affiliate_order_id")
    private String affiliateOrderId;
    
    
    
    
}

/*
    Model: OpenApiCheckoutResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class OpenApiCheckoutResponse {
    
    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
    
    
    @JsonProperty("order_ref_id")
    private String orderRefId;
    
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
}



/*
    Model: AppUser
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class AppUser {
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    
    @JsonProperty("application_id")
    private String applicationId;
    
    
    
    
    
    @JsonProperty("block_reason")
    private String blockReason;
    
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    
    @JsonProperty("updated_by")
    private String updatedBy;
    
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
}

/*
    Model: E
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class E {
    
    
    
    
    
    @JsonProperty("code")
    private Object code;
    
    
    
    
    
    @JsonProperty("exception")
    private String exception;
    
    
    
    
    
    @JsonProperty("info")
    private String info;
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    
    @JsonProperty("request_id")
    private String requestId;
    
    
    
    
    
    @JsonProperty("stack_trace")
    private String stackTrace;
    
    
    
    
    
    @JsonProperty("status")
    private Integer status;
    
    
    
    
}

/*
    Model: Giveaway
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Giveaway {
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("_schedule")
    private Schedule schedule;
    
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    
    @JsonProperty("application_id")
    private String applicationId;
    
    
    
    
    
    @JsonProperty("audience")
    private RewardsAudience audience;
    
    
    
    
    
    @JsonProperty("banner_image")
    private Asset bannerImage;
    
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("rule")
    private RewardsRule rule;
    
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
}

/*
    Model: GiveawayResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class GiveawayResponse {
    
    
    
    
    
    @JsonProperty("items")
    private List<Giveaway> items;
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: HistoryPretty
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class HistoryPretty {
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("application_id")
    private String applicationId;
    
    
    
    
    
    @JsonProperty("claimed")
    private Boolean claimed;
    
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    
    @JsonProperty("expires_on")
    private String expiresOn;
    
    
    
    
    
    @JsonProperty("points")
    private Double points;
    
    
    
    
    
    @JsonProperty("remaining_points")
    private Double remainingPoints;
    
    
    
    
    
    @JsonProperty("text_1")
    private String text1;
    
    
    
    
    
    @JsonProperty("text_2")
    private String text2;
    
    
    
    
    
    @JsonProperty("text_3")
    private String text3;
    
    
    
    
    
    @JsonProperty("txn_name")
    private String txnName;
    
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
}

/*
    Model: HistoryRes
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class HistoryRes {
    
    
    
    
    
    @JsonProperty("items")
    private List<HistoryPretty> items;
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    
    @JsonProperty("points")
    private Double points;
    
    
    
    
}

/*
    Model: Offer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Offer {
    
    
    
    
    
    @JsonProperty("_schedule")
    private Schedule schedule;
    
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    
    @JsonProperty("application_id")
    private String applicationId;
    
    
    
    
    
    @JsonProperty("banner_image")
    private Asset bannerImage;
    
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("rule")
    private Object rule;
    
    
    
    
    
    @JsonProperty("share")
    private ShareMessages share;
    
    
    
    
    
    @JsonProperty("sub_text")
    private String subText;
    
    
    
    
    
    @JsonProperty("text")
    private String text;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    
    @JsonProperty("updated_by")
    private String updatedBy;
    
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
}

/*
    Model: Points
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Points {
    
    
    
    
    
    @JsonProperty("available")
    private Double available;
    
    
    
    
}

/*
    Model: Referral
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Referral {
    
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
}

/*
    Model: RewardUser
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class RewardUser {
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    
    @JsonProperty("referral")
    private Referral referral;
    
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    
    @JsonProperty("user_block_reason")
    private String userBlockReason;
    
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
}

/*
    Model: RewardsAudience
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class RewardsAudience {
    
    
    
    
    
    @JsonProperty("header_user_id")
    private String headerUserId;
    
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
}

/*
    Model: RewardsRule
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class RewardsRule {
    
    
    
    
    
    @JsonProperty("amount")
    private Double amount;
    
    
    
    
}

/*
    Model: ShareMessages
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ShareMessages {
    
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    
    @JsonProperty("facebook")
    private String facebook;
    
    
    
    
    
    @JsonProperty("fallback")
    private String fallback;
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    
    @JsonProperty("messenger")
    private String messenger;
    
    
    
    
    
    @JsonProperty("sms")
    private String sms;
    
    
    
    
    
    @JsonProperty("text")
    private String text;
    
    
    
    
    
    @JsonProperty("twitter")
    private String twitter;
    
    
    
    
    
    @JsonProperty("whatsapp")
    private String whatsapp;
    
    
    
    
}

/*
    Model: UserRes
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class UserRes {
    
    
    
    
    
    @JsonProperty("points")
    private Points points;
    
    
    
    
    
    @JsonProperty("user")
    private RewardUser user;
    
    
    
    
}



/*
    Model: StatGroup
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class StatGroup {
    
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
}

/*
    Model: StatsGroups
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class StatsGroups {
    
    
    
    
    
    @JsonProperty("groups")
    private List<StatGroup> groups;
    
    
    
    
}

/*
    Model: StatsGroupComponent
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class StatsGroupComponent {
    
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("filters")
    private Object filters;
    
    
    
    
}

/*
    Model: StatsGroupComponents
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class StatsGroupComponents {
    
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    
    @JsonProperty("components")
    private List<StatsGroupComponent> components;
    
    
    
    
}

/*
    Model: StatsRes
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class StatsRes {
    
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("data")
    private Object data;
    
    
    
    
}

/*
    Model: ReceivedAt
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ReceivedAt {
    
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
}

/*
    Model: AbandonCartsDetail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class AbandonCartsDetail {
    
    
    
    
    
    @JsonProperty("properties_cart_id")
    private String propertiesCartId;
    
    
    
    
    
    @JsonProperty("context_traits_first_name")
    private String contextTraitsFirstName;
    
    
    
    
    
    @JsonProperty("context_traits_last_name")
    private String contextTraitsLastName;
    
    
    
    
    
    @JsonProperty("context_traits_phone_number")
    private String contextTraitsPhoneNumber;
    
    
    
    
    
    @JsonProperty("context_traits_email")
    private String contextTraitsEmail;
    
    
    
    
    
    @JsonProperty("context_app_application_id")
    private String contextAppApplicationId;
    
    
    
    
    
    @JsonProperty("properties_breakup_values_raw_total")
    private String propertiesBreakupValuesRawTotal;
    
    
    
    
    
    @JsonProperty("received_at")
    private ReceivedAt receivedAt;
    
    
    
    
}

/*
    Model: AbandonCartsList
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class AbandonCartsList {
    
    
    
    
    
    @JsonProperty("items")
    private List<AbandonCartsDetail> items;
    
    
    
    
    
    @JsonProperty("cart_total")
    private String cartTotal;
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: AbandonCartDetail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class AbandonCartDetail {
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
    
    @JsonProperty("cart_value")
    private String cartValue;
    
    
    
    
    
    @JsonProperty("articles")
    private List<Object> articles;
    
    
    
    
    
    @JsonProperty("breakup")
    private Object breakup;
    
    
    
    
    
    @JsonProperty("address")
    private Object address;
    
    
    
    
}

/*
    Model: ExportJobReq
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ExportJobReq {
    
    
    
    
    
    @JsonProperty("marketplace_name")
    private String marketplaceName;
    
    
    
    
    
    @JsonProperty("start_time")
    private String startTime;
    
    
    
    
    
    @JsonProperty("end_time")
    private String endTime;
    
    
    
    
    
    @JsonProperty("event_type")
    private String eventType;
    
    
    
    
    
    @JsonProperty("trace_id")
    private String traceId;
    
    
    
    
}

/*
    Model: ExportJobRes
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ExportJobRes {
    
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    
    @JsonProperty("job_id")
    private String jobId;
    
    
    
    
}

/*
    Model: ExportJobStatusRes
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ExportJobStatusRes {
    
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    
    @JsonProperty("job_id")
    private String jobId;
    
    
    
    
    
    @JsonProperty("download_url")
    private String downloadUrl;
    
    
    
    
}

/*
    Model: GetLogsListReq
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class GetLogsListReq {
    
    
    
    
    
    @JsonProperty("marketplace_name")
    private String marketplaceName;
    
    
    
    
    
    @JsonProperty("start_date")
    private String startDate;
    
    
    
    
    
    @JsonProperty("company_id")
    private String companyId;
    
    
    
    
    
    @JsonProperty("end_date")
    private String endDate;
    
    
    
    
}

/*
    Model: MkpLogsResp
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class MkpLogsResp {
    
    
    
    
    
    @JsonProperty("start_time_iso")
    private String startTimeIso;
    
    
    
    
    
    @JsonProperty("end_time_iso")
    private String endTimeIso;
    
    
    
    
    
    @JsonProperty("event_type")
    private String eventType;
    
    
    
    
    
    @JsonProperty("trace_id")
    private String traceId;
    
    
    
    
    
    @JsonProperty("count")
    private String count;
    
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
}

/*
    Model: GetLogsListRes
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class GetLogsListRes {
    
    
    
    
    
    @JsonProperty("items")
    private List<MkpLogsResp> items;
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: SearchLogReq
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class SearchLogReq {
    
    
    
    
    
    @JsonProperty("marketplace_name")
    private String marketplaceName;
    
    
    
    
    
    @JsonProperty("start_date")
    private String startDate;
    
    
    
    
    
    @JsonProperty("company_id")
    private String companyId;
    
    
    
    
    
    @JsonProperty("end_date")
    private String endDate;
    
    
    
    
    
    @JsonProperty("identifier")
    private String identifier;
    
    
    
    
    
    @JsonProperty("identifier_value")
    private String identifierValue;
    
    
    
    
}

/*
    Model: LogInfo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class LogInfo {
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    
    @JsonProperty("event_type")
    private String eventType;
    
    
    
    
    
    @JsonProperty("marketplace_name")
    private String marketplaceName;
    
    
    
    
    
    @JsonProperty("event")
    private String event;
    
    
    
    
    
    @JsonProperty("trace_id")
    private String traceId;
    
    
    
    
    
    @JsonProperty("company_id")
    private Double companyId;
    
    
    
    
    
    @JsonProperty("brand_id")
    private Double brandId;
    
    
    
    
    
    @JsonProperty("store_code")
    private String storeCode;
    
    
    
    
    
    @JsonProperty("store_id")
    private Double storeId;
    
    
    
    
    
    @JsonProperty("item_id")
    private Double itemId;
    
    
    
    
    
    @JsonProperty("article_id")
    private String articleId;
    
    
    
    
    
    @JsonProperty("seller_identifier")
    private String sellerIdentifier;
    
    
    
    
}

/*
    Model: SearchLogRes
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class SearchLogRes {
    
    
    
    
    
    @JsonProperty("items")
    private List<LogInfo> items;
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}



/*
    Model: ValidityObject
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ValidityObject {
    
    
    
    
    
    @JsonProperty("start")
    private String start;
    
    
    
    
    
    @JsonProperty("end")
    private String end;
    
    
    
    
}

/*
    Model: CreateUpdateDiscount
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CreateUpdateDiscount {
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    
    @JsonProperty("app_ids")
    private List<String> appIds;
    
    
    
    
    
    @JsonProperty("extension_ids")
    private List<String> extensionIds;
    
    
    
    
    
    @JsonProperty("job_type")
    private String jobType;
    
    
    
    
    
    @JsonProperty("discount_type")
    private String discountType;
    
    
    
    
    
    @JsonProperty("discount_level")
    private String discountLevel;
    
    
    
    
    
    @JsonProperty("value")
    private Integer value;
    
    
    
    
    
    @JsonProperty("file_path")
    private String filePath;
    
    
    
    
    
    @JsonProperty("brand_ids")
    private List<Integer> brandIds;
    
    
    
    
    
    @JsonProperty("store_ids")
    private List<Integer> storeIds;
    
    
    
    
    
    @JsonProperty("validity")
    private ValidityObject validity;
    
    
    
    
}

/*
    Model: DiscountJob
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class DiscountJob {
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    
    @JsonProperty("app_ids")
    private List<String> appIds;
    
    
    
    
    
    @JsonProperty("job_type")
    private String jobType;
    
    
    
    
    
    @JsonProperty("discount_type")
    private String discountType;
    
    
    
    
    
    @JsonProperty("discount_level")
    private String discountLevel;
    
    
    
    
    
    @JsonProperty("value")
    private Integer value;
    
    
    
    
    
    @JsonProperty("file_path")
    private String filePath;
    
    
    
    
    
    @JsonProperty("brand_ids")
    private List<Integer> brandIds;
    
    
    
    
    
    @JsonProperty("store_ids")
    private List<Integer> storeIds;
    
    
    
    
    
    @JsonProperty("validity")
    private ValidityObject validity;
    
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    
    @JsonProperty("created_by")
    private UserDetails createdBy;
    
    
    
    
    
    @JsonProperty("modified_by")
    private UserDetails modifiedBy;
    
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
}

/*
    Model: ListOrCalender
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class ListOrCalender {
    
    
    
    
    
    @JsonProperty("items")
    private List<DiscountJob> items;
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: InternalDiscountQuery
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class InternalDiscountQuery {
    
    
    
    
    
    @JsonProperty("job_ids")
    private List<String> jobIds;
    
    
    
    
    
    @JsonProperty("item_ids")
    private List<Integer> itemIds;
    
    
    
    
    
    @JsonProperty("seller_identifiers")
    private List<String> sellerIdentifiers;
    
    
    
    
    
    @JsonProperty("brand_ids")
    private List<Integer> brandIds;
    
    
    
    
    
    @JsonProperty("store_ids")
    private List<Integer> storeIds;
    
    
    
    
}

/*
    Model: DiscountValueObject
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class DiscountValueObject {
    
    
    
    
    
    @JsonProperty("min_items")
    private Integer minItems;
    
    
    
    
    
    @JsonProperty("value")
    private Integer value;
    
    
    
    
}

/*
    Model: DiscountDetail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class DiscountDetail {
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("job_id")
    private String jobId;
    
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    
    @JsonProperty("app_ids")
    private List<String> appIds;
    
    
    
    
    
    @JsonProperty("discount_type")
    private String discountType;
    
    
    
    
    
    @JsonProperty("discount")
    private List<DiscountValueObject> discount;
    
    
    
    
    
    @JsonProperty("brand_ids")
    private List<Integer> brandIds;
    
    
    
    
    
    @JsonProperty("store_ids")
    private List<Integer> storeIds;
    
    
    
    
    
    @JsonProperty("item_id")
    private Integer itemId;
    
    
    
    
    
    @JsonProperty("seller_identifier")
    private String sellerIdentifier;
    
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
}

/*
    Model: DiscountList
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class DiscountList {
    
    
    
    
    
    @JsonProperty("items")
    private List<DiscountDetail> items;
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: FileJobResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class FileJobResponse {
    
    
    
    
    
    @JsonProperty("stage")
    private String stage;
    
    
    
    
    
    @JsonProperty("total")
    private Integer total;
    
    
    
    
    
    @JsonProperty("failed")
    private Integer failed;
    
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    
    @JsonProperty("body")
    private Object body;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("file_type")
    private String fileType;
    
    
    
    
}

/*
    Model: DownloadFileJob
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class DownloadFileJob {
    
    
    
    
    
    @JsonProperty("brand_ids")
    private List<Integer> brandIds;
    
    
    
    
    
    @JsonProperty("store_ids")
    private List<Integer> storeIds;
    
    
    
    
}

/*
    Model: CancelJobResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class CancelJobResponse {
    
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
}

/*
    Model: UserDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class UserDetails {
    
    
    
    
    
    @JsonProperty("username")
    private String username;
    
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
}

/*
    Model: BadRequestObject
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class BadRequestObject {
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
}



/*
    Model: AddProxyReq
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class AddProxyReq {
    
    
    
    
    
    @JsonProperty("attached_path")
    private String attachedPath;
    
    
    
    
    
    @JsonProperty("proxy_url")
    private String proxyUrl;
    
    
    
    
}

/*
    Model: AddProxyResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class AddProxyResponse {
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("attached_path")
    private String attachedPath;
    
    
    
    
    
    @JsonProperty("proxy_url")
    private String proxyUrl;
    
    
    
    
    
    @JsonProperty("company_id")
    private String companyId;
    
    
    
    
    
    @JsonProperty("application_id")
    private String applicationId;
    
    
    
    
    
    @JsonProperty("extension_id")
    private String extensionId;
    
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    
    @JsonProperty("modified_at")
    private String modifiedAt;
    
    
    
    
}

/*
    Model: APIError
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class APIError {
    
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    
    @JsonProperty("info")
    private String info;
    
    
    
    
    
    @JsonProperty("request_id")
    private String requestId;
    
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
}

/*
    Model: RemoveProxyResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class RemoveProxyResponse {
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    
    @JsonProperty("data")
    private Object data;
    
    
    
    
}



/*
    Model: EventConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class EventConfig {
    
    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
    
    
    @JsonProperty("event_name")
    private String eventName;
    
    
    
    
    
    @JsonProperty("event_type")
    private String eventType;
    
    
    
    
    
    @JsonProperty("event_category")
    private String eventCategory;
    
    
    
    
    
    @JsonProperty("version")
    private String version;
    
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
}

/*
    Model: EventConfigList
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class EventConfigList {
    
    
    
    
    
    @JsonProperty("items")
    private List<EventConfig> items;
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: SubscriberConfigList
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class SubscriberConfigList {
    
    
    
    
    
    @JsonProperty("items")
    private List<SubscriberResponse> items;
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: EventProcessedStatus
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class EventProcessedStatus {
    
    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
    
    
    @JsonProperty("subscriber_id")
    private String subscriberId;
    
    
    
    
    
    @JsonProperty("attempt")
    private Integer attempt;
    
    
    
    
    
    @JsonProperty("response_code")
    private String responseCode;
    
    
    
    
    
    @JsonProperty("response_message")
    private String responseMessage;
    
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    
    @JsonProperty("processed_on")
    private String processedOn;
    
    
    
    
    
    @JsonProperty("status")
    private Boolean status;
    
    
    
    
}

/*
    Model: EventPayload
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class EventPayload {
    
    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
    
    
    @JsonProperty("event_trace_id")
    private String eventTraceId;
    
    
    
    
    
    @JsonProperty("message_id")
    private String messageId;
    
    
    
    
    
    @JsonProperty("event_name")
    private String eventName;
    
    
    
    
    
    @JsonProperty("event_type")
    private String eventType;
    
    
    
    
    
    @JsonProperty("version")
    private String version;
    
    
    
    
    
    @JsonProperty("status")
    private Boolean status;
    
    
    
    
}

/*
    Model: SubscriberConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class SubscriberConfig {
    
    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("webhook_url")
    private String webhookUrl;
    
    
    
    
    
    @JsonProperty("association")
    private Association association;
    
    
    
    
    
    @JsonProperty("status")
    private PlatformClient.SubscriberStatus status;
    
    
    
    
    
    @JsonProperty("email_id")
    private String emailId;
    
    
    
    
    
    @JsonProperty("auth_meta")
    private AuthMeta authMeta;
    
    
    
    
    
    @JsonProperty("event_id")
    private List<Integer> eventId;
    
    
    
    
}

/*
    Model: SubscriberResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class SubscriberResponse {
    
    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("webhook_url")
    private String webhookUrl;
    
    
    
    
    
    @JsonProperty("association")
    private Association association;
    
    
    
    
    
    @JsonProperty("email_id")
    private String emailId;
    
    
    
    
    
    @JsonProperty("status")
    private PlatformClient.SubscriberStatus status;
    
    
    
    
    
    @JsonProperty("auth_meta")
    private AuthMeta authMeta;
    
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    
    @JsonProperty("updated_on")
    private String updatedOn;
    
    
    
    
    
    @JsonProperty("event_configs")
    private List<EventConfig> eventConfigs;
    
    
    
    
}

/*
    Model: SubscriberEvent
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class SubscriberEvent {
    
    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
    
    
    @JsonProperty("subscriber_id")
    private Integer subscriberId;
    
    
    
    
    
    @JsonProperty("event_id")
    private Integer eventId;
    
    
    
    
    
    @JsonProperty("created_date")
    private String createdDate;
    
    
    
    
}

/*
    Model: AuthMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class AuthMeta {
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("secret")
    private String secret;
    
    
    
    
}

/*
    Model: Association
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public static class Association {
    
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    
    @JsonProperty("application_id")
    private List<String> applicationId;
    
    
    
    
    
    @JsonProperty("extension_id")
    private String extensionId;
    
    
    
    
    
    @JsonProperty("criteria")
    private String criteria;
    
    
    
    
}


}