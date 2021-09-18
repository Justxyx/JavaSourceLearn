package design_pattern.p12代理模式c.p1静态代理;

/**
 * @author xm
 * @date 2021/9/17 17:55
 * @description:
 */
public class UserDao implements IUserDao {
    @Override
    public void save() {
        System.out.println("已经保存了数据");
    }
}

