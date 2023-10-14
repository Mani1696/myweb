package com.example.MyWeb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


	@RestController
	public class MyController {
		@Autowired
		@GetMapping(value="/Get")
		public String get() {
			return "Hellow World";
		}

	}



