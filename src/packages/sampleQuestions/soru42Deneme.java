package packages.sampleQuestions;

public class soru42Deneme {
    public static void main(String[] args) {
       soru42Constructor nesne = new soru42Constructor("Laptop","Gri",5);
        System.out.println(nesne);
        //soru42Constructor{nesneAdi='Laptop', nesneRengi='Gri', miktari=5}

        soru42Constructor nesne1 = new soru42Constructor("Masa üstü PC","Siyah",8);
        System.out.println(nesne1);
        //soru42Constructor{nesneAdi='Masa üstü PC', nesneRengi='Siyah', miktari=8}
    }
}
