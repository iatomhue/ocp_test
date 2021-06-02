import java.time.LocalTime ;
import java.time.LocalDate;
import java.time.Period ;
import java.time.MonthDay ;
import java.time.Year ; 
public class Report {
  public static void Case1(){
    LocalTime lt = LocalTime.parse("10:34");
    System.out.println( lt );
  }

  public static void Case2() {
      LocalDate dt = LocalDate.ofYearDay( 2016, 366 ) ;
      System.out.println( dt );
      System.out.println( LocalDate.parse( "2016-12-31" ));

  }
  public static void Case3() {
    Period p = Period.ofMonths(2);
    p = p.plusYears(1);
    p = p.withYears(2);
    System.out.println( p );
  }

  public static void Case4() {
    Year y = Year.of( 2014 );
    LocalDate ym = y.atMonthDay(MonthDay.of( 3, 3));
    System.out.println( ym );

  }

  public static void main( String[] args ){
    //Case1();
    //Case2();
    //Case3();
    Case4();
  }
}
