public class LoopFail{
  public static void main( String[] args ){

    try{
      new LoopFail().go();
    }catch( Exception e ){
      e.printStackTrace();
    }

  }
  public void go() throws Exception {
    for( int i = 0 ; i > 5 ; i++ ) {
      System.out.println( "aaa ");
    }
  }
}
