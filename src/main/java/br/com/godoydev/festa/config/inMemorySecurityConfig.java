package br.com.godoydev.festa.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;

@Configuration
public class inMemorySecurityConfig {
    /*@Autowired
    public void configureGlobal(AuthenticationManagerBuilder builder) throws Exception{

        builder
                    .inMemoryAuthentication()
                    .withUser("joao").password("123").roles("USER")
                    .and()
                    .withUser("carlos").password("123").roles("USER");
        }
    */
}
