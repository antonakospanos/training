package com.antonakospanos.oca.m10apis.examples;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class CalendarManipulation {
	
	public static LocalDateTime adjustDay(LocalDateTime ldt) {
		ldt = ldt.with(TemporalAdjusters.firstInMonth(DayOfWeek.SUNDAY));
		System.out.println("ltd after adjusting the day to first Sunday of month: " + ldt);

		return ldt;
	}
	
	public static int compareDateTime(LocalDateTime ldt1, LocalDateTime ldt2) {
		System.out.println("ltd1: " + ldt1 + "ltd2: " + ldt2);

		return ldt1.compareTo(ldt2);
	}
	
	public static long diffMonths(LocalDateTime ldt1, LocalDateTime ldt2) {
		return diffUnit(ldt1, ldt2, ChronoUnit.MONTHS);
	}
	public static long diffDays(LocalDateTime ldt1, LocalDateTime ldt2) {
		return diffUnit(ldt1, ldt2, ChronoUnit.DAYS);
	}
	public static long diffMillis(LocalDateTime ldt1, LocalDateTime ldt2) {
		return diffUnit(ldt1, ldt2, ChronoUnit.MILLIS);
	}
	private static long diffUnit(LocalDateTime ldt1, LocalDateTime ldt2, ChronoUnit unit) {
		System.out.println("ltd1: " + ldt1 + "ltd2: " + ldt2);
		
		return unit.between(ldt1, ldt2);
	}
	
	public static LocalDateTime addPeriod(LocalDateTime ldt, Period p) {
		ldt =  ldt.plus(p);
		System.out.println("ltd after adding a period: " + ldt);

		return ldt;
	}
}
