import java.util.Scanner;

public class Bilet extends Koltuk{




    private String musteriAdi;
    private String musteriSoyadi;
    private String musteriTC;
    private int fiyat;

    public Bilet() {
        this.musteriAdi = musteriAdi;
        this.musteriSoyadi = musteriSoyadi;
        this.musteriTC = musteriTC;
        this.fiyat = fiyat;
    }


    public String getMusteriAdi() {
        return musteriAdi;
    }

    public void setMusteriAdi(String musteriAdi) {
        this.musteriAdi = musteriAdi;
    }

    public String getMusteriSoyadi() {
        return musteriSoyadi;
    }

    public void setMusteriSoyadi(String musteriSoyadi) {
        this.musteriSoyadi = musteriSoyadi;
    }

    public String getMusteriTC() {
        return musteriTC;
    }

    public void setMusteriTC(String musteriTC) {
        this.musteriTC = musteriTC;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }

    Gosterim gosterim = new Gosterim();








    public void showTicket(){
        int filmNo, tarihNo, seansNo;


        System.out.println("Film listesi: ");
        for(int i = 0; i < gosterim.filmler.length; i++){

            System.out.println(gosterim.filmler[i]);

        }
        Scanner scanner = new Scanner(System.in);

        System.out.println("Film numarasini seciniz: ");
        filmNo  = scanner.nextInt();

        System.out.println("Tarihler: ");

        for(int i = 0; i < gosterim.tarih.length; i++){
            System.out.println(gosterim.tarih[i]);
        }

        System.out.println("Tarih seciniz: (1-7 basiniz)");
        tarihNo = scanner.nextInt();

        System.out.println("Seanslar: ");
        for(int i = 0; i < gosterim.seanslar.length; i++){
            System.out.println(gosterim.seanslar[i]);
        }

        seansNo = scanner.nextInt();








        System.out.println("SINEMA BILETI");
        System.out.println("Bilet sahibi adi soyadi:  " + musteriAdi +" "+  musteriSoyadi);
        System.out.println("TC kimlik no: " + musteriTC);
        System.out.println("Film adi: " + gosterim.filmler[filmNo - 1]);
        System.out.println("Film tarihi: " + gosterim.tarih[tarihNo - 1]);
        System.out.println("Film seansi: " + gosterim.seanslar[seansNo - 1]);
        System.out.println("Fiyat: " + getFiyat());
    }












}










