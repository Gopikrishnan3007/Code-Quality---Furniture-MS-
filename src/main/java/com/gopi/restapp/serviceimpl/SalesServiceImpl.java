package com.gopi.restapp.serviceimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gopi.restapp.model.Sales;
import com.gopi.restapp.repository.SalesRepo;
import com.gopi.restapp.service.SalesService;

@Service
public class SalesServiceImpl implements SalesService {

	SalesRepo repo;

	public SalesServiceImpl(SalesRepo repo) {
		super();
		this.repo = repo;
	}

	@Override
	public void addSales(Sales sales) {
		repo.save(sales);
	}

	@Override
	public Sales getSales(int id) {
		return repo.findById(id);
	}

	@Override
	public List<Sales> getAllSales() {
		return repo.findAll();
	}

	@Override
	public void updateSales(Sales sales) {
		repo.update(sales);

	}

	@Override
	public void deleteSales(int id) {
		repo.deleteById(id);
	}
}
