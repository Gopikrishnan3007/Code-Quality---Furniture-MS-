package com.gopi.restapp.service;

import java.util.List;

import com.gopi.restapp.model.Sales;

public interface SalesService {
	public void addSales(Sales sales);

	Sales getSales(int id);

	List<Sales> getAllSales();

	void updateSales(Sales sales);

	void deleteSales(int id);
}
