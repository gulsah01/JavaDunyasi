package day12_stringManipulation;

public class c04_nullPointer {
    public static void main(String[] args) {
String str1;
        //System.out.println(str1);
        //str1.concat("candir");
str1 = "java";



        System.out.println(str1); // java
        System.out.println(str1.concat("candir")); // java candir

String str2 = null;
/* null bir deger degil pointerdir(isaretleyici)
15 satir icin
str2 nin degeri null veya str2 ye null degeri atanmis ifadeleri YANLISTIR
dogru olan ifade
str2 ye deger atamadik farkindayiz,ve null olarak isaretledik
 */

        System.out.println(str2); // null
        System.out.println(str2+ " candir"); // null candir

     //   System.out.println(str2.concat("candir"));//NullPointerException

        str2= "tava";

        System.out.println(str2);// tava
        System.out.println(str2.concat("candir")); // tava candir

        String str3 = null;
        String str4 = "";
        System.out.println(str4.isBlank()); // true
        System.out.println(str4.isEmpty()); // true
        // System.out.println(str3.isBlank()); // NullPointerException
        // System.out.println(str3.isEmpty()); // NullPointerException



    }
}
