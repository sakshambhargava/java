import java.util.Scanner;

public class Pascal_Triangle {

	public static void main(String[] args) {
		int r, b, c, n, k = 1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		n = sc.nextInt();
		for(r = 0; r < n; r++) {
			for(b = 0; b < 4-r; b++) {
				System.out.print(" ");
			}
			for(c = 0; c <= r; c++) {
				if(c == 0 || r == 0) 
			        k = 1;
				else
					k = k*(r- c + 1)/c;
				System.out.printf("%d ", k);
		   
			}
			System.out.println();
			
		}

	}

}
