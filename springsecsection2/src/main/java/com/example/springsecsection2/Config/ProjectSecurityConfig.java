package com.example.springsecsection2.Config;

import org.springframework.cglib.proxy.NoOp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.WebSecurityConfigurer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Configuration
public class ProjectSecurityConfig   {
    /**
     *
     * /myAccount - secured
     * /myBalance - secured
     * /myCards - secured
     * /myLoans - secured
     * /notices - not secured
     * /contact - not secured
     *
     */
    @Bean
    protected SecurityFilterChain configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
//                .anyRequest().authenticated()
                .antMatchers("/myAccount").authenticated()
                .antMatchers("/myBalance").authenticated()
                .antMatchers("/myCards").authenticated()
                .antMatchers("/myLoans").authenticated()
                .antMatchers("/notices").permitAll()
                .antMatchers("/contact").permitAll()

                .and()
                .formLogin().and()
                .httpBasic();
        return http.build();
    }

//    Configuring multiple users

    @Bean
    public InMemoryUserDetailsManager adminDetailsService() {
        UserDetails user = User
                .withUsername("user")
                .password("12345")
                .roles("USER")
                .build();

//        UserDetails admin = User.withDefaultPasswordEncoder()
        UserDetails admin = User
                .withUsername("admin")
                .password("12345")
                .roles("ADMIN")
                .build();
        Collection<UserDetails>arr = new ArrayList<>();
        arr.add(user);
        arr.add(admin);
        return new InMemoryUserDetailsManager(arr);
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return NoOpPasswordEncoder.getInstance();
    }



    }
