package design_pattern.p10组合模式;

/**
 * @author xm
 * @date 2021/9/16 18:52
 * @description:
 *      比如 晚餐菜单里面还有甜品菜单 类似一个树形结构
 *      怎么遍历 ？
 *
 *      ** 这是一个共同父类，相当于集成了所有方法的父类 **
 */
public abstract class MenuComponent {
        public void add(MenuComponent menuComponent) {
            throw new UnsupportedOperationException();
        }

        public void remove(MenuComponent menuComponent) {
            throw new UnsupportedOperationException();
        }

        public MenuComponent getChild(int i) {
            throw new UnsupportedOperationException();
        }

        public String getName() {
            throw new UnsupportedOperationException();
        }

        public String getDescription() {
            throw new UnsupportedOperationException();
        }

        public double getPrice() {
            throw new UnsupportedOperationException();
        }

        public boolean isVegetarian() {
            throw new UnsupportedOperationException();
        }

        public void print() {
            throw new UnsupportedOperationException();
        }
    }


