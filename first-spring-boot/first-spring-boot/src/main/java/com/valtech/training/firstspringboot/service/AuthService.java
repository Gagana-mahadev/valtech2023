package com.valtech.training.firstspringboot.service;

import org.springframework.security.core.userdetails.User;


import com.valtech.training.firstspringboot.model.ChangePasswordModel;
import com.valtech.training.firstspringboot.model.RegisterUserModel;

public interface AuthService {

	com.valtech.training.firstspringboot.entities.User createUser(RegisterUserModel regUserModel);
	 
	boolean changePassword(ChangePasswordModel passwordModel);
 
	void upgradeUserToAdmin(long id);
 
	void enableUser(long id);
 
	void disableUser(long id);
}