package day10_SwitchCase_stringManipulations;

public class c05_equals {
    public static void main(String[] args) {
String str1 = "Mehmet";
String str2 = "MEHMET";
String str3 = "mehmet";
String str4 = "MEHmet";

        System.out.println(str1==str2); // false

        System.out.println(str3 == str4.toLowerCase()); // mehmet == mehmet false

        System.out.println(str2 == str3.toUpperCase()); // MEHMET == MEHMET false

        /* Stringlede == bekledigimiz sonuclara DONMEYEBILIR
        bunun sebebi String classini olustururken yapilan bazi ozelliklerdir
        bu konu olerde detayli bir sekilde anlatilacak

        verilen iki String in metinsel olarak ayni olup olmadigini kontrol etmek icin
        == yerine equals() kullanilir

        equals() u bire bir ayni olan iki metin icin true ,
        farkli metinler icin false sonucu uretir(dondurur)
        bu karsilastirmada metnin ayni olmasi yaninda ,
        buyuk kucuk harf durumunu da kontrol eder(case sensitive)

        eger case sensitive olmadan metinleri karsilastirmak isterseniz
        equalsIgnoreCase() kullanilir

         */
        System.out.println(str1.equals(str2));// Mehmet == MEHMET
        System.out.println(str3.equals(str4.toLowerCase())); //mehmet == mehmet // true
        System.out.println(str2.equals(str3.toUpperCase())); // MEHMET  == MEHMET  // true

        System.out.println(str1.equalsIgnoreCase(str2));// Mehmet == MEHMET -- true
        System.out.println(str1.equalsIgnoreCase(str3));// Mehmet == mehmet -- true
        System.out.println(str3.equalsIgnoreCase(str4)); // mehmet == MEHmet -- true




    }
}
