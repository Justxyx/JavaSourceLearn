package design_pattern.p7外观模式.p1外观模式的实现;

/**
 * @author xm
 * @date 2021/9/14 17:26
 * @description:
 *      在家庭影院里你想看一部电影
 *      1. 打开爆米花机
 *      2. 炸爆米花
 *      3. 拉下电影幕布
 *      4. 打开投影仪放电影
 *      5. 吃爆米花
 *      6.看完电影 关投影仪
 *      7. 收电影幕布
 *      8. 收爆米花机
 *
 *      How to do ?
 */
public class Theater {
    private Curtain curtain;
    private Popcorn popcorn;
    private Projector projector;

    public Theater(Curtain curtain, Popcorn popcorn, Projector projector) {
        this.curtain = curtain;
        this.popcorn = popcorn;
        this.projector = projector;
    }

    void startMoving(){
        popcorn.openPopcorn();
        popcorn.workPopcorn();
        curtain.pullCurtain();
        projector.open();
        popcorn.eatPopcorn();
    }

    void closedMoving(){
        projector.closed();
        curtain.closedCurtain();
        popcorn.closedPopcorn();
    }
}

