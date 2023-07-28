package day27_parametreliConstructor;

public class C04_ArabaRunner {
    public static void main(String[] args) {

        C03_Araba araba1=new C03_Araba();
araba1.model="E200";
araba1.marka ="Mercedes";
araba1.yil = 2010;
araba1.fiyat =15000;
araba1.renk ="Siyah";

        System.out.println(araba1);
  //C03_Araba{marka='Mercedes', model='E200', yil=2010, fiyat=15000, renk='Siyah'}

        //Her yeni obje olusturdugumuzda parametresiz default cons. calistigindan
        // o class da instance variable lara atanan degerleri alir
        // sonra bizim he variable icin yenidan atama yapmamiz gerekir

        //Bunun yerine constructor call a parametre olarak degerler yazalim
    }

}
