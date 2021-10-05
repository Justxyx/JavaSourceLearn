package java_io.p3非阻塞异步Nio.p2channel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author xm
 * @date 2021/10/5 19:58
 * @description:
 *      读取文件
 */
public class Test02 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("channel.txt");
        FileChannel channel = fis.getChannel();

        ByteBuffer buffer = ByteBuffer.allocate(1024);
        int read = channel.read(buffer);

        System.out.println(new String(buffer.array()));
    }
}

