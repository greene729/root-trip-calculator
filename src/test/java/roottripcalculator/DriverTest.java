package roottripcalculator;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.junit.Assert.assertEquals;

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
	
	@Test
	public void shouldBeAbleToAddTripsToDriver() {
		
		Driver underTest =  new Driver("foo");
		Trip testTrip = new Trip("00:01", "23:59", 50.2);
		underTest.addNewTrip(testTrip);
		assertThat(underTest.getTrips(), contains(testTrip));
		
	}

}
