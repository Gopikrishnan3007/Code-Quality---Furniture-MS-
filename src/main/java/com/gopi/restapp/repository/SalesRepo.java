package com.gopi.restapp.repository;

import java.util.List;

import com.gopi.restapp.model.Sales;

public interface SalesRepo {
	public void save(Sales sales);

	Sales findById(int id);

	List<Sales> findAll();

	void update(Sales sales);

	void deleteById(int id);
}
