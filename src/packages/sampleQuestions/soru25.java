package packages.sampleQuestions;

public class soru25 {
    public static void main(String[] args) {
        //Soru 25 : Alfabeyi konsola yazdırın.
        //          örnek:
        //          a b c .. .. .. .. y z
        //          ipucu: char kullanmak iyi bir fikir olabilir.

        char ilk = 'a';
        char son = 'z';
        char x = ' ';

        for (int i = 'a'; i <= 'z' ; i++) {
            x = (char)i;
            System.out.print(x + " ");
        }

    }
}
