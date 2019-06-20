package com.sperasoft.mood.javaforqa.inheritance;

public class ShapeDemo {
    public static void main(String[] args) {


        Shape circle = new Circle1("Wihte", true, 5.5);
        Shape rectangle = new Rectangle("BLUE", false, 8, 12);
        Shape square = new Square("Purple", true, 6.0);


        Shape[] shapes = {circle, rectangle,square};

        for (Shape shape : shapes) {
            System.out.println(shape.toString());
            if (shape instanceof Circle1) System.out.println("Area is " + ((Circle1) shape).getArea());
            if (shape instanceof Rectangle) System.out.println("Perimeter is " + ((Rectangle) shape).getPerimeter());


        }
    }
}

