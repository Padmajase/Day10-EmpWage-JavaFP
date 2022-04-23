import java.util.Random;

class EmployeeWageMain {
	public static void main(String args[]) {
	System.out.println("Welcome To Employee Wage Computation Program !");
	
	/** Checking Employee is Present or Absent**/ 

	Random rand = new Random();
	int isEmployee = rand.nextInt(2);	
	System.out.println(isEmployee);

	if(isEmployee == 1){
		System.out.println("Employee is Present");
	} else {
		System.out.println("Employee is Absent");
	}

	}
}
class EmployeeWage {

	public static void main(String args[]) {
	System.out.println("Welcome To Employee  Wage computation Program!");	
	}
}
