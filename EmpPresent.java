public class EmpPresent{
 public static void main(String[] args){
 //constant
 int IS_FULL_TIME=1;
 //computations
 double employeeCheck=Math.floor(Math.random()*10)%2;
 System.out.println("generated - "+employeeCheck);

 //Type Casting External
  int employeeCheck1=(int) (Math.floor(Math.random()*10)%2);
  System.out.println("integer generated - "+employeeCheck1);

  if(employeeCheck == IS_FULL_TIME){
     System.out.println("Employee Present");
  }
  else{
     System.out.println("Employee Absent");
  }
  }
}

