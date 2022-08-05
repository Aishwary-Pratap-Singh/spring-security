package com.example.springsecsection2.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class ProjectSecurityConfig  {
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
}
