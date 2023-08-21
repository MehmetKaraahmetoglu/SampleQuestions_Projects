package packages.sampleQuestions;

public class soru44Student {
//  Ardından Student adlı bir class olusturun ve içine parametreli constructor koyun,
//  bu parametreler Maın classdaki bılgılerı ıstesın.
//  Bu parametreli constructor icinde kullanıcıya ögrenci bilgilerini doldurtun.
//  Ardından consolda girilen bilgileri yazdırın

    String ad = "Ad bilgisi girilmedi";
    String soyad= "Soyad bilgisi girilmedi";
    int yas;
    char cinsiyet;
    String okul ="Okul bilgisi girilmedi";

    public soru44Student() {

    }




    public soru44Student(String ad, String soyad, int yas, char cinsiyet, String okul) {
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
        this.cinsiyet = cinsiyet;
        this.okul = okul;


    }
    @Override
    public String toString() {
        return "Ogrenci bilgileri asagidadir." +
                "\nAd: " + ad +
                "\nSoyad: " + soyad  +
                "\nYas: " + yas +
                "\nCinsiyet: " + cinsiyet +
                "\nOkul: " + okul;
    }
}

