package design_pattern.p4单例模式;

/**
 * @author xm
 * @version 1.0
 * @date 2021/9/13 19:57
 */
public class UserSingleton {
    private String name;
    private String pwd;
    private static int count;
    private static UserSingleton uniqueInstance;

    private UserSingleton(String name, String pwd) {
        this.name = name;
        this.pwd = pwd;
    }

    public static UserSingleton getInstance(){
        if (uniqueInstance == null){
            uniqueInstance = new UserSingleton("xyx","123");
        }
        return uniqueInstance;
    }

    public  int getCount() {
        return count;
    }
}

