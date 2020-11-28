package com.github.espartin21.archon.controller;

import com.github.espartin21.archon.model.groupme.GroupMeInfo;
import com.github.espartin21.archon.model.groupme.attachments.GroupMeMention;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class TestController {
    @GetMapping("/ping")
    public String ping() {
        return "Pong!";
    }

    @PostMapping("/callback")
    public void callback(@RequestBody GroupMeInfo groupMeInfo) {
        GroupMeMention mention = (GroupMeMention) groupMeInfo.getAttachments()[0];
        System.out.println(mention.type);
    }
}
