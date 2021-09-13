package design_pattern.p1观察者模式.p1实现一个气象站;

/**
 * @author xm
 * @version 1.0
 * @date 2021/9/13 9:53
 */
public interface Observer {
    public void update(float temp,float humidity,float pressure);

}

