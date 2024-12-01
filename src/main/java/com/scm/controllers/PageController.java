package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestMethod;
// import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.bind.annotation.RequestMethod;
// import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class PageController {


    @RequestMapping("/home")
    public String home(Model model){
    System.out.println("Home page handler");

    
    // model.addAttribute("name", "Substring technologies");
    // model.addAttribute("Instagramchannel", "sukhdevthakurr");
    // model.addAttribute("GithubRepository", "https://github.com/sukhdevjs");
    return "home";
    
}
@RequestMapping("/base")
    public String base(Model model){
    System.out.println("Home page handler");

    return "base";
}

@RequestMapping("/about")
public String about(Model model) {
    System.out.println("Home page handler");
    return  "about";
}
@RequestMapping("/services")
public String services(Model model) {
    System.out.println("Home Page Handler");
    return "services";
}
@RequestMapping("/contact")
public String contact(Model model) {
    System.out.println("Contact Page Handler");
    return "contact";
}

@RequestMapping("/login")
public String login(Model model) {
    System.out.println("Login Page Handler");
    return "login";
}
@RequestMapping("/register")
public String register(Model model) {
    System.out.println("Register Page Handler");
    return "register";
}

}