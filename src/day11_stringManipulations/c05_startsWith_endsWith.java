package day11_stringManipulations;

public class c05_startsWith_endsWith {
    public static void main(String[] args) {
        String str = "Java cok guzel";
        // str Java ile mi basliyor?
        System.out.println(str.startsWith("Java")); // true

        // str j ile baslar
        System.out.println(str.startsWith("J"));

        System.out.println(str.startsWith("Ja"));
        // str ja ile mi basliyor

        System.out.println(str.startsWith("Java cok guzel"));
        // str java cok guzel ile mi basliyor

        System.out.println(str.startsWith("")); // hiclik de true j den once hiclik var

        //5. indexden sonrasi c ile mi baslar
        System.out.println(str.startsWith("c" ,5)); // true

        //6.indexden sonrasi ok ile mi baslar ?
        System.out.println(str.startsWith("ok",6)); // true

        // java vok guzel ile mi biter
        System.out.println(str.endsWith("guzel")); // true

        //str el ile mi biter?
        System.out.println(str.endsWith("el")); // true

        //str "" ile mi biter?
        System.out.println(str.endsWith("")); // true

        System.out.println(str.endsWith(" ")); // false


    }
}
