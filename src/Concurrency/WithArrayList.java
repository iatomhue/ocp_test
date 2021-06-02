import java.util.List;
import java.util.ArrayList ;
public class WithArrayList{


  public static void main( String[] args ){
    List<Integer> list = new ArrayList<Integer>();
    list.add( 5 );
    list.add( 10 );
    list.add( 20 );

    list.stream().
    peek( System.out::print).parallel().
    forEach(System.out::print);
  }
}
