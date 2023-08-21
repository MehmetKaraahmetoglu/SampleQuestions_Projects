package packages.StringManipulationsSorular;

public class aa {
    public static void main(String[] args) {
          /*
     kullanicinin belirli bir formatta verdigi string fiyatlari toplayip yazdirin
     input1= "15.30$" input2 =11.40$
     output= 26.70
      */
        String str1= "15.30$";
        String str2="11.40$";

        System.out.println(str1 = str1.replace(".","_"));
        System.out.println(str2 = str2.replace(".","_"));

        System.out.println(str1= str1.replaceAll("\\W",""));
        System.out.println(str2= str2.replaceAll("\\W",""));

        System.out.println(str1 = str1.replace("_", "."));
        System.out.println(str2 = str2.replace("_","."));

        System.out.println((Double.parseDouble(str1))+(Double.parseDouble(str2)));

    }
}
