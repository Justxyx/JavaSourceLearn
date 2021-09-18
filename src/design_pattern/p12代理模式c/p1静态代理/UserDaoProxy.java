package design_pattern.p12代理模式c.p1静态代理;

/**
 * @author xm
 * @date 2021/9/17 17:56
 * @description:
 */
public class UserDaoProxy implements IUserDao {

    private IUserDao target;

    public UserDaoProxy(IUserDao target) {
        this.target = target;
    }

    @Override
    public void save() {
        System.out.println("开始事务");
        target.save();
        System.out.println("结束事务");
    }
}

