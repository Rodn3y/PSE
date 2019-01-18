package emissionTest;

public class TennisSmart {
	
	String Manufacturer = "IW";
	String Color = "Black";
	String AvailableMotors = "0.8 TFSI";
		
	public void setManufacturer(String Manufacturer) {
		
		this.Manufacturer = Manufacturer;
	}
	
	public void setColor(String Color) {
		
		this.Color = Color;
	}
	
	public void setAvailableMotors(String availableMotors) {
		
		this.AvailableMotors = availableMotors;
	}
	
	String getManufacturer() {
		return Manufacturer;
	}
	
	String getColor() {
		return Color;
	}
	
	String getAvailableMotors() {
		return AvailableMotors;
	}
}
