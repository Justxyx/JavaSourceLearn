package test.p5注解;

import java.lang.annotation.*;

/**
 * @author xm
 * @date 2021/10/3 17:03
 * @description:
 *      定义一个注解
 */
@Documented
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface MthodInterface {
    String name() default "";
}
