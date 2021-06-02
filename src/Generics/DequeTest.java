import  java.util.ArrayDeque ;
public class DequeTest{

  public static void main(String[] args ){
    ArrayDeque<String> dq = new ArrayDeque<String>();
    dq.add("a");
    dq.add("b");
    dq.add("c");
    dq.add("a");
    dq.removeLastOccurrence("a");
    System.out.println( dq );
  }
}
