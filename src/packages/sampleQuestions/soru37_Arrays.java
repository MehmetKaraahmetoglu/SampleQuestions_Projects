package packages.sampleQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class soru37_Arrays {
    /*Tekrarlanan kayıtların çıkarıldığı yeni bir dizi döndüren aşağıdaki başlıga sahip bir metot yazınız.
    On tane tamsayı alan ve bu metodu çağırarak sonucu gösteren bir test programı yazınız.
            ---->>>
    public static int[] eliminateDuplicates(int[] list)
    ÖRNEK:
    On sayi giriniz:
            1 2 3 2 1 6 3 4 5 2
    ÇIKTI:
    Birbirinden farkli girilen sayilar: 1 2 3 6 4 5

     */
    public static void main(String[] args) {
        System.out.println(tekrarsizlar());

    }

    public static List<Integer> tekrarsizlar() {

        System.out.println("Array olusturmak icin 10 adet sayi giriniz");
        Scanner scanner = new Scanner(System.in);

        int[] sayilar = new int[10];

        for (int i = 0; i < sayilar.length; i++) {
            sayilar[i] = scanner.nextInt();

        }
        // int[] sayilar = {1 2 3 4 5 6 7 8 9 0};
        List<Integer> tekrarsizlar = new ArrayList<>();

        for (int i = 0; i < sayilar.length; i++) {
            if (!tekrarsizlar.contains(sayilar[i])) {
                tekrarsizlar.add(sayilar[i]);

            }
        }
        return tekrarsizlar;
    }
}




