package design_pattern.p01观察者模式.p1实现一个气象站;

import java.util.ArrayList;

/**
 * @author xm
 * @version 1.0
 * @date 2021/9/13 10:00
 *
 * 主题实现
 */
public class WeatherData implements Subject {
    private ArrayList observers;
    private float temperture;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i>0){
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);
            observer.update(temperture,humidity,pressure);
        }
    }

    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurementsChanged(float temperture,float humidity,float pressure){
        this.temperture = temperture;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}

