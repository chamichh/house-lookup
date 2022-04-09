package practicals;

import java.util.ArrayList;

public class HousePractical {
	String city;
	String street;
	int number;
	int price;
	HouseMain housemain;

	static ArrayList<HousePractical> allHouses = new ArrayList<HousePractical>();

	HousePractical(String city, String street, int number, int price) {
		this.city = city;
		this.street = street;
		this.number = number;
		this.price = price;
		allHouses.add(this); // TODO

	}

	static void houseStreetCount(String streetName) {
		int temp = 0;
		for (HousePractical i : allHouses) {
			if (i.street.equals(streetName)) {
				temp++;
			}
		}
		System.out.println("House count on this street is: " + temp);
	}

	static void mostExpensive() {
		int mostExp = 0;
		for (HousePractical p : allHouses) {
			if (p.price > mostExp) {
				mostExp = p.price;
			}
		}
		System.out.println("The most expensive house is with the price: " + mostExp);
	}
	static void doesThisHouseExistString(String inputAddress) {
		boolean addressFound = false;
		for (HousePractical a : allHouses) {
			String address = a.city + ", " + a.street + " street " + a.number;
			if (inputAddress.equals(address)) {
				addressFound = true;
			}
		}
		if (addressFound == true) {
			System.out.println("This house "+inputAddress+" exists!");
		} else {
			System.out.println("This house "+inputAddress+" doesn't exist :(");
		}

	}
}