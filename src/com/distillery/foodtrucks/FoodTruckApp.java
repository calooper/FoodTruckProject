package com.distillery.foodtrucks;

import java.util.Scanner;

public class FoodTruckApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		FoodTruckApp fta = new FoodTruckApp();
		fta.launch(scanner);
		scanner.close();

	}

	private void launch(Scanner scanner) {

		FoodTruck ftArr[];
		FoodTruck ft;
		int foodTrucksEntered = 0;
		boolean hasValues = true;

		System.out.println("Welcome to the food truck rating app!! ");
		System.out.println("How many food trucks do you want to rate? 1 - 5 ");

		int numOfRatings = scanner.nextInt();
		scanner.nextLine();

		ftArr = new FoodTruck[numOfRatings]; // allocating appropriate memory spaces to

		if (!(numOfRatings > 0) || !(numOfRatings <= 5)) {
			System.out.println("Please start over and enter a number between 1 and 5 ");
		} else {

			for (int i = 0; i < numOfRatings; i++) {

				System.out.println(
						"Please enter the name of food truck: " + (i + 1) + " (enter \"quit\" to end the app) ");
				String truckName = scanner.nextLine();

				if (!truckName.equalsIgnoreCase("quit")) {

					System.out.println("What type of food does it offer? ");
					String foodType = scanner.nextLine();

					System.out.println("How would you rate this truck? ( 1 - 5 ) ");
					double truckRating = scanner.nextDouble();
					scanner.nextLine();

					ft = new FoodTruck(truckName, foodType, truckRating);

					ftArr[i] = ft;

					foodTrucksEntered++;

				} else {

					if (i < 1) {
						hasValues = false;
						System.out.println("Thanks for using the food truck app ");
						break;
					} else
						break;

				}

			}

			if (hasValues == true) {
				menu(foodTrucksEntered, scanner, ftArr);
			}

		}

	}

	private void menu(int foodTrucksEntered, Scanner scanner, FoodTruck[] ftArr) {

		boolean keepGoing = true;

		while (keepGoing) {
			System.out.println("-----------------------------------------");
			System.out.println("Please select a choice number to display resulst");
			System.out.println(" 1. Average Rating of all food trucks entered");
			System.out.println(" 2. Highest rated food truck ");
			System.out.println(" 3. List of all food trucks ");
			System.out.println(" 4. Quit ");
			System.out.println("-----------------------------------------");
			int menuNum = scanner.nextInt();

			switch (menuNum) {
			case 1:
				Double rating = ((AverageRating(ftArr, foodTrucksEntered)) / (foodTrucksEntered));
				System.out.println("Average user rating for " + foodTrucksEntered + " truck(s) is: " + rating);
				System.out.println();
				break;
			case 2:
				int highestRatedTruck = highestRating(ftArr, foodTrucksEntered);
				System.out.println("---------------------Highest Rated Food Truck--------------------------");
				System.out.println(ftArr[highestRatedTruck].toString());
				System.out.println();
				break;
			case 3:
				String allTheTrucks = AllTrucksEntered(ftArr, foodTrucksEntered);
				System.out.println("List of all the trucks entered:  " + allTheTrucks);
				System.out.println();
				break;
			case 4:
				System.out.println("Thanks for using the food truck app. Goodbye!  ");
				keepGoing = false;
				break;

			default:
				System.out.println("That is not a menu choice. Please try again");
				break;

			}

		}

	}

	private Double AverageRating(FoodTruck[] ftArr, int foodTrucksEntered) {
		double sumFoodRating = 0;

		for (int i = 0; i < foodTrucksEntered; i++) {
			sumFoodRating += ftArr[i].getRating();

		}
		return sumFoodRating;

	}

	private int highestRating(FoodTruck[] ftArr, int foodTrucksEntered) {

		double max = 0;
		int highestRatedFoodTruckArrayNumber = 0;

		for (int i = 0; i < foodTrucksEntered; i++) {
			if (ftArr[i].getRating() > max) {
				max = ftArr[i].getRating();
				highestRatedFoodTruckArrayNumber = i;

			}

		}
		return highestRatedFoodTruckArrayNumber;

	}

	private String AllTrucksEntered(FoodTruck[] ftArr, int foodTrucksEntered) {
		String allTheTrucks = "";
		String allTheTrucksCommas = "";

		for (int i = 0; i < foodTrucksEntered; i++) {
			allTheTrucks = ftArr[i].getName();

			if (i < (foodTrucksEntered - 2)) {
				allTheTrucksCommas += allTheTrucks + ", ";
			} else if (i == (foodTrucksEntered - 2)) {
				allTheTrucksCommas += allTheTrucks + ", & ";
			} else
				allTheTrucksCommas += allTheTrucks + " ";

		}
		return allTheTrucksCommas;

	}
}
