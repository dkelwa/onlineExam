package com.exam.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.exam.controller.form.ProfileForm;
import com.exam.service.ProfileService;

@Controller
public class ProfileController {

    private static final Logger logger = LoggerFactory
	    .getLogger(ProfileController.class);

    @Autowired
    ProfileService profileService;

    @RequestMapping(value = "/show_profile", method = RequestMethod.GET)
    public ModelAndView showProfile(
	    @ModelAttribute("profileForm") ProfileForm profileForm) {
	ModelAndView mav = new ModelAndView("profile");
	if (profileForm == null) {
	    profileForm = new ProfileForm();
	}
	mav.addObject("profileForm", profileForm);
	return mav;
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @ResponseBody
    public String save(@ModelAttribute("profileForm") ProfileForm profileForm) {
	System.out.println("Controller Input - ");
	profileService.save(profileForm.getProfile());
	return "user";
    }
}
