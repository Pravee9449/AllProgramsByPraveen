package staticandNonstatic;

public class Program5 {
	void start4()
{
		System.out.println("non static method4");
}
	static void start5()
	{
		System.out.println("static method5");
		
	}
	int c=50;
	static int d=70;

	public static void main(String[] args) {
		Program5 p1=new Program5();
		p1.start4();
		start5();
		System.out.println(p1.c);
		System.out.println(d);
		p1.start4();
		Program4 p=new Program4();
		p.start();
		System.out.println(p.a);
		p.start2();
	    System.out.println(p.b);
		
		
	}

}
