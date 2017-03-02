/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oaut2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

/**
 *
 * @author kouwonou
 */
@SpringBootApplication
@EnableResourceServer
public class ServerMain   {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(ServerMain.class, args);
    }

//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.httpBasic().disable();
//		http.authorizeRequests().antMatchers("/resource/*").hasAnyRole("USER")
//                        .anyRequest().authenticated();
//    }
//    @Bean
//    HeaderHttpSessionStrategy sessionStrategy() {
//    return new HeaderHttpSessionStrategy();
//  }

   
}
