package roottripcalculator;

import java.util.ArrayList;

public class Driver {
	
	private String name;
	private Double distanceTravelled;
	private ArrayList<Trip> trips = new ArrayList<>();
	
	public Driver(String name) {
		
		this.name = name;
		distanceTravelled = 0.0;

}
	
	public void addNewTrip(Trip tripToAdd) {
		
		trips.add(tripToAdd);
		
	}
	
	// Just some getters

	public String getName() {
		
		return name;
		
	}

	public Double getDistanceTravelled() {
		return distanceTravelled;
	}
	
	public ArrayList<Trip> getTrips() {
		return trips;
	}

	
}