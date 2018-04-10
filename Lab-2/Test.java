import java.util.*;
class Test
{
public static void main (String[] args) 
{ 
	Employee c1 = new Employee("Sid","Pednekar","A+",15000,"jul-1997");
	c1.displayDetails();
	Employee c2 = new Employee("Teena","Bodhwani","A",16000,"aug-1994");
	c2.displayDetails();
	Employee c3 = new Employee("Teena","Bodhwani","A",16000,"aug-1994");
	c3.displayDetails();
	c2.displayDetails(); 
	System.out.println("the no of employees are "  + c2.count);
}
}