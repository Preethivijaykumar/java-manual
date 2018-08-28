package manual;

public class student {

	 int rollno;  
	 String name;  
	 String city;  
	  
	 student(int rollno, String name, String city){  
	 this.rollno=rollno;  
	 this.name=name;  
	 this.city=city;  
	 }  
	  
	 public static void main(String args[]){  
	   student s1=new student(101,"Raj","lucknow");  
	   student s2=new student(102,"Vijay","ghaziabad");  
	     
	   System.out.println(s1);//compiler writes here s1.toString()  
	   System.out.println(s2);//compiler writes here s2.toString()  
	 }  
	}  
