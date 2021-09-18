package design_pattern.p13符合模式.p1一个符合模式;

/**
 * @author xm
 * @date 2021/9/18 11:09
 * @description:
 */
public class BlackDuck implements Quackable {
    @Override
    public void quack() {
        System.out.printf("Black   gaga~");
    }
}

