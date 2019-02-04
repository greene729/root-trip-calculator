package roottripcalculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DriverTest {
	
	@Test
	public void driverShouldHaveName() {
		
		Driver underTest = new Driver("foo");
		String name = underTest.getName();
		assertEquals("foo", name);
		
	}
	
	@Test
	public void newDriverShouldHaveZeroDistanceTravelled() {
		
		Driver underTest = new Driver("foo");
		Double distance = underTest.getDistanceTravelled();
		assertEquals(0.0, distance, 0.001);
		
	}
	
	

}
