import java.util.Map ;
import java.util.TreeMap ;
import java.util.SortedMap;
public class MapTest{


  public static void main( String[] args ){
    TreeMap<String, String> map = new TreeMap<String, String>();
    map.put( "a", "apple");
    map.put( "b", "banana");
    map.put( "c", "cherry");
    SortedMap<String, String> smap = map.subMap("a", "b");
    //smap.put( "a", "xx");
    //runtime exception because you cant add more elements to this submap only modify
    smap.put( "d", "dog");
    smap.put( "e", "eel");
    smap.put( "f", "fish");

    System.out.println( smap );
    System.out.println( map );
  }
}
