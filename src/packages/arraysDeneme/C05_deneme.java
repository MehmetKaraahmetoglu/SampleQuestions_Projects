package packages.arraysDeneme;

public class C05_deneme {
    // Soru 6- Verilen String bir array’deki en uzun ve en kisa kelimeleri yazdiran bir method olusturun.

    public static void main(String[] args) {

        String[] isimler = {"Resul", "Omer", "Mehmet", "Ertugrul"};

        String enUzun = isimler[0];
        String enKisa = isimler[0];

        for (int i = 0; i < isimler.length; i++) {
            if (isimler[i].length() > enUzun.length()){
                enUzun = isimler[i];
            }
            if (isimler[i].length() < enKisa.length()){
                enKisa = isimler[i];

            }

        }
        System.out.println("en uzun isim: "+ enUzun);
        System.out.println("en kisa isim: "+ enKisa);


    }
}
