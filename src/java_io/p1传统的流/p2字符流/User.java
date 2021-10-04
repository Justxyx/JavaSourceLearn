package java_io.p1传统的流.p2字符流;

import java.io.Serializable;

/**
 * @author xm
 * @date 2021/10/4 20:02
 * @description:
 */
public class User implements Serializable{
    private String name;
    private String pwd;
    private transient int age;

    public User(String name, String pwd, int age) {
        this.name = name;
        this.pwd = pwd;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", age=" + age +
                '}';
    }
}

