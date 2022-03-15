
public class constructor {
	int a;
	String b;
	constructor(int c,String d)
	{
		a=c;
		b=d;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
constructor O =new constructor(45, "  sum");
constructor X=new constructor(67," mutliply");
	System.out.println(O.a+X.b);
	System.out.println(X.a+O.b);
	}

}
