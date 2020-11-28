package com.github.espartin21.archon.model.groupme.groupinfo;

import com.github.espartin21.archon.model.groupme.GroupMeUser;
import com.github.espartin21.archon.model.groupme.groupinfo.util.GroupMeGroupInfoMessageInformation;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class GroupMeGroupInfo {
    private String id;
    private String group_id;
    private String name;
    private String phone_number;
    private String type;
    private String description;
    private String image_url = null;
    private String creator_user_id;
    private int created_at;
    private int updated_at;
    private int muted_until;
    private boolean office_mode;
    private String share_url;
    private String share_qr_code_url;
    private List<GroupMeUser> members;
    private GroupMeGroupInfoMessageInformation messages;
    private int max_members;
    private String theme_name; // Not sure about this
    String like_icon; // Not sure about this
}
