package no.hvl.dat100;

public class O1B {

	public static void main(String[] args) {
		int[][] test = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		skrivUt1(test);
		System.out.println(tilStreng(test));

	}
// a)

	public static void skrivUt1(int[][] matrise) {

		for (int rad[] : matrise) {
			for (int element : rad) {
				System.out.print(element + " ");
			}
			System.out.println();
		}

	}

	// b)

	public static String tilStreng(int[][] matrise) {
		String returStreng = "";

		for (int i = 0; i < matrise.length; i++) {
			int[] rad = matrise[i];
			for (int k = 0; k < rad.length; k++) {
				returStreng += rad[k] + " ";
			}
			returStreng += "\n";
		}
		return returStreng;
	}
	
	// c)
	
	

}
