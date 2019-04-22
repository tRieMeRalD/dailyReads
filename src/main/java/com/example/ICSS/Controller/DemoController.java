package com.example.ICSS.Controller;

import com.example.ICSS.document.Users;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.ICSS.respository.UserRepository;

import java.util.List;

@RestController
public class DemoController {

    @RequestMapping(value = "/echo", method = RequestMethod.GET)
    public String echo(@RequestParam(value = "request", defaultValue = "Hello!") String request) {
        return request;
    }

    private UserRepository userRepository;

    @RequestMapping(value = "/posts", method = RequestMethod.GET)
    public List<Users> getPosts() {
        return userRepository.findAll();
    }
}