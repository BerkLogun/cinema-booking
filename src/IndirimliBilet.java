import java.io.IOException;
import java.util.Scanner;

public class IndirimliBilet extends Bilet{
    public String indirimKodu = "araba";
    public int indirimliBiletFiyati = 10;
    Bilet bilet = new Bilet();

        public void indirimUygula(String girilenKod) throws IOException {
            if(girilenKod.equals(indirimKodu)){
                bilet.setFiyat(indirimliBiletFiyati);

                Scanner sc = new Scanner(System.in);




                System.out.println("---Musteri bilgilerini giriniz---");
                System.out.println("Ad: ");
                bilet.setMusteriAdi(sc.next());

                System.out.println("Soyad: ");
                bilet.setMusteriSoyadi(sc.next());

                System.out.println("TC kimlik no: ");
                bilet.setMusteriTC(sc.next());


                Scanner scanner = new Scanner(System.in);

                char sira, sandalye, salon;

                System.out.println("Salon giriniz: ");
                salon = scanner.next().charAt(0);

                System.out.println("Sira no giriniz: ");
                sira = scanner.next().charAt(0);

                System.out.println("Koltuk No giriniz: ");
                sandalye = scanner.next().charAt(0);


                Koltuk koltuk = new Koltuk();
                koltuk.yerAyir(salon,sira,sandalye);

                bilet.showTicket();
                System.out.println("------SALON BILGILERI------");
                System.out.println("Salon no: " + salon);
                System.out.println("Sira : " + sira);
                System.out.println("Koltuk no: " + sandalye);


            }else{
                System.out.println("Yanlis indirim kodu girdiniz...");
                System.exit(1);
            }


        }
}
