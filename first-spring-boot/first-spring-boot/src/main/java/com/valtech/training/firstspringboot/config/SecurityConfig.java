package com.valtech.training.firstspringboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

//import com.valtech.training.firstspringboot.components.Airthemetic;
//import com.valtech.training.firstspringboot.components.AirthemeticImpl;
//import com.valtech.training.firstspringboot.components.SimpleInterest;
//import com.valtech.training.firstspringboot.components.SimpleInterestImpl;

@Configuration
public class SecurityConfig {
	
//	@Bean
//	public Airthemetic arithmetic() {
//		return new AirthemeticImpl();
//	}
//	
//	@Bean
//	public SimpleInterest simpleInterest() {
//		return new SimpleInterestImpl();
//	}
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http)throws Exception{
		http.csrf().disable()
		.authorizeRequests()
		
		.antMatchers("/user","/orders/**","/hello","/changePassword")
		.hasAnyRole("USER","ADMIN")
		
		.antMatchers("/admin")
		.hasRole("ADMIN")
		
		.antMatchers("/anon","/login","/logout","/register")
		.anonymous()
		
		.anyRequest()
		.authenticated();
		
//		http.httpBasic();
		http.formLogin()
		.loginPage("/login")
		.defaultSuccessUrl("/hello?name=Valtech")
		.failureUrl("/login?error=true");
		
		return http.build();
		
	}
	
//	@Bean
//	public UserDetailsManager userDetailsManger() {
//		UserDetails scott = User.builder().username("scott").password("tiger123").roles("USER").build();
//		UserDetails admin = User.builder().username("admin").password("admin123").roles("ADMIN","USER").build();
//		return new InMemoryUserDetailsManager(scott,admin);
//	}
//	
	@Bean
	public PasswordEncoder passwordEncoder() {
		//return NoOpPasswordEncoder.getInstance();
		return new BCryptPasswordEncoder();
	}

}
