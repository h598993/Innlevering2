package no.hvl.dat100;

public class O1A {

	public static void main(String[] args) {
		int[] heltallsTabell = { 1, 23, 4, 6, 8, 12, 45, 13 };

		skrivUt(heltallsTabell);
		String tabellTilStreng = tilstreng(heltallsTabell);
		System.out.println(tabellTilStreng);

		System.out.println(summerForLøkke(heltallsTabell));
		System.out.println(summerWhileLøkke(heltallsTabell));
		System.out.println(summerForEach(heltallsTabell));
	}

	// a)
	public static void skrivUt(int[] tabell) {
		System.out.println("*********************************************************");
		System.out.print("[ ");
		for (int heltall : tabell) {

			System.out.print(heltall + " ");

		}
		System.out.println("]");
		System.out.println();
		System.out.println("*********************************************************");

	}

	// b)

	public static String tilstreng(int[] tabell) {

		String nyStreng = "[";
		for (int i = 0; i < tabell.length - 1; i++) {
			nyStreng = nyStreng + tabell[i] + ",";
		}
		nyStreng = nyStreng + tabell[tabell.length - 1];
		nyStreng = nyStreng + "]";

		return nyStreng;
	}

	// c

	public static int summerForLøkke(int[] tabell) {

		int sum = 0;

		for (int i = 0; i < tabell.length; i++) {
			sum = sum + tabell[i];
		}
		return sum;
	}

	public static int summerWhileLøkke(int[] tabell) {

		int sum = 0;
		int i = 0;
		while (i < tabell.length) {

			sum += tabell[i];
			i++;
		}

		return sum;
	}

	public static int summerForEach(int[] tabell) {

		int sum = 0;
		for (int tall : tabell) {
			sum += tall;
		}
		return sum;
	}

public static void test() {
	
	
}
}
