import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class TimeFactory {
	private int format = 0; 
	private static TimeFactory single_instance;
	public void setFormat(int firstForm) {
		format = firstForm;
	}
	private TimeFactory(){
		format = 1;
		format = 2;
	}
	
	public String getTime() {
		DateFormat dateformat = null;
		if(format == 1) {
			dateformat = new SimpleDateFormat("HH:MM:SS'Z'");
			dateformat.setTimeZone(TimeZone.getTimeZone("EST"));
						
		}else if (format == 2) {
			dateformat = new SimpleDateFormat("SS,MM,HH'Z'");
			dateformat.setTimeZone(TimeZone.getTimeZone("EST"));
				
		}
		Date date = new Date();
		return dateformat.format(date);
	}
	
	public static TimeFactory getInstance() {
		if (single_instance == null)
			single_instance = new TimeFactory();
		
		return single_instance;
	}

	}
	
