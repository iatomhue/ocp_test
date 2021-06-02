import java.util.stream.IntStream;
import java.util.stream.Stream ;
public class StreamTest{


  public static void main( String[] args ) {
    IntStream ds = IntStream.of( 1, 2, 3, 4 , 5);
    Stream<String> ste = ds.boxed().map(Integer::toString );
    System.out.println( ste.distinct().findFirst());
  }
}
