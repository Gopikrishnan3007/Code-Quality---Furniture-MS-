package com.gopi.restapp.service;

import java.util.List;

import com.gopi.restapp.model.Furniture;

public interface FurnitureService {
	Furniture getFurniture(int id);

	List<Furniture> getAllFurnitures();

	void updateFurniture(Furniture furniture);

	List<Integer> getFurnitureIds();

	void addFurniture(Furniture furniture);

	void deleteFurniture(int id);
}
