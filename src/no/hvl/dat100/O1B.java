package no.hvl.dat100;

public class O1B {

	public static void main(String[] args) {
		int[][] test = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		skrivUt1(test);
		System.out.println(tilStreng(test));
		skrivUt1(skaler(10, test));

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

	public static int[][] skaler(int tall, int[][] matrise) {

		int[][] nyMatrise = new int[matrise.length][];

		for (int rad = 0; rad < matrise.length; rad++) {

			// legger til lengden på raden slik at den blir dynamisk
			nyMatrise[rad] = new int[matrise[rad].length];

			for (int element = 0; element < matrise[rad].length; element++) {
				nyMatrise[rad][element] = matrise[rad][element] * tall;
			}
		}

		return nyMatrise;
	}

}
