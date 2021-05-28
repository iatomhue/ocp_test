public class Inheritance {
  public class A {
      public Object test( String a ){
        return a ;
      }
  }
  public class B extends A {
    /*
    * string return type and parameter type are both child of object
    * therefore the following two methods arent valid. in combination with this method.
    */
      public String test( String a ){
        return a ;
      }
      public String test( Object a ){
        return a.toString() ;
      }

      public Object test( Object a ){
        return a ;
      }
  }


  public static void main( String[] args ){
      B test = new Inheritance().new B() ;
      System.out.println( test.test("") );
  }

}
