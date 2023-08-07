package day32_stringBuilder_accessModifier;

public class C06_Runner {
    public static void main(String[] args) {
        C05 obj =new C05();
       // System.out.println(obj.privateSayi);
        //Private class uyelerine class disindaan hicbir sekilde ulasilamaz

        System.out.println(obj.defaultSayi);//0
        obj.defaultSayi=20;
        System.out.println(obj.defaultSayi);// 20

        System.out.println(obj.protectedsayi);// 0
        obj.protectedsayi=30;
        System.out.println(obj.protectedsayi);// 30

        System.out.println(obj.publicSayi);//0
        obj.publicSayi=50;
        System.out.println(obj.publicSayi); //50



    }
}
