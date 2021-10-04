package java_io.p2Bio.p3一个服务端接收多个客户端;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author xm
 * @date 2021/10/3 19:55
 * @description:
 */
public class ServerThread extends Thread {
    private Socket socket;

    public ServerThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            InputStream inputStream = socket.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            while ((line = reader.readLine()) != null){
                System.out.println("服务端收到： " + Thread.currentThread().getName() + line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

