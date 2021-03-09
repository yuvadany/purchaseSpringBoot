package com.purchase.home.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.purchase.home.model.Items;

@Repository
public interface HomeRepo extends JpaRepository<Items, Integer> {

}
