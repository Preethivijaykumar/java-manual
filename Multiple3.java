
public class Multiple3 implements Runnable {
	public void run(){  
	System.out.println("thread is running...");  
	}  
	  
	public static void main(String args[]){  
	Multiple3 m1=new Multiple3();  
	Thread t1 =new Thread(m1);  
	t1.start();  
	 }  
	}  
