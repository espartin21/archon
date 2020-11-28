package com.github.espartin21.archon.model.groupme;

import com.github.espartin21.archon.model.groupme.attachments.GroupMeAttachment;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class GroupMeInfo {
    GroupMeAttachment[] attachments; // TODO: change this after making class type
    private String avatar_url;
    private int created_at;
    private String group_id;
    private String id;
    private String name;
    private String sender_id;
    private String sender_type;
    private String source_guid;
    private boolean system;
    private String text;
    private String user_id;
}
