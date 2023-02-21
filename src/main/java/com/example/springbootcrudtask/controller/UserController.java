package com.example.springbootcrudtask.controller;

import com.example.springbootcrudtask.model.User;
import com.example.springbootcrudtask.service.UserDaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class UserController {
    private final UserDaoService userService;
    @Autowired
    public UserController(UserDaoService userService) {
        this.userService = userService;
    }
    @GetMapping()
    public String getAllUsers(ModelMap model) {
        model.addAttribute("users", userService.findAll());
        return "users";
    }
    @GetMapping(value = "/editUser/{id}")
    public String editUser(@PathVariable Long id, ModelMap model) {
        model.addAttribute("user", userService.getById(id));
        return "editUser";
    }
    @GetMapping(value = "/addUser")
    public String addUser(ModelMap model) {
        model.addAttribute("user", new User());
        return "addUser";
    }
    @GetMapping(value="/deleteUser/{id}")
    public String deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return "redirect:/";
    }

    @PostMapping(value="/editUser/{getId}")
    public String saveEditUser(@PathVariable Long getId, @ModelAttribute("user") User user){
        user.setId(getId);
        userService.updateUser(user);
        return "redirect:/";
    }
    @PostMapping(value="/addUser")
    public String saveUser(@ModelAttribute("user") User user){
        userService.addUser(user);
        return "redirect:/";
    }

}
