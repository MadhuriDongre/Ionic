package com.food.springBootWithPostgresql.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.food.springBootWithElasticsearch.model.Fooditems;

@Repository
public interface FoodItemRepositoryWithPostgres extends JpaRepository<Fooditems, String> {

	List<Fooditems> findByName(String name);
}
