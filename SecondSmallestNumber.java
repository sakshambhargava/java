import java.util.Scanner;
public class SecondSmallestNumber {
	void SecondSmallest(int arr[]) {
		int temp, size;
		size = arr.length;
		for(int i = 0; i < size; i++) {
			for(int j = i+1; j < size; j++)
			{
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i]  = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Second Smallest Number is : " + arr[1]);
		
	}

	public static void main(String[] args) {
		int n;
		SecondSmallestNumber obj = new SecondSmallestNumber();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the elements:" + n);
		for(int c = 0; c < n; c++)
		{	
			a[c] = sc.nextInt();
		}
		obj.SecondSmallest(a);
		
		
	}

}
                    