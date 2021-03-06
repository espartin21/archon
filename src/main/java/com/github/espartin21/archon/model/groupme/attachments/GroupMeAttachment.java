package com.github.espartin21.archon.model.groupme.attachments;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@NoArgsConstructor
@Getter
@Setter
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", visible = true)
@JsonSubTypes({
        @JsonSubTypes.Type(value = GroupMeImage.class, name = "image"),
        @JsonSubTypes.Type(value = GroupMeLocation.class, name = "location"),
        @JsonSubTypes.Type(value = GroupMeMention.class, name = "mentions")
})
public class GroupMeAttachment {
    public String type;
}
