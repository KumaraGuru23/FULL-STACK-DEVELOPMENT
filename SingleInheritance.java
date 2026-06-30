package chapter6;

class mathteacher {
	void sum() {
		System.out.println("Teacher Teach The sum");
	}
}

class teacher extends mathteacher {
	void program() {
		System.out.println("Teacher Teach The Program");
	}
}


public class SingleInheritance {

	public static void main(String[] args) {
		teacher t = new teacher();
		t.sum();
		t.program();

	}

}
