
public class OgrenciServis extends KullaniciServis{
	public void kay�tOlma(Ogrenci ogrenci, Kurs kurs) {
		System.out.println(ogrenci.adi + " " + ogrenci.soyAdi + " , " + kurs.kursAdi + "' e�itimi kursuna ba�ar�yla kat�ld�n�z" ) ;
		System.out.println("�yi dersler dileriz.");
	}
	
	public void basar�( Ogrenci ogrenci ) {
		if(ogrenci.tamamlamaYuzdesi>80) {
			System.out.println(ogrenci.adi +" " +ogrenci.soyAdi +  " kat�l�m belgesi almaya hak kazand�n�z.");
		}
		
		else 
			System.out.println(ogrenci.adi +" " + ogrenci.soyAdi +  " maalesef kursu tamamlayamad�n�z.");
		}
	}
	

