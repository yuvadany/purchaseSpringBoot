package com.purchase.home.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.purchase.home.model.Items;
import com.purchase.home.service.HomeService;

@RestController
@RequestMapping("/v1/purchase")
public class HomeController {
	
	@Autowired
	private HomeService homeService;

	@GetMapping
	public String welcome() {
		return "Welcome";

	}

	@GetMapping("/all")
	public List<Items> getAllItems() {
		return homeService.getAllItems();

	}

}
