package design_pattern.p9迭代器模式.p1一个简单的点餐;

/**
 * @author xm
 * @date 2021/9/16 11:53
 * @description:
 */
public class BarB {
    Food[] foods;
    int index = 0;

    public BarB() {
        foods = new Food[6];
    }
    void addItems(String name,String descprit,Double cost){
        Food food = new Food(name, descprit, cost);
        foods[index] = food;
        index ++;
    }

    public Food[] getFoods() {
        return foods;
    }
}

