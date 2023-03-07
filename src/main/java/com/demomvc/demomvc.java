package com.demomvc;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/demo")
public class demomvc {

	@GetMapping("/dd1")
	public ResponseEntity<String> n1(){
		
		
		String st1 ="---- welcome spring jenkins mvc project -----";
		
		return new ResponseEntity<String>(st1,HttpStatus.OK);

	}
	
	@GetMapping("/dd2")
	public ResponseEntity<String> n2() {
		
		String st ="start mvc project";
		
		return new ResponseEntity<String> (st,HttpStatus.OK) ;
		
	}
	
	

}
