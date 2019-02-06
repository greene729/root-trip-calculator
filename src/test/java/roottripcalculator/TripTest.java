package roottripcalculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TripTest {
	
	@Test
	public void tripShouldHaveStartTime() {
		
		Trip underTest = new Trip("00:01", "", 50.2);
		String startTime = underTest.getStartTime();
		assertEquals("00:01", startTime);
		
	}
	
	@Test
	public void tripShouldHaveEndTime() {
		
		Trip underTest = new Trip("", "00:01", 50.2);
		String endTime = underTest.getEndTime();
		assertEquals("00:01", endTime);
		
	}
	
	@Test
	public void tripShouldCalculateTripDuration() {
		
		Trip underTest = new Trip("00:15", "01:05", 50.2);
		underTest.calculateTripDuration();
		Double tripDuration = underTest.getTripDuration();
		assertEquals(0.83333, tripDuration, 0.001);
		
	}
	
	@Test
	public void tripShouldHaveDistance() {
		
		Trip underTest = new Trip("", "", 50.2);
		Double tripDistance = underTest.getDistance();
		assertEquals(50.2, tripDistance, 0.001);
		
	}
	
	@Test
	public void tripShouldCalculateAverageSpeed() {
		
		Trip underTest = new Trip("00:01", "01:05", 50.2);
		underTest.calculateAverageSpeed();
		Double averageSpeed = underTest.getAverageSpeed();
		assertEquals(47.0624999985, averageSpeed, 0.001);
		
	}

}
