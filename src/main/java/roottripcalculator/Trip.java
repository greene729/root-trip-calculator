package roottripcalculator;

public class Trip {
	
	private String driverName;
	private String startTime;
	private String endTime;
	private Double tripDuration;
	private Double distance;
	private Double averageSpeed;
	
	public Trip(String driverName, String startTime, String endTime, Double distance) {
		
		this.driverName = driverName;
		this.startTime = startTime;
		this.endTime = endTime;
		this.distance = distance;
		
	}
	
	public void calculateTripDuration() {
	
		Double startTimeAsMinutes = convertTimeStringToMinutes(startTime);
		Double endTimeAsMinutes = convertTimeStringToMinutes(endTime);
		Double calculatedTripDuration = endTimeAsMinutes - startTimeAsMinutes;		
		
		tripDuration = calculatedTripDuration;
		
	}

	public void calculateAverageSpeed() {
		
		calculateTripDuration();		
		averageSpeed = distance / tripDuration;
		
	}
	
	private Double convertTimeStringToMinutes(String timeString) {
		
		String [] splitTimeString = timeString.split(":");
		Double hoursAsMinutes = Double.valueOf(splitTimeString[0]) * 60;
		Double remainderMinutes = Double.valueOf(splitTimeString[1]);
		
		// Trip duration needs to be expressed in hours to calculate average speed
		Double convertedTripDuration = (hoursAsMinutes + remainderMinutes) / 60;		
		
		return convertedTripDuration;
		
	}

	// Just some getters

	public String getDriverName() {
		return driverName;
	}

	public String getStartTime() {
		return startTime;
	}

	public String getEndTime() {
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
