import java.time.LocalDate ;
import java.time.format.DateTimeFormatter ;
public class DateObject {

  public static void main( String[] args ){
    LocalDate d1  = LocalDate.of( 2019, 1, 1);
    LocalDate d2 = LocalDate.parse( "2019-1-01", DateTimeFormatter.ISO_DATE ); // ISO Date requires dates to be preceded with 0 if its a single digit.
    LocalDate d3 = LocalDate.now().withDayOfMonth(1).withMonth(1).withYear(2019);
    System.out.println( ".." + d1.equals(d2) + "--" + d2.equals(d3));
  }
}
