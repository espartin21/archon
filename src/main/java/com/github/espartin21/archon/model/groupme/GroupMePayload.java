package com.github.espartin21.archon.model.groupme;

import com.github.espartin21.archon.model.groupme.attachments.GroupMeAttachment;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class GroupMePayload {
    private String text;
    private String bot_id;
    private GroupMeAttachment[] attachments;

    GroupMePayload(String text, String bot_id) {
        this.text = text;
        this.bot_id = bot_id;
        this.attachments = null;
    }
}
