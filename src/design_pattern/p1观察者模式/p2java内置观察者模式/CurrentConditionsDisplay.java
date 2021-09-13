package design_pattern.p1观察者模式.p2java内置观察者模式;

import java.util.Observable;
import java.util.Observer;

/**
 * @author xm
 * @version 1.0
 * @date 2021/9/13 10:11
 */
public class CurrentConditionsDisplay  implements Observer,DisplayElement {
    private Observable observable;
    private float tempreature;
    private float humidity;


    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData){
            WeatherData weatherData =  (WeatherData) o;
            this.tempreature = weatherData.getTemperture();
            this.humidity = weatherData.getHumidity();

            display();
        }

    }

    @Override
    public void display() {
        System.out.println(tempreature + "--- " + humidity + "---");
    }
}

