package java_io.p2Bio.p5图片上传下载的例子;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * @author xm
 * @date 2021/10/5 17:02
 * @description:
 */
public class Client {
    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("127.0.0.1", 8888);
        DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
        dataOutputStream.writeUTF("test.jpeg");
        FileInputStream fis = new FileInputStream("D:\\人脸识别模拟服务器\\test.jpeg");
        int len;
        byte[] b = new byte[1024];
        while ((len = fis.read(b))!= -1){
            dataOutputStream.write(b,0,len);
        }
        dataOutputStream.flush();
    }
}

