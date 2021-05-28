public class ProtectedInheritance  {

  public class A {
    protected String variable = "000" ;
  }

  public class B extends A {
    String variable = "xx";
  }

  public static void main ( String args[] ){
      ProtectedInheritance a = new ProtectedInheritance() ;
      ProtectedInheritance.A test = a.new B()  ;
      System.out.println( test.variable );
  }
}
