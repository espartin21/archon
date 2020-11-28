package com.github.espartin21.archon.model.groupme;

import com.github.espartin21.archon.model.groupme.util.GroupMeGroupInfoMessageInformation;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class GroupMeGroupInfo {
    String id;
    String group_id;
    String name;
    String phone_number;
    String type;
    String description;
    String image_url = null;
    String creator_user_id;
    int created_at;
    int updated_at;
    int muted_until;
    boolean office_mode;
    String share_url;
    String share_qr_code_url;
    List<GroupMeUser> members;
    GroupMeGroupInfoMessageInformation messages;
    int max_members;
    String theme_name; // Not sure about this
    String like_icon; // Not sure about this
}
