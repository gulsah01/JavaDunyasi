package day38_abstractClasses;

public abstract class F_Hemsire extends D_Personel{
    /*
    abstract bir classi parent edinen absrtract child class parent classdaki zorunlu
    methodlari implement etmek zorunda degildir(ara catidir)

       parent'daki abstract method'lari implement etmek zorunda degildir,
        ama isterse implement edebilir
     */
    public abstract void sertifika();

    public abstract void nobet();

    @Override
    public void standartMaas() {
        System.out.println("Tum hemsireler icin standart maas 20.000 TL");
    }
}
