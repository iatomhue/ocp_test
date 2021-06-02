
public class ResourceMgmt  {

  public static void main( String[] args ){
    try( Res r = new ResourceMgmt().new Res() ) {
         System.out.println("YYY") ;
         throw new RuntimeException () ;
    }
    try( 1 + 1 ){
      Sytem.out.println( "" );
    }
  }
  class Res implements AutoCloseable  {
    @Override
    public void close(){
      System.out.println( "xx ");
    }
  }
}
