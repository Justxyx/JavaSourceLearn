package design_pattern.p01观察者模式.p2java内置观察者模式;

/**
 * @author xm
 * @version 1.0
 * @date 2021/9/13 10:16
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurementsChanged(12,13,15);
        weatherData.setMeasurementsChanged(18,13,15);
    }
}

