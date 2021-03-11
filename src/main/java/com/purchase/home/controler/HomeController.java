package com.purchase.home.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.purchase.home.model.Items;
import com.purchase.home.service.HomeService;

@RestController
//@CrossOrigin(origins = "http://localhost:4200")
@CrossOrigin
@RequestMapping("/v1/purchase")
public class HomeController {

	@Autowired
	private HomeService homeService;

	@GetMapping
	public String welcome() {
		return "Welcome...";

	}

	@GetMapping("/all")
	public List<Items> getAllItems() {
		return homeService.getAllItems();

	}

	@GetMapping("/{person_id}")
	public List<Items> getItemByPerson(@PathVariable int person_id) {
		return homeService.findByPerson(person_id);

	}

	@PostMapping(path = "/addItem", consumes = "application/json")
	public List<Items> addItem(@RequestBody Items item) {
		return homeService.addItem(item);

	}

	@PostMapping(path = "/updateStatus", consumes = "application/json")
	public Items updateStatus(@RequestBody Items item) {
		return homeService.updateStatus(item);

	}

	@DeleteMapping(path = "/deleteItem", consumes = "application/json")
	public List<Items> deleteItem(@RequestBody Items item) {
		return homeService.deleteItem(item);

	}

}
