package com.sperasoft.mood.javaforqa.Task3.inheritance;

public class ShapeDemo {
    public static void main(String[] args) {


        Shape circle = new CircleShape("Wihte", true, 5.5);
        Shape rectangle = new Rectangle("BLUE", false, 8, 12);
        Shape square = new Square("Purple", true, 4);
        double x = 1;
        double y = 5;

        Shape[] shapes = {circle, rectangle,square};

        for (Shape shape : shapes) {
            System.out.println(shape.toString());
            if (shape instanceof CircleShape) System.out.println("Area is " + ((CircleShape) shape).getArea());
            if (shape instanceof CircleShape) System.out.println("Circumference is " + ((CircleShape) shape).getPerimetr());
            if (shape instanceof Rectangle) System.out.println("Perimeter is " + ((Rectangle) shape).getPerimetr());
            if (shape instanceof Rectangle) System.out.println("Area is " + ((Rectangle) shape).getArea());
            if (shape instanceof CircleShape)System.out.println("Is the point x="+ x +" y="+ y + " inside the shape:" + (shape.isInside(x,y) ));
            if (shape instanceof Rectangle)System.out.println("The point x="+ x +" y="+ y + " inside the shape:" + (shape.isInside(x,y) ));


        }
    }
}

