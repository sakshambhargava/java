import java.util.Scanner;
public class SelectionSort {
	void Sort(int arr[])
	{
		int n = arr.length;
		for(int i = 0; i < n-1; i++) {
			int min_ind = i;
			for(int j = i+1; j < n; j++)
				if(arr[j] < arr[min_ind])
					min_ind = j;
			int temp = arr[min_ind];
			arr[min_ind] = arr[i];
			arr[i] = temp;
		}
		System.out.println("Sorted array is: ");
		for(int i = 0; i<n; i++) {
			System.out.print(arr[i] + " ");
	  }
	}

	public static void main(String[] args) {
		int n;
		SelectionSort obj = new SelectionSort();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the elements:" + n);
		for(int c = 0; c < n; c++)
		{	
			a[c] = sc.nextInt();
		}
		obj.Sort(a);
		

	}

}
