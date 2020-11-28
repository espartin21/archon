package com.github.espartin21.archon.model.groupme.attachments;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@NoArgsConstructor
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = GroupMeImage.class, name = "GroupMeImage"),
        @JsonSubTypes.Type(value = GroupMeLocation.class, name = "GroupMeLocation"),
        @JsonSubTypes.Type(value = GroupMeMention.class, name = "GroupMeMention")
})
public abstract class GroupMeAttachment {
    String type;
}
