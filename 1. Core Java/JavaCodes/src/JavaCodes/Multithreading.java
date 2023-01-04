package JavaCodes;

public class Multithreading {
	public class MultithreadingWithThread extends Thread{
		public void run(){
	        try {

	            System.out.println("Thread with Thread class: " + Thread.currentThread().getId());
	        }
	        catch (Exception e) {

	            System.out.println("Exception is caught");
	        }
	    }
	}
	
	public class MultithreadingWithRunnable implements Runnable{
		@Override
		public void run(){
	        try {

	            System.out.println("Thread with Runnable Interface: " + Thread.currentThread().getId());
	        }
	        catch (Exception e) {
	 
	            System.out.println("Exception is caught");
	        }
	    }
	}

	public static void main(String[] args) {

		Multithreading d = new Multithreading();
		int n = 6; 
		for (int i = 0; i < n; i++) {
			MultithreadingWithThread usingThread =d.new MultithreadingWithThread();
			usingThread.start();
        }
		System.out.println("MultiThreading with runnable class ");
        for (int i = 0; i < n; i++) {
        	Thread usingRunnable = new Thread (d.new MultithreadingWithRunnable());
        	usingRunnable.start();
        }

	}

}

