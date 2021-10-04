package java_io.p1传统的流.p1字节流;



import java.io.*;

/**
 * @author xm
 * @date 2021/10/4 18:29
 * @description:
 */
public class p2文件输入流 {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("temp1.log");
        int i;
        while ((i = fileInputStream.read()) != -1){
            System.out.println(i);
        }

        System.out.println("----------------");

        byte[] b = new byte[2];
        int read;
        while ((read =  fileInputStream.read(b)) != -1){
            String s = new String(b);
            System.out.println(s);
        }
    }
}

