
class Employee
{
	private int employeeId;
	private String firstName;
	private String lastName;
	private String grade;
	private float salary;
	Date d;
	//private Date dateOfJoining;
	private String dateOfJoining;
//Date doj=new Date();
// autogeneration
public static int count = 0;

private void generateId() {
	
   employeeId= ++count;
}


// Parameterized constructor	
public Employee(String firstName,String lastName,String grade,float salary,String doj)
{
	generateId();
	this.firstName= firstName;
	this.lastName= lastName;
	this.grade=grade;
	this.salary=salary;
	dateOfJoining=doj;
}
public void getDate()
{
	d= new Date();
	d.toSubString(dateOfJoining);
	}

public void displayDetails()
{
	System.out.println("Your generated employeeid :"+ employeeId);
	System.out.println("First name : "+ firstName);
	System.out.println("Last name : "+ lastName);
	System.out.println("Grade : "+ grade);
	System.out.println("Your Salary : "+ salary);
	getDate();
    System.out.println("Your date of joining is : " + d.day+"/"+d.month+"/"+d.year);	
}
	
}
