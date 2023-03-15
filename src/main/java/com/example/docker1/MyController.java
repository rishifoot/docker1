package com.example.docker1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
@GetMapping("/fetch")	
public String getAnswer() {
		return "Rishikesh";
	}

}
