package packages.sampleQuestions;

import java.util.Scanner;

public class soru19 {
    public static void main(String[] args) {


        //Soru 19-)  Method Sorusu
        // Kullanıcıdan doğum tarihini alınız. Burcunu hesaplayan bir method yazınız.
        //ipucu:
        //Switch Case kullanabilirsiniz. Veya Method yazarak Method aracılıgı ile de yapabilirsiniz.
        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen dogum tarihinizin ayini rakam olarak giriniz");
        int ay = scanner.nextInt();

        System.out.println("lutfen dogdugunuz gunu rakam olarak giriniz");
        int gun = scanner.nextInt();
        switch (ay) {
            case 1:
                if (gun > 0 && gun <= 31) {
                    if (gun < 22) {
                        System.out.println("Oglak burcusunuz");
                    } else {
                        System.out.println("kova burcusunuz");
                    }
                } else {
                    System.out.println("hatali gun girdiniz, dogum gununuzu tekrar rakam olarak giriniz");
                }
                break;
            case 2:
                if (gun > 0 && gun <= 29) {
                    if (gun < 20) {
                        System.out.println("Kova burcusunuz");
                    } else {
                        System.out.println("Balik burcusunuz");
                    }
                } else {
                    System.out.println("hatali gun girdiniz, dogum gununuzu tekrar rakam olarak giriniz");
                }
                break;
            case 3:
                if (gun > 0 && gun <= 31) {
                    if (gun < 21) {
                        System.out.println("Balik burcusunuz");
                    } else {
                        System.out.println("Koc burcusunuz");
                    }
                } else {
                    System.out.println("hatali gun girdiniz, dogum gununuzu tekrar rakam olarak giriniz");
                }
                break;
            case 4:
                if (gun > 0 && gun <= 30) {
                    if (gun < 21) {
                        System.out.println("Koc burcusunuz");
                    } else {
                        System.out.println("Boga burcusunuz");
                    }
                } else {
                    System.out.println("hatali gun girdiniz, dogum gununuzu tekrar rakam olarak giriniz");
                }
                break;
            case 5:
                if (gun > 0 && gun <= 31) {
                    if (gun < 22) {
                        System.out.println("Boga burcusunuz");
                    } else {
                        System.out.println("Ikizler burcusunuz");
                    }
                } else {
                    System.out.println("hatali gun girdiniz, dogum gununuzu tekrar rakam olarak giriniz");
                }
                break;
            case 6:
                if (gun > 0 && gun <= 30) {
                    if (gun < 23) {
                        System.out.println("Ikizler burcusunuz");
                    } else {
                        System.out.println("Yengec burcusunuz");
                    }
                } else {
                    System.out.println("hatali gun girdiniz, dogum gununuzu tekrar rakam olarak giriniz");
                }
                break;
            case 7:
                if (gun > 0 && gun <= 31) {
                    if (gun < 23) {
                        System.out.println("Yengec burcusunuz");
                    } else {
                        System.out.println("Aslan burcusunuz");
                    }
                } else {
                    System.out.println("hatali gun girdiniz, dogum gununuzu tekrar rakam olarak giriniz");
                }
                break;

            case 8:
                if (gun > 0 && gun <= 31) {
                    if (gun < 23) {
                        System.out.println("Aslan burcusunuz");
                    } else {
                        System.out.println("Basak burcusunuz");
                    }
                } else {
                    System.out.println("hatali gun girdiniz, dogum gununuzu tekrar rakam olarak giriniz");
                }
                break;
            case 9:
                if (gun > 0 && gun <= 30) {
                    if (gun < 23) {
                        System.out.println("Basak burcusunuz");
                    } else {
                        System.out.println("Terazi burcusunuz");
                    }
                } else {
                    System.out.println("hatali gun girdiniz, dogum gununuzu tekrar rakam olarak giriniz");
                }
                break;

            case 10:
                if (gun > 0 && gun <= 31) {
                    if (gun < 23) {
                        System.out.println("Terazi burcusunuz");
                    } else {
                        System.out.println("Akrep burcusunuz");
                    }
                } else {
                    System.out.println("hatali gun girdiniz, dogum gununuzu tekrar rakam olarak giriniz");
                }
                break;
            case 11:
                if (gun > 0 && gun <= 30) {
                    if (gun < 22) {
                        System.out.println("Akrep burcusunuz");
                    } else {
                        System.out.println("Yay burcusunuz");
                    }
                } else {
                    System.out.println("hatali gun girdiniz, dogum gununuzu tekrar rakam olarak giriniz");
                }
                break;
            case 12:
                if (gun > 0 && gun <= 31) {
                    if (gun < 22) {
                        System.out.println("Yay burcusunuz");
                    } else {
                        System.out.println("Oglak burcusunuz");
                    }
                } else {
                    System.out.println("hatali gun girdiniz, dogum gununuzu tekrar rakam olarak giriniz");
                }
                break;
            default:
                System.out.println("ay girisi hatali, lutfen dogdigunuz ayi rakam olarak giriniz");

        }


    }


}

