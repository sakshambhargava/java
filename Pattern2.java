
public class Pattern2 {

	public static void main(String[] args) {
		int s, b, r;
		for(r = 1; r <= 5; r++) {
			for(b = 1; b <= 6-r; b++) {
				System.out.print(" ");
			}
			for(s =1; s <= 2*r-1; s++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(r = 1; r <= 6; r++) {
			for(b = 1; b <= r-1; b++) {
				System.out.print(" ");
			}
			for(s = 1; s <= 13-2*r; s++) {
				System.out.print("*");
			}
		System.out.println();	
		}

	}

}
