package design_pattern.p1观察者模式.p1实现一个气象站;

/**
 * @author xm
 * @version 1.0
 * @date 2021/9/13 10:11
 */
public class CurrentConditionsDisplay  implements Observer ,DisplayElement{
    private float tempreature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("当前显示内容为" + tempreature + " ---- 湿度" + humidity);
    }

    @Override
    public void update(float tempreature, float humidity, float pressure) {
        this.tempreature = tempreature;
        this.humidity = humidity;
        display();
    }
}

