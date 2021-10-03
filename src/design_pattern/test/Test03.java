package design_pattern.test;

/**
 * @author xm
 * @date 2021/9/22 17:01
 * @description:
 */
public class Test03 {
    public static void main(String[] args) {
        new Demo() {
            @Override
            public void method() {
                System.out.println("这是一个匿名内部类");
            }
        }.start();


    }
}

