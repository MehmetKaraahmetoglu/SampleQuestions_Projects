package packages.arraysDeneme;

import java.util.Arrays;

public class C01_deneme {
    public static void main(String[] args) {
        //    Soru 1-  Verilen bir int array’in tum elemanlarini 2 artirip
        //             bize donduren bir method olusturun.
        //             Eski array’i yeni haliyle kaydedin.
        //
             int[] arr ={3,4,6,8,1};

             int artis=2;


        for (int i = 0; i < arr.length; i++) {
            arr[i]= arr[i] + artis;
            // hocam burdan devam edin,  orda nasıl olmus anlamadim
            // hocam git ve github kurarken dosyalar ile alakali hata yapmis olabilirim
            //Tesekkurler


        }
        System.out.println(Arrays.toString(arr));
    }
}
