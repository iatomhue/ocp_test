public class ClassUndefinedVariable{

  public ClassUndefinedVariable() {

  }

  public static void main( String[] args){
    System.out.println( "... ");
  }

  int i = 0 ;
  int i2 = i3 + i; //illegal forward reference 
  int i3 = 4;
}
