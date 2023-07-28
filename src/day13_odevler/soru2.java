package day13_odevler;

public class soru2 {
    public static void main(String[] args) {
        /*Soru 2 : Kullanicinin belirli bir formatta verdigi String fiyatlari toplayip yazdirin.
                input1 : “15.30 €” , input2 : “11.40 €”
        output : 26.70 €

         */
        String sayi1 ="15.30 €";
        String sayi2 ="11.40 €";
        sayi1=sayi1.replaceAll("€","");
        sayi1=sayi1.replaceAll(" ","");
        sayi2=sayi2.replaceAll("€","");
        sayi2=sayi2.replaceAll(" ","");
        System.out.println(Float.parseFloat(sayi1)+Float.parseFloat(sayi2) +"0"+" €");



    }
}
