public class Merge {

  /*sort the array from least to greatest value. This is a wrapper function*/
  public static void mergesort(int[]data){
    if (data.length <= 1) return;
    mergesort(data,0,(data.length/2)-1);
    mergesort(data,(data.length/2),data.length-1);


  }

  public static int[] mergesort(int[] data, int lo, int hi) {
    if (hi > lo) { // if the array list is longer than 1 element long.
      int newI = (hi-lo)/2 + lo;
      int[] t1 = mergesort(data,lo,newI);
      int[] t2 = mergesort(data,newI+1,hi);
    }
    //gets to this point once the array consists of 2 single-element arrays

    System.out.println(lo+", "+hi);

  }

  private static int[] merge(int[] d1, int[] d2) {
    int[] result = new int[d1.length+d2.length];

  }

  public static void main(String[] args) {
    int[] data = {4,2,6,7,3,4,2};
    mergesort(data);
  }



}
