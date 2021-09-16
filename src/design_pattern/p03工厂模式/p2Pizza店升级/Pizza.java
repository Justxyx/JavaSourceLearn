package design_pattern.p03工厂模式.p2Pizza店升级;

import java.util.ArrayList;

/**
 * @author xm
 * @version 1.0
 * @date 2021/9/13 18:10
 */
public abstract class Pizza {
    String name;
    String dough;
    String sacue;
    ArrayList arrayList = new ArrayList();

    void papre(){
        System.out.println("pizaa is pare");
    }
    void bake(){
        System.out.println("pizza is bake");
    }
    void cut(){
        System.out.println("pizza is cut ");
    }
    void box(){
        System.out.println("pizza is box");
    }

    public String getName() {
        return name;
    }
}

