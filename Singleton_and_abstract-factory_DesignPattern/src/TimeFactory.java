import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeFactory {
	private int format = 0; 
	private static TimeFactory single_instance;
	public void setFormat(int firstForm) {
		format = firstForm;
	}
	private TimeFactory(){
		format = 1;
	}
	
	public String getTime() {
		DateFormat dateformat;
		if(format == 1) {
			dateformat = new SimpleDateFormat("HH:MM:SS");
		}else {
			dateformat = new SimpleDateFormat("SS,MM,HH");
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
	
