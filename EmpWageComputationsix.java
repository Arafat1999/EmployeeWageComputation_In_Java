public class EmpWageComputationsix
{

	public static void main(String[] args)
	{
		System.out.println("***WELCOME TO EMPLOYEE WAGE COMPUTATION***");

		int empRatePerHour=20;
		int empHrs=0;
		int wage=0;
		int totalempHours=0;
		int totalWorkDays=0;

		for(int i=0;i<31;i++)
		{
			if(totalWorkDays>20 || totalempHours>=100)break;

			int empCheck=(int)(Math.random()*10%3);

			switch(empCheck)
			{
			case 1:
				empHrs=8;
				totalWorkDays++;
				wage=wage+empHrs*empRatePerHour;
				totalempHours=totalempHours+empHrs;
				break;
			case 2:
				empHrs=4;
				wage=wage+empHrs*empRatePerHour;
				totalempHours=totalempHours+empHrs;
				totalWorkDays++;
				break;
			}
		}
		System.out.println("Employee Total Salary Is:" + wage);
	}
}
