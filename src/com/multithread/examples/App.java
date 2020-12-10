package com.multithread.examples;

 class MyCounter extends Thread{
	 private int threadNo;

	public MyCounter(int threadNo) {
		this.threadNo = threadNo;
	}
	@Override
	public void run() {
		countMe();
	}
	 public void countMe() {
		 for(int i=1; i<=9; i++) {
			 try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			 System.out.println("the value of it id " +i+ " and the thread number is: " +threadNo);
		 }
	 }
	 
 }

public class App {

	public static void main(String[] args) {
		
		MyCounter count1 = new MyCounter(1);
		MyCounter count2 = new MyCounter(2);
		
		long startTime = System.currentTimeMillis();
		count1.start();
		System.out.println("********************************************");
		count2.start();
		long endTime = System.currentTimeMillis();
		
		System.out.println("Total time Required: "+(endTime-startTime));
		

		
	}

}
