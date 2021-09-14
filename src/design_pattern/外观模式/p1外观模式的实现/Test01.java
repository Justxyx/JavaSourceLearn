package design_pattern.外观模式.p1外观模式的实现;

/**
 * @author xm
 * @date 2021/9/14 17:37
 * @description:
 */
public class Test01 {
    public static void main(String[] args) throws InterruptedException {
        Theater theater = new Theater(new Curtain(), new Popcorn(), new Projector());
        theater.startMoving();
        System.out.println("==========");
        Thread.sleep(1000);
        theater.closedMoving();
    }
}

