package com.exam.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class User implements Serializable {
    private Integer userId;
    private String email;
    private String password;

    public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getEmail() {
	return email;
    }

    public void setEmail(String email) {
	this.email = email;
    }

    public String getPassword() {
	return password;
    }

    public void setPassword(String password) {
	this.password = password;
    }

	@Override
	public String toString() {
		return "User [userId=" + userId + ", email=" + email + ", password="
				+ password + "]";
	}
}
