//import java.util.;
class Test
{
public static void main (String[] args) 
{ 
	Date d;
	d=new Date("18","07","1996");
	Employee c1 = new Employee("Sid","Pednekar","A+",15000,d);
	c1.displayDetails();
	
	d=new Date("10","08","1994");
	Employee c2 = new Employee("Teena","Bodhwani","B",14000,d);
	c2.displayDetails();
	
	d=new Date("17","07","1997");
	Employee c3 = new Employee("Suraj","Yadav","C",13000,d);
	c3.displayDetails();
	
	d=null;
	System.out.println("the no of employees are "  + Employee.count);
}
}