package java_io.p2Bio.p5图片上传下载的例子;

import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

/**
 * @author xm
 * @date 2021/10/5 17:27
 * @description:
 */
public class ServerThread extends Thread {
    private Socket accept;

    public ServerThread(Socket socket) {
        this.accept = socket;
    }

    @Override
    public void run() {
        // 单独来开启一个线程来上传下载文件

        try {
            InputStream inputStream = accept.getInputStream();
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            String title = dataInputStream.readUTF();
            System.out.println("服务端收到了：" + title);

            // 写出到一个新的文件

            FileOutputStream fos = new FileOutputStream("D:\\人脸识别模拟服务器\\" + System.currentTimeMillis() + title);
            int len;
            byte[] b = new byte[1024];
            while ((len = dataInputStream.read(b))!= -1){
                fos.write(b,0,len);
            }
            fos.close();
            System.out.println("服务端保存成功啦");
        } catch (IOException e) {
            System.out.println("服务端关闭");
        }
    }
}

