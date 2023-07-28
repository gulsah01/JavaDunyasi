package day11_stringManipulations;

public class c01_charAt {
    public static void main(String[] args) {

        String str = "Java Candir";
        // ilk harfini yazdirin
        System.out.println(str.charAt(0));

        //7.harfi yazdirin
        System.out.println(str.charAt(6));
        // bu metnin uzunlugu 11
        //son harfi yazdirin
        System.out.println(str.charAt(11-1)); // r

        //sondan 3. harfi yazdirin
        System.out.println(str.charAt(11-3)); //d

        //eger sondan basa dogru gelecek sekilde bir char isteniyorsa
        //char (uzunluk - sondan kacinci karakter) diyebiliriz

        //metnin uzunlugundan daha buyuk bir siradaki karakter istenirse
        //20.karakteri yazdirin
        //System.out.println(str.charAt(20)); // StringIndexOutOfBoundsException

        //4/ harf i buyuk yaz
        System.out.println(str.toUpperCase().charAt(3));

        /* charAt bize char data turunde bir sonuc verir(dondurur). toUpperCase
        gibi metodlar String variablelar ile calistigindan
        charAt calistiktan sonra String Manipulation YAPILAMAz
        eger manipulation ihtiyaci varsa ,charAT den once kullanilmalidir.
         */

    }
}
