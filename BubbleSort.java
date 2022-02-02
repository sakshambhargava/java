import java.util.Scanner;
public class BubbleSort {
int i;    
	void Sort(int arr[], int n) {
		for(int i = 0; i < n; i++) {
			for(int j = i+1; j < n; j++) {
				int temp = 0;
				if(arr[j] < arr[i]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
			   }
			}
		}
		System.out.println("Sorted array is: ");
		for(i = 0; i<n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public static void main(String[] args) {
		int n;
		BubbleSort obj = new BubbleSort();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the elements:" + n);
		for(int c = 0; c < n; c++)
		{	
			a[c] = sc.nextInt();
		}
		obj.Sort(a, n);
	}
}
