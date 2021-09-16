package design_pattern.p09迭代器模式.p1一个简单的点餐;

/**
 * @author xm
 * @date 2021/9/16 11:34
 * @description:
 */
public class Food {
    private String name;
    private String descript;
    private double cost;

    public Food(String name, String descript, double cost) {
        this.name = name;
        this.descript = descript;
        this.cost = cost;
    }


    public String getName() {
        return name;
    }

    public String getDescript() {
        return descript;
    }

    public double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", descript='" + descript + '\'' +
                ", cost=" + cost +
                '}';
    }
}

