package practicals;
import java.util.ArrayList;
public class House {
	String street;
	int number;
	Residents resident;
	static ArrayList<House> Houses = new ArrayList<House>();
	
	House(String street, int number, Residents resident){
		this.street = street;
		this.number = number;
		this.resident = resident;
		Houses.add(this);
	}
	
	
	
}
