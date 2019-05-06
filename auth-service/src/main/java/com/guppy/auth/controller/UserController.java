package com.guppy.auth.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping(value = "/")
public class UserController {

    @RequestMapping(value = "/current")
    public Principal getUser(Principal principal){
        return principal;
    }
}
