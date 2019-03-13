import java.util.*;
import java.io.*;

public class Driver {

  public static void main(String[] args) {
    Random rand = new Random();

    int[] arr = new int[10],arr2 = new int[10];
    for(int x = 0; x < arr.length; x++) {
      int temp = rand.nextInt(1000);
      arr[x] = temp;
      arr2[x] = temp;
    }
    //System.out.println(Arrays.toString(arr));

    Quick.quicksort(arr);
    Arrays.sort(arr2);

    for(int x = 0; x < arr.length; x++) {
      if(arr[x]!=arr2[x]) System.out.println("WRONG");
    }

    //System.out.println(Arrays.toString(arr));


  }


}
