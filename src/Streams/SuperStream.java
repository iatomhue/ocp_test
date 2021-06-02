import java.util.stream.Stream ;
import java.util.stream.IntStream;
import java.util.List ;
import java.util.stream.Collectors ;
import java.util.Arrays;
//import java.util.Comparator ;
public class SuperStream {

public static void Case1 ()  {
  Stream<String> str = Stream.of( "1234", "1111", "2222",
    "3333", "4444", "02351");
    Stream<String> out = str.map( (String s) -> ( s.substring(0, 1 ) ) );
    System.out.println( "Case 1 ");
    System.out.println( "************************* ");
    out.forEach( System.out::println);

}
public static void Case2() {
  List<String> lst  = Arrays.asList( "1Zo-809", "1Zo-810", "1Zo-819",
  "1Zo-820", "1Zo-812", "1Zo-811", "1Zo-840" ) ;
  List<String> lst2 = lst.stream().flatMap(  e -> Stream.of( e.split("-")) ).
    distinct().sorted( String.CASE_INSENSITIVE_ORDER.reversed()).collect(Collectors.toList());
    System.out.println( "Case 2 ");
    System.out.println( "************************* ");
    System.out.println( lst2 );
}

public static void Case3() {
  Stream<Double> str = Stream.of( 2.2, 2.8, 2.5 );
  Stream<Integer> out = str.mapToInt( Double::intValue).boxed();
  System.out.println( "Case 3 ");
  System.out.println( "************************* ");
  out.distinct().forEach( System.out::println);
  ///System.out.println( out.distinct().count() );
}

public static void Case4() {
  //IntStream ints = IntStream.of( 2.1, 1.4, 3.8, 22.3 );
  IntStream ints = IntStream.of( 3, 2, 1, 5, 3, 4, 5 );
  System.out.print( ints.filter( e-> e>3 ).distinct().
    average().getAsDouble() );

}

public static void Case5() {
  Stream str = Stream.of( 10, 20, "30 ");
  boolean out = str.allMatch( in -> in instanceof Number );

  System.out.println( out );
}
  public static void main( String [] args )  {
    //Case1 () ;
    //Case2() ;
    //Case3() ;
    //Case4();
    Case5();
  }
}
