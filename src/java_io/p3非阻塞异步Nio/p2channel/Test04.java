package java_io.p3非阻塞异步Nio.p2channel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author xm
 * @date 2021/10/5 20:16
 * @description:
 * 分散与聚集
 */
public class Test04 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("channel.txt");
        FileOutputStream fos = new FileOutputStream("test04.txt");

        FileChannel fisChannel = fis.getChannel();
        FileChannel fosChannel = fos.getChannel();

        ByteBuffer allocate1 = ByteBuffer.allocate(4);
        ByteBuffer allocate2 = ByteBuffer.allocate(1024);

        ByteBuffer[] byteBuffers = {allocate1,allocate2};

        fisChannel.read(byteBuffers);

        for (ByteBuffer byteBuffer : byteBuffers) {
            byteBuffer.flip();
            System.out.println(new String(byteBuffer.array()));
        }

        fosChannel.write(byteBuffers);
        fisChannel.close();
        fosChannel.close();
    }
}

