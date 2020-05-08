package com.pslyp.bookmarks.controllers;

import com.pslyp.bookmarks.entities.Web;
import com.pslyp.bookmarks.repositories.WebRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
@RequestMapping("")
public class WebController {

    @Autowired
    private WebRepository webRepository;

    @GetMapping(value = "")
    public String index() {
        return "index";
    }

    @GetMapping(value = "web")
    public String show(Model model) {
        model.addAttribute("items", webRepository.findAll());

        System.out.println(webRepository.findAll());

        return "index";
    }

    @PostMapping(value = "web")
    public String store(@RequestParam Map<String,String> inputs, Model model) {

        System.out.println(inputs.get("name"));

        Web web = new Web();

        web.setName(inputs.get("name"));
        web.setUrl(inputs.get("url"));

//        webRepository.save(web);

        return "redirect:/web";
    }

}
