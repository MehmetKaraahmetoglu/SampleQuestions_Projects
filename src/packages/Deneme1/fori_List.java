package packages.Deneme1;

import java.util.ArrayList;
import java.util.List;

public class fori_List {
    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(1);
        sayilar.add(2);
        sayilar.add(3);

        int eklenecekSayi = 10;

        for (int i = 0; i < sayilar.size(); i++) {
            sayilar.set(i,(sayilar.get(i)+eklenecekSayi));

        }
        System.out.println(sayilar);



    }
}
