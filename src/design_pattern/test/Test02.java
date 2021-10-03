package design_pattern.test;

/**
 * @author xm
 * @date 2021/9/22 16:40
 * @description:
 */
public class Test02  implements Interface{
    public static void main(String[] args) {
        InterfaceImpl anInterface = new InterfaceImpl();
        anInterface.method();
        Interface.method2();
    }
}

