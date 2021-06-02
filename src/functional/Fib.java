import java.util.function.Supplier ;
import java.util.List;
import java.util.ArrayList;
public class Fib{
  private volatile  int  cur = 0 ;
  private volatile  int  prev = 0 ;
  public Integer get() {
    //System.err.println( "Called ");
    int tmp = cur;

    tmp = Math.max( prev + cur, 1 ) ;

    if( cur != prev )
      prev = cur ;
    cur = tmp ;
    return tmp  ;
  }
  public List<Integer> get( int range )
  {
    int tmp = range;

    //Supplier<Integer> supp = () -> this.get();
    List<Integer> lst = new ArrayList<Integer>();
    while( tmp > 0  ) {
      //lst.add(supp.get() );
      lst.add( this.get() );
      tmp -- ;
    }
    return lst ;

  }

  


  public static void main(String[] args ){
    Fib data = new Fib();
    System.out.println( data.get() );
    System.out.println( data.get() );
    System.out.println( data.get() );
    System.out.println( data.get() );

    //System.out.println( new Fib().get(10) );
  }





}
