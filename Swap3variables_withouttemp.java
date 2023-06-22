package payilagam;

public class Swap3variables_withouttemp {

	public static void main(String[] args)
	{
		int a=10,b=20,c=30;
		System.out.println("before swap a is "+a+" b is "+b+" c is "+c);
		a=a+b+c;
		b=a-(b+c);
		c=a-(b+c);
		a=a-(b+c);
		System.out.println("after swap a is "+a+" b is "+b+" c is "+c);
	}
}
