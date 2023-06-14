package com.ru.adrassad.learnwords.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/words")
public class WordController {
    @GetMapping()
    public String word(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model) {
        List<String> list = new ArrayList<>();
        list.add("World");
        model.addAttribute("words", list);
        return "words/list";
    }
}
