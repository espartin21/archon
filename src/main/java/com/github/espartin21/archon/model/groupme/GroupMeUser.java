package com.github.espartin21.archon.model.groupme;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GroupMeUser {
    String user_id;
    String nickname;
    String image_url;
    String id;
    boolean muted;
    boolean autokicked;
    String[] roles;
    String name;
}
