package packages.sampleQuestions;

import java.util.Arrays;

public class soru33 {
    public static void main(String[] args) {
        //Soru 33-)
        //Array kullanarak String bir cümleyi Reverse eden (tersine çeviren) bir Java programı yazın
        //(boşluklar ve özel karakterler dahil).
        //Örnek:
        //String str=''Kodlama harika.''
        //String arr[]: ".etaerg si gnidoC"
        //İpucu: Önce Split kullanarak Arraye çevirin ardından Loop kullanarak son karakterden başlayıp tersten yazdırın

        String str = "Kodlama harika.";

        char[] tersten1 = str.toCharArray();
        // System.out.println(Arrays.toString(tersten1));

        String tersten = "";
        int sayac = 0;

        for (int i = tersten1.length-1; i>=0; i--) {
            tersten += tersten1[i];
            sayac++;
        }
        // System.out.println(tersten);  // .akirah amaldoK

        String[] terstenArr= new String[1];
        terstenArr[0] =tersten;

        System.out.println(Arrays.toString(terstenArr));


    }


}



