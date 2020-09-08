public class EmpWageComputationfour {

	public static void main(String[] args) {

		System.out.println("***WELCOME TO EMPLOYEE WAGE COMPUTATION***");

		int wage=0;
		int partTimeWage=0;
		int fullTime=1;
      int wageperHour=20;
      int fullDayHour=8;
		int parttimehour=4;

		int empCheck=(int)(Math.random()*10%3);

		switch(empCheck)
		{
		case 1:
				System.out.println("Employee is Present.");
				wage=wageperHour*fullDayHour;
				System.out.println("Daily Employee Wage Is:" + wage);
				break;
		case 2:
				System.out.println("Employee is Present.");
				partTimeWage=wageperHour*parttimehour;
				System.out.println("Employee Works Part Time & his Daily Wage Is:" + partTimeWage);
				break;
		default:
				System.out.println("Employee is Absent.");
				break;
		}
	}
}
