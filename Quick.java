import java.util.*;
import java.io.*;

public class Quick{


// -------------------- QuickSelect ------------------------//
  public static int quickselect(int []data, int k){
    int idx = partition(data, 0, data.length-1);
    while (idx!=k-1){
      if(idx>k) idx = partition(data,0,idx);
      else idx = partition(data, idx, data.length-1);
      // idx = partition(data, 0, data.length-1);
    }
    return data[idx];
  }

  public static int partition(int[] data, int start, int end) {
    int pivot = (int)(Math.random()*(end-start+1));
    int temp = data[0];
    data[0] = data[pivot];
    data[pivot] = temp;
    start = 1;
    while(start<data.length&&start!=end){
      boolean swap = ((int)(Math.random()*2)==1);
      if(data[start] > data[0]||(data[start]==data[0]&&swap)) {
        temp = data[end];
        data[end] = data[start];
        data[start] = temp;
        end--;
      }
      else start++;
    }
    //switch pivot element back to correct spot
    if(data[0]>=data[end]) {
      temp = data[0];
      data[0] = data[end];
      data[end] = temp;
      return end;
    }
    else {
      temp = data[0];
      data[0] = data[end-1];
      data[end-1] = temp;
      return end-1;
    }
  }

//-------------------------- QuickSort --------------------------//
  public static void quicksort(int[] data) {
    quicksortH(data, 0, data.length-1);
  }

  public static void quicksortH(int[] data, int start, int end){
    if(start>=end) {
      return;
    }
    int pivot = partition(data, start, end);
    //System.out.println(pivot);
    quicksortH(data, start, pivot-1); //left side
    quicksortH(data, pivot+1, end); //right side
  }




}
