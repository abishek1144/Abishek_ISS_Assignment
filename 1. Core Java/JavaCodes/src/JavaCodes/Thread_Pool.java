package JavaCodes;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Thread_Pool {
	private static final int MAX_THREAD = 4;
	class Task implements Runnable {
	    private String name;
	      
	    public Task(String s){
	        name = s;
	    }

	    public void run(){
	    	try {
	    		for(int i=0; i <5; i++) {
		    		if(i == 0) {
		    			System.out.println("Task: " + name + "has started ");
		    		}
		    		else {
		    			System.out.println("Task: " + name + "is running... ");
		    		}
		    		Thread.sleep(1000);
		    	}
	    		
    			System.out.println("Task: " + name + "is completed");	
	    	}
	    	catch(InterruptedException e) {
	    		e.printStackTrace();		
	    	}
	    }
	}

	public static void main(String[] args) {
		
		Thread_Pool threadPool = new Thread_Pool();
		Runnable r1 = threadPool.new Task("1");
        Runnable r2 = threadPool.new Task("2");
        Runnable r3 = threadPool.new Task("3");
        Runnable r4 = threadPool.new Task("4");
        Runnable r5 = threadPool.new Task("5");
 

        ExecutorService pool = Executors.newFixedThreadPool(threadPool.MAX_THREAD);  

        pool.execute(r1);
        pool.execute(r2);
        pool.execute(r3);
        pool.execute(r4);
        pool.execute(r5);
          
        pool.shutdown(); 

	}
}
