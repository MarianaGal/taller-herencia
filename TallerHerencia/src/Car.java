public class Car extends Vehicles {  
	
	private int numDoors; 
	private boolean isElectric; 
 	
 	
	 	public Car (int numWheels, int numDoors, boolean isElectric) { 
 	 	this.numWheels = (numWheels);  	 	
 	 	this.numDoors = numDoors;  	 	
 	 	this.isElectric = isElectric; 
	 	
 } 
 	 
	 	public int getNumDoors() { 
	 	 	return numDoors;  	
 	} 
 	 
	 	public boolean getIsElectric() { 
	 	 	return isElectric; 
	 } 
} 
 
