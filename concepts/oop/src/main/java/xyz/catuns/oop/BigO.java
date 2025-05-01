package xyz.catuns.oop;

public class BigO {

  public static void main(String[] args) {
    int[] nums = {1,2,3,4,5,6};

//    num[0]
  }


  void oOfN(int iterations) {

    for (int x =0; x < iterations; x++) {
      System.out.println(x);
    }
  }

  void oOfNSquared(int iterations) {

    for (int x =0; x < iterations; x++) {
      for (int y =0; y < iterations; y++) {
        System.out.println(x);
      }
    }
  }
}
