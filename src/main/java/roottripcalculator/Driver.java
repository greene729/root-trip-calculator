package roottripcalculator;

public class Driver {
	
	private String name;
	private Double distanceTravelled;
	
	public Driver(String name) {
		
		this.name = name;
		distanceTravelled = 0.0;

}

	public String getName() {
		
		return name;
		
	}

	public Double getDistanceTravelled() {
		return distanceTravelled;
	}
	
}