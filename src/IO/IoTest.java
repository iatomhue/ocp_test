import java.io.Console;
import java.io.InputStream;
import java.io.IOException;
import java.io.BufferedWriter ;
import java.io.FileWriter ;
import java.io.PrintWriter; 
public class IoTest {

public static void Case1(){
  Console c = System.console() ;
  String uname = c.readLine( "Username : ");
  char[] p = c.readPassword("Password : ");
  String pwd = new String( p );

  //System.out.println( uname );
  //System.out.println( pwd );
  /* for( char x : p )
    System.out.println( x + "... ");
    */
    System.out.println( uname.toString() );
}


public static void Case2 () throws IOException {
  byte[] b = new byte[10];
  InputStream in = System.in ;
  int i = in.read( b );
  for( byte c : b )
    System.out.print( (char ) c );

  try{ in.close(); }catch( Exception e ) {
    System.out.println( e.getMessage() );
  }

}

public static void Case3() throws IOException{

  try(
    BufferedWriter bw = new BufferedWriter(new FileWriter( "test.txt") )
    ){
    bw.write( "dkjdfkjjk");
  }


}

public static void Case4() throws IOException {
  PrintWriter pw = new PrintWriter("file.txt");
  pw.print( "zzz");
  pw.print( new char[]{'a', 'b'});
  pw.println();
  pw.flush();
  pw.close();
}

public static void main(String[] args ){

  try{
    //Case1();
    //Case2() ;
    //Case3();
    Case4();
  }catch( Exception e ) {
    System.out.println(e.getMessage());
  }
}

}
