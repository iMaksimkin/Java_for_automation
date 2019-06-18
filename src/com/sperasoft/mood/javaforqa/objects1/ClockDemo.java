package com.sperasoft.mood.javaforqa.objects1;


import java.util.Scanner;

public class ClockDemo {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Clock defaultClock=new Clock();
        defaultClock.print();

        System.out.println("Создать первые часы");
        System.out.println("Сколько секунд прошло после полуночи?");
        int sec=in.nextInt();
        Clock firstClock=new Clock(sec);
        firstClock.print();
        System.out.println("\nСоздать вторые часы");

        System.out.println("Введите количество часов");
        int hours = in.nextInt();
        System.out.println("Введите количество минут");
        int minutes = in.nextInt();
        System.out.println("Введите количество секунд");
        int seconds = in.nextInt();
        Clock secondClock=new Clock(hours,minutes,seconds);
        secondClock.print();


        System.out.println("Сколько раз тикать?");
        int amountTicks= in.nextInt();
        firstClock.tick(amountTicks);

        secondClock.tick(amountTicks);

      firstClock.addClock(secondClock).print();

      //  secondClock.toString();
     //   firstClock.toString();
       firstClock.substrackClock(secondClock).print();


    }
}
