package day10_SwitchCase_stringManipulations;

public class c03_StringManipulations {
    public static void main(String[] args) {
        /* String manipulation verilen bir string uzerinde HAZIR METODLAR kullanarak
        degisiklik yapmak veya
        verilen string uzerindeki bir bilgiyi almak
        icin yaptigimiz tum islemlerdir

        string uzerinde yapilan manipulation islemleri stringi kalici olarak degistirmez

        eger yapilan islem sonucundaki yeni halin kalici olmasini istersek atama yapmaliyiz.

         */
        String str = "Java Candir";
        // str in ilk harfini yazdirin
        System.out.println(str.charAt(0)); // J

        // str i tum harfleri buyuk yazdir
        System.out.println(str.toUpperCase());// JAVA CANDIR


        //str i tamamen kucuk harflerden olusan bir metne cevirin
        str = str.toLowerCase();
        System.out.println(str);





    }
}
