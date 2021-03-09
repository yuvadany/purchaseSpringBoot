package com.purchase.home.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.purchase.home.model.Items;

@RestController
@RequestMapping("/v1/purchase")
public class HomeController {
	@Autowired
	private Items itemsModel;

	@GetMapping
	public String welcome() {
		return "Welcome";

	}

	@GetMapping("/all")
	public Items getAllItems() {
		return itemsModel;

	}

}
