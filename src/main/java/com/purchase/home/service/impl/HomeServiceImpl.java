package com.purchase.home.service.impl;

import java.util.List;

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

}
