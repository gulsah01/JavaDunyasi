package day10_SwitchCase_stringManipulations;

import java.util.Locale;

public class c04_toUpperCASE_toLowerCase {
    public static void main(String[] args) {

        String str ="Java Candır";
        System.out.println(str.toUpperCase());// JAVA CANDIR

        str = str.toUpperCase();// JAVA CANDIR

        System.out.println(str.toLowerCase());//java candir

        //eger yerel bir dile gore buyuk kucuk harf degisimi yapmak istersek

        System.out.println(str.toLowerCase(Locale.forLanguageTag("Tr")));// java candir.



    }
}
