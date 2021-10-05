package java_io.p2Bio.p4伪异步通信;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author xm
 * @date 2021/10/5 12:50
 * @description:
 */
public class Service {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        HandlerSocketThreadPool pool = new HandlerSocketThreadPool();
        while (true){
            Socket accept = serverSocket.accept();
            pool.execute(new ReaderClientRunnable(accept));
        }
    }
}

