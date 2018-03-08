package Inherit;

public class mainmethod implements innerface,innerface2 {
public void method1() 
{
	System.out.println("Print method1");
}
@Override
public void method2() {
	// TODO Auto-generated method stub
	System.out.println("Print method2");	
}


@Override
public void method3() {
	// TODO Auto-generated method stub
	System.out.println("Print method3");
}	
@Override
public void method4() {
	// TODO Auto-generated method stub
	System.out.println("Print method4");
}
@Override
public void method5() {
	// TODO Auto-generated method stub
	System.out.println("Print method5");
}
@Override
public void method6() {
	// TODO Auto-generated method stub
	System.out.println("Print method6");
}
public static void main(String[] args) {
		// TODO Auto-generated method stub
mainmethod mm = new mainmethod();
mm.method1();
mm.method2();
mm.method3();
mm.method4();
mm.method5();
mm.method6();
	}


	

}
