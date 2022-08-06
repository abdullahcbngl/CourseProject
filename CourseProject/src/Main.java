
public class Main {

	public static void main(String[] args) {
		Kurs kurs1 = new Kurs();
		kurs1.kursId = 32151253;
		kurs1.kursAdi = "C#";

		Kurs kurs2 = new Kurs();
		kurs2.kursId = 4561236;
		kurs2.kursAdi = "Java";

		Kurs kurs3 = new Kurs();
		kurs3.kursId = 75613486;
		kurs3.kursAdi = "Siber G�venlik E�itimi";

		Kurs kurs4 = new Kurs();
		kurs4.kursId = 115348;
		kurs4.kursAdi = "Android Programlama";

		Kurs kurs5 = new Kurs();
		kurs5.kursId = 5;
		kurs5.kursAdi = "Web Tasar�m�";

		Kurs kurs6 = new Kurs();
		kurs6.kursId = 6;
		kurs6.kursAdi = "�leri Seviye Python E�itimi";

		Kurs kurs7 = new Kurs();
		kurs7.kursId = 7;
		kurs7.kursAdi = "Veritaban� Geli�time";

		System.out.println("---------Kurslar�m�z-----------");
		Kurs[] kurslar = { kurs1, kurs2, kurs3, kurs4, kurs5, kurs6, kurs7 };
		for (Kurs kurs : kurslar) {
			System.out.println(kurs.kursAdi);
		}

		Ogretmen ogretmen1 = new Ogretmen();
		ogretmen1.ogretmenId = 1;
		ogretmen1.adi = "Mustafa Murat";
		ogretmen1.soyAdi = "Co�kun";
		ogretmen1.eMail = "mustafamrtcskn@gmail.com";
		ogretmen1.bolum = "Web Programlama";
		ogretmen1.deneyimSuresi = 8;
		ogretmen1.sertifika = "Microsoft Web Gelistiricisi";
		ogretmen1.yas = "32";

		Ogretmen ogretmen2 = new Ogretmen();
		ogretmen2.ogretmenId = 2;
		ogretmen2.adi = "Engin";
		ogretmen2.soyAdi = "Demiro�";
		ogretmen2.eMail = "engindemirog@gmail.com";
		ogretmen2.bolum = "Kurumsal Yaz�l�m Mimarileri";
		ogretmen2.deneyimSuresi = 10;
		ogretmen2.sertifika = "MCT, PMP, ITIL";
		ogretmen2.yas = "30";

		Ogretmen ogretmen3 = new Ogretmen();
		ogretmen3.ogretmenId = 3;
		ogretmen3.adi = "At�l ";
		ogretmen3.soyAdi = "Samanc�o�lu";
		ogretmen3.eMail = "@atilsamancioglu.com";
		ogretmen3.bolum = "Siber G�venlik";
		ogretmen3.deneyimSuresi = 7;
		ogretmen3.sertifika = "Siber G�venlik Sertifikas�";
		ogretmen3.yas = "35";

		Ogretmen ogretmen4 = new Ogretmen();
		ogretmen4.ogretmenId = 4;
		ogretmen4.adi = "Selman";
		ogretmen4.soyAdi = "Kahya";
		ogretmen4.eMail = "@SelmaKahyaX";
		ogretmen4.bolum = "Android Geli�tirme";
		ogretmen4.deneyimSuresi = 12;
		ogretmen4.sertifika = "Uber Android Geli�tiricisi";
		ogretmen4.yas = "28";

		Ogretmen ogretmen5 = new Ogretmen();
		ogretmen5.ogretmenId = 5;
		ogretmen5.adi = "Sadi Evren";
		ogretmen5.soyAdi = "�eker";
		ogretmen5.eMail = "sadievrenseker@gmail.com";
		ogretmen5.bolum = "Web Geli�tirme";
		ogretmen5.deneyimSuresi = 15;
		ogretmen5.sertifika = "Web Geli�tirme sertifikas�";
		ogretmen5.yas = "38";

		Ogretmen ogretmen6 = new Ogretmen();
		ogretmen6.ogretmenId = 6;
		ogretmen6.adi = "Volkan";
		ogretmen6.soyAdi = "Ta�c�";
		ogretmen6.eMail = "vlkntsc@gmail.com";
		ogretmen6.bolum = "Masa�st� Uygulamalar�";
		ogretmen6.deneyimSuresi = 7;
		ogretmen6.sertifika = "MCT";
		ogretmen6.yas = "32";

		Ogretmen ogretmen7 = new Ogretmen();
		ogretmen7.ogretmenId = 7;
		ogretmen7.adi = "Emre";
		ogretmen7.soyAdi = "Altunbilek";
		ogretmen7.eMail = "altnbilekemre@gmail.com";
		ogretmen7.bolum = "Web tasar�m�";
		ogretmen7.deneyimSuresi = 9;
		ogretmen7.sertifika = "Web aray�z geli�tirme sertifikas�";
		ogretmen7.yas = "39";

		System.out.println("------------E�itmenlerimiz------------ ");
		System.out.println("\n");

		Ogretmen[] ogretmenler = { ogretmen1, ogretmen2, ogretmen3, ogretmen4, ogretmen5, ogretmen6, ogretmen7 };
		for (Ogretmen ogretmen : ogretmenler) {
			System.out.println(ogretmen.adi + " " + ogretmen.soyAdi);
		}

		System.out.println("-------------------------");

		Ogrenci ogrenci1 = new Ogrenci();
		ogrenci1.ogrenciId = 1;
		ogrenci1.adi = "Faruk";
		ogrenci1.soyAdi = "Demez";
		ogrenci1.eMail = "farukdmz@gmail.com";
		ogrenci1.okulAdi = "Milli Savunma �niversitesi Deniz Harp Okulu";
		ogrenci1.yas = "21";
		ogrenci1.tamamlamaYuzdesi = 80;

		Ogrenci ogrenci2 = new Ogrenci();
		ogrenci2.ogrenciId = 2;
		ogrenci2.adi = "Mehmet";
		ogrenci2.soyAdi = "Ak�n";
		ogrenci2.eMail = "mhmtakn@gmail.com";
		ogrenci2.okulAdi = "Ege �niversitesi";
		ogrenci2.yas = "23";
		ogrenci2.tamamlamaYuzdesi = 60;

		Ogrenci ogrenci3 = new Ogrenci();
		ogrenci3.ogrenciId = 3;
		ogrenci3.adi = "Ece";
		ogrenci3.soyAdi = "Bilek";
		ogrenci3.eMail = "blk2321@hotmail.com";
		ogrenci3.okulAdi = "�stanbul Teknik �niversitesi";
		ogrenci3.yas = "21";
		ogrenci3.tamamlamaYuzdesi = 90;

		Ogrenci ogrenci4 = new Ogrenci();
		ogrenci4.ogrenciId = 4;
		ogrenci4.adi = "Meltem";
		ogrenci4.soyAdi = "�elik";
		ogrenci4.eMail = "mltmclk34@gmail.com";
		ogrenci4.okulAdi = "Ankara Fen Lisesi";
		ogrenci4.yas = "17";
		ogrenci4.tamamlamaYuzdesi = 60;

		Ogrenci ogrenci5 = new Ogrenci();
		ogrenci5.ogrenciId = 5;
		ogrenci5.adi = "Kerem";
		ogrenci5.soyAdi = "Yoku�";
		ogrenci5.eMail = "keremmyks@gmail.com";
		ogrenci5.okulAdi = "Bilkent �niversitesi";
		ogrenci5.yas = "20";
		ogrenci5.tamamlamaYuzdesi = 100;

		Ogrenci ogrenci6 = new Ogrenci();
		ogrenci6.ogrenciId = 6;
		ogrenci6.adi = "Ahmet";
		ogrenci6.soyAdi = "Bilgin";
		ogrenci6.eMail = "blgntmha@hotmail.com";
		ogrenci6.okulAdi = "�ukurova �niversitesi";
		ogrenci6.tamamlamaYuzdesi = 65;
		ogrenci6.yas = "24";

		Ogrenci ogrenci7 = new Ogrenci();
		ogrenci7.ogrenciId = 7;
		ogrenci7.adi = "Buket";
		ogrenci7.soyAdi = "�etin";
		ogrenci7.eMail = "ctnbkt1452@hotmail.com";
		ogrenci7.okulAdi = "Ad�yaman �niversitesi";
		ogrenci7.tamamlamaYuzdesi = 84;
		ogrenci7.yas = "21";

		Ogrenci ogrenci8 = new Ogrenci();
		ogrenci8.ogrenciId = 8;
		ogrenci8.adi = "Berkay";
		ogrenci8.soyAdi = "Buca";
		ogrenci8.eMail = "berkaybuca21@hotmail.com";
		ogrenci8.okulAdi = "�stanbul Geli�im �niversitesi";
		ogrenci8.tamamlamaYuzdesi = 79;
		ogrenci8.yas = "22";

		Ogrenci ogrenci9 = new Ogrenci();
		ogrenci9.ogrenciId = 9;
		ogrenci9.adi = "Suat";
		ogrenci9.soyAdi = "G�ne�";
		ogrenci9.eMail = "suatgns@outlook.com";
		ogrenci9.okulAdi = "�zmir Ekonomi �niversitesi ";
		ogrenci9.tamamlamaYuzdesi = 98;
		ogrenci9.yas = "24";

		Ogrenci[] ogrenciler = { ogrenci1, ogrenci2, ogrenci3, ogrenci4, ogrenci5, ogrenci6, ogrenci7, ogrenci8,
				ogrenci9 };
		System.out.println("------------Kay�tl� ��rencilerimiz ------------ ");
		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i].adi + " " + ogrenciler[i].soyAdi);
		}

		System.out.println("\n");

		KullaniciServis kullaniciServis = new KullaniciServis();
		kullaniciServis.Ekle(ogrenci1);
		kullaniciServis.Ekle(ogrenci2);
		kullaniciServis.Ekle(ogrenci3);
		kullaniciServis.Ekle(ogrenci4);
		kullaniciServis.Ekle(ogrenci5);
		kullaniciServis.Sil(ogrenci8);
		kullaniciServis.Sil(ogretmen1);
		kullaniciServis.Sil(ogrenci9);
		kullaniciServis.Sil(ogrenci3);
		kullaniciServis.G�ncelleme(ogretmen2);
		kullaniciServis.G�ncelleme(ogretmen4);
		kullaniciServis.G�ncelleme(ogrenci4);
		kullaniciServis.G�ncelleme(ogrenci5);
		kullaniciServis.G�ncelleme(ogretmen6);
		kullaniciServis.G�ncelleme(ogrenci5);
		System.out.println("\n");

		System.out.println("--------------");
		OgrenciServis ogrenciServis = new OgrenciServis();
		ogrenciServis.kay�tOlma(ogrenci1, kurs1);
		ogrenciServis.kay�tOlma(ogrenci2, kurs2);
		ogrenciServis.kay�tOlma(ogrenci3, kurs3);
		ogrenciServis.kay�tOlma(ogrenci4, kurs4);
		ogrenciServis.kay�tOlma(ogrenci5, kurs1);
		ogrenciServis.kay�tOlma(ogrenci7, kurs5);
		ogrenciServis.kay�tOlma(ogrenci6, kurs7);
		System.out.println("\n");
		ogrenciServis.basar�(ogrenci1);
		ogrenciServis.basar�(ogrenci2);
		ogrenciServis.basar�(ogrenci3);
		ogrenciServis.basar�(ogrenci4);
		ogrenciServis.basar�(ogrenci5);
		ogrenciServis.basar�(ogrenci7);
		ogrenciServis.basar�(ogrenci9);

		System.out.println("--------------");
		OgretmenServis ogretmenServis = new OgretmenServis();
		ogretmenServis.kursEkleme(ogretmen1, kurs1);
		ogretmenServis.kursEkleme(ogretmen2, kurs2);
		ogretmenServis.kursEkleme(ogretmen3, kurs3);
		ogretmenServis.kursEkleme(ogretmen4, kurs4);
		ogretmenServis.kursEkleme(ogretmen6, kurs5);
		ogretmenServis.kursEkleme(ogretmen5, kurs7);
		System.out.println("\n");
		ogretmenServis.odev(ogretmen1);
		ogretmenServis.odev(ogretmen2);
		ogretmenServis.odev(ogretmen3);
		ogretmenServis.odev(ogretmen4);
		ogretmenServis.odev(ogretmen6);
		ogretmenServis.odev(ogretmen5);
		ogretmenServis.odev(ogretmen7);
	}

}
