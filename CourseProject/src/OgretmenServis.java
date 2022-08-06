
public class OgretmenServis {
	 public void kursEkleme(Ogretmen ogretmen, Kurs kurs) {
		 System.out.println("Sayýn " + ogretmen.adi + " " 
				  + ogretmen.soyAdi +", " + kurs.kursAdi + " adlý kursunuz sisteme eklenmiþtir.");
	 }
	 
	 public void odev(Ogretmen ogretmen) {
		  System.out.println(ogretmen.adi + " " +  ogretmen.soyAdi +  ", ödevleriniz sisteme eklenmiþtir.");
	 }
}
