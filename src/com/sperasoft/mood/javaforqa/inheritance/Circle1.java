package com.sperasoft.mood.javaforqa.inheritance;


public class Circle1 extends Shape {


    public static final double PI = 3.14;

    private double radius;

    public Circle1(String colour, boolean filled, double radius) {
        super(colour, filled);
        this.radius = radius;
    }

    public Circle1(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle1(String colour, double radius) {
        super(colour);
        this.radius = radius;
    }


    public Circle1() {
        radius = 1;

    }


    public double getArea() {

        return PI * this.radius * radius;
    }

    @Override
    public String toString() {
        return "Circle " + " is a subclass of " + super.toString() +
                " radius=" + radius;
    }
}

