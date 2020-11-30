package com.everis.users.domain.repository;

import com.everis.users.domain.User;
import com.everis.users.domain.UserResponse;
import com.everis.users.infraestructure.UserEntity;

public interface UserRepository {
	
	UserResponse createUser(User user);
	
	UserEntity findByEmail(String mail);

}
