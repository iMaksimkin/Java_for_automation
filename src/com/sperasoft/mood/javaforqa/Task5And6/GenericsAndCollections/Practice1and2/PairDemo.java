package com.sperasoft.mood.javaforqa.Task5And6.GenericsAndCollections.Practice1and2;



import com.sperasoft.mood.javaforqa.task3And4.inheritance.Circle;
import com.sperasoft.mood.javaforqa.task3And4.inheritance.RectangleShape;
import com.sperasoft.mood.javaforqa.task3And4.inheritance.Shape;
import com.sperasoft.mood.javaforqa.task3And4.inheritance.SquareShape;


public class PairDemo {
    public static void main(String[] args) {


        Pair<String, RectangleShape> objectsPair = new Pair<String, RectangleShape>("Simple Shape named", new RectangleShape("Blue", 4, 3));

        String name = objectsPair.getFirst();

        Shape rectangleShape = objectsPair.getSecond();

        System.out.println(name + " " + rectangleShape);

        

        String str1 = new String("square");
        String str2 = new String("square");
        String str3 = new String("rectangle");

        System.out.println("First string " + str1);
        System.out.println("2nd string " + str2);
        System.out.println("3rd string " + str3);

        System.out.println("Comparing 1st string and 2nd " + Pair.compare(str1, str2));
        System.out.println("Comparing 1st string and 3rd " + Pair.compare(str1, str3));
   
}
}
