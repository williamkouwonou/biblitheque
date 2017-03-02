/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oaut2.auth;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 *
 * @author kouwonou
 */
//@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter{
    @Override
    public void configure(AuthenticationManagerBuilder amb) throws Exception{
        amb.inMemoryAuthentication().withUser("william").password("123").roles("USER");
    }
    @Override
    public void configure(HttpSecurity http){
        
    }
}
