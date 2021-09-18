package design_pattern.p13符合模式.p1一个符合模式;

/**
 * @author xm
 * @date 2021/9/18 11:29
 * @description:
 * 适配器模式
 */
public class GooseAdapter implements Quackable {

    private Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.honk();
    }
}

