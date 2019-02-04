package roottripcalculator;

public class Trip {
	
	private String driverName;
	private String startTime;
	private String endTime;
	private Double tripDuration;
	
	public Trip(String driverName, String startTime, String endTime) {
		
		this.driverName = driverName;
		this.startTime = startTime;
		this.endTime = endTime;
		
	}
	
	private void calculateTripDuration() {
	
		Double startTimeAsMinutes = convertTimeStringToMinutes(startTime);
		Double endTimeAsMinutes = convertTimeStringToMinutes(endTime);
		Double calculatedTripDuration = endTimeAsMinutes - startTimeAsMinutes;		
		
		tripDuration = calculatedTripDuration;
		
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
		calculateTripDuration();
		return tripDuration;
	}

}
