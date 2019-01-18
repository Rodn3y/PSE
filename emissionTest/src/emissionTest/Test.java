/*	 @date: 18.01.2019
	 @author: Jan Nabatian, Valentin Martens

*/

package emissionTest;

public class Test {
	
	public static void main(String args[]) {
		
		System.out.println("Emission Test Starting Up!");
		
		/*
		 * Enter your Configuration here
		 * "1.8TFSI" or "2.0TDI" or "0.8TFSI" (smart Engine)
		 * "M6" or "Tennis" or "Tennis-Smart"
		 */ 
		Engine tdi = new Engine("1.8TFSI");
		Vehicle M6 = new Vehicle("Tennis-Smart");
		
		System.out.println("Testing " + M6.type + " Vehicle with " + tdi.engineName + " Engine (Manufacturer: "+ M6.getManufacturer() + ")" );
		
		double totalRotations = 0;
		
		
		System.out.println("Starting Engine");
		
		for(int i = 0; i < 8000; i++) {
			totalRotations = totalRotations + i;
			System.out.println("Engine RPM: " + i);
		}
		
		for (int i = 7999; i>0; i--) {
			totalRotations = totalRotations + i;
			System.out.println("Engine RPM: " + i);
			
		}
		
		System.out.println("Total Rotations of the Test: " + totalRotations);
		
		
		
		/*
		 * Calculating Emissions
		 */
		
		double makeRealCoefficient = 0.00000001;
		
		double emissions = tdi.getCoefficient() * totalRotations * makeRealCoefficient;
		

		System.out.println("Es wurden insgesamt " + emissions + " Kg Co2 Ausgestoﬂen");

	}

}
