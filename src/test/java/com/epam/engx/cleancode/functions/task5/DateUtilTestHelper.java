package com.epam.engx.cleancode.functions.task5;

import java.util.Date;

public class DateUtilTestHelper {
	
	private DateUtilTestHelper(){
		throw new UnsupportedOperationException();
	}

    public static Date getDirectlyIncrementedDate(DateProvider dateProvider, Date date) {
        return dateProvider.changeToNextMidnight(date);
    }

    public static Date getInverseIncrementedDate(DateProvider dateProvider, Date date) {
        return dateProvider.changeToPreviousMidnight(date);
    }
}
