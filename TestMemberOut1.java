package manual;

public class TestMemberOut1 {
  
		private int data=470;  
			 class Inner{  
			  void msg(){System.out.println("data is "+data);}  
			 }  
			 public static void main(String args[]){  
			  TestMemberOut1 obj=new TestMemberOut1();  
			  TestMemberOut1.Inner in=obj.new Inner();  
			  in.msg();  
			 }  
			}  
