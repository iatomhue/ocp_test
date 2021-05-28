public class Uninitialized {
  private static boolean TEST = true;
  public static void main( String[] args ){
    String p ;
    //Fails because the compiler could not determine that ths variable would be Uninitialized at compile time. 
    if( TEST ){
      p = new String("") ;
    }
    System.out.println( p );
  }
}
