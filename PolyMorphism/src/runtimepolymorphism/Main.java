package runtimepolymorphism;

public class Main {


	//1.Employee emp = new Developer();-> emp.work()->Developing App
	//2.Employee emp - new Tester(); -> emp.work() -> testing app

	static void display(Employee emp) {
		emp.work();


	}
	public static void main(String[] args) {

		//1.Upcasting using method
		display(new Developer());
		display(new Tester());
		System.out.println("--------------------");

		//2.Seperate reference variable
		Employee e1= new Developer();//rule 3 upcasting
		e1.work();
		Employee e2=new Tester();//rule 3 upcasting
		e2.work();
		System.out.println("--------------");
		
		//3 single reference
		Employee emp;
		emp=new Developer();
		emp.work();
		Employee e3;
		e3=new Tester();
		e3.work();
		
		

	}

}
