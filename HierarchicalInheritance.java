package chapter6;

class vehicle {
	void parents () {
		System.out.println("Both Have A vehicle");
	}
}
class Car extends vehicle{
	void car () {
		System.out.println("mom have a car");
	}
}

class Bike extends vehicle{
	void bike () {
		System.out.println("dad have a bike");
	}
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		
		Car m1 = new Car();
		Bike d = new Bike();
		m1.parents();
		m1.car();
		d.parents();
		d.bike();

	}

}
