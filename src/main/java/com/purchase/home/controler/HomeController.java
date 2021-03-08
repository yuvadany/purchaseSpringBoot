package com.purchase.home.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/purchase")
public class HomeController {
	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome";

	}

}
