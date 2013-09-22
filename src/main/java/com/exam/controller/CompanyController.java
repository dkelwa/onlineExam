package com.exam.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.exam.controller.form.CompanyForm;

@Controller
public class CompanyController {

    private static final Logger logger = LoggerFactory
	    .getLogger(CompanyController.class);

    @RequestMapping(value = "/show_company_form", method = RequestMethod.GET)
    public ModelAndView showForm(
	    @ModelAttribute("companyForm") CompanyForm companyForm) {
	ModelAndView mav = new ModelAndView("company-form");
	if (companyForm == null) {
	    companyForm = new CompanyForm();
	}
	mav.addObject("companyForm", companyForm);
	return mav;
    }

}
