package day17_metodOlusturma_metodOverloading;

import day16_MetodOlusturmaveKullanma.C01_MethodOlusturma;
import day16_MetodOlusturmaveKullanma.C02_baskaClasslardanMethodKullanma;
import day16_MetodOlusturmaveKullanma.C03_MethodOlusturma;

public class C03_BaskaClassdanMethodKullanma {

    public static void main(String[] args) {


        C01_MethodOlusturma.altString("Method budur...",7,8);//b
        System.out.println(C03_MethodOlusturma.isimDuzenle("omer", "GOK")); // Omer Gok

        System.out.println(C01_AsalSayiBulma.asalSayiMi(59)); //true
        System.out.println(C02_TamBolenlerSayisiniBulma.tamBolenlerSayisi(12));// 6


    }



}





