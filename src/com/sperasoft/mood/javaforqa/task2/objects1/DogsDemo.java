package com.sperasoft.mood.javaforqa.objects1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import java.util.Scanner;


public class DogsDemo {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Dog dog = new Dog();

        System.out.println("Сколько собак вы хотите создать(укажите число)");
        int amount = in.nextInt();


        Dog[] pack = new Dog[amount];

        for (int i = 0; i < amount; i++) {
            System.out.println("Введите имя собаки: ");
            dog.setName(br.readLine())
            ;

            if (dog.getName().trim().isEmpty()) {
                dog.setName(dog.generateName());
            } else dog.getName();
            System.out.println("Введите сколько лет собаке от 1 до 20(выйдя за пределы возраст будет сгенерирован автоматически): ");
            dog.setAge(in.nextInt());
            //  dog.setAge(br.read()) it skip nextline and i can't reset System.in

            if (dog.getAge() != 0) {
                dog.getAge();

            } else dog.setAge(dog.generateAge());


            System.out.println("Выберете размер: BIG MEDIUM SMALL или размер сгенерируется автоматически");
            String dogSize = br.readLine();
            if (dogSize.equals("BIG") || dogSize.equals("SMALL") || dogSize.equals("MEDIUM")) {
                br.readLine();
            } else {
                dogSize = Dog.generateSize();
            }


            pack[i] = new Dog(dog.getName(), dog.getAge(), Dog.Size.valueOf(dogSize));
        }

        System.out.println(" \n получилась стая собак:");
        for (Dog d : pack)
            System.out.println(d);


        System.out.println("\n Сортировка по имени к->z туда");
        Arrays.sort(pack, Dog::compareDogsByName);
        Arrays.asList(pack).forEach(System.out::println);

        System.out.println("\n Сортировка по имени к->a сюда");
        Arrays.sort(pack, Dog::compareDogsByName1);
        Arrays.asList(pack).forEach(System.out::println);

        System.out.println("\nСортировка по Возрасту -> к смерти");
        Arrays.sort(pack, Dog::compareDogsByAge);
        Arrays.asList(pack).forEach(System.out::println);
        System.out.println("\n Сортировка по  Возрасту к рождению");
        Arrays.sort(pack, Dog::compareDogsByAge1);
        Arrays.asList(pack).forEach(System.out::println);


        System.out.println("\nСортировка по имени размеру от мала до велика");
        Arrays.sort(pack, Dog::compareDogsBySize);
        Arrays.asList(pack).forEach(System.out::println);
        System.out.println("\nСортировка по размеру от гигантов до карликов");
        Arrays.sort(pack, Dog::compareDogsBySize1);
        Arrays.asList(pack).forEach(System.out::println);
    }

}








