public class Exceptions_examples {
    public static void main(String[] args) {
        int sayi= 10;
        int sayi1=0;

        try {

            System.out.println(sayi / sayi1);
        }
        catch (ArithmeticException e){
            System.out.println("sayi 0'a bölünemez");
        }
    }
}
