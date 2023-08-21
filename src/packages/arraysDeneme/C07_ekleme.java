package packages.arraysDeneme;

import java.util.Arrays;

public class C07_ekleme {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6, 7, 8};

        //Yeni bir Array olusturup verilen arraylerin elementlerini, yeni arrayin icine element olarak atayin.
        int[] arr3 = new int[arr1.length+ arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];

        }
        System.out.println(Arrays.toString(arr3));
        int sayac = 0;
        for (int i = arr1.length; i < arr3.length ; i++) {
            arr3[i] = arr2[sayac];
            sayac++;

        }
       System.out.println(Arrays.toString(arr3));
    }

}