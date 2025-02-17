class FloatingPoint {
  public static void main(String[] args) {
    double x = 92.98;
    int nx = (int) Math.round(x);
    // System.out.println(nx);
  }
}

// Nilai nx:
// 93, karena dibulatkan ke integer terdekat
//
// Kenapa dibutuhkan cast (int) dalam penggunaan Math.round(x):
// Karena method Math.round mengembalikan nilai numerik bertipe long, jika tidak
// di cast (int), nilainya tidak bisa di assign ke variabel tipe integer
