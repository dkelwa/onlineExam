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

import com.exam.controller.form.UserForm;
import com.exam.model.User;
import com.exam.service.UserService;

@Controller
public class UserController {

    private static final Logger logger = LoggerFactory
	    .getLogger(UserController.class);

    @Autowired
    UserService userService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView showForm1(@ModelAttribute("userForm") UserForm userForm) {
	ModelAndView mav = new ModelAndView("user");
	if (userForm == null) {
	    userForm = new UserForm();
	}
	mav.addObject("userForm", userForm);
	return mav;
    }

    @RequestMapping(value = "/show_user", method = RequestMethod.GET)
    public ModelAndView showForm(@ModelAttribute("userForm") UserForm userForm) {
	ModelAndView mav = new ModelAndView("user");
	if (userForm == null) {
	    userForm = new UserForm();
	}
	mav.addObject("userForm", userForm);
	return mav;
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public String login(@ModelAttribute("userForm") final UserForm userForm) {
	System.out.println(userForm.getUser());
	User user = userService.login(userForm.getUser());
	System.out.println("Result : " + user);
	return "user";
    }
}
