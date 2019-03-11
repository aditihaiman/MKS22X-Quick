import java.util.*;
import java.io.*;

public class Driver {

  public static void main(String[] args) {
    int[] arr = {9, 6, 4, 5, 3, 8, 2, 7, 0, 1};
    System.out.println(Arrays.toString(arr));
    System.out.println(Quick.partition(arr, 0, 9));
    System.out.println(Arrays.toString(arr));

  }


}
