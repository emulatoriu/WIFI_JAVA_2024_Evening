package com.cats.CatsBackend.controller;

import com.cats.CatsBackend.data.User;
import com.cats.CatsBackend.logic.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
@AllArgsConstructor
public class UserController {
    private final UserService userService;
    @PostMapping("save")
    public User save(@RequestBody User user) {
        return userService.save(user);
    }

    @GetMapping("findAll")
    public List<User> findAll() {
        return userService.findAll();
    }
}
