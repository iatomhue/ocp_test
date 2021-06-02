import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream ;
import java.util.Random;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.function.Function ;
import java.util.function.IntPredicate ;
import java.util.List ;
public class Program {


  public static void Case1 () {
    Fib data = new Fib();
    IntStream.generate(  data::get ).limit(10).
    forEach( System.out::println );
  }

  public static void Case2( ){
    Fib data = new Fib();
    OptionalDouble val  = IntStream.generate(  data::get ).limit(10).average();
    if( val.isPresent() ) {
      System.out.println( "Average (of first 10 Fib): " + val.getAsDouble()  );
    }

  }

  public static void Case3(){
    Fib data = new Fib();
    IntStream is = IntStream.generate(  data::get ).limit(14) ;
    System.out.println( is
    .mapToObj(Integer::toString)
    .collect(
        Collectors.joining(",")
        )
      );
      int val = IntStream.generate(  new Fib()::get ).limit(14).reduce( 0 , ( p1 , p2 ) -> p1+p2/3 );
    System.out.println( "Value : " + val  );

  }

  public static void Case4() {
    Fib data = new Fib();
    IntStream is = IntStream.generate(  data::get ).limit(5) ;
    IntPredicate  predi = p  -> {

      return (p%3)==0;
    };
    IntStream is2 = is.filter( predi );
    is2.forEach( System.out::println );
  }

  public static void Case5() {
    Fib data = new Fib();
    int sz = 13 ;
    int start = 0  ;
    IntStream is = IntStream.generate(  data::get ).limit(sz) ;

    IntStream is2 ;
    if( sz %2 == 0 ){
      //get two
      start = ( (sz )/ 2) ;
      is2 = IntStream.range( start -1, start + 1  );//invalid generates a list

    }else{
      //get the one.
      start = ( (sz-1 )/ 2) ;
      is2 = IntStream.range( start  , start + 1  );

    }

    //String mean = is2.mapToObj(Integer::toString).collect( Collectors.joining(",") );
    OptionalDouble mean = is2.average();
    System.out.println( "Geometric Mean: " + mean.getAsDouble() );
  }
  public static void main( String[] args ) {
    System.out.println( "****************");
    Case1();
    System.out.println( "****************");
    Case2() ;
    System.out.println( "****************");
    Case3();
    System.out.println( "****************");
    Case4();
    System.out.println( "****************");
    //Case5();
    System.out.println( "****************");
    //Case6();
    System.out.println( "****************");
    //Case7();
    System.out.println( "****************");
    //Case8();
    System.out.println( "****************");


  }
}
