public class Merge {

  /*sort the array from least to greatest value. This is a wrapper function*/
  public static void mergesort(int[]data){
    if (data.length <= 1) return;
    mergesort(data,0,(data.length/2)-1);
    mergesort(data,(data.length/2),data.length-1);


  }

  public static void mergesort(int[] data, int lo, int hi) {

  }



}
