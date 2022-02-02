import java.util.Scanner;
public class binarySearch {
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
	int binary_Search(int arr[], int element, int low, int high) {
		while(low <= high) {
			int mid = (low+high)/2;
			if(arr[mid]==element)
				return mid;
			if(arr[mid]<element)
				low = mid + 1;
			else 
				high = mid - 1;
		}
		return -1;
		
	}

	public static void main(String[] args) {
		int n, key;
		binarySearch obj = new binarySearch();
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
		System.out.println("\nEnter the value to find: ");
		key = sc.nextInt();
		int result = obj.binary_Search(a, key, 0, n-1);
		if(result == -1)
			System.out.println("Not Found");
		else
			System.out.println("Element found at index "+ (result+1));
	}


}
