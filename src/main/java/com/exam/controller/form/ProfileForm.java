package com.exam.controller.form;

import java.util.List;

import com.exam.model.Profile;

public class ProfileForm {

    private Profile profile;
    private List<Profile> rows;

    public Profile getProfile() {
	return profile;
    }

    public void setProfile(Profile profile) {
	this.profile = profile;
    }

    public List<Profile> getRows() {
	return rows;
    }

    public void setRows(List<Profile> listUser) {
	this.rows = listUser;
    }
}
