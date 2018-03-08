package Inherit;

public class callencaps {

public void encaps1() {
	
	Encapsulation ec=new Encapsulation();
	ec.setFnum(25);
	ec.setSnum(30);
	ec.setResult(ec.getFnum()+ec.getSnum());
	System.out.println("VAlue of getresult: " +ec.getResult());
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		callencaps cc=new callencaps();
		cc.encaps1();

	}

}
