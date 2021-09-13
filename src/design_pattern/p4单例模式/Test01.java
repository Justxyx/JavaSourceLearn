package design_pattern.p4单例模式;

/**
 * @author xm
 * @version 1.0
 * @date 2021/9/13 20:00
 */
public class Test01 {
    public static void main(String[] args) {
        UserSingleton instance = UserSingleton.getInstance();
        int count = instance.getCount();
        System.out.println(count);
    }
}

