import java.util.*;
import java.io.*;

public class Quick{

  public static int quickselect(int []data, int k){
    int idx = partition(data, 0, data.length-1);
    while (idx!=k){
      idx = partition(data, 0, data.length-1);
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
      if(data[start] > data[0]) {
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





}
