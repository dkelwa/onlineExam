package com.exam.controller.form;

import java.util.List;

import com.exam.model.User;

public class UserForm {

    private User user;
    private List<User> rows;

    public User getUser() {
	return user;
    }

    public void setUser(User user) {
	this.user = user;
    }

    public List<User> getRows() {
	return rows;
    }

    public void setRows(List<User> listUser) {
	this.rows = listUser;
    }
}
