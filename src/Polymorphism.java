

public class Polymorphism extends Method2method {
	final long a = 10;
	public void show()
	{
		super.show();
		System.out.println("PRINT DEFAULT SHOW");
		this.show(a);
		this.show(30);
	}

	public void show(int a)
	{
		System.out.println("Print Value of a:" +a);
	}
	public void show(long a)
	{
		System.out.println("Print Value of Long a:" +a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polymorphism P = new Polymorphism ();
		P.show();

	}

}
