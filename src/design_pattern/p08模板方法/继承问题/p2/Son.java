package design_pattern.p08模板方法.继承问题.p2;

/**
 * @author xm
 * @date 2021/9/15 11:54
 * @description:
 */
public class Son extends Father {
    int c;



    public Son(int a, int b, int c) {
        super(a, b);
        this.c = c;
    }
}

