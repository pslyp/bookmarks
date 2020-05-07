package com.pslyp.bookmarks.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("")
public class DemoController {

    @GetMapping(value = "")
    public String index(Model model) {
        String text = "Hello Eiei";
        model.addAttribute("hello", text);
        return "index";
    }

}
