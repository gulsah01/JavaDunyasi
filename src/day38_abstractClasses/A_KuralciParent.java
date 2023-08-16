package day38_abstractClasses;

public abstract class A_KuralciParent {

    public void method1(){
        System.out.println("Parent method1");
    }
    public void method2(){
        System.out.println("Parent method2");
    }
    public abstract void method3();
    public abstract void method4();

    public abstract void method5();

    public void method6(){
        System.out.println("Parent method6");


    /*
    Eger parent claasi child classlar icin bir cati class yapiyorsak
    ve parent classa extends yapan tum child classlarin bazi methodlari
    kendisine uyarlamaya MECBUR ETMEK istiyorsak ABSTRACTION kullaniriz.

    1- Bir claasin bu ozellikleri salmasi icinabstract olmasi lazim
    - absrtract class- kismi abstraction sagliyor
    bazi methodlarin chilsdlarin uyarlamasini mecbur eder, bazilarini serbest birakir.
    - Interface- full abstraction saglar
    tum methodlari childlarin kendisine uyarlamasini mecbur eder.
    2- bir classi abstract class yapmak isterseniz
    deklarasyonuna abstract class yazmaliyiz.
    3- child classlarin mecburen uyarlamasini istedigimiz methodlari abstract method yapiyoruz.
    mecburen uyarlanmasini istemedigimiz , karari child classa biraktigimiz methodlari
    bu gune kadar yaptigimiz sekilde birakiyoruz.
     */
}}
