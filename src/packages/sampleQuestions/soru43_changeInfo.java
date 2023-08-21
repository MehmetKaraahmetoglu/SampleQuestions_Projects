package packages.sampleQuestions;

import java.util.Scanner;

// soru 43
public class soru43_changeInfo {

    //Main methodda ögrenci bilgileri oluşturun ve bu verileri kullanın.
    //Changename adında bir method oluşturun, parametre olarak öğrenci bilgileri alın
    //ve methodda tüm bilgileri değiştirin ve yeni bilgileri ekleyip yazdırın.

    //Main Methoddaki Changename methodunu çağırdığımız satırda öğrenci bilgilerini tekrardan yazdırın
    //Changesurname adlı bir method oluşturun , bu method lastname'i parametre olarak alsın.
    // Methodda kullanıcıya yeni bir lastname sorulsun ve eski lastname degiştirilsin.

    //  public static void main(String[] args) {

    static String ogrenciAdi;
    String ogrenciSoyadi;
    int yas;
    //Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) { //Main methodda ögrenci bilgileri oluşturun ve bu verileri kullanın.

       // soru43_changeInfo ogrenci1 = new soru43_changeInfo("mehmet", "karaahmetoglu", 33);
       // System.out.println("ogrenci adi :"+ ogrenci1.ogrenciAdi);
       // String ogrenciAdi="mehmet";
       // String ogrenciSoyadi="Kara";
       // int yas= 33;
       //  System.out.println(ogrenci1);
       //  System.out.println("");

        soru43_changeInfo ogrenci1 = new soru43_changeInfo();
        ogrenci1.ogrenciAdi="Ahmet";
        ogrenci1.ogrenciSoyadi="Mehmet";
        ogrenci1.yas=30;
/*
        changeName(ogrenci1);
        System.out.println(ogrenci1);
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println(ogrenci1.ogrenciAdi);





 */
        System.out.println(ogrenci1);
        System.out.println(ogrenciAdi);



    }


    public String toString() {
        return "Ogrenci bilgileri: " +
                "Ogrenci adi: " + ogrenciAdi + '\'' +
                ", Ogrenci soyadi: " + ogrenciSoyadi + '\'' +
                "Ogrencinin yasi: " + yas;
    }

    public soru43_changeInfo() {

    }

    public soru43_changeInfo(String ogrenciAdi, String ogrenciSoyadi, int yas) {


        this.ogrenciAdi = ogrenciAdi;
        this.ogrenciSoyadi = ogrenciSoyadi;
        this.yas = yas;

    }

    public static void changeName(soru43_changeInfo ogrenci) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(ogrenci);
        System.out.println("");


        System.out.println("Yeni ögrenci adini giriniz: ");
        String gelen = scanner.nextLine();
        if (!gelen.isEmpty()) {
            ogrenci.ogrenciAdi = gelen;
        }


        System.out.println("Yeni ögrenci soyadini giriniz: ");
        String gelen1 = scanner.nextLine();
        if (!gelen1.isEmpty()) {
            ogrenci.ogrenciSoyadi = gelen1;
        }


        System.out.println("Yeni ögrenci yasini giriniz: ");
        String gelen3 = scanner.nextLine();
        if (!gelen3.isEmpty())
            ogrenci.yas = Integer.parseInt(gelen3);


    }
    // Changesurname adlı bir method oluşturun , bu method lastname'i parametre olarak alsın.
    // Methodda kullanıcıya yeni bir lastname sorulsun ve eski lastname degiştirilsin.


    public soru43_changeInfo(String ogrenciSoyadi) {

        this.ogrenciSoyadi = ogrenciSoyadi;
    }

    public static void changeSurname(soru43_changeInfo ogrenciSoyadi) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen ögrencinin yeni soyadini giriniz: ");
        String yeniSoyad = scanner.nextLine();
        ogrenciSoyadi.ogrenciSoyadi = yeniSoyad;
        System.out.println("Ogrencinin yeni soyadi: " + yeniSoyad);

    }
}

