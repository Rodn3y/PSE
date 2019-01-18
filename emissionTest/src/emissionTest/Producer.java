package emissionTest;

public class Producer {

	String Producer;
	String Model;
	
	
	public Producer(String Producer) {
		
		if(Producer.equals("IW")) {
			
			this.Producer = Producer;
			this.Model = "Tennis";
		}
		
		if(Producer.equals("SMW")) {
			
			this.Producer = Producer;
			this.Model = "M6";
		}
		
	}
	
	String getProducer() {
		
		return this.Producer;
	}
	
	String getModel() {
		
		return this.Model;
	}
}
