package no.hvl.dat100;

public class O1A {

	public static void main(String[] args) {
		int[] heltallsTabell = { 1, 23, 4, 6, 8, 12, 45, 13 };
		boolean finnestall = finnesTall(heltallsTabell, 12);

		skrivUt(heltallsTabell);
		String tabellTilStreng = tilstreng(heltallsTabell);
		System.out.println(tabellTilStreng);

		System.out.println(summerForLøkke(heltallsTabell));
		System.out.println(summerWhileLøkke(heltallsTabell));
		System.out.println(summerForEach(heltallsTabell));
		System.out.println(finnestall);
		System.out.println(posisjonTall(heltallsTabell, 14));
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

	// c)
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
	
	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		boolean funnet = false;
		int i = 0;
		while (!funnet && i < tabell.length) {
			if (tabell[i] == tall) {
				funnet = true;
			}
			i++;
		}

		return funnet;
	}
	
	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		int returVerdi = -1;
		
		for(int i=0; i < tabell.length;i++) {
			if (tabell[i] == tall) {
				returVerdi = i;
				break;
			}
		}
		return returVerdi;
		
	}
}
