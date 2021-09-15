package design_pattern.p7外观模式.p1外观模式的实现;

/**
 * @author xm
 * @date 2021/9/14 17:29
 * @description:
 */
public class Popcorn {
    void openPopcorn(){
        System.out.println("打开爆米花机器");
    }
    void workPopcorn(){
        System.out.println("开始炸爆米花");
    }
    void eatPopcorn(){
        System.out.println("吃爆米花");
    }
    void closedPopcorn(){
        System.out.println("收拾爆米花机");
    }
}

