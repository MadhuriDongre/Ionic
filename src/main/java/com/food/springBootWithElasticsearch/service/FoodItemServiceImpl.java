package com.food.springBootWithElasticsearch.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.food.springBootWithElasticsearch.model.Fooditems;
import com.food.springBootWithElasticsearch.repository.FoodItemRepository;
import com.food.springBootWithPostgresql.repository.FoodItemRepositoryWithPostgres;

@Service
public class FoodItemServiceImpl implements FoodItemService{
	
	@Autowired
	private FoodItemRepository repository;
	
	@Autowired
	private FoodItemRepositoryWithPostgres repo;
	
	public Optional<Fooditems> findOne(String id) {
		return repository.findById(id);
	
	}

	public Iterable<Fooditems> findAll() {
		return repo.findAll();
		
	}

	public List<Fooditems> findByName(String name) {
		return repository.findByName(name);
	}

}
