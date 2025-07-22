

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class JavaUtilities {

	public int getRandomNumber() {
		Random r = new Random();
		int random = r.nextInt(1000);
		return random;
	}

	public String getCurrentDate() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String currentDate = sdf.format(date);
		return currentDate;
	}

	public String getRequiredDate(int number) {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		sdf.format(date);

		Calendar cal = sdf.getCalendar();
		cal.add(Calendar.DAY_OF_MONTH, number);
		String reqDate = sdf.format(cal.getTime());
		return reqDate;
	}

	public String getSystemDateAndTime() {
		Date d = new Date();
		String currentDate[] = d.toString().split(" ");
		String day = currentDate[0];
		String month = currentDate[1];
		String date = currentDate[2];
		String time = currentDate[3].replace(":", "-");
		String year = currentDate[5];

		String finalDate = day + " " + month + " " + date + " " + time + " " + year;
		return finalDate;

	}
	
	public String getTimeStamp()
	{
		Date d = new Date();
		String date = d.toString().replace(" ", "-").replace(":", "-");
		return date;
	}
	
}
