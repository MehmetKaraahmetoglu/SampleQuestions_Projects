package packages.sampleQuestions;

import java.util.Arrays;

public class soru40_Arrays {
    //Soru 40-)
    //Parametre olarak 2 Int Array kabul eden ve 2 Array listesini yeni bir Arraye ekleyen ve yazdıran bir method yazın.
    //		 * Input1={1,2,3,4}
    //		 * Input2={5,6}
    //		 * Çıktı={1,2,3,4,5,6}

    public static void main(String[] args) {
        int arr1[] ={1,2,3};
        int arr2[] ={1,2,5,6,7};

        birlesik(arr1,arr2);

    }
    public static  int[] birlesik(int[] arr1,int[] arr2){

        int[] birlesik= new int[arr1.length+ arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            birlesik[i]=arr1[i];

        }
        // [1,2,3,0,0,0,0,0]
        int sayac=0;
        for (int i = 0; i < arr2.length; i++) {
            birlesik[arr1.length+sayac]=arr2[i];
            sayac++;
        }
        System.out.println(Arrays.toString(birlesik));
        return birlesik;
    }
}
