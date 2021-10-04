package java_io.p1传统的流.p2字符流;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author xm
 * @date 2021/10/4 19:07
 * @description:
 */
public class p1读取字符数据 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("temp1.log");
//        int b;
//        while ((b = fr.read()) != -1){
//            System.out.print((char) b);
//        }

        char[] c = new char[2];
        int b;

        while ((b=fr.read(c)) != -1){
            System.out.println(new String(c,0,b));
        }
    }
}

