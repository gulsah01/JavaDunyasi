package day35_inheritance;

import day34_inheritance.Araba;

public class BToyota extends Araba {

    BToyota(){
        System.out.println("Toyota parametresiz constructor calisti");

    }
    // parent class'daki bazi ozellikleri update edebiliriz
    String marka = "Toyota";
    String uretimYeri = "Toyota araclar japonya ve Turkiye'de uretilir";
    // parent class'da olmayan yeni ozellikler ekleyebiliriz
    String lastik = "Tum toyota araclar pirelli lastik kullanir";
    String guvenlik = "Tum Toyota araclar extra guvenlik icerir";
    String fren = "Toyota araclar abs fren sistemi kullanir";

}
