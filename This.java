
public class This {
	String n;
This(String n)
{
	this.n=n;
}
void display() {
	System.out.println("this keyword using"+n);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stu
		This O=new This(" sun");
		O.display();
	}

}
