package com.purchase.home.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.purchase.home.model.Items;
import com.purchase.home.repo.HomeRepo;
import com.purchase.home.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService {

	@Autowired
	private HomeRepo homeRepo;

	@Override
	public List<Items> getAllItems() {
		// TODO Auto-generated method stub
		return homeRepo.findAll();
	}

	@Override
	public List<Items> findByPerson(int person_id) {
		// TODO Auto-generated method stub
		return homeRepo.findByNeedFor(person_id);
	}

	@Override
	public List<Items> addItem(Items item) {
		// TODO Auto-generated method stub
		homeRepo.save(item);
		return homeRepo.findAll();
	}

	@Override
	public Items updateStatus(Items item) {
		// TODO Auto-generated method stub
		homeRepo.save(item);
		Optional<Items> items = homeRepo.findById(item.getId());
		return items.get();
	}

}
