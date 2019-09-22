package com.distillery.foodtrucks;

public class FoodTruck {

	// F I E L D S
	private static int foodTruckID = 0;
	private int nextFoodTruckID;
	private String name;
	private String foodType;
	private double rating;

	// C O N S T R U C T O R S
	public FoodTruck() {

	}

	public FoodTruck(String name, String foodType, double rating) {

		this.name = name;
		this.foodType = foodType;
		this.rating = rating;
		foodTruckID++;
		nextFoodTruckID = foodTruckID;
	}

	// M E T H O D S
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;

	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Food truck name: ");
		builder.append(name);
		builder.append("   Food type offered: ");
		builder.append(foodType);
		builder.append("   Food truck rating: ");
		builder.append(rating);
		builder.append("   Food truck ID: ");
		builder.append(nextFoodTruckID);

		return builder.toString();
	}

}
