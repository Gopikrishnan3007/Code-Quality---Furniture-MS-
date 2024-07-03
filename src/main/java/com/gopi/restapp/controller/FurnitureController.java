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

import com.gopi.restapp.model.Furniture;
import com.gopi.restapp.service.FurnitureService;

@RestController
@RequestMapping("/furniture")
@CrossOrigin("http://localhost:3000")
public class FurnitureController {

	FurnitureService service;

	public FurnitureController(FurnitureService service) {
		super();
		this.service = service;
	}

	@PostMapping
	public String insertFurniture(@RequestBody Furniture furniture) {
		String msgString = "";

		try {
			service.addFurniture(furniture);
			msgString = "Insertion Success";
		} catch (Exception e) {
			msgString = "Insertion Failure";
		}
		return msgString;
	}

	@GetMapping("{id}")
	public Furniture getFurnitureById(@PathVariable("id") int id) {
		return service.getFurniture(id);
	}

	@GetMapping("/all")
	public List<Furniture> getFurniture() {
		return service.getAllFurnitures();
	}

	@PutMapping
	public String updateFurniture(@RequestBody Furniture furniture) {
		String msgString = "";

		try {
			service.updateFurniture(furniture);
			msgString = "Updation Success";
		} catch (Exception e) {
			msgString = "Updation Failure";
		}
		return msgString;
	}

	@GetMapping("/getFurnitureid")
	public List<Integer> getFurnitureIds() {
		return service.getFurnitureIds();
	}

	@DeleteMapping("{id}")
	public String deleteFurnitureById(@PathVariable("id") int id) {
		String msgString = "";
		try {
			service.deleteFurniture(id);
			msgString = "Deletion Success";
		} catch (Exception e) {
			msgString = "Deletion Failure";
		}
		return msgString;
	}
}
