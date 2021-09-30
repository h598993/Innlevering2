package no.hvl.dat100;

public class O1B {

	public static void main(String[] args) {
	int[][] test = {
			{2,4,45,2},
			{6,2,6,2},
	};
	
	skrivUt1(test);

	}
// a)
	
	public static void skrivUt1(int[][] matrise) {
		
		
		
		for(int rad[] : matrise) {
			for(int element : rad) {
				System.out.print(element + " ");
			}
			System.out.println();
		}
	
	}
}
