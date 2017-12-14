package com.shengpay.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class DivThreadFactoryDemo {

	static class MyTask implements Runnable{

		int a,b;
		
		public MyTask(int a, int b) {
			this.a = a;
			this.b = b;
		}


		@Override
		public void run() {
			double re = a/b;
			System.out.println(re);
		}
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		
		ExecutorService es = new ThreadPoolExecutor(
				0, 
				Integer.MAX_VALUE,
				0, 
				TimeUnit.MILLISECONDS,
				new SynchronousQueue<Runnable>());
		
		for (int i = 0; i < 5; i++) {
			MyTask myTask = new MyTask(100,i);
//			es.submit(myTask);
			es.execute(myTask);
		}
		
		
	}
	
	
}
