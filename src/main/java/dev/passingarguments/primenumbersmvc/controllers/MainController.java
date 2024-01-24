package dev.passingarguments.primenumbersmvc.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String showHome() {
        return "home";
    }

    @GetMapping("/main")
    public String showMain() {
        return "main";
    }

    @PostMapping("/result")
    public String showResult() {
        return "display-result";
    }

}
