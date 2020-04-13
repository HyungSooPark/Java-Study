package com.hw3.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SetDate {
	public SetDate() {}
	
	public String todayPrint() {
		Calendar c = Calendar.getInstance();
		
		int year = c.get(c.YEAR);
		int month = c.get(c.MONTH)+1;
		int date = c.get(c.DATE);
		int hour = c.get(c.HOUR);
		int min = c.get(c.MINUTE);
		int sec = c.get(c.SECOND);
				
		return year+"년 "+month+"월 "+date+"일 "+hour+"시 "+min+"분 "+sec+"초";
	}
	
	public String setDay() {
		Calendar c = Calendar.getInstance();
		
		c.set(2011, 3-1, 21);
		
		String str = null;
		
		SimpleDateFormat sdf = new SimpleDateFormat("MM");
		
		switch(c.get(c.DAY_OF_WEEK)) {
		case 1:
			str = "일요일";
			break;
		case 2:
			str = "월요일";
			break;
		case 3:
			str = "화요일";
			break;
		case 4:
			str = "수요일";
			break;
		case 5:
			str = "목요일";
			break;
		case 6:
			str = "금요일";
			break;
		case 7:
			str = "토요일";
			break;
		}
				
		return c.get(c.YEAR)+"년 "+sdf.format(c.getTime())+"월 "+c.get(c.DATE)+"일 "+str;
	}
}
