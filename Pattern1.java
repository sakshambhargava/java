
public class Pattern1 {

	public static void main(String[] args) {
		int s1, b, s2, r;
		for(s1 = 1; s1<=11; s1++) {
			System.out.print("*");
		}
		System.out.println();
		for(r = 1; r <= 4; r++)
		{
			for(s1 = 1; s1 <= 6-r; s1++) {
				System.out.print("*");
			}
			for(b = 1; b <= 2*r-1; b++) {
				System.out.print(" ");
			}
			for(s2 = 1; s2 <= 6-r; s2++) {
				System.out.print("*");
			}
		System.out.println();	
		}
		
		for(r = 1; r <= 5; r++) {
			for(s1 = 1; s1 <= r; s1++) {
				System.out.print("*");
			}
			for(b = 1; b <=11-2*r; b++) {
				System.out.print(" ");
			}
			for(s2 = 1; s2 <= r; s2++) {
				System.out.print("*");
			}
		System.out.println();	
		}
		for(s1 = 1; s1 <= 11; s1++) {
			System.out.print("*");
		}
	
	}

}
