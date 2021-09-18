package design_pattern.p12代理模式c.p1静态代理;

/**
 * @author xm
 * @date 2021/9/17 17:57
 * @description:
 */
public class Test01 {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        UserDaoProxy proxy = new UserDaoProxy(userDao);
        proxy.save();
    }
}

