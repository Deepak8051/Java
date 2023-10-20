package runtimepolymorphism;

public class Employee {
	void work() {
		System.out.println("working");
	}

}

class Developer extends Employee {  
	@Override
	void work() {
		System.out.println("Developing app");
	}
}
class Tester extends Employee {
	@Override
	void work() {
		System.out.println("Testing app");
	}
}