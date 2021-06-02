public class AssertionTest{


  public static void main(String[] args ){
    int i = 9 ;
    assert( ++i > 7 ): "Error ";
    assert( i == 12 ): i ;
    assert( ++i > 8 ): System.out.println( i );
    assert( i == 12 ) : new AssertionTest() ; 
  }
}
