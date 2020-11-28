package com.github.espartin21.archon.model.groupme;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GroupMeUser {
    private String user_id;
    private String nickname;
    private String image_url;
    private String id;
    private boolean muted;
    private boolean autokicked;
    private String[] roles;
    private String name;
}
