import java.util.Random;

/** saving the total Wage for Each company **/
class EmployeeWageMain {
	
	static int wagePerHr = 20; 
	static int workingHr = 8;
	static int dayPerMonth = 20;
	static int totalWorkingHr  = 0 ;
	static int totalWage = 0;

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
		return "wage for company " + companyName +" is "+ totalWage;
	}
	

	public static void main(String args[])
	{
		System.out.println("Welcome To Employee Wage Computation program !");
		EmployeeWageMain wipro = new EmployeeWageMain();
		wipro.calculateEmpWage("WIPRO", 20, 8, 20);
		System.out.println(wipro);
		EmployeeWageMain tcs = new EmployeeWageMain();
		wipro.calculateEmpWage("TCS", 30, 8, 20);
		System.out.println(tcs);
	}
}

