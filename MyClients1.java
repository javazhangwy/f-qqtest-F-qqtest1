//����һ���ͻ��˳��򣬿������ӷ�������

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
			
			//Socket()��������ĳ���������ˣ�192.168.0.106��ʾ��������ip
			//999���Ƕ˿ں�
			Socket s = new Socket("192.168.0.106",999);
			
			//���socket���ӳɹ����Ϳ��Է������ݸ�������
		 
			//����ͨ��pw��sд����,true��ʾ��ʱˢ��
			PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
		
		    pw.println("��������ǿͻ���");
		  //Ҫ��ȡs�д��ݵ�����
		    InputStreamReader isr = new InputStreamReader(s.getInputStream());
		    BufferedReader br = new BufferedReader(isr);
		    
		    String response = br.readLine();
		    System.out.println("���ǿͻ��ˣ����յ��˷��������͵���Ϣ:"+response);
		}
		 catch (Exception e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
