public class EmpWageComputationfive {

	public static void main(String[] args) {

		System.out.println("***WELCOME TO EMPLOYEE WAGE COMPUTATION***");

		int wage=0;
      int wageperHour=20;
		int workingday=20;
		int workingHour;

		int empCheck=(int)(Math.random()*10%3);

		switch(empCheck)
		{
		case 1:
				workingHour=8;
				wage=workingday*wageperHour*workingHour;
				System.out.println("Employee Works Full Time & Daily Wage Is:" + wage);
				break;
		case 2:
				workingHour=4;
				wage=workingday*wageperHour*workingHour;
      		System.out.println("Employee Works Part Time & Daily Wage Is:" + wage);
				break;
		default:
				System.out.println("Employee is Absent.");
				break;
		}
	}
}
