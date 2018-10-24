package com.food.springBootWithElasticsearch.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "fooditems", type = "search")
@Entity
@Table(name = "fooditems")
public class Fooditems {

	@Id
	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private String id;
	
	@Column(name = "name")
    private String name;
	
	@Column(name = "region")
    private String region;
	
	@Column(name = "mealtype")
    private String mealtype;
    
    public Fooditems(){
    	
    }

	public Fooditems(String id, String name, String region, String mealtype) {
		this.id = id;
		this.name = name;
		this.region = region;
		this.mealtype = mealtype;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getMealtype() {
		return mealtype;
	}

	public void setMealtype(String mealtype) {
		this.mealtype = mealtype;
	}

	@Override
	public String toString() {
		return "Fooditems [id=" + id + ", name=" + name + ", region=" + region + ", mealtype=" + mealtype + "]";
	}

}
