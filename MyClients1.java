//这是一个客户端程序，可以连接服务器端

package com.test;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;


public class MyClients1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyClients1 mc1 = new MyClients1();
		
	}
   
	public MyClients1()
	{
		try {
			
			//Socket()就是连接某个服务器端，192.168.0.106表示服务器的ip
			//999就是端口号
			Socket s = new Socket("192.168.0.106",999);
			
			//如果socket连接成功，就可以发送数据给服务器
		 
			//我们通过pw向s写数据,true表示及时刷新
			PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
		
		    pw.println("你好吗？我是客户端");
		  //要读取s中传递的数据
		    InputStreamReader isr = new InputStreamReader(s.getInputStream());
		    BufferedReader br = new BufferedReader(isr);
		    
		    String response = br.readLine();
		    System.out.println("我是客户端，我收到了服务器回送的消息:"+response);
		}
		 catch (Exception e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
