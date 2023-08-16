package day37_overridin_polimorphism;

public class BChild extends AParent {
    final static int SAYI=10;
    final static int SAYI2=20;

   /* public final void finalMethod(){
        // final method override edilemeyen method demektir
        System.out.println("Bu child classdaki final method")}
    */
    public static void staticMethod(){
        System.out.println("Bu child classdaki static method");
    }
    private void privateMethod(){
        //
        //child class kendisinde olusturulan bu methodu parent classda olmayan bir method kabul eder
        // cte yok ama overriding oklari yok
        System.out.println("Bu child classdaki private method");
    }

    public static void main(String[] args) {
        System.out.println(SAYI2);//10
       // sayi=20; final variable son degerini almis demektir, dolayisiyla yeni deger atanamaz.
        System.out.println(Integer.MIN_VALUE);
    }
}
