package day07_ifStatements;

public class c01_bagimsizIf_cumleleri {
    public static void main(String[] args) {
        int a = -201;
        int b = 104;
        if (a>0){
            System.out.println("a sayisi pozitif");
        }
        if (a+b>100){
            System.out.println("sayilarin toplami 100 den buyuk");
        }
        if (b%3== 0){
            System.out.println("b 3 ile tam bolunen bir tamsayidir");
        }
        if (b<100){
            System.out.println("b 100 den kucuk bir tamsayidir");
        }
         //bagimsiz if cumleleri isminden de anlasilacagi uzere
        //kodun kalani ile ilgilenmez , sadece boolean sarta odaklanir
        //sartin sonucu true ise if bodysi calisir. boolean sartin sonucu FALSE ise if bodysi
        //devreye girmez
        //YANI birden fazla bagimsiz if cumlesi olan bir kod calistiginda kac tane if bodysinin
        //calisacagi verilen degerlere baglidir
        //tum if bodylari calisabilir ,bazirlari yada hicbir if bodysi calismayabilir.


    }
}
