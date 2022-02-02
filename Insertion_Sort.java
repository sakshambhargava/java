import java.util.Scanner;
public class Insertion_Sort {
	public static void insertionSort(int arr[]) {
		int n = arr.length;
		for(int i = 1; i < n; i++) {
			int key = arr[i];
			int j = i-1;
			while(j >= 0 && arr[j] > key)
			{
				arr[j+1] = arr[j];
				j--;
				
			}
			arr[j+1] = key;
				
		}
	}
	     public static void main(String[] args) {
	    	 int n, key;
	    	 Insertion_Sort obj = new Insertion_Sort();
	    	 Scanner sc = new Scanner(System.in);
	 		System.out.println("Enter the number of elements:");
	 		n = sc.nextInt();
	 		int a[] = new int[n];
	 		System.out.println("Enter the elements:");
	 		for(int c = 0; c < n; c++)
	 		{	
	 			a[c] = sc.nextInt();
	 		}
	 		System.out.println("Before sorting an array elements are: \n");
	 		for(int i = 0; i < n; i++) {
	 			System.out.println(a[i] + " ");
	 		}
	 		System.out.println();
	 		insertionSort(a);
	 		System.out.println("After insertion sort array is:\n ");
	 		for(int i = 0; i < n; i++) {
	 			System.out.println(a[i] + " ");
	 		}
	                                                                                    	
	}
	     
}

