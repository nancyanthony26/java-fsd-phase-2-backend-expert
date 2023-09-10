package travelling_ticket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleTimeFormat {

	public SimpleTimeFormat(String string) {
		// TODO Auto-generated constructor stub
	}

	public String format(Date time) {
		Date ThisDate = new Date();
		SimpleDateFormat dateForm = new SimpleDateFormat("MM/dd/Y hh: mm a");
		String myString = dateForm.format(ThisDate);
		System.out.println(myString);
		return myString;
		
	}
		

}
