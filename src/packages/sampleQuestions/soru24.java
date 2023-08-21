package packages.sampleQuestions;

public class soru24 {
    public static void main(String[] args) {
        /*
        Soru 24-) 20'den 0'a kadar çift sayıları yazdırın ancak decrement (i--) kullanmayın.
                Örnek: 100'den 0'a kadar Çift Sayılar şunlardır: 20 18 16 14 12 10 8 6 4 2 0
                ipucu: Loop içinde if kullanarak çözebilirsiniz. % kullanmak iyi bir fikir olabilir
         */
        int sayi = 20;

        System.out.print("\n20'den 0'a kadar Çift Sayılar şunlardır:");

        for (int i = 0; i <= sayi; i++) {

            if (i % 2 == 0) {

                System.out.print((sayi - i) + " ");

            }


        }
    }
}
