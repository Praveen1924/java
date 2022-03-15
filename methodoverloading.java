
public class methodoverloading {
static int addition(int a,int b,int c) {
	return a+b+c;
}
static int addition (int a,int b) {
	return a+b;
}
static double addition(double a,double b) {
	return a+b;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(addition(12,13,14));
System.out.println(addition(34,57));
System.out.println(addition(2.56,6));
	}

}
