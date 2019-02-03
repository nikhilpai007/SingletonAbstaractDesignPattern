import java.time.format.DateTimeFormatter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

 class DateFactory
{
	private int format = 0;
		private static DateFactory single_instance;
	public void setFormat(int firstFrom)
	{
		format = firstFrom;
	}
	private DateFactory()
	{
		format = 1;
		
	}
	
	public String getDate(){
		DateFormat dateformat;
		
		if(format == 1) {
			dateformat = new SimpleDateFormat("MM/DD/YYYY");
		}else {
			dateformat = new SimpleDateFormat("DD-MM-YYYY");
		}
		Date date = new Date();
		return dateformat.format(date);
	}
}
