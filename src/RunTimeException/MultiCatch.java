public class MultiCatch{


  public static void main(String[] args ){
    try{
      System.out.println(args[0]);
    }catch( ArrayIndexOutOfBoundsException | ArithmeticException
    | NullPointerException e ) {
      if( e instanceof ArrayIndexOutOfBoundsException ){
        e = new ArrayIndexOutOfBoundsException(" Bad Idx " ); // cannot assign e
        // e is essentially a final instance 
      }else if( e instanceof NullPointerException ){
        e = new NullPointerException("Null Value") ;

      }else{
        e = new ArithmeticException ( "Arithmetic ") ;

      }
      System.out.println( e.getMessage() );
    }
  }
}
