package com.demomvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class demomvc {

	@GetMapping("/welcome123")
	public ModelAndView name(){
		
		
		String aa="---------------- welcome spring mvc project page ---------";
		
		ModelAndView n=new ModelAndView();
		n.addObject("AA", aa);
		n.setViewName("demofile");
		
		return n;

	}

}
