

public class Method2method {
	
	public void show()
	{
		System.out.println("PRINT DEFAULT SHOW from Parent");
		this.method1();
	}
	
	public void method1(){
		int a = 25;
		int b = 30;
		int c = a*b;
		System.out.println("Value of C :" +c);
		this.method2();
	}
	public void method2(){
		int a = 25;
		int b = 30;
		int c = a-b;
		System.out.println("Value of C :" +c);
	}
}


	
