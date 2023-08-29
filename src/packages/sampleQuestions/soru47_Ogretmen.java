package packages.sampleQuestions;

public class soru47_Ogretmen {
    String ad;
    String soyad;
    String kimlikNo;
    int yas;
    String bolum;
    String sicilNo;
    int siraNo;

    public soru47_Ogretmen() {
    }

    @Override
    public String toString() {
        return "Ogretmen Sira No" + siraNo +
                ", Ad: " + ad +
                ", Soyad: " + soyad +
                ", KimlikNo: " + kimlikNo +
                ", Yas: " + yas +
                ", Bolum: " + bolum +
                ", SicilNo: " + sicilNo;
    }

    public soru47_Ogretmen(int siraNo, String ad, String soyad, String kimlikNo, int yas, String bolum, String sicilNo) {
        this.siraNo = siraNo;
        this.ad = ad;
        this.soyad = soyad;
        this.kimlikNo = kimlikNo;
        this.yas = yas;
        this.bolum = bolum;
        this.sicilNo = sicilNo;
    }
}
