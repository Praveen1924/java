
public class cbr {
int a;
int b;
private static void add(cbr x,cbr y)
{
	x.a=3;
	System.out.println("hello"+(x.a+y.b));
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
cbr x=new cbr();
cbr y=new cbr();
x.a=4;
y.b=6;
System.out.println(x.a+y.b);
add(x,y);
System.out.println(x.a+y.b);

	}

}
