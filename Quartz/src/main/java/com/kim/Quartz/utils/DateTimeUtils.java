package com.kim.Quartz.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeUtils {
	private static final String DEFAULT_DATETIME_FORMAP = "yyyy-MM-dd HH:mm:ss";
	
	private DateTimeUtils() {
	}

	public static String toString(Date date) {
		return toString(DEFAULT_DATETIME_FORMAP,date);
	}

	public static String toString(String pattern,Date date) {
	String dateStr = null;	
	 if (date != null) {
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		dateStr = sdf.format(date);
	 }
	 return dateStr;
	}
}
