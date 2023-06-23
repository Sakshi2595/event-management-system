package com.stackroute.eventmanagement.authentication.service;

import com.stackroute.eventmanagement.authentication.exception.UserAlreadyExistsException;
import com.stackroute.eventmanagement.authentication.exception.UserNotFoundException;
import com.stackroute.eventmanagement.authentication.model.UserModel;

import java.util.List;


public interface UserService {
    UserModel register(UserModel user) throws UserAlreadyExistsException;
    UserModel login(UserModel user) throws UserNotFoundException;

    List<UserModel> getAllUser();

}
