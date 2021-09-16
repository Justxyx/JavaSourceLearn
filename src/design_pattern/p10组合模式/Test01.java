package design_pattern.p10组合模式;

/**
 * @author xm
 * @date 2021/9/16 19:17
 * @description:
 */
public class Test01 {
    public static void main(String[] args) {
        Menu m1 = new Menu("x1", "brakfast");
        Menu m2 = new Menu("x2", "lunch");
        Menu m3 = new Menu("x3", "dinner");
        Menu m4 = new Menu("x4", "dessert");

        Menu all = new Menu("顶层菜单", "所有的菜单啦");

        all.add(m1);
        all.add(m2);
        all.add(m3);

        MenuItem i1 = new MenuItem("菜品1", "xx", true, 1.2);
        MenuItem i2 = new MenuItem("菜品2", "xx", true, 1.2);
        MenuItem i3 = new MenuItem("菜品3", "xx", true, 1.2);

        m1.add(i1);
        m2.add(i2);
        m3.add(i3);
        m3.add(m4);

        Waiteress waiteress = new Waiteress(all);
        waiteress.print();

    }
}

