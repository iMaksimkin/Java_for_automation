package com.sperasoft.mood.javaforqa.task2.objects;


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


        System.out.println("Сколько раз тикать вперед?");
        int amountTicks= in.nextInt();
        System.out.println("Первые часы тикают");
        firstClock.tick(amountTicks);
        System.out.println("Вторые часы тикают");
        secondClock.tick(amountTicks);

        System.out.println("Сколько раз тикать назад?");
        int amountTicks1= in.nextInt();
        System.out.println("Первые часы тикают");
        firstClock.tickDown(amountTicks1);
        System.out.println("Вторые часы тикают");
        secondClock.tick(amountTicks1);
        System.out.println("адд клок");
      firstClock=firstClock.addClock(secondClock);
        firstClock.print();
      //  secondClock.toString();
     //   firstClock.toString();
        System.out.println("сабстрэк клок");
       firstClock.substrackClock(secondClock).print();


    }
}
