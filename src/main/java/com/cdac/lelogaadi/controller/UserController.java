package com.cdac.lelogaadi.controller;

import com.cdac.lelogaadi.model.User;
import com.cdac.lelogaadi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "/signup")
    @CrossOrigin(origins = "*")
    public User createUser(@RequestBody User user, HttpSession session) {
        boolean flag = userService.checkEmail(user.getEmail());
        if (flag) {
            session.setAttribute("Email Already Exists", null);
            return null;
        } else {
            return userService.createUser(user);
        }
    }
}
