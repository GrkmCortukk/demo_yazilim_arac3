package tr.edu.medipol.yazilimaraclari;

public class HesaplamaApp {

	public static void main(String[] args) {
		
		int sayi1 = 2;
		int sayi2 = 4;
		System.out.printf("%d + %d = %d", sayi1, sayi2, toplama(sayi1, sayi2));
	}
	
	public static int toplama(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}
}