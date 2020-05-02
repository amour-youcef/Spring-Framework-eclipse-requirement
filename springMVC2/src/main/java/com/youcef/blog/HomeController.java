package com.youcef.blog;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping(value ="/", method = RequestMethod.GET)
	public ModelAndView personForm() {
		return new ModelAndView("personform","command",new Person());
	}
	
	@RequestMapping(value="/addperson", method = RequestMethod.POST)
	public ModelAndView addperson(@ModelAttribute("p")Person p) {
		System.out.println(p.getId()+" "+p.getName()+" "+p.getAge()+" "+p.getAge()+" "+p.getAddress());
		return new ModelAndView("redirect:/viewperson");
	}
	@RequestMapping("/viewperson")
	public ModelAndView viewemp() {
		 
		List<Person> list = new ArrayList<Person>();
		list.add(new Person(1,"mohammed",30,"iraqu"));
		list.add(new Person(2,"mohammed",30,"iraqu"));
		list.add(new Person(3,"mohammed",30,"iraqu"));
		list.add(new Person(4,"mohammed",30,"iraqu"));
		list.add(new Person(5,"mohammed",30,"iraqu"));
		return new ModelAndView("viewperson","list",list);
	}
}
