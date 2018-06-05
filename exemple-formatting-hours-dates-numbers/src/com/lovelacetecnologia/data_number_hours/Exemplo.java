package com.lovelacetecnologia.data_number_hours;

import java.math.BigDecimal;
import java.util.Date;

public class Exemplo {

	public static void main(String[] args) {
		
		
		Date date = new Date();
		BigDecimal bigDecimal = new BigDecimal(100);
		
		Formatacao formatacao = new Formatacao();
		String hours = formatacao.hours(date);
		String todayDate = formatacao.date(date);
		String value = formatacao.numbers(bigDecimal);
		
		System.out.println("Date- > " + todayDate);
		System.out.println("Hours - > " + hours);
		System.out.println("Product Value - > " + value);
		
	}

}
