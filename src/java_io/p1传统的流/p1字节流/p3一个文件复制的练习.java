package java_io.p1传统的流.p1字节流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author xm
 * @date 2021/10/4 18:56
 * @description:
 */
public class p3一个文件复制的练习 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\黑马");
        FileOutputStream fos = new FileOutputStream("D:\\b");


        long l = System.currentTimeMillis();

        int len ;
        byte[] b = new byte[1024];
        while ( (len = fis.read(b)) != -1){
            fos.write(b,0,len);
        }

        System.out.println("花费时间为：" + (System.currentTimeMillis() - l));

        fis.close();
        fos.close();
    }
}

