import java.util.Scanner;

public class kahveMakinesi {
    public static void main(String[] args) {
        /*basit bir Kahve makinesi oluşturun.
        1. Şart
        3 çeşit kahvemiz olsun.
        Sistem şu soruyu sorsun: "Hangi Kahveyi istersiniz?"
        Bu soru ile birlikte kullanıcı kahve bilgilerini görsün.
        Örn:
        Hangi Kahveyi İstersiniz?
        1.Türk kahvesi
        2.Filtre Kahve
        3.Espresso
        2.Şart
        Kahve seçildikten sonra sistem kullanıcıya "Süt eklemek istemisiniz?(Evet veya Hayır olarak cevaplayınız)
        3. Şart
        Süt tercihi yapıldıktan sonra sistem kullanıcıya "Şeker ister misiniz ? (Evet veya hayır cevabını veriniz)
        sorusunu sorsun.
        4. Şart
        Şeker tercihini yaptıktan sonra sistem kullanıcıya "Hangi boyutta olsun? (Büyük boy - orta boy - küçük boy olarak giriniz.)
        sorusunu sorsun.
        Sonuç
        Siparişlerimizi verdik. Son hali görmek istiyoruz.
        konsola şunu yazdırın örnek :
        Türk Kahvesi orta boy hazırdır. Afiyet olsun !!!
 */

        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        System.out.println("Mehmetbucks'a hosgeldiniz!\nHangi kahveyi istersiniz? ");
        System.out.println("Kahve numarasini secip enter'a basiniz...");
        System.out.println("1- Türk Kahvesi\n2- Filtre Kahve\n3- Espresso\n");

        int secim = scanner.nextInt();
        /*
        char secimSut;
        char secimSeker;
        char secimBoyut;

         */

        if (secim == 1 || secim == 2 || secim == 3) {
            switch (secim) {
                case 1:
                    System.out.println("Süt eklemek istermisiniz? E= Evet  H= Hayir  ");
                    char secimSut = scanner.next().toUpperCase().charAt(0);


                    if (secimSut=='E') {
                        System.out.println("Seker eklemek istermisiniz?  E= Evet  H= Hayir");
                        char secimSeker = scanner.next().toUpperCase().charAt(0);
                        switch (secimSeker) {
                            case 'E':
                                System.out.println("Hangi boyutta olsun?\nB= Buyuk  O= Orta  K= Kucuk");
                                char secimBoyut = scanner.next().toUpperCase().charAt(0);
                                switch (secimBoyut) {
                                    case 'B':
                                        System.out.println("Büyük boy, sekerli, sütlü Türk kahvesi hazirdir.\nAfiyet olsun!");
                                        break;
                                    case 'O':
                                        System.out.println("Orta boy, sekerli, sütlü Türk kahvesi hazirdir.\nAfiyet olsun!");
                                        break;
                                    case 'K':
                                        System.out.println("Kucuk boy, sekerli, sütlü Türk kahvesi hazirdir.\nAfiyet olsun!");
                                        break;
                                    default:
                                        System.out.println("Hatali giris yaptiniz lütfen boyutu tekrar giriniz...\nB= Buyuk  O= Orta  K= Kucuk");
                                        secimBoyut = scanner.next().toUpperCase().charAt(0);
                                        break;
                                }
                                break;
                            case 'H':
                                System.out.println("Hangi boyutta olsun?\nB= Buyuk  O= Orta  K= Kucuk");
                                secimBoyut = scanner.next().toUpperCase().charAt(0);
                                switch (secimBoyut) {
                                    case 'B':
                                        System.out.println("Büyük boy, sekersiz, sütlü Türk kahvesi hazirdir.\nAfiyet olsun!");
                                        break;
                                    case 'O':
                                        System.out.println("Orta boy, sekersiz, sütlü Türk kahvesi hazirdir.\nAfiyet olsun!");
                                        break;
                                    case 'K':
                                        System.out.println("Kucuk boy, sekersiz, sütlü Türk kahvesi hazirdir.\nAfiyet olsun!");
                                        break;
                                    default:
                                        System.out.println("Hatali giris yaptiniz lütfen boyutu tekrar giriniz...\nB= Buyuk  O= Orta  K= Kucuk");
                                        secimBoyut = scanner.next().toUpperCase().charAt(0);
                                        break;
                                }
                                break;
                            default:
                                System.out.println("Hatali giris yaptiniz,Lütfen kahve türünü tekrar giriniz...");
                                secim = scanner.nextInt();
                        }
                    } else if (secimSut=='H') {
                        System.out.println("Seker eklemek istermisiniz? E= Evet  H= Hayir");
                        char secimSeker = scanner.next().toUpperCase().charAt(0);
                        switch (secimSeker) {
                            case 'E':
                                System.out.println("Hangi boyutta olsun?\nB= Buyuk  O= Orta  K= Kucuk");
                                char secimBoyut = scanner.next().toUpperCase().charAt(0);
                                switch (secimBoyut) {
                                    case 'B':
                                        System.out.println("Büyük boy, sekerli, sütsüz Türk kahvesi hazirdir.\nAfiyet olsun!");
                                        break;
                                    case 'O':
                                        System.out.println("Orta boy, sekerli, sütsüz Türk kahvesi hazirdir.\nAfiyet olsun!");
                                        break;
                                    case 'K':
                                        System.out.println("Kucuk boy, sekerli, sütsüz Türk kahvesi hazirdir.\nAfiyet olsun!");
                                        break;
                                    default:
                                        System.out.println("Hatali giris yaptiniz lütfen boyutu tekrar giriniz...\nB= Buyuk  O= Orta  K= Kucuk");
                                        secimBoyut = scanner.next().toUpperCase().charAt(0);
                                        break;
                                }
                                break;
                            case 'H':
                                System.out.println("Hangi boyutta olsun?\nB= Buyuk  O= Orta  K= Kucuk");
                                secimBoyut = scanner.next().toUpperCase().charAt(0);
                                switch (secimBoyut) {
                                    case 'B':
                                        System.out.println("Büyük boy, sekersiz, sütsüz Türk kahvesi hazirdir.\nAfiyet olsun!");
                                        break;
                                    case 'O':
                                        System.out.println("Orta boy, sekersiz, sütsüz Türk kahvesi hazirdir.\nAfiyet olsun!");
                                        break;
                                    case 'K':
                                        System.out.println("Kucuk boy, sekersiz, sütsüz Türk kahvesi hazirdir.\nAfiyet olsun!");
                                        break;
                                    default:
                                        System.out.println("Hatali giris yaptiniz lütfen boyutu tekrar giriniz...\nB= Buyuk  O= Orta  K= Kucuk");
                                        secimBoyut = scanner.next().toUpperCase().charAt(0);
                                        break;
                                }
                                break;
                            default:
                                System.out.println("Hatali giris yaptiniz,Lütfen kahve türünü tekrar giriniz...");
                                secim = scanner.nextInt();
                        }


                    }else {
                        System.out.println("Hatali giris yaptiniz, lütfen tekrar deneyiniz.\nSüt eklemek istermisiniz? Evet veya Hayir olarak cevaplayiniz");
                        secimSut=scanner.next().toUpperCase().charAt(0);
                    }
                    break;


                case 2:
                    System.out.println("Süt eklemek istermisiniz? E= Evet  H= Hayir  ");
                    secimSut = scanner.next().toUpperCase().charAt(0);


                    if (secimSut=='E') {
                        System.out.println("Seker eklemek istermisiniz?  E= Evet  H= Hayir");
                        char secimSeker = scanner.next().toUpperCase().charAt(0);
                        switch (secimSeker) {
                            case 'E':
                                System.out.println("Hangi boyutta olsun?\nB= Buyuk  O= Orta  K= Kucuk");
                                char secimBoyut = scanner.next().toUpperCase().charAt(0);
                                switch (secimBoyut) {
                                    case 'B':
                                        System.out.println("Büyük boy, sekerli, sütlü Filtre kahve hazirdir.\nAfiyet olsun!");
                                        break;
                                    case 'O':
                                        System.out.println("Orta boy, sekerli, sütlü Filtre kahve hazirdir.\nAfiyet olsun!");
                                        break;
                                    case 'K':
                                        System.out.println("Kucuk boy, sekerli, sütlü Filtre kahve hazirdir.\nAfiyet olsun!");
                                        break;
                                    default:
                                        System.out.println("Hatali giris yaptiniz lütfen boyutu tekrar giriniz...\nB= Buyuk  O= Orta  K= Kucuk");
                                        secimBoyut = scanner.next().toUpperCase().charAt(0);
                                        break;
                                }
                                break;
                            case 'H':
                                System.out.println("Hangi boyutta olsun?\nB= Buyuk  O= Orta  K= Kucuk");
                                secimBoyut = scanner.next().toUpperCase().charAt(0);
                                switch (secimBoyut) {
                                    case 'B':
                                        System.out.println("Büyük boy, sekersiz, sütlü Filtre kahve hazirdir.\nAfiyet olsun!");
                                        break;
                                    case 'O':
                                        System.out.println("Orta boy, sekersiz, sütlü Filtre kahve hazirdir.\nAfiyet olsun!");
                                        break;
                                    case 'K':
                                        System.out.println("Kucuk boy, sekersiz, sütlü Filtre kahve hazirdir.\nAfiyet olsun!");
                                        break;
                                    default:
                                        System.out.println("Hatali giris yaptiniz lütfen boyutu tekrar giriniz...\nB= Buyuk  O= Orta  K= Kucuk");
                                        secimBoyut = scanner.next().toUpperCase().charAt(0);
                                        break;
                                }
                                break;
                            default:
                                System.out.println("Hatali giris yaptiniz,Lütfen kahve türünü tekrar giriniz...");
                                secim = scanner.nextInt();
                        }
                    } else if (secimSut=='H') {
                        System.out.println("Seker eklemek istermisiniz? E= Evet  H= Hayir");
                        char secimSeker = scanner.next().toUpperCase().charAt(0);
                        switch (secimSeker) {
                            case 'E':
                                System.out.println("Hangi boyutta olsun?\nB= Buyuk  O= Orta  K= Kucuk");
                                char secimBoyut = scanner.next().toUpperCase().charAt(0);
                                switch (secimBoyut) {
                                    case 'B':
                                        System.out.println("Büyük boy, sekerli, sütsüz Filtre kahve hazirdir.\nAfiyet olsun!");
                                        break;
                                    case 'O':
                                        System.out.println("Orta boy, sekerli, sütsüz Filtre kahve hazirdir.\nAfiyet olsun!");
                                        break;
                                    case 'K':
                                        System.out.println("Kucuk boy, sekerli, sütsüz Filtre kahve hazirdir.\nAfiyet olsun!");
                                        break;
                                    default:
                                        System.out.println("Hatali giris yaptiniz lütfen boyutu tekrar giriniz...\nB= Buyuk  O= Orta  K= Kucuk");
                                        secimBoyut = scanner.next().toUpperCase().charAt(0);
                                        break;
                                }
                                break;
                            case 'H':
                                System.out.println("Hangi boyutta olsun?\nB= Buyuk  O= Orta  K= Kucuk");
                                secimBoyut = scanner.next().toUpperCase().charAt(0);
                                switch (secimBoyut) {
                                    case 'B':
                                        System.out.println("Büyük boy, sekersiz, sütsüz Filtre kahve hazirdir.\nAfiyet olsun!");
                                        break;
                                    case 'O':
                                        System.out.println("Orta boy, sekersiz, sütsüz Filtre kahve hazirdir.\nAfiyet olsun!");
                                        break;
                                    case 'K':
                                        System.out.println("Kucuk boy, sekersiz, sütsüz Filtre kahve hazirdir.\nAfiyet olsun!");
                                        break;
                                    default:
                                        System.out.println("Hatali giris yaptiniz lütfen boyutu tekrar giriniz...\nB= Buyuk  O= Orta  K= Kucuk");
                                        secimBoyut = scanner.next().toUpperCase().charAt(0);
                                        break;
                                }
                                break;
                            default:
                                System.out.println("Hatali giris yaptiniz,Lütfen kahve türünü tekrar giriniz...");
                                secim = scanner.nextInt();
                        }


                    }else {
                        System.out.println("Hatali giris yaptiniz, lütfen tekrar deneyiniz.\nSüt eklemek istermisiniz? Evet veya Hayir olarak cevaplayiniz");
                        secimSut=scanner.next().toUpperCase().charAt(0);
                    }
                    break;



                case 3:
                    System.out.println("Süt eklemek istermisiniz? E= Evet  H= Hayir  ");
                    secimSut = scanner.next().toUpperCase().charAt(0);


                    if (secimSut=='E') {
                        System.out.println("Seker eklemek istermisiniz?  E= Evet  H= Hayir");
                        char secimSeker = scanner.next().toUpperCase().charAt(0);
                        switch (secimSeker) {
                            case 'E':
                                System.out.println("Hangi boyutta olsun?\nB= Buyuk  O= Orta  K= Kucuk");
                                char secimBoyut = scanner.next().toUpperCase().charAt(0);
                                switch (secimBoyut) {
                                    case 'B':
                                        System.out.println("Büyük boy, sekerli, sütlü Espresso hazirdir.\nAfiyet olsun!");
                                        break;
                                    case 'O':
                                        System.out.println("Orta boy, sekerli, sütlü Espresso hazirdir.\nAfiyet olsun!");
                                        break;
                                    case 'K':
                                        System.out.println("Kucuk boy, sekerli, sütlü Espresso hazirdir.\nAfiyet olsun!");
                                        break;
                                    default:
                                        System.out.println("Hatali giris yaptiniz lütfen boyutu tekrar giriniz...\nB= Buyuk  O= Orta  K= Kucuk");
                                        secimBoyut = scanner.next().toUpperCase().charAt(0);
                                        break;
                                }
                                break;
                            case 'H':
                                System.out.println("Hangi boyutta olsun?\nB= Buyuk  O= Orta  K= Kucuk");
                                secimBoyut = scanner.next().toUpperCase().charAt(0);
                                switch (secimBoyut) {
                                    case 'B':
                                        System.out.println("Büyük boy, sekersiz, sütlü Espresso hazirdir.\nAfiyet olsun!");
                                        break;
                                    case 'O':
                                        System.out.println("Orta boy, sekersiz, sütlü Espresso hazirdir.\nAfiyet olsun!");
                                        break;
                                    case 'K':
                                        System.out.println("Kucuk boy, sekersiz, sütlü Espresso hazirdir.\nAfiyet olsun!");
                                        break;
                                    default:
                                        System.out.println("Hatali giris yaptiniz lütfen boyutu tekrar giriniz...\nB= Buyuk  O= Orta  K= Kucuk");
                                        secimBoyut = scanner.next().toUpperCase().charAt(0);
                                        break;
                                }
                                break;
                            default:
                                System.out.println("Hatali giris yaptiniz,Lütfen kahve türünü tekrar giriniz...");
                                secim = scanner.nextInt();
                        }
                    } else if (secimSut=='H') {
                        System.out.println("Seker eklemek istermisiniz? E= Evet  H= Hayir");
                        char secimSeker = scanner.next().toUpperCase().charAt(0);
                        switch (secimSeker) {
                            case 'E':
                                System.out.println("Hangi boyutta olsun?\nB= Buyuk  O= Orta  K= Kucuk");
                                char secimBoyut = scanner.next().toUpperCase().charAt(0);
                                switch (secimBoyut) {
                                    case 'B':
                                        System.out.println("Büyük boy, sekerli, sütsüz Espresso hazirdir.\nAfiyet olsun!");
                                        break;
                                    case 'O':
                                        System.out.println("Orta boy, sekerli, sütsüz Espresso hazirdir.\nAfiyet olsun!");
                                        break;
                                    case 'K':
                                        System.out.println("Kucuk boy, sekerli, sütsüz Espresso hazirdir.\nAfiyet olsun!");
                                        break;
                                    default:
                                        System.out.println("Hatali giris yaptiniz lütfen boyutu tekrar giriniz...\nB= Buyuk  O= Orta  K= Kucuk");
                                        secimBoyut = scanner.next().toUpperCase().charAt(0);
                                        break;
                                }
                                break;
                            case 'H':
                                System.out.println("Hangi boyutta olsun?\nB= Buyuk  O= Orta  K= Kucuk");
                                secimBoyut = scanner.next().toUpperCase().charAt(0);
                                switch (secimBoyut) {
                                    case 'B':
                                        System.out.println("Büyük boy, sekersiz, sütsüz Espresso hazirdir.\nAfiyet olsun!");
                                        break;
                                    case 'O':
                                        System.out.println("Orta boy, sekersiz, sütsüz Espresso hazirdir.\nAfiyet olsun!");
                                        break;
                                    case 'K':
                                        System.out.println("Kucuk boy, sekersiz, sütsüz Espresso hazirdir.\nAfiyet olsun!");
                                        break;
                                    default:
                                        System.out.println("Hatali giris yaptiniz lütfen boyutu tekrar giriniz...\nB= Buyuk  O= Orta  K= Kucuk");
                                        secimBoyut = scanner.next().toUpperCase().charAt(0);
                                        break;
                                }
                                break;
                            default:
                                System.out.println("Hatali giris yaptiniz,Lütfen kahve türünü tekrar giriniz...");
                                secim = scanner.nextInt();
                        }


                    }else {
                        System.out.println("Hatali giris yaptiniz, lütfen tekrar deneyiniz.\nSüt eklemek istermisiniz? Evet veya Hayir olarak cevaplayiniz");
                        secimSut=scanner.next().toUpperCase().charAt(0);
                    }
                    break;


            }


        } else {
            System.out.println("Hatali giris yaptiniz. Iyi gunler");

        }
    }
}
