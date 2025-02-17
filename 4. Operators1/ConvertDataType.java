class ConvertDataType {
  static short methodOne(long l) {
    int i = (int) l;
    return (short) i;
  }

  public static void main(String[] args) {
    double d = 10.25;
    float f = (float) d;
    // System.out.println(f);
    byte b = (byte) methodOne((long) f);
    System.out.println(b);
  }
}

// Output:
// 10
//
// Penjelasan perubhana casting:
// dari double 10.25, diconvert menjadi float menjadi 10.25, lalu diconvert
// menjadi long menjadi 10, lalu ke modul methodOne, lalu diconvert menjadi int
// menjadi 10 dan disimpan di variabel i, lalu
// diconvert menjadi short menjadi 10 dan di-return, lalu diconvert menjadi byte
// menjadi 10 dan disimpan di variabel b
