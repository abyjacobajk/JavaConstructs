public class EmpWageCompany {
	//constants
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	
	private final String company;
	private final int empRatePerHour;
	private final int numOfWorkingDays ;
	private final int maxHoursPerMonth;
	
	public  EmpWageCompany( String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth ) {
	 
		this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHoursPerMonth = maxHoursPerMonth;
	}
	
	private int computeEmpWage() {
	      // variables
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
		// Computation
	//public static void main(String[] args) {
		
//		EmpWageMonthly dMart =new EmpWageMonthly("dMart", 20,2,10);
		//variables
	//	int totalEmpHrs = 0, totalEmpWage = 0, totalWorkingDays = 0;
		// Computation
		while (totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < numOfWorkingDays ) {
			
			totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
		    switch (empCheck) {
		    case IS_PART_TIME:
		    	empHrs =8;
		    	break;
		    case IS_FULL_TIME:
		    	empHrs = 16;
		    	break;
	    	default:
	    		empHrs = 0;
	    }
	totalEmpHrs += empHrs;
	System.out.println("Days#:" + totalWorkingDays + " Emp Hr: " +empHrs);
}
	//int totalEmpWage = totalEmpHrs * empRate;
	//System.out.println("Total EmpWage For Company:" +company+ " is: "+totalEmpWage);
	return totalEmpHrs * empRatePerHour;
}
    public static void main(String[] args) {
	 EmpWageCompany dMart = new EmpWageCompany ("DMart", 20, 2, 11);
	 EmpWageCompany BigBasket = new EmpWageCompany ("BigBasket", 10, 5, 10);
	 System.out.println("total wage for company" + dMart.company + " is: " +dMart.computeEmpWage());
	 System.out.println("total wage for company" + BigBasket.company + " is: " +BigBasket.computeEmpWage());
}
}
