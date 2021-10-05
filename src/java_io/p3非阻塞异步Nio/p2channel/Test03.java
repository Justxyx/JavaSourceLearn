package java_io.p3非阻塞异步Nio.p2channel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author xm
 * @date 2021/10/5 20:05
 * @description:
 *      使用Nio 复制文件
 */
public class Test03 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("channel.txt");
        FileOutputStream fos = new FileOutputStream("copy.txt");

        FileChannel fisChannel = fis.getChannel();
        FileChannel fosChannel = fos.getChannel();

        ByteBuffer buffer = ByteBuffer.allocate(1024);

        while (true){
            buffer.clear();
            int i = fisChannel.read(buffer);
            buffer.flip();
            if (i == -1){
                break;
            }
            fosChannel.write(buffer);

        }


    }
}

