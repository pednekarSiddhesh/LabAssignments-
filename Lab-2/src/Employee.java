
class Employee
{
	private int employeeId;
	private String firstName;
	private String lastName;
	private String grade;
	private float salary;
	private Date doj;
// autogeneration
public static int count = 0;

private void generateId() {
	
   employeeId= ++count;
}


// Parameterized constructor	
public Employee(String firstName,String lastName,String grade,float salary,Date doj)
{
	generateId();
	this.firstName= firstName;
	this.lastName= lastName;
	this.grade=grade;
	this.salary=salary;
	this.doj=doj;
}


public void displayDetails()
{
	System.out.println("Your generated employeeid :"+ employeeId);
	System.out.println("First name : "+ firstName);
	System.out.println("Last name : "+ lastName);
	System.out.println("Grade : "+ grade);
	System.out.println("Your Salary : "+ salary);
  //  System.out.println("Your date of joining is : " + doj.toString());	
  //  System.out.println("Your date of joining is : " + doj.getDate());	
    System.out.println("Your date of joining is : " + doj);	
    System.out.println("");
}
	
}
