package com.everis.users.domain.service;

import com.everis.users.application.exceptions.MailFoundException;
import com.everis.users.domain.User;
import com.everis.users.domain.UserResponse;

public interface UserService {
	
	UserResponse createUser(User user) throws MailFoundException;

}
