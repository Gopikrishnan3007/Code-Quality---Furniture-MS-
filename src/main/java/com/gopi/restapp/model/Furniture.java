package com.gopi.restapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Furniture")
public class Furniture {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int furnitureId;

	@Column
	private String furnitureName;

	@Column
	private String furnitureAmount;

	@Column
	private int furnitureCount;

	public Furniture() {
		super();
	}

	public Furniture(int furnitureId, String furnitureName, String furnitureAmount, int furnitureCount) {
		super();
		this.furnitureId = furnitureId;
		this.furnitureName = furnitureName;
		this.furnitureAmount = furnitureAmount;
		this.furnitureCount = furnitureCount;
	}

	public int getFurnitureId() {
		return furnitureId;
	}

	public String getFurnitureName() {
		return furnitureName;
	}

	public String getFurnitureAmount() {
		return furnitureAmount;
	}

	public int getFurnitureCount() {
		return furnitureCount;
	}

	public void setFurnitureId(int furnitureId) {
		this.furnitureId = furnitureId;
	}

	public void setFurnitureName(String furnitureName) {
		this.furnitureName = furnitureName;
	}

	public void setFurnitureAmount(String furnitureAmount) {
		this.furnitureAmount = furnitureAmount;
	}

	public void setFurnitureCount(int furnitureCount) {
		this.furnitureCount = furnitureCount;
	}

	@Override
	public String toString() {
		return "Furniture [furnitureId=" + furnitureId + ", furnitureName=" + furnitureName + ", furnitureAmount="
				+ furnitureAmount + ", furnitureCount=" + furnitureCount + "]";
	}

}
