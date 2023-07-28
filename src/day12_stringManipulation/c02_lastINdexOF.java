package day12_stringManipulation;

public class c02_lastINdexOF {
    public static void main(String[] args) {

        String str = "Javayi ogrenecegiz, baska yolu yok";
        // "a" harfinin ilk kullanim indexini yazdirin
        System.out.println(str.indexOf("a")); //1

        // a harfinin son kullaniminin indexini yazdirin
        System.out.println(str.lastIndexOf("a")); //24

        //j harfinin ilk indexi
        System.out.println(str.indexOf("J")); //0

        // J harfinin son kullanimin son kullanimi
        System.out.println(str.lastIndexOf("J")); //0

        int ilkindex =str.indexOf("e");
        int sonindex =str.lastIndexOf("e");

        if (ilkindex == -1){
            System.out.println("Hic e kullanilmamis");
        } else if (ilkindex==sonindex) {
            System.out.println("Sadece 1 e kullanilmis");
        }else{
            System.out.println("e harfi 2 kere veya daha fazla kullanilmis");
        }
         // "Javayi ogrenecegiz, baska yolu yok";
        // o harfinin son index'ini yazdirin
        System.out.println(str.lastIndexOf("o")); // 32
        // o harfinin son kullanimindan bir onceki kullaniminin index'ini yazdirin
        System.out.println(str.lastIndexOf("o", 31)); // 27
        // k harfinin son kullaniminin indexini yazdiralim
        System.out.println(str.lastIndexOf('k')); // 33


    }
}
