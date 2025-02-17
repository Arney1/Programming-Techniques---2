import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Kata pertama: ");
    String firstWord = scanner.nextLine();
    System.out.println("Kata kedua: ");
    String lastWord = scanner.nextLine();
    scanner.close();

    int length = firstWord.length() + lastWord.length();
    System.out.println(length);

    if (firstWord.compareTo(lastWord) <= 0) {
      System.out.println("No");
    } else {
      System.err.println("Yes");
    }

    System.out.println(firstWord.substring(0, 1).toUpperCase() + firstWord.substring(1) + " "
        + lastWord.substring(0, 1).toUpperCase() + lastWord.substring(1));
  }

}
