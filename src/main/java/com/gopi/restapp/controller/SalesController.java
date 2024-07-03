package com.gopi.restapp.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gopi.restapp.model.Sales;
import com.gopi.restapp.service.SalesService;

@RestController
@RequestMapping("/sales")
@CrossOrigin("http://localhost:3000")
public class SalesController {

	SalesService service;

	public SalesController(SalesService service) {
		super();
		this.service = service;
	}

	@PostMapping
	public String insertSales(@RequestBody Sales sales) {
		String msgString = "";

		try {
			service.addSales(sales);
			msgString = "Insertion Success";
		} catch (Exception e) {
			msgString = "InsertionFailure";
		}
		return msgString;
	}

	@GetMapping("{id}")
	public Sales getSalesById(@PathVariable("id") int id) {
		return service.getSales(id);
	}

	@GetMapping("/all")
	public List<Sales> getSales() {
		return service.getAllSales();
	}

	@PutMapping
	public String updateSales(@RequestBody Sales sales) {
		String msgString = "";

		try {
			service.updateSales(sales);
			msgString = "Updation Success";
		} catch (Exception e) {
			msgString = "Updation Failure";
		}
		return msgString;
	}

	@DeleteMapping("{id}")
	public String deleteSalesById(@PathVariable("id") int id) {
		String msgString = "";
		try {
			service.deleteSales(id);
			msgString = "Deletion Success";
		} catch (Exception e) {
			msgString = "Deletion Failure";
		}
		return msgString;
	}
}
