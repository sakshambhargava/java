    import java.util.Scanner;

public class Magic_Square {

	static void generateSquare(int n) {
		int x, a[][] = new int[n][n], r = 0, c = n/2;
		for(x = 1; x<= n*n; x++) {
			a[r][c] = x;
			if(x%n == 0)
				r++;
			else
			{
				r--; c--;
				if(r<0)
					r += n;
				if(c<0)
					c += n;
			}
		}
		System.out.println("The magic square for " + n*n + ":");
		System.out.println("Sum of each column or row " + n * (n*n+1)/2 +  ":");
		for(r = 0; r < n; r++)
		{
			for(c = 0; c < n; c++)
				System.out.print(a[r][c] + " ");
			System.out.println();
		}
	}
public static void main(String[] args) {
	int n;
    Scanner sc = new Scanner(System.in);
	System.out.print("Enter the size(odd number only): ");
	n = sc.nextInt();
	generateSquare(n);
  }
}