import java.io.*;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        File f = new File("sinema.txt");

        if (!f.exists()) {
            System.out.println("HATA");
            System.out.println("Lutfen 'sinema.txt' dosyasinin konumunu ve ismini kontrol ediniz......");
            return;
        }


        System.out.println("Indirimli bilet icin 1 basiniz, normal devam etmek icin herhangi bir tusa basiniz....");
        Scanner scanner = new Scanner(System.in);

        int evet;
        evet = scanner.nextInt();
        if(evet == 1){

            IndirimliBilet indirimliBilet = new IndirimliBilet();
            System.out.println("Indirim kodunu giriniz: (araba)");
            String discountCode;
            scanner.nextLine();
            discountCode = scanner.nextLine();
            indirimliBilet.indirimUygula(discountCode);








        }else {
            Scanner sc = new Scanner(System.in);

            Bilet bilet = new Bilet();


            System.out.println("---Musteri bilgilerini giriniz---");
            System.out.println("Ad: ");
            bilet.setMusteriAdi(sc.next());

            System.out.println("Soyad: ");
            bilet.setMusteriSoyadi(sc.next());

            System.out.println("TC kimlik no: ");
            bilet.setMusteriTC(sc.next());


            System.out.println("Bilet ucretini giriniz: ");
            bilet.setFiyat(sc.nextInt());

            char sira, sandalye, salon;


            System.out.println("Salon giriniz: ");
            salon = scanner.next().charAt(0);

            System.out.println("Sira no giriniz: ");
            sira = scanner.next().charAt(0);

            System.out.println("Koltuk No giriniz: ");
            sandalye = scanner.next().charAt(0);


            Koltuk koltuk = new Koltuk();
            koltuk.yerAyir(salon, sira, sandalye);


            bilet.showTicket();
            System.out.println("------SALON BILGILERI------");
            System.out.println("Salon no: " + salon);
            System.out.println("Sira : " + sira);
            System.out.println("Koltuk no: " + sandalye);
        }

    }







}
