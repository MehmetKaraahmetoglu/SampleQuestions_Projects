package packages.sampleQuestions;

public class soru34 {
    //Soru 34-)
    //Bir String'i parametre olarak kabul eden ve verilen dizede Stringde bulunan
    //rakamların toplamını yazdıran bir Method yazın.
    //
    //Örnek
    //String str : ade1r4d3
    //Int toplam : 8
    //İpucu :      Character.isDigit() kullanarak Digitleri alabilir sonra bunları Arraye atabilirsiniz.
    //                  Ardından loop yardımı ile Integer.valueOf() kullanarak toplama yapabilirsiniz


    public static void main(String[] args) {

rakamlarToplami("1a2b3c4");

    }
    public static void rakamlarToplami(String metin){

        metin = metin.replaceAll("\\D","");
        int metinRakamlari = Integer.parseInt(metin);

        int bolumdenkalan=0;
        int toplam =0;

        for (int i = 0; i < metin.length(); i++) {

            bolumdenkalan = metinRakamlari % 10;
            toplam += bolumdenkalan;
            metinRakamlari = metinRakamlari /10 ;


        }
        System.out.println("Metin icindeki rakamlar toplami: " + toplam);


    }
}
