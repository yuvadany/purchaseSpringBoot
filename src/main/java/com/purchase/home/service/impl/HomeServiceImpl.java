package com.purchase.home.service.impl;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.purchase.home.controler.HomeController;
import com.purchase.home.model.Items;
import com.purchase.home.repo.HomeRepo;
import com.purchase.home.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService {
	private static Logger logger = LoggerFactory.getLogger(HomeServiceImpl.class);
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

	@Override
	public List<Items> deleteItem(Items item) {
		// TODO Auto-generated method stub
		homeRepo.deleteById(item.getId());
		return homeRepo.findAll();
	}

	@Override
	public List<Items> deleteByItem(int id) {
		// TODO Auto-generated method stub
		homeRepo.deleteById(id);
		return homeRepo.findAll();
	}

	@Override
	public Optional<Items> findById(int id) {
		return homeRepo.findById(id);
	}

}
