package typecasting;

public class Son extends Father
{
 int y=15;
 public static void main(String[] args) {
	Father f= new Son();//Upcating one way
	System.out.println(f.x);
	Son s=new Son();//Upcasting another way
	Father f1=s;//Upcasting another way
	System.out.println(f1.x);
	
	Son s1=(Son)f;//downcasting 
	System.out.println(s1.x);
	System.out.println(s1.y);
}
}
