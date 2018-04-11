public class Date
{
	private String day,month,year,combo;
	
	public Date(String day,String month,String year)
	{
		this.day=day;	
		this.month=month;
		this.year=year;	
	}
	/*public String getDate()
	{
		combo=day + "/"  + month + "/"  + year;
		return combo;
	}*/
	public String toString()
	{
		combo=day + "/"  + month + "/"  + year;
		return combo;
	}
} 