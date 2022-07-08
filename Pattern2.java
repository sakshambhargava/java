// LOGIC
// top left : (i + j > n)
// top right : (j - i < n)
// bottom left : (i - j < n)
// bottom right : (i + j - n < (2 * n)

public class Pattern2 {

  private static int n = 6;

  public static void main(String[] args) {
    for (int i = 1; i < 2 * n; i++) {
      for (int j = 1; j < 2 * n; j++) {
        if (
          (i + j > n) && 
		  (j - i < n) && 
		  (i - j < n) && 
		  (i + j - n < (2 * n))
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
