package day26_forEachLoop_constructor;

public class C08_car {
    String marka="Marka belirtilmemis";
    String model= "Model belirtilmemis";
    int yil=1900;
    int fiyat;
    String renk="Renk belirtilmemis";

    @Override
    public String toString() {
        return "Araba bilgileri===>" +
                "marka :'" + marka + '\'' +
                ",model='" + model + '\'' +
                ",yil :" + yil +
                ",fiyat :" + fiyat +
                ",renk :'" + renk + '\'';
    }
}
