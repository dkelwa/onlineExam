package com.exam.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.dao.ProfileDAO;
import com.exam.model.Profile;
import com.exam.service.ProfileService;

@Service
public class ProfileServiceImpl implements ProfileService {

    @Autowired
    ProfileDAO profileDAO;

    @Override
    public void save(Profile profile) {
	profileDAO.save(profile);
    }
}
