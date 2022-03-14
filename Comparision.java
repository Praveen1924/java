
import java.util.Scanner;
public class Comparision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a=new Scanner(System.in);
		System.out.println("enter first value");
		int c=a.nextInt();
		System.out.println("enter second value");
		int d=a.nextInt();
 if(c>d) {
	 System.out.println(c+" is larger");
 }
 if(c<d)
 {
	 System.out.println(d+" is larger");
 }
 else
	{
		System.out.println("These numbers are equal");
	}

	}
}
