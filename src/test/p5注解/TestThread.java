package test.p5注解;

import java.lang.reflect.Method;

/**
 * @author xm
 * @date 2021/10/3 17:05
 * @description:
 */
public class TestThread {

    public static final int NUMBER = 10000;


    @MthodInterface(name = "test1")
    void test1() {
        System.out.println("just test1");
    }

    @MthodInterface(name = "test2")
    void test2() {
        System.out.println("just test2");
    }

    @MthodInterface(name = "test3")
    void test3(){
        System.out.println("just test3");
    }



    static void testJava() throws ClassNotFoundException {
        Class aClass = Class.forName("test.p5注解.TestThread");
        Method[] methods = aClass.getDeclaredMethods();
        for (Method method : methods) {
            boolean annotationPresent = method.isAnnotationPresent(MthodInterface.class);
            if (annotationPresent){
                MthodInterface annotation = method.getAnnotation(MthodInterface.class);
                String name = annotation.name();
            }
        }
    }
}



