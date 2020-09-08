public class EmpWageComputationtwo {

	public static void main(String[] args) {
		
		System.out.println("***WELCOME TO EMPLOYEE WAGE COMPUTATION***");
		
		int isPresent=1;
		int wage=0;
      int wageperHour=20;
      int fullDayHour=8;

		int empCheck=(int)(Math.random()*10%2);
		if(isPresent==empCheck)
		{
			System.out.println("Employee is Present.");
			wage=wageperHour*fullDayHour;
			System.out.println("Daily Employee Wage Is:" + wage);
		}
		else
		{
			System.out.println("Employee is Absent.");
		}
	}
}
