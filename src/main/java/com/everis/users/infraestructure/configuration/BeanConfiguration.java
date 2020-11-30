package com.everis.users.infraestructure.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.everis.users.domain.repository.UserRepository;
import com.everis.users.domain.service.DomainUserService;
import com.everis.users.domain.service.UserService;

@Configuration
@ComponentScan("com.everis.users")
public class BeanConfiguration {
	
	@Bean
	UserService userService(final UserRepository userRepository) {
		return new DomainUserService(userRepository);
	}
	
	 

}
