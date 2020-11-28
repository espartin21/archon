package com.github.espartin21.archon.controller;

import com.github.espartin21.archon.model.groupme.GroupMeInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/ping")
    public String ping() {
        return "Pong!";
    }

    @PostMapping("/callback")
    public void callback(@RequestBody GroupMeInfo groupMeInfo) {
        System.out.println(groupMeInfo);
    }
}
