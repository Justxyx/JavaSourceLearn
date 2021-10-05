package java_io.p2Bio.p4伪异步通信;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author xm
 * @date 2021/10/5 12:39
 * @description:
 */
public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("127.0.0.1", 8888);
            OutputStream outputStream = socket.getOutputStream();
            PrintStream printStream = new PrintStream(outputStream);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String line = null;
            while ((line = bufferedReader.readLine()) != null){
                printStream.println(line);
                printStream.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

