package practicals;

public class HouseMain {
	
	
	public static void main(String[] args) {
		new HousePractical("Riga", "Kr. Barona", 57, 456800);
		new HousePractical("Riga", "Brivibas", 85, 864000);
		new HousePractical("Riga", "Olgas", 16, 346000);
		new HousePractical("Riga", "Tallinas", 95, 857000);
		new HousePractical("Riga", "Gertrudes", 46, 284000);
		new HousePractical("Riga", "Krisjana Valdemara", 175, 265000);
		new HousePractical("Riga", "Stabu", 34, 953000);
		new HousePractical("Riga", "Olgas", 27, 284000);
		
		HousePractical.houseStreetCount("Olgas");
		HousePractical.mostExpensive();
		HousePractical.doesThisHouseExistString("Riga, Olgas street 16"); // exists
		HousePractical.doesThisHouseExistString("Riga, Olgas street 15"); // doesn't exist

	}

}
