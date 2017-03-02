/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oaut2.ui.app;

import java.security.Principal;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import javax.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author kouwonou
 */
//@RestController
public class Resources {
    //@RequestMapping("/resource")
    public Map<String,Object> home() {
    Map<String,Object> model = new HashMap<>();
    model.put("id", UUID.randomUUID().toString());
    model.put("content", "Hello World");
    return model;
  }
  @RequestMapping("/user")
  public Principal user(Principal user) {
    return user;
  }
   @RequestMapping("/token" )
   
  public Map<String,String> token(HttpSession session) {
    return Collections.singletonMap("token", session.getId());
  }
}
