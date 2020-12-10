package com.multithread.examples;

public class MultithreadingDemo extends Thread {
	
	public void run() {
		System.out.println("my thread is executed");
	}

	public static void main(String[] args) {
		
		MultithreadingDemo demo = new MultithreadingDemo();
		demo.start();
	}

}
