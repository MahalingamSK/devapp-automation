/**
 * 
 */
package com.sample.devops.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 */
@RestController
@RequestMapping("/api/v1")
public class DurgaController {
	
	@GetMapping("/durga")
	public String java() {
		return "Spring boot CI CD";
	}

}
