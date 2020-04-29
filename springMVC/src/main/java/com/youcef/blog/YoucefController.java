package com.youcef.blog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class YoucefController {
	
	@RequestMapping("/index2")
	public ModelAndView youcef() {
		String msg ="amour it zerrouk youssouf";
		return new ModelAndView("index2","msg",msg);
	}
}
