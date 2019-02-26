package br.com.opet.ex01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataMain {

	public static void main(String[] args) throws ParseException {
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		String data = "26/06/1999";
		
		d = sdf.parse(data);
		
		System.out.println(sdf.format(d));
	}

}
