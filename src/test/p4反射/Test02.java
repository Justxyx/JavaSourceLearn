package test.p4反射;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author xm
 * @date 2021/10/3 16:10
 * @description:
 */
public class Test02 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class c2 = Class.forName("test.p4反射.User");
        User user = (User)c2.newInstance();
        System.out.println(user);

        Constructor declaredConstructor = c2.getDeclaredConstructor(String.class, Integer.class);
        User u1 = (User)declaredConstructor.newInstance("周杰伦", 22);
        System.out.println(u1);
        Method setName = c2.getDeclaredMethod("setName", String.class);
        Object lJJ = setName.invoke(u1, "lJJ");
        System.out.println(u1);
    }
}

