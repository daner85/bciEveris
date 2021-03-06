package com.everis.users

import javax.validation.constraints.NotNull

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.context.TestConfiguration
import org.springframework.boot.test.mock.mockito.SpyBean
import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.stereotype.Component

import com.everis.users.domain.Phones
import com.everis.users.domain.Token
import com.everis.users.domain.User
import com.everis.users.domain.UserResponse
import com.everis.users.domain.repository.UserRepository
import com.everis.users.domain.service.DomainUserService
import com.everis.users.domain.service.UserService
import com.everis.users.infraestructure.HibernateUserRepository
import com.fasterxml.jackson.annotation.JsonProperty

import spock.lang.Shared
import spock.lang.Specification
import spock.mock.DetachedMockFactory

@SpringBootTest
class TokenTest extends Specification {
	
	
	void 'UserRepository injection'() {
		given: 'a Repository injection'
//
		def token = new Token()
		when: ''
		
		then: 'Service injection ok'
		token!=null
	}
  
	
}