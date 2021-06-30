package com.purchase.home.controler;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.purchase.home.advice.ItemNotFoundException;
import com.purchase.home.model.Items;
import com.purchase.home.service.HomeService;

@RestController
//@CrossOrigin(origins = "http://localhost:4200")
//@CrossOrigin
@RequestMapping("/v1/purchase")
public class HomeController {
	private static Logger logger = LoggerFactory.getLogger(HomeController.class);
	@Autowired
	private HomeService homeService;

	@GetMapping
	public ResponseEntity<String> welcome() {
		String greetings = "Welcome...";
		HttpHeaders headers = new HttpHeaders();
		headers.add("content", "welcome");
		logger.info("welcome()");
		return ResponseEntity.status(HttpStatus.OK).headers(headers).body(greetings);

	}

	@GetMapping("/all")
	public ResponseEntity<List<Items>> getAllItems() {
		logger.info("getAllItems()");
		HttpHeaders headers = new HttpHeaders();
		headers.add("type", "get All Items");
		var lists = homeService.getAllItems();
		return ResponseEntity.status(HttpStatus.OK).headers(headers).body(lists);

	}

	@GetMapping("/item/{id}")
	public ResponseEntity<Optional<Items>> getItemById(@PathVariable int id) {
		logger.info("getItemById()");
		var items = homeService.findById(id);
		HttpHeaders headers = new HttpHeaders();
		headers.add("type", "get item by id");
		if (items.isPresent())
			return ResponseEntity.status(HttpStatus.OK).headers(headers).body(items);
		else
			throw new ItemNotFoundException(id);

	}

	@GetMapping("/{person_id}")
	public ResponseEntity<List<Items>> getItemByPerson(@PathVariable int person_id) {
		logger.info("getItemByPerson(@PathVariable int person_id) ");
		var item = homeService.findByPerson(person_id);
		HttpHeaders headers = new HttpHeaders();
		headers.add("type", "get item by id");
		if (!item.isEmpty())
			return ResponseEntity.status(HttpStatus.OK).headers(headers).body(item);
		else
			throw new ItemNotFoundException(person_id);
	}

	/*
	 * @PostMapping(path = "/addItem", consumes = "application/json") public
	 * List<Items> addItem(@RequestBody Items item) {
	 * logger.info("addItem(@RequestBody Items item) "); return
	 * homeService.addItem(item);
	 * 
	 * }
	 */

	@PostMapping(path = "/addItem", consumes = "application/json")
	public ResponseEntity<List<Items>> addItem(@RequestBody Items item) {
		logger.info("addItem(@RequestBody Items item) ");
		var items = homeService.addItem(item);
		HttpHeaders headers = new HttpHeaders();
		headers.add("type", "adding Item");
		return ResponseEntity.status(HttpStatus.CREATED).headers(headers).body(items);

	}

	@PostMapping(path = "/updateStatus", consumes = "application/json")
	public ResponseEntity<Items> updateStatus(@RequestBody Items item) {
		logger.info(" updateStatus(@RequestBody Items item) ) ");
		HttpHeaders headers = new HttpHeaders();
		headers.add("type", "updating Item");
		var items = homeService.updateStatus(item);
		return ResponseEntity.status(HttpStatus.CREATED).headers(headers).body(items);
	}

	@DeleteMapping(path = "/deleteItem", consumes = "application/json")
	public ResponseEntity<List<Items>> deleteItem(@RequestBody Items item) {
		logger.info(" deleteItem(@RequestBody Items item) ");
		HttpHeaders headers = new HttpHeaders();
		headers.add("type", "updating Item");
		var items = homeService.deleteItem(item);
		return ResponseEntity.status(HttpStatus.ACCEPTED).headers(headers).body(items);

	}

	@DeleteMapping(path = "/delete/{id}", consumes = "application/json")
	public ResponseEntity<List<Items>> deleteItemById(@PathVariable int id) {
		logger.info(" deleteItem(@RequestBody Items item) ");
		HttpHeaders headers = new HttpHeaders();
		headers.add("type", "updating Item");
		var items = homeService.deleteByItem(id);
		return ResponseEntity.status(HttpStatus.ACCEPTED).headers(headers).body(items);

	}

}
