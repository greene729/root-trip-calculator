package roottripcalculator;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Trip {
	
	private LocalTime startTime;
	private LocalTime endTime;
	private Double tripDuration;
	private Double distance;
	private Double averageSpeed;
	
	public Trip(String startTime, String endTime, Double distance) {
		
		this.startTime = LocalTime.parse(startTime);
		this.endTime = LocalTime.parse(endTime);
		this.distance = distance;
		this.tripDuration = Double.valueOf(this.startTime.until(this.endTime, ChronoUnit.MINUTES));
		this.averageSpeed = this.distance / (this.tripDuration / 60);
		
	}

//	public static void main(String[] args){
//		Trip newTrip = new Trip("00:01", "00:05", 50.1);
//		System.out.println(newTrip.startTime);
//		System.out.println(newTrip.endTime);
//		System.out.println(newTrip.tripDuration);
//		System.out.println(newTrip.distance);
//		System.out.println(newTrip.averageSpeed);
//	}
	
//	public void calculateTripDuration() {
//
//		Double startTimeAsMinutes = convertTimeStringToMinutes(startTime);
//		Double endTimeAsMinutes = convertTimeStringToMinutes(endTime);
//		Double calculatedTripDuration = endTimeAsMinutes - startTimeAsMinutes;
//
//		tripDuration = calculatedTripDuration;
//
//	}

//	public void calculateAverageSpeed() {
//
//		calculateTripDuration();
//		averageSpeed = distance / tripDuration;
//
//	}
	
//	private Double convertTimeStringToMinutes(String timeString) {
//
//		String [] splitTimeString = timeString.split(":");
//		Double hoursAsMinutes = Double.valueOf(splitTimeString[0]) * 60;
//		Double remainderMinutes = Double.valueOf(splitTimeString[1]);
//
//		// Trip duration needs to be expressed in hours to calculate average speed
//		Double convertedTripDuration = (hoursAsMinutes + remainderMinutes) / 60;
//
//		return convertedTripDuration;
//
//	}

	// Just some getters

	public LocalTime getStartTime() {
		return startTime;
	}

	public LocalTime getEndTime() {
		return endTime;
	}

	public Double getTripDuration() {
		return tripDuration;
	}

	public Double getDistance() {
		return distance;
	}

	public Double getAverageSpeed() {
		return averageSpeed;
	}


}
