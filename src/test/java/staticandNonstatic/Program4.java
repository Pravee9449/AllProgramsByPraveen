package staticandNonstatic;

public class Program4 {
	void start() {
		System.out.println("non static method");
	}

	static void start2() {
		System.out.println("static methoddjdjdjjjdj");

	}

	int a = 20;
	static int b = 30;

	public static void main(String[] args) {
		Program4 p = new Program4();
		p.start();
		System.out.println(p.a);
		start2();
		System.out.println(b);
	}

}
