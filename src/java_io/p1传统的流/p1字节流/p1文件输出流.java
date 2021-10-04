package java_io.p1传统的流.p1字节流;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author xm
 * @date 2021/10/4 17:37
 * @description:
 *
 *  OutputStream 为父类
 */
public class p1文件输出流 {
    public static void main(String[] args) {
        try {
            File file = new File("temp1.log");
            FileOutputStream fos = new FileOutputStream(file);
            fos.write("你好啊".getBytes());
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}

