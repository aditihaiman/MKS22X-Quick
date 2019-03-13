import java.util.*;
import java.io.*;

public class Driver {

  public static void main(String[] args) {
    int[] arr = {9, -3, 5, 2, 6, 8, -6, 1, 3};
    // System.out.println(Arrays.toString(arr));
    System.out.println(Quick.partition(arr, 0, 8));
    System.out.println(Arrays.toString(arr));
    Quick.quicksort(arr);
    System.out.println(Arrays.toString(arr));

  }


}
