import java.util.ResourceBundle ;
import java.util.Collections;
import java.util.Enumeration ;
import java.util.ListResourceBundle;
import java.util.Locale;
public class ResourceTest {



  public static void main( String[] args ){
    //System.out.println("u001B[31m");
    Test1();
    Test2();
    Test3();
    Test4() ;
    //System.out.println( "\u001B[0m");
  }

  public static void Test1 () {
    ResourceBundle mResource = ResourceBundle.getBundle("Bundle_HA" ) ;
    if( mResource.getString("ok").equals("yes")) {
      System.out.println(" Ok found in resource bundle value : " + "yes") ;
    }


  }
  public static void Test4() {
    ResourceBundle mResource = ResourceBundle.getBundle("program_bundle", new Locale("de", "FR") ) ;
    String value = mResource.getString("ok");
    if( value.equals("icht") ) {
      System.out.println(" Ok found in resource bundle value : " + "yes") ;
    }else{
      System.out.println( "Test 4 : Failed " );
      System.out.println( "Value: " + value );
    }
  }
  public static void Test2() {
    try{
      ResourceBundle mResource = ResourceBundle.getBundle("Bundle_HA" ) ;
      System.out.println( mResource.getString("dont") );
    }catch( Exception e ){
      System.out.println( "Exception raised due to key not existing. ");
    }
  }

  public static void Test3 ( ){
    ListResourceBundle lrb = new ResourceTest().new CListResourceBundle() ;
    String key = "good";
    String r = lrb.getString(key);
    System.out.println( "** List Resource Bundle **");
    System.out.println( "key: " + key  + " , value: " + r  );
  }

  class CListResourceBundle extends ListResourceBundle {
    @Override
    protected Object[][]getContents() {
      return new String[][] {
        {"ok", "Yes"},
        {"data","aaab"},
        {"good", "saab"}

      };
    }
  }

}
