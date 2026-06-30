package chapter6;

class product {
	String ktm = "Duke";
	
	void showDetails() {
		System.out.println("Bike Brand : "+ ktm);
		}
}
class bike extends product {
	String ktm = "Rc";
	
	void display() {
		System.out.println("KTM BRAND = "+ktm);
		System.out.println("KTM BRAND = "+super.ktm);
	}
	
}
public class SuperKeyWord {

	public static void main(String[] args) {
		
		bike b = new bike();
		
		b.display();

	}

}
