package com.gopi.restapp.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Sales")
public class Sales {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customerId;

	@Column
	private String customerName;

	@Column
	private String customerAddress;

	@Column
	private String date;

	@Column
	private String time;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Furniture")
	private Furniture furniture;

	public Sales() {
		super();
	}

	public Sales(int customerId, String customerName, String customerAddress, String date, String time,
			Furniture furniture) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.date = date;
		this.time = time;
		this.furniture = furniture;
	}

	public int getCustomerId() {
		return customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public String getDate() {
		return date;
	}

	public String getTime() {
		return time;
	}

	public Furniture getFurniture() {
		return furniture;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public void setFurniture(Furniture furniture) {
		this.furniture = furniture;
	}

	@Override
	public String toString() {
		return "Sales [customerId=" + customerId + ", customerName=" + customerName + ", customerAddress="
				+ customerAddress + ", date=" + date + ", time=" + time + ", furniture=" + furniture + "]";
	}

}
