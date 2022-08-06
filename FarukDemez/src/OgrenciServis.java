
public class OgrenciServis extends KullaniciServis{
	public void kayýtOlma(Ogrenci ogrenci, Kurs kurs) {
		System.out.println(ogrenci.adi + " " + ogrenci.soyAdi + " , " + kurs.kursAdi + "' eðitimi kursuna baþarýyla katýldýnýz" ) ;
		System.out.println("Ýyi dersler dileriz.");
	}
	
	public void basarý( Ogrenci ogrenci ) {
		if(ogrenci.tamamlamaYuzdesi>80) {
			System.out.println(ogrenci.adi +" " +ogrenci.soyAdi +  " katýlým belgesi almaya hak kazandýnýz.");
		}
		
		else 
			System.out.println(ogrenci.adi +" " + ogrenci.soyAdi +  " maalesef kursu tamamlayamadýnýz.");
		}
	}
	

