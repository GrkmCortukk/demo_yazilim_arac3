package tr.edu.medipol.yazilimaraclari;

import static org.junit.Assert.*;

import org.junit.Test;

public class HesaplamaAppTest {

	@Test
	public void testToplama() {
		
		// On kosullar (given)
		int sayi1 = 101;
		int sayi2 = 499;
		
		// Asil test edilecek metodun cagrilmasi (When)
		int sonuc = HesaplamaApp.toplama(sayi1, sayi2);
		
		// Kontrol adimi (Then)
		assertEquals(600, sonuc);
	}

}