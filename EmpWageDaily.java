public class EmpWageDaily{

    public static final int EMPLOYEE_RATE_PER_HOUR = 20;

    public static void main(String[] args) {
    

   	int present=1;
	int totalHours=0;
//checking employee is present or not
        int employeeCheck = (int) (Math.floor(Math.random()*10)%3);
                System.out.println("integer generated - "+employeeCheck);

	if(employeeCheck == present) {
                      System.out.println("Employee is present");
                      totalHours=8;
//worked for 8 hours in a day
	}
	else{
		System.out.println("Employee is absent");
		totalHours=0;
//employee is absent
	}
	 System.out.println("wage - "+totalHours*EMPLOYEE_RATE_PER_HOUR);
//daily wage of employee

   }
}
