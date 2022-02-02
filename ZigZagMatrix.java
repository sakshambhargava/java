import java.util.Scanner;

class ZigZagMatrix {
	static int i, j, k;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		int n_double = n * 2;
		int arr[][] = new int[n][n];
		int count = 1;
		for(int i = 0; i < n_double; i++) {
			if(i < n) {
				if(i % 2 == 0) {
 					k = i;
					for(j = 0; j <= i; j++) //Upward
					{
						arr[k][j] = count++;
						k--; // for decrement of row
					}
				}
				else {
					k = 0;
					for(j = i; j >= 0; j--) //Downward
					{
						arr[k][j] = count++;
						k++; // for increment of row
					}
				}
			}
			else {
				if(i % 2 == 0) {
					k = n - 1;
					for(j = i - n +  1; j < n; j++) // Upward
					{
						arr[k][j] = count++;
						k--; // for decrement of row
					}
				}
				else {
					k = i - n + 1;
					for(j = n - 1; j >= i - n + 1; j--) //Downward
					{
						arr[k][j] = count++;
						k++; // for increment of row
					}
				}
			}
		}
		// printing
		for(i = 0; i < n; i++)
		{
			for(j = 0; j < n; j++)
			{
				System.out.printf(" %d " , arr[i][j]);
			}
			System.out.println();
		}
	}
}
