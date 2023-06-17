//package com.springboot.quizApp.security;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//
//@Configuration
//public class SecurityCofig {
//	@Bean
//	public InMemoryUserDetailsManager userDetailsManager() {
//		UserDetails john = User.builder().username("john").password("{noop}test123").roles("EMPLOYEE").build();
//		UserDetails mery = User.builder().username("mery").password("{noop}test123").roles("EMPLOYEE", "MANAGER")
//				.build();
//		UserDetails susan = User.builder().username("susan").password("{noop}test123")
//				.roles("EMPLOYEE", "MANAGER", "ADMIN").build();
//
//		return new InMemoryUserDetailsManager(john, mery, susan);
//	}
////
////	@Bean
////	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
////
////		http.authorizeHttpRequests(configurer -> configurer.anyRequest().authenticated())
////				.formLogin(form -> form.loginPage("/employees/showMyLoginPage").loginProcessingUrl("/authenticateTheUser").permitAll());
////		
////		return http.build();
////	}
//
//}
