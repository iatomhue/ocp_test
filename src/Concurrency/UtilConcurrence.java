import java.util.List ;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.* ;
public class UtilConcurrence{

  public static void main( String[] args ) {
    long[] md = new long[100];
    new Random(189).longs().
  }


  

  static class ATask extends RecursiveAction {
    long[] data ;
    int lo ;
    int hi ;
    ATask(long[] arr , int lo, int hi ){
      this.data = arr;
      this.lo = lo;
      this.hi = hi;
    }
    ATask( long[] arr ) {
      this.data = arr ;
      lo = 0 ;
      hi = this.data.length ;
    }
    @Override
    protected void compute() {
      if( hi - lo < THRESHOLD )
        sortSequentially( lo, hi );
      else {
        int mid = ( lo + hi ) >>> 1 ;
        invokeAll( new ATask( data, lo, mid ),
        new ATask( data, mid, hi ) );

        merge( lo, mid, hi);

      }
    }
    static final int THRESHOLD = 1000 ;
    void sortSequentially( int lo, int hi ) {
      Arrays.sort( data, lo, hi );
    }

    void merge ( int lo, int mid, int hi ) {
      long[] buff = Arrays.copyOfRange( data, lo, mid );
      for( int i = 0 , j = lo, k = mid ; i < buff.length ; j++ ) {
        data[j] = ( k == hi || buff[i] < data[k]) ?
        buff[i++ ] : data[k++];
      }
    }

  }
}
