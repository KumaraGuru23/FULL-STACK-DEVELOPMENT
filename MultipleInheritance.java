package chapter6;

interface a {
	void duke (); 
	
}
interface b {
	void ktm ();
}
class c implements a, b {
	public void duke() {
		System.out.println("duke was a 200 cc bike and price is = 2,00,000");
	}
	public void ktm () {
		System.out.println("ktm was a 390 cc bike and price is = 3,00,000");
	}
}
public class MultipleInheritance {

	public static void main(String[] args) {
		
		c obj = new c();
		obj.duke();
		obj.ktm();
		

	}

}
