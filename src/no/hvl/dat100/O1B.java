package no.hvl.dat100;

public class O1B {

	public static void main(String[] args) {
		int[][] test = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] test2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] test3 = { { 7, 8, 10 }, { 6, 7, 8, 10 }, { 7, 8, 10 } };

		skrivUt1(test);
		System.out.println(tilStreng(test));
		skrivUt1(skaler(10, test));
		System.out.println(erLik(test, test2));
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

	// d)

	public static boolean erLik(int[][] mat1, int[][] mat2) {
		boolean erLik = true;
		// sjekker om lengden er lik først
		if (mat1.length == mat2.length) {

			for (int r = 0; r < mat1.length; r++) {

				for (int k = 0; k < mat1[r].length; k++) {
					if (mat1[r][k] != mat2[r][k]) {
						erLik = false;
						return erLik;
					}
				}
			}
		} else {
			erLik = false;
		}
		return erLik;
	}
}
