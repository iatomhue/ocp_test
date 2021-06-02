import java.util.stream.* ;
public class Pipe {

public static void main (String[] args ) {
  Stream<String> str = Stream.of( "A", "ABC", "ABCD", "AA");
  String out = str.filter( s->s.length() > 2 ).
    filter(s->s.indexOf("C")>-1).findAny().orElse("None") ;

    //System.out.println( out );
    new Pipe().Test2(); 
}

public void Test2() {

  Stream<String> str = Stream.of( "A", "B", "C","D");
  System.out.println( str.peek(System.out::print).findAny().orElse("NA"));
}

}
