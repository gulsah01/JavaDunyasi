package day46_nestedMaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class C05_NestedMap {
    public static void main(String[] args) {
/*
“firstname” : “Ahmet”,
            “lastname” : “Bulut”,
            “totalprice” : 500,
            “depositpaid” : false,
            “bookingdates” : {
                   “checkin” : “2023-07-21”,
                   “checkout” : “2023-08-10”
                      },
            “additionalneeds” : “wi-fi” }
 */
        Map<String, Object> bookingMap = new HashMap<>();
        Map<String,String> bookingDatesMap = new HashMap<>();

        bookingDatesMap.put("checkin", "2013-07-21");
        bookingDatesMap.put("checkout","3023-08-10");

        bookingMap.put("firstname","Ahmet");
        bookingMap.put("lastname","Bulut");
        bookingMap.put("totalprice",500);
        bookingMap.put("depositpaid",false);
        bookingMap.put("bookingdates",bookingDatesMap);
        bookingMap.put("additionalneeds","wi-fi");

        System.out.println(bookingMap);
//{firstname=Ahmet,
// additionalneeds=wi-fi,
// bookingdates={checkin=2013-07-21,
// checkout=3023-08-10}, totalprice=500,
// depositpaid=false, lastname=Bulut}


        //rezervasyon ismini yazdirin
        System.out.println(bookingMap.get("firstname")); // Ahmet

        

    }
}
