import java.util.*;
import java.io.*;

public class Quick{


// -------------------- QuickSelect ------------------------//
  public static int quickselect(int[] data, int k){
    return quickselectH(data, 0, data.length-1, k);
  }

  private static int quickselectH(int[] data, int lo, int hi, int k) {
    if(lo>=hi) return data[lo];
    int idx = partition(data, lo, hi);
    if(idx==k-1) return data[idx];
    else if(k-1 < idx) return quickselectH(data, lo, idx-1, k);
    else return quickselectH(data, idx, hi, k);
  }

  private static int partition(int[] data, int start, int end) {
    int pivot = (int)(Math.random() * ((end - start) + 1)) + start;
    int start1 = start;
    swap(data, start1, pivot);
    start++;
    while(start<end){
      //boolean swap = ((int)(Math.random()*2)==1);
      if(data[start]==data[start1] && Math.random() > 0.5) {
        swap(data, end, start);
        end--;
      }
      if(data[start] > data[start1]) {
        swap(data, end, start);
        end--;
      }
      else start++;
    }
    //switch pivot element back to correct spot
    if(data[start1]>=data[end]) {
      swap(data, start1, end);
      return end;
    }
    else {
      swap(data, start1, end-1);
      return end-1;
    }
  }

  private static void swap(int[] data, int el1, int el2) {
    int temp = data[el1];
    data[el1] = data[el2];
    data[el2] = temp;
  }

//-------------------------- QuickSort --------------------------//
  public static void quicksort(int[] data) {
    quicksortH(data, 0, data.length-1);
  }

  private static void quicksortH(int[] data, int start, int end){
    if(start>=end) {
      return;
    }
    int pivot = partition(data, start, end);
    //System.out.println(pivot);
    quicksortH(data, start, pivot-1); //left side
    quicksortH(data, pivot+1, end); //right side
  }




}
