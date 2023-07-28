package day26_forEachLoop_constructor;

public class C07_Runner {
    public static void main(String[] args) {
        C04 obj;
        // deklarasyon vardir ama etekemige burunmus
        // bor obje yoktur
        new C04();
        // obje olusturduk ama sonraki satirda kullanamayiz
        //cunku bir objeye atamadik

        System.out.println(new C04().sayi);//10

        C04 obj2 = new C04();
    }
}
