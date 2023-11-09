 package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.HttpMediaTypeException;

import com.example.Authentication.MyUserDetailsServiceImpl;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class BasicConfiguration {
	@Autowired
	PasswordEncoder passwordEncoder;
	@Autowired
	MyUserDetailsServiceImpl userDetails;
	

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

		http.csrf((csrf) -> csrf.disable());
		http.authorizeHttpRequests((authorizeHttpRequests) -> {
			authorizeHttpRequests.antMatchers("/home","/page").permitAll();
			authorizeHttpRequests.antMatchers("/hello").authenticated();
		});
		
		http.httpBasic();
		http.formLogin().loginPage("/loggg").defaultSuccessUrl("/hello").permitAll();
		return http.build();
	}

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetails).passwordEncoder(passwordEncoder);
	}

	
	

}