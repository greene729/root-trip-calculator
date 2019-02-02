package roottripcalculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DriverTest {
	
	@Test
	public void shouldHaveName() {
		
		Driver underTest = new Driver("New Driver");
		String name = underTest.getName();
		assertEquals("New Driver", name);
		
	}

}
