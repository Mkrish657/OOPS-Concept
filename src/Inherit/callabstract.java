package Inherit;

public class callabstract extends Abstraction{

	@Override
	public void sub() {
		int a = 35;
		int b =45;
		int c = a-b*55;
		System.out.println("Value of C:" +c);
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		callabstract ac = new callabstract();
		ac.add();
		ac.sub();	
	}


}
