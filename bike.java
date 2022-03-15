
public class bike {
 static float wheels=2;
 static String color="red ";
 static void brake()
 {System.out.println("bike gets slowed");
	 
 }
 void mileage(int s)
 {
	 System.out.println("the mileage is "+s);
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 bike RE=new bike();
 bike R15=new bike();
 bike Duke =new bike();
 RE.brake();
 R15.brake();
 Duke.brake();
 RE.mileage(80);
 R15.mileage(78);
 Duke.mileage(79);
 
 }
	
}
