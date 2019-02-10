# README #
 
 This README would normally document whatever steps are necessary to get your application up and running.
Add a comment to this line
 
 This repository is for getting information about the weather using the OpenWeatherMap.org restful web service.
 
 * Quick summary
 * Version: 1.0
 
** ### How do I get set up? ### **
 
 * Summary of set up
 An example for using this library:
 
```
#!java


 public static void main(String[] args)
 	{
 		IWeatherDataService dataService = WeatherDataServiceFactory.getWeatherDataService(service.OPEN_WEATHER_MAP);
 		WeatherData data;
 		try
 		{
 			data = dataService.getWeatherData(new Location("Holon", "IL"));
 			System.out.println(data.toString());
 		}
 		catch (WeatherDataServiceException e)
 		{
 			e.printStackTrace();
 		}
 	}
```

 
 * Configuration
 * Dependencies
 * Database configuration
 * How to use: 
 **[A YouTube demonstration](https://youtu.be/iudHLsdOfes)**
 * Deployment instructions
 
** ### Contribution guidelines ###**
 
 * Writing tests
 * Code review
 * Other guidelines
 
** ### Who do I talk to? ###**
 
 * Repo Owners: Ohad Cohen, Sagie Lev, Shiran Shen-Tov
 * Team Contact:
 * **[Ohad Cohen](mailto:ohad182@gmail.com)**
 * **[Sagie Lev](mailto:sheyg1@gmail.com)**
 * **[Shiran Shem-Tov](mailto:ishiran10@gmail.com)**