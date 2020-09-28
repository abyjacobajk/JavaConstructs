public class EmpWageLoop {
        // Constants
        public static final int WORK_HOURS=1;
        public static final int IS_FULL_TIME = 2;
	public static final int IS_PART_TIME = 1;
        public static final int EMPLOYEE_RATE_PER_HOUR = 100;

        public static void main(String[] args) {
                // TODO Auto-generated method stub

                // Variables
                int totalHours=0;
                int totalDays=20;
		int hour=100;

                double employeeCheck = Math.floor(Math.random()*10)%3;  // 0-2
                System.out.println("generated - "+employeeCheck);

              

		for(int i=0; i<=hour; i++){
 			if(employeeCheck == IS_FULL_TIME) {
        	              totalHours=10;
                	}
                	else if(employeeCheck == IS_PART_TIME){
                      	      totalHours=5;
              		}
              		else {
                      	      totalHours=0;
             		 }

			int WORK_HOURS=totalHours;
	     	}
		System.out.println("hour -"+WORK_HOURS*totaldays);
                System.out.println("wage - "+WORK_HOURS*EMPLOYEE_RATE_PER_HOUR*totalDays);
 	       }
}


