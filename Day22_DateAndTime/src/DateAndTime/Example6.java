package DateAndTime;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class Example6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalTime d=LocalTime.now(ZoneId.of("America/Puerto_Rico"));
		LocalDateTime df=LocalDateTime.now(ZoneId.of("America/Puerto_Rico"));
		System.out.println(d);
		System.out.println(df);
		for(String s:ZoneId.getAvailableZoneIds())
		{
			System.out.println(s);
	}

	}}
