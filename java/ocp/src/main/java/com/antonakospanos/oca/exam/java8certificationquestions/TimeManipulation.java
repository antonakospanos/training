package com.antonakospanos.oca.exam.java8certificationquestions;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class TimeManipulation {
	
	public static void diffInstants() {
		Instant t1 = Instant.now();
		// code with delay
		Instant t2 = Instant.now();
		
		Duration dt = Duration.between(t1, t2);
		Duration aux = Duration.ofDays(1);
		dt.plus(aux);
	}
	
	public static void diffDateTimes() {
		Period p = Period.ofDays(1);
		Duration d = Duration.ofDays(1);
		Duration t = Duration.ofHours(1);
		
		// LocalDateTime
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		
		LocalDateTime ldtNew = ldt.plus(p);
		LocalDateTime ldtNew2 = ldt.plus(d);
		System.out.println(ldt); // LocalDateTime is immutable!!!!
		System.out.println(ldtNew);
		System.out.println(ldtNew2);
		
		// LocalDate
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		
		LocalDate ldNew = ld.plus(p);
		System.out.println(ld); // LocalDate is immutable!!!!
		System.out.println(ldNew);
		
		// LocalTime
		LocalTime lt = LocalTime.now();
		System.out.println(lt);

		LocalTime ltNew = lt.plus(t);
		System.out.println(lt); // LocalTime is immutable!!!!
		System.out.println(ltNew);

	}
}