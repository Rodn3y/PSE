package emissionTest;

public class Engine {

	String engineName;
	double coefficient; //measueres efficiency
	boolean isPetrol;
	
	public Engine(String engineName) {
		
		this.engineName = engineName;
		
		if(engineName.equals("1.8TFSI")) {
			this.coefficient = 0.6;
			this.isPetrol = true;
		}
		if(engineName.equals("2.0TDI")) {
			this.coefficient = 0.8;
			this.isPetrol = false;
		}
		if(engineName.equals("0.8TFSI")) {
			this.coefficient = 0.6 * 0.6; //60% weniger als 1.8 Liter Motor
			this.isPetrol = true;
		}
		
		
		
		
	}
	
	public double getCoefficient() {
		
		return this.coefficient;
	}
	
	public boolean isPetrol() {
		
		return this.isPetrol;
	}
}
