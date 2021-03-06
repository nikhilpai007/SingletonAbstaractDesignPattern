import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;


 public class DateFactory
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
			dateformat.setTimeZone(TimeZone.getTimeZone("EST"));
		}else {
			dateformat = new SimpleDateFormat("DD-MM-YYYY");
			dateformat.setTimeZone(TimeZone.getTimeZone("EST"));
		}
		Date date = new Date();
		return dateformat.format(date);
	}
	
	public static DateFactory getInstance() {
		if(single_instance == null)
			single_instance = new DateFactory();
		return single_instance;
	}
}
