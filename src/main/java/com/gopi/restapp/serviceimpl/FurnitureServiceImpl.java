package com.gopi.restapp.serviceimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gopi.restapp.model.Furniture;
import com.gopi.restapp.repository.FurnitureRepo;
import com.gopi.restapp.service.FurnitureService;

@Service
public class FurnitureServiceImpl implements FurnitureService {

	FurnitureRepo repo;

	public FurnitureServiceImpl(FurnitureRepo repo) {
		super();
		this.repo = repo;
	}

	@Override
	public Furniture getFurniture(int stationId) {
		return repo.findById(stationId);
	}

	@Override
	public List<Furniture> getAllFurnitures() {
		return repo.findAll();
	}

	@Override
	public void updateFurniture(Furniture furniture) {
		repo.update(furniture);

	}

	@Override
	public List<Integer> getFurnitureIds() {
		return repo.fetchId();
	}

	@Override
	public void addFurniture(Furniture furniture) {
		repo.save(furniture);
	}

	@Override
	public void deleteFurniture(int id) {
		repo.deleteById(id);
	}
}
