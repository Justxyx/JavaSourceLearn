package java_io.p2Bio.p5图片上传下载的例子;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author xm
 * @date 2021/10/5 17:09
 * @description:
 *
 * 服务端开发
 */
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket socket = new ServerSocket(8888);
        Socket accept = socket.accept();

        ServerThread serverThread = new ServerThread(accept);
        serverThread.start();
    }
}

