package com.java2.server;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JFrame;

public class Tester extends JFrame {
	public Tester() {
		setSize(200,300);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Socket socket = new Socket("ppt.cc", 23);
			InputStream ips = socket.getInputStream();
			int data = 0;
			for(int i = 0;i<5000;i++) {
				data = ips.read();
				System.out.println((char)data);
			}
			ips.close();
			socket.close();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
