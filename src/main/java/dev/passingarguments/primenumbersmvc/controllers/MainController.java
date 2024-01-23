package dev.passingarguments.primenumbersmvc.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/")
    public String showHome() {
        return "home";
    }

}
