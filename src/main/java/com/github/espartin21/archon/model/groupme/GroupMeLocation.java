package com.github.espartin21.archon.model.groupme;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GroupMeLocation {
    final String type = "location";
    String lng;
    String lat;
    String name;
}
