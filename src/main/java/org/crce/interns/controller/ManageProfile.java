package org.crce.interns.controller;

import org.crce.interns.beans.ProfileBean;
import org.crce.interns.service.ManageProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ManageProfile {
	
	@Autowired
	private ManageProfileService manageProfileService;
	
	@RequestMapping("/")
	public ModelAndView welcome() {
				return new ModelAndView("index");
	}
	
	
	@RequestMapping(value = "/saveProfile", method = RequestMethod.POST)
	public ModelAndView addProfile(@ModelAttribute("profileBean")ProfileBean profileBean,BindingResult result) {
		manageProfileService.addProfile(profileBean);
		return new ModelAndView("index");
	}
	

	@RequestMapping(value = "/addProfile", method = RequestMethod.GET)
	public ModelAndView createProfile(Model model) {
		 ProfileBean profileBean = new ProfileBean(); // declaring

         model.addAttribute("profileBean", profileBean); // adding in model

		return new ModelAndView("addProfile");
	}


}
