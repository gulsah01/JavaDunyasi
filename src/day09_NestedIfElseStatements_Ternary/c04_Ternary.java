package day09_NestedIfElseStatements_Ternary;

public class c04_Ternary {
    public static void main(String[] args) {
        //input olarak verilen bir sayinin 3 ile tam bolunup bolunmedigini bul
        int input = 20;
        //input % 3 == 0 ? "3 ile bolunuyor" : "3 ile bolunmuyor"
//bu soruda ternary bize bir string donduruyot
        // bunu ya dire yazdir
        // veya bir string varianle a ata
        System.out.println(input % 3 == 0 ? "3 ile bolunuyor" : "3 ile bolunmuyor");
        String sonuc =input % 3 == 0 ? "3 ile bolunuyor" : "3 ile bolunmuyor";
        System.out.println(sonuc);

        // verilen input cift sayi ise "cift sayi " ,
        // input tek sayi ise 2*input sonucunu bir ternary yaz
        System.out.println(input % 2 == 0 ? "cift sayi" : 2 * input);
//int sonuc2 = input%2==0 ? "cift sayi" : 2*input ;
// eger ternary de true durumu ile false durumu bize farkli data turunde sonuclar donduruyorsa
        //sonucu bir variable a atayamayiz
        // ama direk yazdirabiliriz.


    }
}
