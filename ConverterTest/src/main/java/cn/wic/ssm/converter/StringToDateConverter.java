package cn.wic.ssm.converter;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

public class StringToDateConverter implements Converter<String, Date>{
	private String dataPatten;
	public void setDatePatten(String datePatten) {
		this.dataPatten = datePatten;
	}
	public Date convert(String date) {
		try {
			SimpleDateFormat dateFormat = new SimpleDateFormat(this.dataPatten);
			return dateFormat.parse(date);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("ÈÕÆÚ×ª»»Ê§°Ü");
			return null;
		}
	}
}
