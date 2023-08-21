package day40_interfaces;

public class C05_TryCatchdekiE {

    public static void main(String[] args) {
        // try catch blogundaki e yakalanan exceptionun icine atandigi variabledir.
        int a=20;
        int b=0;

        try{
            System.out.println(a/b);
        }catch (ArithmeticException e){// ArithmeticException e =yakalananExection
            //e.printStackTrace();// exceptionun tum bilgilerini yazdirir, kodun calismasini devam ettirir.
           // System.out.println(e.getMessage());// by zero
           System.out.println(e.toString());//java.lang.ArithmeticException: / by zero
        }
    }
}
