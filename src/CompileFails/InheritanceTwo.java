public class InheritanceTwo {

  class Foo {
   static String name = "Foo";
   void print() {
   System.out.println(this.name); // Line 1
   }
  }

  class Bar extends Foo {
   String name = "Bar";

   /*
    * Static objects cannot reference instance
    */
   static void printName() {
   super.print(); // Line 2
   }
  }

  public static void main( String[] args ){
    new InheritanceTwo().new Bar().printName() ;
  }





}
