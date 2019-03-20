import java.io.*;
import java.util.*;

public class Merge {

  /*sort the array from least to greatest value. This is a wrapper function*/
  public static void mergesort(int[]data){
    if (data.length <= 1) return;
    mergesort(data,0,(data.length/2)-1);
    mergesort(data,(data.length/2),data.length-1);


  }

  public static void mergesort(int[] data, int lo, int hi) {
    if (hi > lo) {//if the array list is longer than 1 element long.
          int newI = (hi-lo)/2 + lo;
          mergesort(data,lo,newI);
          mergesort(data,newI+1,hi);
          //reaches this point when
          merge(data,lo,newI,newI+1,hi);

    }

    //gets to this point once the array consists of 2 single-element arrays


    //data = merge(t1,t2);
    //return data;
    //System.out.println(lo+", "+hi);

  }

  private static int[] merge(int[] d1, int[] d2) {
    int[] result = new int[d1.length+d2.length];
    int idx = 0;
    int i1 = 0; int i2 = 0;
    while (i1 < d1.length || i2 < d2.length) {
      if (i1 >= d1.length) {
        result[idx] = d2[i2];
        i2++;
        idx++;
      } else if (i2 >= d2.length) {
        result[idx] = d1[i1];
        i1++;
        idx++;
      } else {
        int add = 0;
        if (d1[i1] < d2[i2]) {
          result[idx] = d1[i1];
          i1++;
          idx++;
        } else if (d2[i2] < d1[i1]) {
          result[idx] = d2[i2];
          i2++;
          idx++;
        } else {//if the values are equal
          result[idx] = d2[i2];
          idx++;
          result[idx] = d1[i1];
          idx++;
          i1++;
          i2++;
        }
      }
    }
    return result;
  }

  private static void merge(int[] data, int i1, int i2, int i3, int i4){
    int[] d1 = Arrays.copyOfRange(data,i1,i2);
    int[] d2 = Arrays.copyOfRange(data,i3,i4);

    int idx = i1;
    int i = 0; int ii = 0;
    while (i < d1.length || ii < d2.length) {
      if (i >= d1.length) {
        data[idx] = d2[ii];
        ii++;
        idx++;
      } else if (ii >= d2.length) {
        data[idx] = d1[i];
        i++;
        idx++;
      } else {
        int add = 0;
        if (d1[i] < d2[ii]) {
          data[idx] = d1[i];
          i++;
          idx++;
        } else if (d2[ii] < d1[i]) {
          data[idx] = d2[ii];
          ii++;
          idx++;
        } else {//if the values are equal
          data[idx] = d2[ii];
          idx++;
          data[idx] = d1[i];
          idx++;
          i++;
          ii++;
        }
      }
    }
  }

  public static void main(String[] args) {
    int[] data = {3,5,5,6};
    int[] d2 = {1,4,5,3,4,9,3};
    int[] d = {4,2,6,8,5,3};
    merge(d2,0,2,3,5);
    System.out.println(Arrays.toString(d2));
  }



}
