package com.lovelacetecnologia.data_number_hours;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Formatacao {

	public String date(Date date) {
		
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy"); 
		
		String dateFormated = dateFormat.format(date);
		
		return dateFormated ;
	}
	
	
	public String hours(Date hours) {
		
		DateFormat hoursFormat = new SimpleDateFormat("HH:mm:ss");   
		
		String hoursFormated = hoursFormat.format(hours);
		
		return hoursFormated;
	}
	
	
	public String numbers(BigDecimal value) {
		
		DecimalFormat decimalFormat = new DecimalFormat("R$ #, ##0.00");
		
		String numberFormated = decimalFormat.format(value);
		
		return numberFormated;
	}
	
}
