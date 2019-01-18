package emissionTest;

public class M6 {

	String Manufacturer = "SMW";
	String Color = "Black";
	String AvailableMotors = "1.8TFSI and 2.0TDI";
		
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
