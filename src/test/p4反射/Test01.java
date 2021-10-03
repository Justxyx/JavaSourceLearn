package test.p4反射;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author xm
 * @date 2021/10/3 15:57
 * @description:
 */
public class Test01 {
    public static void main(String[] args) {
        User user = new User();
        System.out.println(user.getName());

//        1. 类名问题
        Class c1 = user.getClass();
        System.out.println(c1.getName());
        System.out.println(c1.getSimpleName());

//        2. 类属性问题
        Field[] fields = c1.getFields();   // 共有属性
        Field[] declaredFields = c1.getDeclaredFields();  // 不管共有属性 私有属性都能找到

        for (Field field : declaredFields) {
            System.out.println(field.toString());
        }


//        3. 方法问题
        Method[] methods = c1.getMethods();   // 获得所有的本类以及父类方法 public
        Method[] declaredMethods = c1.getDeclaredMethods();


//        4. 构造器问题
        Constructor[] constructors = c1.getConstructors();





    }
}

