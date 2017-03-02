/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oaut2.auth;

import java.security.Principal;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author kouwonou
 */
@SpringBootApplication
@EnableAuthorizationServer
@RestController
@EnableResourceServer
public class AuthenticationServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(AuthenticationServer.class, args);
    }
    @RequestMapping("/user")
  public Principal user(Principal user) {
    return user;
  }
}
