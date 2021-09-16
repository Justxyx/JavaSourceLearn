package design_pattern.p09迭代器模式.p1一个简单的点餐;

import java.util.ArrayList;

/**
 * @author xm
 * @date 2021/9/16 14:25
 * @description:
 */
public class Test01 {
    public static void main(String[] args) {
        ArrayList<Food> foods = new ArrayList<>();
        Food f1 = new Food("1", "1", 1.1);
        Food f2 = new Food("2", "2", 2.2);
        Food f3 = new Food("3", "3", 3.3);
        foods.add(f1);
        foods.add(f2);
        foods.add(f3);
        MenuA menuA = new MenuA(foods);
        Iterator iterator = menuA.createIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}

