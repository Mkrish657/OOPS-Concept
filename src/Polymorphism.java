

public class Polymorphism extends Method2method {
	
	public void show()
	{
		super.show();
		System.out.println("PRINT DEFAULT SHOW");
		this.show(20l);
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
