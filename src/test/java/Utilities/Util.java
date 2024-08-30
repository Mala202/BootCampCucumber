package Utilities;

import java.util.Date;

public class Util {
	
	public static String emailWithDateTimeStamp() {
		Date date = new Date();
		String timeStamp = date.toString().replace(" ", ":").replace(":", "_");
		return "belioska05" + timeStamp + "@gmail.com";
	}
	
	public static final int implicit_wait_time = 10;
	public static final int page_load_time = 200;
	public static final int script_time = 1000;

}
