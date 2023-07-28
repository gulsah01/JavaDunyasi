package day13_stringManipulation_forLoops;

public class c02_ReplaceAll {
    public static void main(String[] args) {

        String str ="1Ja4va 8c9a2n5dir";
        str=str.replace("1","");

        System.out.println(str); //Ja4va 8c9a2n5dir

        //sayilarin tamamindan kurtulmak istersek
        //replace() yeterli olmaz
        // java da sayilar , ozel karakterler, alfabetik karakterlerin tumuyle islem yapmak istersek
        //replaceAll demeliyiz

        str=str.replaceAll("\\d","");
        System.out.println(str); // Java candir

      //   Regex (Regular Expressions)
      //  \\s : space     \\S : space olmayan hersey
      //  \\s+ : yanyana birden fazla space
      //  \\d : digits        \\D : digit olmayan hersey
      //  \\w : harf veya rakam   \\W : harf veya rakam olmayan hersey

    }
}
