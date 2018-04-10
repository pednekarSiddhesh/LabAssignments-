import java.util.*;
class Employee
{
	private int employeeId;
	private String firstName;
	private String lastName;
	private String grade;
	private float salary;
	private String dateOfJoining;
    int id=0;

// autogeneration
public static int count = 0;

private void generateId() {
	
   id= ++count;
}


// Parameterized constructor	
public Employee(String firstName,String lastName,String grade,float salary,String doj)
{
	generateId();
	this.firstName= firstName;
	this.lastName= lastName;
	this.grade=grade;
	this.salary=salary;
	this.dateOfJoining= doj;
}
public void displayDetails()
{
	System.out.println("Your generated employeeid :"+ id);
	System.out.println("First name : "+ firstName);
	System.out.println("Last name : "+ lastName);
	System.out.println("Grade : "+ grade);
	System.out.println("Your Salary : "+ salary);
System.out.println("Your date of joining is : "+ dateOfJoining);	
		
}
	
}
