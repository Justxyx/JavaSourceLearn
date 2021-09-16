package design_pattern.p9迭代器模式.p1一个简单的点餐;

import java.util.ArrayList;

/**
 * @author xm
 * @date 2021/9/16 11:33
 * @description:
 *      barA 用Arrylist容器作为餐单存储
 */
public class BarA {
    ArrayList list;

    public BarA() {
        list = new ArrayList();
    }

    void addItems(String name,String descprit,Double cost){
        Food food = new Food(name, descprit, cost);
        list.add(food);
    }

    public ArrayList getList() {
        return list;
    }
}

