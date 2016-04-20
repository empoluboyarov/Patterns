package Observer;

/**
 * Created by Evgeniy on 20.04.2016.
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay display = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 21);
        weatherData.setMeasurements(45,33,22);
    }
}
