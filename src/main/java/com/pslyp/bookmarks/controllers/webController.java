package com.pslyp.bookmarks.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("")
public class webController {

    @GetMapping(value = "/webs")
    public String index() {
        return "list";
    }

}
