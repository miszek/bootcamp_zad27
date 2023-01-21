package com.michalszekalski.bootcamp_zad27;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class HomeController {

    private UserRepository userRepository;

    public HomeController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/")
    public String home(Model model) {
        List<UserCustom> allUsers = userRepository.findAll();
        model.addAttribute("allUsers", allUsers);
        model.addAttribute("newUser", new UserCustom());
        return "home";
    }

    @PostMapping("/addUser")
    public String addUser(UserCustom user) {
        userRepository.save(user);
        return "redirect:/";
    }
}
