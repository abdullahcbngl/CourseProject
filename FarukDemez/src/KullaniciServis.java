
public class KullaniciServis {
	public void Ekle(Kullanici kullanici) {
		System.out.println(kullanici.adi + " " + kullanici.soyAdi + " başarıyla sisteme eklendi.");
	}
	
	public void Sil(Kullanici kullanici) {
		System.out.println(kullanici.adi + " " +  kullanici.soyAdi + " sistemden kaldırıldı.");
	}
	
	public void Güncelleme(Kullanici kullanici) {
		System.out.println(kullanici.adi + " " + kullanici.soyAdi + " başarıyla sistemde güncellendi. ");
	}
}

