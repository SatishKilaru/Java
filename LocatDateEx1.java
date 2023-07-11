import java.time.*;
import java.time.LocalDateTime;  
import java.time.format.DateTimeFormatter;
class LocatDateEx1{
	public static void main(String args[]){
		LocalDate today=LocalDate.now();
		String dt=today.format(DateTimeFormatter.ISO_DATE);
		LocalDate d1 = LocalDate.parse(dt);  
		LocalDate Yesterday=today.minusDays(1);
		LocalDate Tomorrow=today.plusDays(1);
		System.out.println("today "+today);
		System.out.println("String form "+dt);
		System.out.println("Date form "+d1);
		System.out.println("Yesterday "+Yesterday);
		System.out.println("Tomorrow "+Tomorrow);
		//time 
		LocalTime time = LocalTime.now();  
    		System.out.println(time);  
		//DateTime
		LocalDateTime now = LocalDateTime.now();  
        	System.out.println("Before Formatting: " + now);  
        	DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
        	String formatDateTime = now.format(format);  
        	System.out.println("After Formatting: " + formatDateTime); 
	}
}