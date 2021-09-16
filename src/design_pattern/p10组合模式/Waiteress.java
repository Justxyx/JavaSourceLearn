package design_pattern.p10组合模式;

/**
 * @author xm
 * @date 2021/9/16 19:16
 * @description:
 */
public class Waiteress {
    MenuComponent allMenus;

    public Waiteress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    void print(){
        allMenus.print();
    }
}

