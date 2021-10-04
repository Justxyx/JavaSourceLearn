package java_io.p2Bio.p3一个服务端接收多个客户端;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author xm
 * @date 2021/10/3 19:25
 * @description:
 */
public class Client {
    public static void main(String[] args) throws IOException {

//        1. 创建socket对象请求服务端连接
        Socket socket = new Socket("127.0.0.1", 8888);
//        2. 获取字符输出流
        OutputStream os = socket.getOutputStream();
//        3. 包装成打印流
        PrintStream ps = new PrintStream(os);
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("请说");
            String next = scanner.next();
            ps.println(next);
            ps.flush();
        }
    }
}

