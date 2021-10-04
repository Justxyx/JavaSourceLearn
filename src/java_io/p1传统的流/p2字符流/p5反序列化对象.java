package java_io.p1传统的流.p2字符流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @author xm
 * @date 2021/10/4 20:06
 * @description:
 */
public class p5反序列化对象 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("user.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fis);
        User o = (User) objectInputStream.readObject();
        System.out.println(o);
    }
}

