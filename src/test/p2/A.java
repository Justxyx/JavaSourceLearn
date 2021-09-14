package test.p2;

/**
 * @author xm
 * @version 1.0
 * @date 2021/9/13 20:20
 */
public class A {
    private String name = "zz";
    private String pwd = "333";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public A() {
        this.name = "xx";
        this.pwd = "123";
        System.out.println("父类构造函数");
    }

    void show(){
        System.out.println(name + " -- " + pwd );
    }
}

