package com.cdac.lelogaadi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="cars")
public class Car {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name="make")
	private String make;

	@Column(name="model")
	private String model;

	@Column(name="year")
	private int year;

	@Column(name="price")
	private double price;

	@Column(name="description", columnDefinition = "TEXT")
	private String description;

	@Column(name="image")
	private String image;

	@Column(name="is_sold")
	private boolean isSold;

	@Column(name="is_featured")
	private boolean isFeatured;

	@Column(name="distance_travelled")
	private int distanceTravelled;

	@Column(name="fuel_type")
	private String fuelType;

	@Column(name="transmission")
	private String transmission;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	private User user;

	public Car() {

	}

	public Car(String make, String model, int year, double price, String description, String image, boolean isSold,
			   boolean isFeatured, int distanceTravelled, String fuelType, String transmission) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
		this.description = description;
		this.image = image;
		this.isSold = isSold;
		this.isFeatured = isFeatured;
		this.distanceTravelled = distanceTravelled;
		this.fuelType = fuelType;
		this.transmission = transmission;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public boolean isSold() {
		return isSold;
	}

	public void setSold(boolean isSold) {
		this.isSold = isSold;
	}

	public boolean isFeatured() {
		return isFeatured;
	}

	public void setFeatured(boolean isFeatured) {
		this.isFeatured = isFeatured;
	}


	public int getDistanceTravelled() {
		return distanceTravelled;
	}

	public void setDistanceTravelled(int distanceTravelled) {
		this.distanceTravelled = distanceTravelled;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public String getTransmission() {
		return transmission;
	}

	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}



}
