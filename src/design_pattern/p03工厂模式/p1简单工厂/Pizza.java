package design_pattern.p03工厂模式.p1简单工厂;

/**
 * @author xm
 * @version 1.0
 * @date 2021/9/13 17:18
 */


public class Pizza {
    String type;



    void prepare(){
        System.out.println("pizza prepare");
    }
    void bake(){
        System.out.println("pizza bake");
    }
    void cut(){
        System.out.println("pizza cut");
    }
    void box(){
        System.out.println("pizza box");
    }
}

