package com.purchase.home.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.purchase.home.model.Items;

@Service
public interface HomeService {

	public Optional<Items> findById(int id);

	public List<Items> getAllItems();

	public List<Items> findByPerson(int person_id);

	public List<Items> addItem(Items item);

	public Items updateStatus(Items item);

	public List<Items> deleteItem(Items item);

	public List<Items> deleteByItem(int id);
}
