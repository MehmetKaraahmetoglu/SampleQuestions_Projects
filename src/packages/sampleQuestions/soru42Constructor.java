package packages.sampleQuestions;

public class soru42Constructor {
    //Biri parametreli, diğeri parametresiz 2 constructor oluşturun.
    //Bu const. kullanarak en az 2 nesne oluşturun ve konsolda bu nesnelerin özellikleri yazdırın
    //Ipucu: Constructor konusunu pratik yapalım.
    //Nesnelerin rengini adını sayısını gönderelim sonra cagırıp konsolda yazdıralım.

    String nesneAdi;
    String nesneRengi;
    int miktari;




    public soru42Constructor() {

    }

    @Override
    public String toString() {
        return "soru42Constructor{" +
                "nesneAdi='" + nesneAdi + '\'' +
                ", nesneRengi='" + nesneRengi + '\'' +
                ", miktari=" + miktari +
                '}';
    }

    public soru42Constructor(String nesneAdi, String nesneRengi, int miktari) {
        this.nesneAdi = nesneAdi;
        this.nesneRengi = nesneRengi;
        this.miktari = miktari;


    }
}

