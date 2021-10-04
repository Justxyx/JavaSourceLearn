package java_io.p1传统的流.p2字符流;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author xm
 * @date 2021/10/4 20:02
 * @description:
 */
public class p4序列化对象 {
    public static void main(String[] args) throws IOException {
        User user = new User("xx ", "xxx", 13);

        FileOutputStream fos = new FileOutputStream("user.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fos);
        objectOutputStream.writeObject(user);
        objectOutputStream.close();
        fos.close();

    }
}

