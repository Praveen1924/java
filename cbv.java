
public class cbv {
	int a;
	int b;
	public static int add(int x, int y) {
		 x=50;
		 System.out.println(x+y);
		return (x+y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
cbv o=new cbv();
o.a=4;
o.b=6;
System.out.println(o.a+o.b);
o.add(o.a, o.b);
System.out.println(o.a+o.b);

}

}
