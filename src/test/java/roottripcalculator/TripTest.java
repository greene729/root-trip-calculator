package roottripcalculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TripTest {

	
	@Test
	public void tripShouldCalculateTripDuration() {
		
		Trip underTest = new Trip("00:15", "01:05", 50.2);
		Double tripDuration = underTest.getTripDuration();
		assertEquals(50.0, tripDuration, 0.001);
		
	}
	
	@Test
	public void tripShouldHaveDistance() {
		
		Trip underTest = new Trip("00:00", "23:59", 50.2);
		Double tripDistance = underTest.getDistance();
		assertEquals(50.2, tripDistance, 0.001);
		
	}
	
	@Test
	public void tripShouldCalculateAverageSpeed() {
		
		Trip underTest = new Trip("00:01", "01:05", 50.2);
		Double averageSpeed = underTest.getAverageSpeed();
		assertEquals(47.0624999985, averageSpeed, 0.001);
		
	}

}
