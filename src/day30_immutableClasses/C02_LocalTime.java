package day30_immutableClasses;

import java.time.LocalTime;

public class C02_LocalTime {
    public static void main(String[] args) {

        LocalTime time =LocalTime.now();
        System.out.println(time);//20:38:36.630490

        System.out.println(time.getHour());//20
        System.out.println(time.getMinute());//39

        System.out.println(time.minusMinutes(1000));//04:01:27.402826

        System.out.println(time.minusHours(100));//16:42:21.136215

        System.out.println(time.plusSeconds(10000));//23:29:58.909161

        System.out.println(time.withHour(15));// 15:44:04.137466

        System.out.println(time.withSecond(0).withNano(0));// 20:45




    }
}
