package com.example.dockertest.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("docker")
public class Controller {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @ResponseBody
    public String printHello() {
        return "Hello ! This message is from docker-test project";
    }
}
