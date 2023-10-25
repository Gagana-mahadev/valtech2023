package com.valtech.training;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalTime;

public class DateSample {

	public static void main(String[] args) {
		// Normal way of handling date
		// index the year for 1900
		// Month index with 0
		// index day with 1
		Date date = new Date(47, 7, 15);
		System.out.println(date);

		// Java 8 new feature to handle date using LocalDate
		LocalDate independenceDay = LocalDate.of(1947, 8, 15);
		System.out.println(independenceDay);

		LocalTime time = LocalTime.of(12, 8);
		System.out.println(time);

	}

}
