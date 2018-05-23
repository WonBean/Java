package aaa;

import java.io.*;
import java.net.*;

public class TcpIpClient5 {

	public static void main(String[] args) {
		try {
			String serverIp = "10.10.10.141";
			Socket socket = new Socket(serverIp, 7777);

			System.out.println("������ ����Ǿ����ϴ�.");
			Sender sender = new Sender(socket);
			Receiver receiver = new Receiver(socket);

			sender.start();
			receiver.start();
		} catch (ConnectException ce) {
			ce.printStackTrace();
		} catch (IOException ie) {
			ie.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
