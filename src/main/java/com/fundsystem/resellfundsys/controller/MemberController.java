package com.fundsystem.resellfundsys.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/member")
public class MemberController {
    @GetMapping("/save")
    public String retSave(){
        log.error("hello");
        System.out.println("clear");
        return "save";
    }

    @GetMapping("/new")
    public String retNew(){
        log.error("new");
        return "new";
    }
}
