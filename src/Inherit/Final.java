package Inherit;

public class Final {
	
	int a,b,c;
	
	Final (int i,int j, int k)
	{
		a=i;
		b=j;
		c=k;
	}

	public Final() {
		// TODO Auto-generated constructor stub
	}

	public void example(){
		System.out.println("Print a:" +a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Final F = new Final(10,20,30);
		F.example();
		

	}

}
