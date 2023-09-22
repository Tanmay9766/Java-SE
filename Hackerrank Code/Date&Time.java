
import java.time.LocalDate;
class Result {
  
         public static String findDay(int month, int day, int year) {
        
        LocalDate lt = LocalDate.of(year, month, day);
        
        return lt.getDayOfWeek().name();
    }
}
