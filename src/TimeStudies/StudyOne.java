import java.time.LocalTime;
import java.time.temporal.ChronoField;
public class StudyOne {


  public static void main( String [] args ){
    LocalTime lt = LocalTime.of( 1, 15, 30);
    LocalTime lt2 =  lt.withHour(2);
    lt2 = lt.with( ChronoField.MINUTE_OF_DAY, 45 );
    System.out.println( " Value : " + lt + ", Second Value: " + lt2 );
  }
}
