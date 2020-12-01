package com.github.espartin21.archon.controller;

import com.github.espartin21.archon.model.groupme.GroupMeInfo;

import com.github.espartin21.archon.service.groupme.GroupMeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    private final GroupMeService groupMeService;

    public TestController(GroupMeService groupMeService) {
        this.groupMeService = groupMeService;
    }

    @GetMapping("/ping")
    public String ping() {
        return "Pong!";
    }

    @GetMapping("/members")
    public void members() {
        System.out.println(groupMeService.getGroupInfo());
    }

    @PostMapping("/callback")
    public void callback(@RequestBody GroupMeInfo groupMeInfo) {
    }
}
