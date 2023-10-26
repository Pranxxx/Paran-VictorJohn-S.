import java.time.*;
public class DaysTilNextMonth {
  public static void main (String[] args) {
  
    LocalDate currentDate = LocalDate.now();
  
    String monthtoString = currentDate.getMonth().toString();
    int day = currentDate.getDayOfMonth();
    int year = currentDate.getYear();

    System.out.println("Month: " + monthtoString);
    System.out.println("Day: " + day);
    System.out.println("Year: " + year);
    
  }
}
  
  
  