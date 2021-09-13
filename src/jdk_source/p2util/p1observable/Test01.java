package jdk_source.p2util.p1observable;

import java.util.Observable;
import java.util.Observer;

/**
 * @author xm
 * @version 1.0
 * @date 2021/9/13 11:43
 */
public class Test01 {
    public static void main(String[] args) {
        /**
         * 观察者模式 ，  可用jdk 内置类实现
         */

        /**
         *  源码较为简单
         *  只要自己动手实现过观察者模式的 应该都可以看懂
         */

        Observable observable = new Observable();

    }

    class demo implements Observer{
        @Override
        public void update(Observable o, Object arg) {

        }
    }
}

