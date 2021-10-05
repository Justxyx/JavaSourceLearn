package java_io.p2Bio.p4伪异步通信;

/**
 * @author xm
 * @date 2021/10/5 12:34
 * @description:
 */
public class Test {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello word !");
            }
        }).start();
    }
}

