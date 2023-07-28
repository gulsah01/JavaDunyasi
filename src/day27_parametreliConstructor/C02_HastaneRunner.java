package day27_parametreliConstructor;

public class C02_HastaneRunner {
    public static void main(String[] args) {
        C01_Hastane personel1 = new C01_Hastane();
        System.out.println(personel1.personelIsmi);// isim atanmadi
        System.out.println(personel1.personelTelefonu);// tel atanmadi
        System.out.println(personel1.hastaneAdi);// Yildiz Hastanesi
        System.out.println(personel1.hastaneTelefonu); //

        personel1.personelTelefonu ="56875478875670";
        personel1.personelIsmi ="Mertkan";

        C01_Hastane personel2 =new C01_Hastane();
        System.out.println(personel2.personelIsmi);
        System.out.println(personel2.personelTelefonu);



    }
}
