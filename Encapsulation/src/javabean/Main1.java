package javabean;

public class Main1 {

	public static void main(String[] args) {
		
		
	Employee emp=new Employee();
	emp.setId(123);
	emp.setName("Deepak");
	emp.setSal(67.0);
	//int id= emp.getId();
	//String name=emp.getName();
	//double sal=emp.getSal();
	System.out.println("id:"+emp.getId());
	System.out.println("name:"+emp.getName());
	System.out.println("sal:"+emp.getSal());

	}

}
