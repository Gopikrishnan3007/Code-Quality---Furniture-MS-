package com.gopi.restapp.repository;

import java.util.List;

import com.gopi.restapp.model.Furniture;

public interface FurnitureRepo {

	List<Integer> fetchId();

	Furniture findById(int id);

	List<Furniture> findAll();

	void update(Furniture furniture);

	void save(Furniture furniture);

	void deleteById(int id);
}
