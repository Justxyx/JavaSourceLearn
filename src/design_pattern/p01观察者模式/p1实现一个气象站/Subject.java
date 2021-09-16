package design_pattern.p01观察者模式.p1实现一个气象站;

/**
 * @author xm
 * @version 1.0
 * @date 2021/9/13 9:51
 *
 * 主题接口
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}

