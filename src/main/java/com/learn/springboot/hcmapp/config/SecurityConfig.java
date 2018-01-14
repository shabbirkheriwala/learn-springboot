package com.learn.springboot.hcmapp.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    
	@Autowired
	protected void configureGlobalSecurity(AuthenticationManagerBuilder auth) throws Exception {
		System.out.println("*********** A u t h e n t i c a t i o n M a n a g e r B u i l d e r *********** ");
		auth.inMemoryAuthentication() 
			.withUser("shabs").password("password").roles("ADMIN", "USER")
			.and()
			.withUser("demo").password("test").roles("USER");
	}
	
	@Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
    		System.out.println("*********** c o n f i g u r e *********** ");
    		httpSecurity
//        .formLogin().permitAll() // This will display the spring login form
    		.authorizeRequests()
        .antMatchers("/hello").hasAnyRole("ADMIN", "USER")
        .antMatchers("/employee/all").hasAnyRole("ADMIN", "USER")
        .antMatchers("/employee/add").hasAnyRole("ADMIN")
        .anyRequest().authenticated()
        .and().httpBasic() // needed for Basic auth (test it from postman Authorization->Basic Auth) REMEMBER TO CLEAR COOKIES EACH TIME TO TEST
        .and().csrf().disable();
    }
	
}
