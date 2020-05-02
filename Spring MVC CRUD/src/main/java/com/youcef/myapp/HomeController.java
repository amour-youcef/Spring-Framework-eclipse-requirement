package com.youcef.myapp;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@Autowired 
	Databaseinfo di;
	
	@RequestMapping("/")
	public ModelAndView personForm() {
		return new ModelAndView("home","command",new Person());
	}
	
	@RequestMapping(value="/addperson")
	public ModelAndView showform() {
		return new ModelAndView("addperson","command",new Person());
	}
	
	@RequestMapping(value="/save",method = RequestMethod.POST)
	public ModelAndView save(@ModelAttribute("p") Person p) {
		di.insertPerson(p);
		return new ModelAndView("redirect:/viewperson");
	}
	
	
	@RequestMapping("/viewperson")
	public ModelAndView viewemp() {
		 
		List<Person> list = di.viewAll();

		return new ModelAndView("viewperson","list",list);
	}
}