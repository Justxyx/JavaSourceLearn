package java_io.p2Bio.p3一个服务端接收多个客户端;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author xm
 * @date 2021/10/3 19:53
 * @description:
 *      服务端，启动多线程技术。
 *      目标：
 *          服务端可接收多个客户端服务
 */
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket socket = new ServerSocket(8888);
        while (true){
            Socket accept = socket.accept();
            ServerThread thread = new ServerThread(accept);
            thread.start();
        }
    }
}

