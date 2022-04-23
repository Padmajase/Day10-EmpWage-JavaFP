import java.util.Random;

// managing Employee Wage of multiple companies using API approach 

interface EmployeeWageMain {
	
	public static final int wagePerHr = 20; 
	public static final int workingHr = 8;
	public static finalint dayPerMonth = 20;
	public static finalint totalWorkingHr  = 0 ;
	public static final int totalWage = 0;

	abstract public void calculateEmpWage(String companyName, int wagePerHour, int workingHour, int workingDays);
}

class Wipro {
	
	String companyName;
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
		return "wage for company " mpanyName +" is "+ totalWage;
	}
	

	public static void main(String args[])
	{
		System.out.println("Welcome To Employee Wage Computation program !");
		EmployeeWageMain wipro = new EmployeeWageMain();
		wipro.calculateEmpWage("WIPRO", 20, 8, 20);
		System.out.println(wipro);
		EmployeeWageMain tcs = new EmployeeWageMain ();
		wipro.calculateEmpWage("TCS", 30, 8, 20);
		System.out.println(tcs);
	}
}

