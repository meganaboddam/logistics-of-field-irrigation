package com.irrigationlogistics;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.nio.file.LinkPermission;

@org.springframework.stereotype.Controller
public class IOController {

    @GetMapping("/input")
    public String greetingForm(Model model) {
        model.addAttribute("input", new FieldAttributes());
        return "input";
    }

    @PostMapping("/input")
    public String greetingSubmit(@ModelAttribute FieldAttributes input, Model model) {
        model.addAttribute("input", input);
        return "result";
    }

}