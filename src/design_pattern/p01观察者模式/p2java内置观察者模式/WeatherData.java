package design_pattern.p01观察者模式.p2java内置观察者模式;

import java.util.Observable;

/**
 * @author xm
 * @version 1.0
 * @date 2021/9/13 10:00
 */
public class WeatherData extends Observable {
    private float temperture;
    private float humidity;
    private float pressure;

    public WeatherData() {
    }





    public void measurementsChanged(){
        setChanged();
        notifyObservers();
    }

    public void setMeasurementsChanged(float temperture,float humidity,float pressure){
        this.temperture = temperture;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperture() {
        return temperture;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}

