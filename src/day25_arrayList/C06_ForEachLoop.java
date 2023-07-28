package day25_arrayList;

public class C06_ForEachLoop {
    public static void main(String[] args) {


        int [] arr ={20,30,5,45};
        // arrayin tum elementlerini toplayin
        // arrayin tum elementlerini yazdirin
        // arrayin elementlerinden cift sayi olanlari yazdirin
        // arrayin elementlerinden en buyuk olani bulun

        /*
        arrayin tum elementlerini gozden gecirmemeiz gereken sorularda for loop kullaniriz
        for loopun en onemli ozelligi index sayesinde tum elementleri
         0 indexden sonuncu indexe kadar sirali olarak getirmesidir
         
        ama bu sorularda elementi sirasiyla getirmesinin hirbir onemi yok
        
        indexin yani sirali getirmenin onemli olmalidigi durumlarda
         for loop yerine for-each loop kullaniriz
         */
        for (int each:arr
             ) {
            System.out.print(each + " ");
        }
        


        
    
    
    
    
    }
    
}
