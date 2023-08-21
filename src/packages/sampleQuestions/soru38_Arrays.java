package packages.sampleQuestions;

public class soru38_Arrays {
    //Soru-38)
    //Bir tamsayı dizisini (Int Array) girdi olarak kabul eden ve
    //verilen bu (Arrayden) diziden minimum ve maksimum sayıları yazdıran bir yöntem yazın.
    //Örnek:
    //Input : {3,2,5,4,1,6}
    //Output :
    //min: 1
    //max: 6

    public static void main(String[] args) {
        int[] tamSayi= {1,5,6,10,2,56,23,-5};

        min_max_degerler(tamSayi);
        //max sayi: 56
        //min sayi: -5
    }
    public static void min_max_degerler (int[] sayi){

        int min = sayi[0];
        int max = sayi[0];

        for (int i = 0; i < sayi.length; i++) {
            if (sayi[i] < min){
                min = sayi[i];
            }
            if (sayi[i] > max){
                max = sayi[i];
            }
        }
        System.out.println("max sayi: "  + max);
        System.out.println("min sayi: " + min);

    }
}
