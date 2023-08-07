/*
package com.vishal.UserAccessManagement.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class LogoutConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .logout()
                .logoutUrl("/logout")  // The URL where the logout request will be sent
                .logoutSuccessUrl("/login?logout")  // The URL to redirect after successful logout
                .invalidateHttpSession(true)  // Invalidate the HttpSession
                .deleteCookies("JSESSIONID")  // Delete cookies
                .permitAll();  // Allow all users to access the logout URL
    }
}
*/
