package JavaBasics;

public class EmployeeMethod {

			
		String name;
		String id;
		String department;
		double salary;
		String shift;
		
		void work() {
		System.out.println(name+" is working on shift "+shift);
		}
		
		void takeLeaves() {
		System.out.println(name+" is going on leaves");
		}
		
		public static void main(String[] args) {
			
		EmployeeMethod emp = new EmployeeMethod();
		emp.name="john";
		emp.id="123";
		emp.department="IT";
		emp.salary=200000;
		emp.shift="Evening";
		
		emp.work();
		
		EmployeeMethod emp2 = new EmployeeMethod();
		emp2.name="Adam";
		//emp2.department="Sales";
		//emp2.id="456A";
		//emp2.salary=150000;
		//emp2.shift="Morning";
		
		emp2.takeLeaves();

	}

}
