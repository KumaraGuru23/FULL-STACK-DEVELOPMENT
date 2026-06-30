package chapter6;

class work1 {
	void person () {
		System.out.println("Person To Employee : Have Any vacancy");
	}
}

class work2 extends work1 {
	void employee () {
		System.out.println("Employee To Manager : Sir Have Any vacancy");
		
	}
}
class work3 extends work2 {
	void manager () {
		System.out.println("Manager To Employee : Yes, Told Him To Come For A Interview");
		
	}
}

public class MultilevelInheritance {

	public static void main(String[] args) {
		work3 w = new work3();
		 
		w.person();
		w.employee();
		w.manager();
		

	}

}
