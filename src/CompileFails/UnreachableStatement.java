public class UnreachableStatement{

  public static boolean CANRUN = false ;
  public static void main( String [] args ){


    //while( false ): Leads to compilation error
    while( false ){ //unreachable only on if statement. 
      System.out.println( "... ");
      break;
    }

  }
}
