
public class KullaniciServis {
	public void Ekle(Kullanici kullanici) {
		System.out.println(kullanici.adi + " " + kullanici.soyAdi + " baþarýyla sisteme eklendi.");
	}
	
	public void Sil(Kullanici kullanici) {
		System.out.println(kullanici.adi + " " +  kullanici.soyAdi + " sistemden kaldýrýldý.");
	}
	
	public void Güncelleme(Kullanici kullanici) {
		System.out.println(kullanici.adi + " " + kullanici.soyAdi + " baþarýyla sistemde güncellendi. ");
	}
}

