package com.multithread.examples;

public class MultithreadingRunableInterface implements Runnable {
	
	public void run() {
		System.out.println("My thread is in running state");
	}

	public static void main(String[] args) {

		MultithreadingRunableInterface mtri = new MultithreadingRunableInterface();
		
		Thread thread = new Thread(mtri);
		thread.start();
		
	}

	
}
