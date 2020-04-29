package com.youcef.blog;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView personForm() {
	
		
		return new ModelAndView("personform","command",new Person());
	}
	
	@RequestMapping(value = "/addperson", method = RequestMethod.POST)
	public ModelAndView addperson(@ModelAttribute("p")Person p) {
	
		System.out.println(p.getId()+" "+p.getName()+" "+p.getAge()+" "+p.getAge()+" "+p.getAddress());
		
		return new ModelAndView("redirect:/viewperson");
	}
}
