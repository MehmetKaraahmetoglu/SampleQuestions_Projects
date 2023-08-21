package packages.sampleQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class soru35 {
    //Soru 35-)
    //Parametre olarak bir isim kabul eden ve ismi bir char Array dizisi olarak yazdıran bir method Return edin.
    //		--> toCharArray() yöntemini kullanmayın
    //      Örnek:
    //		String isim:    Yakup
    //		char arr[]:     [Y,a,k,u,p]
    //İpucu: Bir method içerisinde Array oluşturun ve aldıgınız ismi methoda gönderin.
    //Bu ismi parçalayarak, her bir harfi, Arraye yerleştirin

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen harflerine bölmek istediginiz ismi giriniz:");
        String isim= scanner.nextLine();
        harflereAyirma(isim);

    }
    public static char[] harflereAyirma(String isim){


        char[] harfler = new char[isim.length()];

        for (int i = 0; i < harfler.length; i++) {
            harfler[i] = isim.charAt(i);


        }
        System.out.println("Harflerine ayrilmis isim: " + Arrays.toString(harfler));
        return  harfler;
    }



}

