package com.learn.springboot.hcmapp.resources;

import com.learn.springboot.hcmapp.model.User;
import com.learn.springboot.hcmapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/user")
public class UserController  {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(method= RequestMethod.POST, value="/add")
    public @ResponseBody
    String addNewUser (@RequestBody User user) {
        userRepository.save(user);
        return "User Saved";
    }
}
