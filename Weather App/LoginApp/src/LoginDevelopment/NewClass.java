/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginDevelopment;

import java.io.IOException;
import java.net.MalformedURLException;
import net.aksingh.owmjapis.CurrentWeather;
import net.aksingh.owmjapis.DailyForecast;
import net.aksingh.owmjapis.OpenWeatherMap;
import org.json.JSONException;


/**
 *
 * @author USUARIO
 */
public class NewClass {
    public static void main(String[] args)throws IOException, MalformedURLException, JSONException {

          boolean isMetric = true;
        String owmApiKey = "d799891c3abc14a23330011c4f39ed63"; /* YOUR OWM API KEY HERE */
        String weatherCity = "Cuenca,EC";
        byte forecastDays = 3;
        OpenWeatherMap.Units units = (isMetric)
            ? OpenWeatherMap.Units.METRIC
            : OpenWeatherMap.Units.IMPERIAL;
        OpenWeatherMap owm = new OpenWeatherMap(units, owmApiKey);
        try {
          DailyForecast forecast = owm.dailyForecastByCityName(weatherCity, forecastDays);
          System.out.println("Clima para: " + forecast.getCityInstance().getCityName());
          int numForecasts = forecast.getForecastCount();
          for (int i = 0; i < numForecasts; i++) {
            DailyForecast.Forecast dayForecast = forecast.getForecastInstance(i);
            DailyForecast.Forecast.Temperature temperature = dayForecast.getTemperatureInstance();
            System.out.println("\t" + dayForecast.getDateTime());
            System.out.println("\tTemperatura Minima: " + temperature.getMinimumTemperature() +
                " Temperatura Maxima: " + temperature.getMaximumTemperature() + "\n");
          }
        }
        catch (IOException | JSONException e) {
          e.printStackTrace();
        }
      }
}
