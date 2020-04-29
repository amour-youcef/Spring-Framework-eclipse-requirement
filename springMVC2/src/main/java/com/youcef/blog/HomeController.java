package com.youcef.blog;

import java.util.logging.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController {
	
//	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	
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
