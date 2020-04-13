package com.test.chap05_date.run;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Run {

	public static void main(String[] args) {
		//Date
		//Date originTime = new Date(0L);
		//Date originTime = new Date(1000L);
		//System.out.println(originTime);
		
		String originTime = new Date(0L).toGMTString();
		//지역 상관없이 그리니치 표준시로 나오게 하는 메소드
		System.out.println(originTime);
		
		Date today = new Date();
		System.out.println(today);
		
		//원하는 패턴으로
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(today));
		
		System.out.println("----캘린더----");
		Calendar calendar = Calendar.getInstance();
		//현재 시간
		calendar.set(2020,4-1,13);
		
		int year = calendar.get(1);
		int month = calendar.get(calendar.MONTH)+1;
		int date = calendar.get(calendar.DATE);
		int hour = calendar.get(calendar.HOUR);
		int min = calendar.get(calendar.MINUTE);
		int sec = calendar.get(calendar.SECOND);
		
		System.out.println(year+"년 "+month+"월 "+date+"일");
		System.out.println(calendar);
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println(sdf1.format(calendar.getTime()));
		
		Calendar cal = (Calendar)calendar.clone();
		cal.add(calendar.YEAR, -10);
		cal.add(calendar.MONTH, -2);
		cal.add(calendar.DATE, 11);
		
		System.out.println(cal.getTime());
		
		//타임존
		TimeZone tz = TimeZone.getTimeZone("Etc/Greenwich");
		sdf1.setTimeZone(tz);
		System.out.println(sdf1.format(calendar.getTime()));
		
		/*for(String name : TimeZone.getAvailableIDs()) {
			System.out.println(name);
		}*/
		
		//
		System.out.println("---- 그레고리안 ----");
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println(gc.getTime());
		gc.set(2018, 9-1, 22);
		System.out.println(sdf1.format(gc.getTime()));
	}

}
