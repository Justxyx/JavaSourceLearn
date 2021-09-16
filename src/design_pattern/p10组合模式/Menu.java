package design_pattern.p10组合模式;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author xm
 * @date 2021/9/16 19:02
 * @description:
 *      组合菜单类
 */
public class Menu extends MenuComponent {

        ArrayList menuComponents = new ArrayList();
        String name;
        String description;

        public Menu(String name, String description) {
            this.name = name;
            this.description = description;
        }

        public void add(MenuComponent menuComponent) {
            menuComponents.add(menuComponent);
        }

        public void remove(MenuComponent menuComponent) {
            menuComponents.remove(menuComponent);
        }

        public MenuComponent getChild(int i) {
            return (MenuComponent)menuComponents.get(i);
        }

        public String getName() {
            return name;
        }

        public String getDescription() {
            return description;
        }

        public void print() {
            System.out.println("\n" + getName());
            System.out.println(", " + getDescription());
            System.out.println("-------------------");

            Iterator iterator = menuComponents.iterator();
            while (iterator.hasNext()){
                MenuComponent next = (MenuComponent) iterator.next();
                next.print();
            }
        }
    }


