
class Check {
	static int c=67;
	void m1() {
		 int a1=90;
		 int b1=89;
			System.out.println(a1);

	}	
}
public class Checking extends Check {
	static int c=899;
	void m1() {
		 int a1=90;
		 int b1=89;
		 int c=990;
			System.out.println(this.c);

	}	
	public static void main(String args[]) {
		int a1=34;
		int b=78;
		System.out.println(a1);
		Checking c=new Checking();
		c.m1();

	}
}
