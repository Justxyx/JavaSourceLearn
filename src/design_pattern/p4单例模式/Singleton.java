package design_pattern.p4单例模式;

/**
 * @author xm
 * @version 1.0
 * @date 2021/9/13 19:53
 */


/**
 * 单例模式的静待你实现
 */
public class Singleton {
    private static Singleton uniqueInstance;

    private Singleton() {
    }

    public static Singleton getInstance(){
        if (uniqueInstance == null){
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}

