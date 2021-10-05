package java_io.p2Bio.p4伪异步通信;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * @author xm
 * @date 2021/10/5 12:51
 * @description:
 */
public class ReaderClientRunnable implements Runnable {
    private Socket socket;

    public ReaderClientRunnable(Socket socket) {
        this.socket = socket;
    }


    @Override
    public void run() {

        try {
            InputStream is = socket.getInputStream();
            //        3. 包装成字符缓冲输入流
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String msg;
            while ((msg = br.readLine()) != null){
                System.out.println("服务端收到" + msg);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

