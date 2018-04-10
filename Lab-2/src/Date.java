public class Date
{
	public String day,month,year;
	//String dateOfJoining="15-10-1254";
	public void toSubString(String dateOfJoining){
		day=dateOfJoining.substring(0,2);
		month=dateOfJoining.substring(3,5);
		year=dateOfJoining.substring(6,10);
		//System.out.println(day+""+month+""+year);
		
		}
	/*public void 
	public static void main (String[] args) 
	{ 
		Date d=new Date();
		d.toSubString("15-20-3254");
	}*/
	
}