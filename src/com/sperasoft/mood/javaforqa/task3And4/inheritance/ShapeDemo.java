package com.sperasoft.mood.javaforqa.task3And4.inheritance;
// common main class for 3rd and 4th task with using custom Math util
public class ShapeDemo {
    public static void main(String[] args) {


        Shape circle = new CircleShape("Wihte", true, 5.5);
        Shape rectangle = new RectangleShape("BLUE", false, 8, 12);
        Shape square = new SquareShape("Purple", true, 4);
        double x = 1;
        double y = 5;

        Shape[] shapes = {circle, rectangle,square};

        for (Shape shape : shapes) {
            System.out.println(shape.toString());
            if (shape instanceof CircleShape) System.out.println("Area is " + ((CircleShape) shape).getArea());
            if (shape instanceof CircleShape) System.out.println("Circumference is " + ((CircleShape) shape).getPerimetr()+"\n");
            if (shape instanceof RectangleShape) System.out.println("Perimeter is " + ((RectangleShape) shape).getPerimetr());
            if (shape instanceof RectangleShape) System.out.println("Area is " + ((RectangleShape) shape).getArea()+"\n");
            if (shape instanceof CircleShape)System.out.println("The point x="+ x +" y="+ y + " is inside the shape:" + (shape.isInside(x,y)+"\n"));
            if (shape instanceof RectangleShape)System.out.println("The point x="+ x +" y="+ y + " is inside the shape:" + (shape.isInside(x,y)+"\n"));


        }
    }
}

