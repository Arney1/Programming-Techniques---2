public class Constants2 {
  public static final double CM_PER_INCH = 2.54;

  public static void main(String[] args) {
    double paperWidth = 8.5;
    double paperHeight = 11;
    System.out.println("Paper size in centimeters: " + paperWidth *
        CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);
  }
}

// Output:
// Paper size in centimeters: 21.59 by 27.94
//
// Perbedaan penggunaan final double dan public static final:
// penggunaan final double digunakan untuk membuat kosntanta lokal, sementara
// public static final digunakan untuk membuat atribut yang berupa kosntanta di
// class Constants2 yang dapat diakses oleh class manapun, dan jika ingin
// diakses di dalam class Contents2, maka dapat diakses tanpa membuat objek
// Contents2.
