package com.exam.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.dao.UserDAO;
import com.exam.model.User;
import com.exam.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDAO userDAO;

    @Override
    public User login(User user) {
	return userDAO.login(user);
    }

}
