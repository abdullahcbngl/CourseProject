
public class KullaniciServis {
	public void Ekle(Kullanici kullanici) {
		System.out.println(kullanici.adi + " " + kullanici.soyAdi + " ba�ar�yla sisteme eklendi.");
	}
	
	public void Sil(Kullanici kullanici) {
		System.out.println(kullanici.adi + " " +  kullanici.soyAdi + " sistemden kald�r�ld�.");
	}
	
	public void G�ncelleme(Kullanici kullanici) {
		System.out.println(kullanici.adi + " " + kullanici.soyAdi + " ba�ar�yla sistemde g�ncellendi. ");
	}
}

