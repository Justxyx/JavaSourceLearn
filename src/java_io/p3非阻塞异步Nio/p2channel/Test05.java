package java_io.p3非阻塞异步Nio.p2channel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

/**
 * @author xm
 * @date 2021/10/5 20:26
 * @description:
 *      管道间的复制
 */
public class Test05 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("test04.txt");
        FileOutputStream fos = new FileOutputStream("test05.txt");

        FileChannel fisChannel = fis.getChannel();
        FileChannel fosChannel = fos.getChannel();

        long l = fisChannel.transferTo(fisChannel.position(), fisChannel.size(), fosChannel);

        fis.close();
        fos.close();
        System.out.println("复制完成");
    }
}

