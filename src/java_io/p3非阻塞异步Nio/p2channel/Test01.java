package java_io.p3非阻塞异步Nio.p2channel;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author xm
 * @date 2021/10/5 19:41
 * @description:
 * 向外写文件
 */
public class Test01 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("channel.txt");
        FileChannel channel = fos.getChannel();

        ByteBuffer buffer = ByteBuffer.allocate(1024);
        buffer.put("你好啊，同学".getBytes());
        buffer.flip();

        channel.write(buffer);
        channel.close();

    }
}

