public class Bicycle extends Vehicles { 
	
	 	//Mountain bike, road bike, recumbent bike.. etc 
	 	private String bikeType; 
 	 
	 	public Bicycle(int numWheels, String bikeType) { 
	 	 super(); 
	 	 	
		this.bikeType = bikeType; 
	} 
 	 
	 	public String getBikeType() { 
	 	 	return bikeType; 
 	} 
	 	
} 
