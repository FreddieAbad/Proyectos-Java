package il.ac.hit.finalproject.main;

import il.ac.hit.finalproject.exceptions.*;
import il.ac.hit.finalproject.classes.*;
import il.ac.hit.finalproject.classes.WeatherDataServiceFactory.service;

/**
 * 
 * @author Ohad Cohen
 *
 */
public class Program
{
	public static void main(String[] args)
	{
		IWeatherDataService dataService = WeatherDataServiceFactory.getWeatherDataService(service.OPEN_WEATHER_MAP);
		WeatherData data;
		try
		{
			data = dataService.getWeatherData(new Location("Holon", "IL"));
			System.out.println(data.toString());
		} catch (WeatherDataServiceException e)
		{
			e.printStackTrace();
		}
	}
}