package com.purchase.home.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.purchase.home.model.Items;

@Service
public interface HomeService {

	public List<Items> getAllItems();
} 
