package day12_stringManipulation;

public class c01_indexOf {
    public static void main(String[] args) {
        String str = "Ali topu at, topu at ali";

        System.out.println(str.indexOf("top")); //4

        //ikinci top metnini yazdir
        System.out.println(str.indexOf("top", 5));  //13

        System.out.println(str.indexOf("top",str.indexOf("top")+1)); //13


        //at kelimesini iki kez kullanmi mi bul
        int ilkindex = str.indexOf("at"); // ya -1 olur ya dogal sayi olur

        if (ilkindex ==-1){// hic kullanilmamis demek
            System.out.println("2 kere kullanilmamis");
        }else {//en az bir kere kulanilmis

            int ikinciIndex = str.indexOf("at",ilkindex+1);
            //-1 veya 2. defa kullanilmissa dogal sayi olur
            if (ilkindex == -1){// sadace 1 kere kullanilmis,1. kullanim yok
                System.out.println("2 kere kullanilmamis");
            }else{
                System.out.println("2 defa veya daha fazla kullanilmis");
            }
        }

    }

}
