public class ProtectedClass2{

class Foo {
 protected static String myField = "Foo";
 protected  static Object myMethod() {
 return "Foo";
 }
}

public class Bar extends Foo {
 public String myField = "Bar";
 //cannot override static method only 
 public String myMethod() {
 return "Bar";
 }

}

public static void main(String[] args) {
Foo foo = new ProtectedClass2().new Bar();
System.out.println(foo.myField);
System.out.println(foo.myMethod());
}

}
