public class EmpWageSwitc {
	// Constants
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	public static final int EMPLOYEE_RATE_PER_HOUR = 100;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Variables
		int totalHours=0;
		int totalDays=0;

		double employeeCheck = Math.floor(Math.random()*10)%3;	// 0-2
		System.out.println("generated - "+employeeCheck);
		
		// TYPE CASTING - external
		int employeeCheck1 = (int) (Math.floor(Math.random()*10)%3);
		System.out.println("integer generated - "+employeeCheck1);
		
		/*
		 * Switch Case
		 */
		switch(employeeCheck1) {
		case IS_FULL_TIME :
				System.out.println("Employee is full time");
				totalHours=8;
				break;
		case IS_PART_TIME:
				System.out.println("Employee is part time");
				totalHours=4;
				break;
		default :
				System.out.println("employee absent");
				break;
		}
		
//		if(employeeCheck == IS_FULL_TIME) {
//			System.out.println("Employee is full time");
//			totalHours=8;
//		}
//		else if(employeeCheck == IS_PART_TIME){
//			System.out.println("Employee is part time");
//			totalHours=4;
//		}
//		else {
//			System.out.println("employee not present");
//		}
		
		System.out.println("wage - "+totalHours*EMPLOYEE_RATE_PER_HOUR);
	}
}
