package emissionTest;

public class Vehicle {

	String type; //Tennis or M6
	String manufacturer; //IW or SMW
	String color; //black tennis, white m6
	//boolean isPetrol; //weather its a petrol motor, false = diesel engine
	
	public Vehicle(String type) {
		
		this.type = type;
		
		if(type.equals("Tennis")) {
			
			this.manufacturer = "IW";
			this.color = "Black";
		}
		if(type.equals("M6")) {
			
			this.manufacturer = "SMW";
			this.color = "White";
		}
		if(type.equals("Tennis-Smart")) {
			
			this.manufacturer = "IW";
			this.color = "Black";
		}
		
	}
	
	String getManufacturer() {
		
		return this.manufacturer;
	}
	
	String getColor() {
		
		return this.color;
	}
	
	
	
}
