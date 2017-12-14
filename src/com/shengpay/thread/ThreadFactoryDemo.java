package com.shengpay.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadFactoryDemo {

	static class MyTask implements Runnable{

		@Override
		public void run() {
			
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		MyTask myTask = new MyTask();
		
		ExecutorService es = new ThreadPoolExecutor(
				5, 
				5,
				0, 
				TimeUnit.MILLISECONDS,
				new SynchronousQueue<Runnable>(), 
				new ThreadFactory() {
					@Override
					public Thread newThread(Runnable r) {
						Thread t = new Thread();
						t.setDaemon(true);
						System.out.println("create " + t);
						return t;
					}
				});
		
		for (int i = 0; i < 5; i++) {
			es.submit(myTask);
		}
		
		Thread.sleep(2000);
		System.out.println(Runtime.getRuntime().availableProcessors());
		
	}
	
	
}
