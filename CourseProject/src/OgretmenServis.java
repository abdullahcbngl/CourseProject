
public class OgretmenServis {
	 public void kursEkleme(Ogretmen ogretmen, Kurs kurs) {
		 System.out.println("Say�n " + ogretmen.adi + " " 
				  + ogretmen.soyAdi +", " + kurs.kursAdi + " adl� kursunuz sisteme eklenmi�tir.");
	 }
	 
	 public void odev(Ogretmen ogretmen) {
		  System.out.println(ogretmen.adi + " " +  ogretmen.soyAdi +  ", �devleriniz sisteme eklenmi�tir.");
	 }
}
