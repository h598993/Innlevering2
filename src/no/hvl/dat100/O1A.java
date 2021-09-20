package no.hvl.dat100;

public class O1A {

	public static void main(String[] args) {
		int[] heltallsTabell = { 1, 23, 4, 6, 8, 12, 45, 13 };

		skrivUt(heltallsTabell);
		String tabellTilStreng = tilstreng(heltallsTabell);
		System.out.println(tabellTilStreng);
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
		for(int i =0;i<tabell.length-1;i++) {
			nyStreng = nyStreng + tabell[i] + ",";
		}
		nyStreng = nyStreng + tabell[tabell.length-1];
		nyStreng = nyStreng + "]";
		
		return nyStreng;
	}
}
