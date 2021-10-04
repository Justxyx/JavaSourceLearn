package java_io.p2Bio.p2同步阻塞案例之服务端与客户端多发多收;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author xm
 * @date 2021/10/3 19:18
 * @description:
 *      服务端
 *      服务端收消息，客户端发消息。
 */
public class Server {
    public static void main(String[] args) throws IOException {
        //        1. 定义一个serversocket进行服务端端口注册
        ServerSocket ss = new ServerSocket(8888);
        //        2.监听客户端的socket 连接请求
        Socket socket = ss.accept();
        InputStream is = socket.getInputStream();
        //        3. 包装成字符缓冲输入流
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String msg;
        while ((msg = br.readLine()) != null){
            System.out.println("服务端收到" + msg);
        }

    }
}

