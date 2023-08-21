package packages.sampleQuestions;

import java.util.Scanner;

public class soru44 {
    //Soru 44-)
    //StudentMaın adında bir class olusturun, ögrenci bilgilerini alın.
    //(ad soyad yas cınsiyet okul) Ardından Student adlı bir class olusturun ve içine parametreli constructor koyun,
    //bu parametreler Maın classdaki bılgılerı ıstesın.
    //Bu parametreli constructor icinde kullanıcıya ögrenci bilgilerini doldurtun.
    //Ardından consolda girilen bilgileri yazdırın
    //Ipucu:
    //Bu soruda iki classa ihtiyacımız olacak.
    //Birinci main classda ögrenci bilgilerini tanımlayacagımız variablerı olusturacagız.
    //String isim, int yas, char cinsiyet gibi...
    //Ardından baska bir class olusturacagız ve bu classa parametrelı bir constructor koyacagız,
    //bu parametrelı constructor az önce olusturdugumuz classdaki parametreleri kabul edecek sekılde olmalı.
    //Ardından Main classda, parametreli constructoru olan classtan bir obje olusturacagız ve
    //tabi ki constructor parametrelı oldugu ıcın bızden parametre yazmamızı ısteycek,
    //bızde yukarıda olusturdugumuz variable adlarını ekleyecegız.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen ögrenci adini giriniz: ");
        String ogrenciAdi =scanner.nextLine();

        System.out.println("Lütfen ogrenci soyadini giriniz: ");
        String soyad=scanner.next();

        System.out.println("Lütfen ogrencinin yasini giriniz: ");
        int yas =scanner.nextInt();

        System.out.println("Cinsiyeti giriniz: \nErkek icin 'e' , Kiz icin 'k':" );
        char cinsiyet=scanner.next().toUpperCase().charAt(0);

        System.out.println("Lütfen okul bilgisini giriniz:");
        String okul=scanner.next();
        scanner.nextLine();


        soru44Student student1= new soru44Student(ogrenciAdi,soyad,yas,cinsiyet,okul);
        System.out.println(student1);
    }


}
