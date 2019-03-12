import java.util.*;
import java.io.*;

public class Driver {

  public static void main(String[] args) {
    int[] arr = {999,999,999,999,999,1,999,999,999,999,999};
    // System.out.println(Arrays.toString(arr));
    // System.out.println(Quick.partition(arr, 0, 9));
    // System.out.println(Arrays.toString(arr));
    System.out.println(Quick.quickselect(arr, 1));

  }


}
