package Inherit;

public class Merge extends Inheritance {

	public void multi()
	{
		int a = 10;
		int b = 15;
		int c = a*b;
		System.out.println("Value of c is:" +c);
	}
	public void divide()
	{
		int a = 10;
		int b= 5;
		int c = a/b+20;
		System.out.println("Value of c is:" +c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Merge a = new Merge();
		a.add();
		a.sub();
		a.multi();
		a.divide();
	}

}
