package com.github.espartin21.archon.model.groupme.groupinfo;

import com.github.espartin21.archon.model.groupme.GroupMeUser;
import com.github.espartin21.archon.model.groupme.groupinfo.util.GroupMeGroupInfoMessageInformation;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class GroupMeGroupInfo {
    private String id;
    private String group_id;
    private String name;
    private String phone_number;
    private String type;
    private String description;
    private String image_url = null;
    private String creator_user_id;
    private long created_at;
    private long updated_at;
    private long muted_until;
    private boolean office_mode;
    private String share_url;
    private String share_qr_code_url;
    private List<GroupMeUser> members;
    private GroupMeGroupInfoMessageInformation messages;
    private int max_members;
    private String theme_name;
    private String like_icon;
}
