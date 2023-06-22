package payilagam;

public class Swap_threenos_usingtemp {

	public static void main(String[] args)
	{
		int a=10,b=20,c=30;
		System.out.println("before swap a is "+a+" b is "+b+" c is "+c);
		int t=a;
		a=b;
		b=c;
		c=t;
		System.out.println("after swap a is "+a+" b is "+b+" c is "+c);
	}
}
