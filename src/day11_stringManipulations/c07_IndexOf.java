package day11_stringManipulations;

public class c07_IndexOf {
    public static void main(String[] args) {
        String  str = "Ali topu at, at ali at";

        //Ali nin index i nedir ? 0

        System.out.println(str.indexOf("Ali"));
        // at in indexi nedir? 9
        System.out.println(str.indexOf("at")); // 9

        //op un indexi kac?  5
        System.out.println(str.indexOf("op")); //5

        System.out.println(str.indexOf('a')); // 9

        System.out.println(str.indexOf("a",10)); // 13

      //  System.out.println(str.indexOf("yusuf")); //
    }
}
