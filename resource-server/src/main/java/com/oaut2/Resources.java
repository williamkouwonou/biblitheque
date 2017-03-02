/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oaut2;

import java.security.Principal;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author kouwonou
 */
@RestController
@RequestMapping("/resource")
public class Resources {

    //@CrossOrigin(origins = "http://localhost:9053",allowedHeaders={"x-auth-token", "x-requested-with"})
   
    
    @RequestMapping("/get")
    @Secured({"ROLE_USER1"})
    public Map<String, Object> home() {
        Map<String, Object> model = new HashMap<>();
         model.put("id", UUID.randomUUID().toString());
        model.put("content", "Hello World");
        model.put("principal", "Will");
        return model;
    }

    @RequestMapping("/user")
    public Principal user(Principal user) {
        return user;
    }
}
