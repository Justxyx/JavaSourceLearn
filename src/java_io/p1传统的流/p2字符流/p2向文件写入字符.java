package java_io.p1传统的流.p2字符流;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author xm
 * @date 2021/10/4 19:16
 * @description:
 */
public class p2向文件写入字符 {
    public static void main(String[] args) throws IOException {
        File file = new File("a.log");
        FileWriter fw = new FileWriter(file);
        fw.write("你好啊");
        fw.flush();
    }
}

