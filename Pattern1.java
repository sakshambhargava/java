// top left : (i + j <= n + 1)
// top right : (j - i >= n - 1)
// bottom left : (i - j >= n - 1)
// bottom right : (i + j - n >= (n * 2) - 1)

public class Pattern1 {

  private static int n = 6;

  public static void main(String[] args) {
    for (int i = 1; i < 2 * n; i++) {
      for (int j = 1; j < 2 * n; j++) {
        if (
          (i + j <= n + 1) ||
          (j - i >= n - 1) ||
          (i - j >= n - 1) ||
          (i + j - n >= (n * 2) - 1)
        ) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}
