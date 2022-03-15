
public class instvsstat {
	int A=45;
	static int B=35;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
instvsstat obj =new instvsstat();
instvsstat obj1=new instvsstat();
System.out.println(obj.A);
System.out.println(instvsstat.B);
System.out.println(obj1.A);
System.out.println(obj1.B);
obj.A=100;
obj.B=200;
System.out.println(obj.A);
System.out.println(obj1.B);
	}

}
