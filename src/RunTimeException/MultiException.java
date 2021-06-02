public class MultiException {

  public static void main( String [] args ) {
    try{
      String data = args[2];
      //parent class exception cannot be raised with child exception as they are a subclass
    }catch( NullPointerException | Exception | IndexOutOfBoundsException  e  ){
      System.out.println( " Exception Occured: " + e.getMessage() );
    }

  }
}
