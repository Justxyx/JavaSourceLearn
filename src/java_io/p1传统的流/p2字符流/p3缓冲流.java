package java_io.p1传统的流.p2字符流;

import java.io.*;

/**
 * @author xm
 * @date 2021/10/4 19:32
 * @description:
 */
public class p3缓冲流 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("buffer.txt");
        BufferedOutputStream bfos = new BufferedOutputStream(fos);
        bfos.write("你好啊".getBytes());
        bfos.flush();

        FileInputStream fis = new FileInputStream("buffer.txt");
        BufferedInputStream bfis = new BufferedInputStream(fis);



        int b;
        byte[] c = new byte[2];
        while ( (b = bfis.read(c)) != -1){
            System.out.println(new String(c));
        }
    }
}

