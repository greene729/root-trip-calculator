package roottripcalculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TripTest {
	
	@Test
	public void tripShouldHaveDriverName() {
		
		Trip underTest = new Trip("foo", "", "");
		String driverName = underTest.getDriverName();
		assertEquals("foo", driverName);
		
	}
	
	@Test
	public void tripShouldHaveStartTime() {
		
		Trip underTest = new Trip("", "00:01", "");
		String startTime = underTest.getStartTime();
		assertEquals("00:01", startTime);
		
	}
	
	@Test
	public void tripShouldHaveEndTime() {
		
		Trip underTest = new Trip("", "", "00:01");
		String endTime = underTest.getEndTime();
		assertEquals("00:01", endTime);
		
	}
	
	@Test
	public void tripShouldCalculateTripDuration() {
		
		Trip underTest = new Trip("", "00:15", "01:05");
		underTest.calculateTripDuration();
		Double tripDuration = underTest.getTripDuration();
		assertEquals(0.83333, tripDuration, 0.001);
		
	}

}
