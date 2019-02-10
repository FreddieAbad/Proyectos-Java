package il.ac.hit.finalproject.tests;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import il.ac.hit.finalproject.classes.Location;

/**
 * @author Sagie Lev, Ohad Cohen, Shiran Shem-Tov
 *
 *         A class that is used for testing OpenWeatherMap.org integration
 */
public class LocationJUnitTests
{

	private static Location location;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception
	{
		location = new Location("holon", "IL");
		location.setUnit("metric");

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception
	{
		location = null;
	}

	@Test
	public void testGetUnit()
	{
		String expected = "metric";
		String actual = location.getUnit();
		assertEquals(expected, actual);

	}

	@Test
	public void testGetCity()
	{
		String expected = "holon";
		String actual = location.getCity();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCountry()
	{
		String expected = "IL";
		String actual = location.getCountry();
		assertEquals(expected, actual);
	}

}
