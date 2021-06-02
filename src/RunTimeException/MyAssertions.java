public class MyAssertions{

  public static void main( String[] args ){
    System.out.println( args.length );
    assert false : "The arguement legnth is less than zero" ;
    System.out.println( args );
  }
}
