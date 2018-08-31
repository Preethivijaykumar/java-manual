
public class TestMultiThreading1 extends Thread {
       public void run(){  
	   System.out.println("running...");  
	  }  
	 public static void main(String args[]){  
	  TestMultiThreading1 t1=new TestMultiThreading1();  
	  TestMultiThreading1 t2=new TestMultiThreading1();  
	  System.out.println("Name of t1:"+t1.getName());  
	  System.out.println("Name of t2:"+t2.getName());  
	   
	  t1.start();  
	  t2.start();  
	  
	  t1.setName("preethi vijay");  
	  System.out.println("After changing name of t1:"+t1.getName());  
	 }  
	}  
