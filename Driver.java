import java.util.*;
import java.io.*;

public class Driver {

  public static void main(String[] args) {
    Random rand = new Random(1);
    int length = 100;
    int[] arr = new int[length],arr2 = new int[length];
    for(int x = 0; x < arr.length; x++) {
      int temp = rand.nextInt(100);
      arr[x] = temp;
      arr2[x] = temp;
    }

    int idx = 1;
    int result = Quick.quickselect(arr, idx);
    Arrays.sort(arr2);

    for(int x = 0; x < arr.length; x++) {
      result = Quick.quickselect(arr, idx);
      if(result!=arr2[idx-1]) System.out.println("WRONG");
      idx++;
    }

    //System.out.println(Arrays.toString(arr));


  }


}
