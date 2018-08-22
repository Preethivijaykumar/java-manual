package manual;

public class circle{  
	 operation op;//aggregation  
	 double pi=3.14;  
	    
	 double area(int radius){  
	   op=new operation();  
	   int rsquare=op.square(radius);//code reusability (i.e. delegates the method call).  
	   return pi*rsquare;  
	 }  
	  
	     
    
	 public static void main(String args[]){  
	   circle c=new circle();  
	   double result=c.area(150);  
	   System.out.println(result);  
	 }  
	}  
