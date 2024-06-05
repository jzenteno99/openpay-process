package com.openpay.process.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
@EnableWebSecurity
public class SecurityConfig {

	@Bean
	public SecurityFilterChain securityFilterChain (HttpSecurity http) throws Exception  {
		
		http
		.authorizeHttpRequests(request -> 
			request.requestMatchers("/h2-console/**")
				.permitAll()
				.requestMatchers("/marvel/services/**")
				.authenticated()
			)
			.httpBasic(Customizer.withDefaults())
			.csrf(csrf -> csrf.ignoringRequestMatchers("/h2-console/**"))
		;
		
	return http.build();
	
	}
	
	@Bean
	public UserDetailsService userDetailsService(PasswordEncoder passwordEncoder) {
		User.UserBuilder user = User.builder();
		UserDetails user1 = user.username("jonathan")
				.password(passwordEncoder.encode("999"))
				.roles()
				.build();

		return new InMemoryUserDetailsManager(user1);
		
	}		
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		
		return new BCryptPasswordEncoder();
	}

	@Bean
    public WebSecurityCustomizer webSecurityCustomizer() {
        return (web) -> web.ignoring().requestMatchers("/h2-console/**");
    }
}
