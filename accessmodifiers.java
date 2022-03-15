
public class accessmodifiers {
	public void meth1() {
		System.out.println("it is a public method");
		
	}
	void meth2() {
		System.out.println("it's a default method");
	}
	protected void meth3() {
		System.out.println("it's a protected method");
		
	}
	private void meth4() {
		System.out.println("it's a private method");
		
	}

	public static void main(String[] args) {
	accessmodifiers ac=new accessmodifiers();
	ac.meth1();
	ac.meth2();
	ac.meth3();
	ac.meth4();

	}

}
