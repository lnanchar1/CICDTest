package com.epam.engx.cleancode.functions.task5;

import java.util.Calendar;
import java.util.Date;

public class DateProvider {

	public Date changeToPreviousMidnight(Date date) {
		Calendar calendar = getCalender(date);
		calendar.setTime(date);
		subtractDay(calendar);
		setTimeToMidnight(calendar);
		return calendar.getTime();
	}

	public Date changeToNextMidnight(Date date) {
		Calendar calendar = getCalender(date);
		calendar.setTime(date);
		addDay(calendar);
		setTimeToMidnight(calendar);
		return calendar.getTime();
	}
	
	private void setTimeToMidnight(Calendar calendar) {
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
	}

	private void addDay(Calendar calendar) {
		calendar.add(Calendar.DATE, 1);    
	}

	private void subtractDay(Calendar calendar) {
		calendar.add(Calendar.DATE, -1);
	}

	private Calendar getCalender(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar;
	}
}
