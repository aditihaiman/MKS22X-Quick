import java.util.*;
import java.io.*;

public class Driver {

  public static void main(String[] args) {
    int[] arr = {-6, 1, -3, 2, 3, 5, 6, 8, 9};
     System.out.println(Arrays.toString(arr));
    System.out.println(Quick.partition(arr, 1, 2));
    //System.out.println(Arrays.toString(arr));
    //Quick.quicksort(arr);
    System.out.println(Arrays.toString(arr));

  }


}
