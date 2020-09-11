public class EmpWageComputationseven
{
		public static int calWage(int empCheck,int empRatePerHour)
		{
			int wage=0;

			switch(empCheck)
			{
				case 1:
						wage=empRatePerHour*8;
						break;
				case 2:
						wage=empRatePerHour*4;
						break;
			}
			return wage;
		}

	public static void main(String[] args)
	{
		System.out.println("***WELCOME TO EMPLOYEE WAGE COMPUTATION***");

		int empRatePerHour=20;
		int totalWorkdays=0;
		int totalWorkHours=0;
		int wage=0;

		for(int i=0;i<31;i++)
		{
			if(totalWorkdays>=20 || totalWorkHours>=100)break;

			int empCheck=(int)(Math.random()*10%3);
			wage+= calWage(empCheck,empRatePerHour);

			if(empCheck==1)totalWorkHours+=8;
			if(empCheck==2)totalWorkHours+=4;
			if(empCheck==1||empCheck==2)
			totalWorkdays++;
		}

		System.out.println("Total Employee Salary Is:" + wage);
		System.out.println("Total Employee Work Hours Is:" + totalWorkHours);
		System.out.println("Total Employee Work Days Is:" + totalWorkdays);
	}
}
