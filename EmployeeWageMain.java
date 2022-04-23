import java.util.Random;

class EmployeeWageMain {

	static int wagePerHr = 20; 
	static int workingHr = 8;
	static int dayPerMonth = 20;
	static int totalWorkingHr  = 0 ;
	
	public static void main(String args[])
	{
		System.out.println("Welcome !");
		Random rand = new Random();
			
		while( totalWorkingHr <= 100 && dayPerMonth <=20 ) {
			
			int isEmployee = rand.nextInt(3);	
			switch (isEmployee) {
			case 1 :
			{
				System.out.println("Employee is full time Present");
				int wage1 = (wagePerHr * workingHr );
				System.out.println("Daily full time Employee Wage = " + wage1);
			}
			break;
			case 2 :
			{
				System.out.println("Employee is part time Present");
				int wage2 = (wagePerHr * workingHr );
				System.out.println("Daily part time Employee Wage = " + wage2);
			}	
			break;
			case 0 :
			{
				System.out.println("Employee is Absent");
				System.out.println("Daily Employee Wage = 0 " );
			}
			break;
			default :
			System.out.println("Invalid");
			break;

			} 
			totalWorkingHr = totalWorkingHr + workingHr ;
			System.out.println(totalWorkingHr );
		}
	}
}
