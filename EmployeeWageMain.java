import java.util.Random;

// managing Employee Wage of multiple companies using API approach 

interface EmployeeWage {
	
	int wagePerHr = 20; 
	int workingHr = 8;
	int dayPerMonth = 20;
	int totalWorkingHr  = 0 ;
	int totalWage = 0;

	void calculateEmpWage(String companyName, int wagePerHour, int workingHour, int workingDays);
}

class Wipro {	
	static String companyName;
	static int wagePerHour;
	static int workingHour;
	static int workingDays;

	public void calculateEmpWage(String companyName, int wagePerHour, int workingHour, int workingDays)
	{	
		this.companyName = companyName;
		this.wagePerHour = wagePerHour;
		this.workingHour = workingHour;
		this.workingDays = workingDays;

			while( totalWorkingHr <= 100 && dayPerMonth <=20 ) {
			Random rand = new Random();
			int isEmployee = rand.nextInt(3);	
			
			switch (isEmployee) {
			case 1 :
			{
				int wage = (wagePerHr * workingHour );
			}
			break;
			case 2 :
			{
				int wage = (wagePerHr * workingHour );
			}	
			break;
			case 0 :
			{
				int wage  = 0;
			}
			break;
			default :
			System.out.println("Invalid");
			break;

			} 
			totalWorkingHr = totalWorkingHr + workingHour ;
		}
		totalWage = wagePerHour * totalWorkingHr ;
	}

	@Override
	public String toString() {
		return "wage for company " companyName +" is "+ totalWage;
	}
}


class Wipro {	
	static String companyName;
	static int wagePerHour;
	static int workingHour;
	static int workingDays;

	public void calculateEmpWage(String companyName, int wagePerHour, int workingHour, int workingDays)
	{	
		this.companyName = companyName;
		this.wagePerHour = wagePerHour;
		this.workingHour = workingHour;
		this.workingDays = workingDays;

			while( totalWorkingHr <= 100 && dayPerMonth <=20 ) {
			Random rand = new Random();
			int isEmployee = rand.nextInt(3);	
			
			switch (isEmployee) {
			case 1 :
			{
				int wage = (wagePerHr * workingHour );
			}
			break;
			case 2 :
			{
				int wage = (wagePerHr * workingHour );
			}	
			break;
			case 0 :
			{
				int wage  = 0;
			}
			break;
			default :
			System.out.println("Invalid");
			break;

			} 
			totalWorkingHr = totalWorkingHr + workingHour ;
		}
		totalWage = wagePerHour * totalWorkingHr ;
	}

	@Override
	public String toString() {
		return "wage for company " companyName +" is "+ totalWage;
	}
}	

class EmployeeWageMain {
	public static void main(String args[]) {
		System.out.println("Welcome To Employee Wage Computation program !");
		Wipro wipro = new Wipro();
		wipro.calculateEmpWage("WIPRO", 20, 8, 20);
		System.out.println(wipro);
		TCS tcs = new TCS ();
		wipro.calculateEmpWage("TCS", 30, 8, 20);
		System.out.println(tcs);
	}
}

