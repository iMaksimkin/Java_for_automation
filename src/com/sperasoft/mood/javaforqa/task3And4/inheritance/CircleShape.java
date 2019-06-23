package com.sperasoft.mood.javaforqa.task3And4.inheritance;


public class CircleShape extends Shape {




    private double radius;

    public CircleShape(String colour, boolean filled, double radius) {
        super(colour, filled);
        this.radius = radius;
    }

    public CircleShape(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public CircleShape(String colour, double radius) {
        super(colour);
        this.radius = radius;
    }


    public CircleShape() {
        radius = 1;

    }

    @Override
    public double getPerimetr() {
       return CustomMathUtil.PI*2*this.radius;
    }

    @Override
    public double getArea() {
        return CustomMathUtil.PI * CustomMathUtil.pow(this.radius,2);
    }
//    public boolean isInside(double x, double y) {
//        return Math.abs(x) < radius && Math.abs(y) < radius;
//       // return x < radius && y < radius;
//    }
    @Override
    public boolean isInside(double x, double y) {
        if (Math.sqrt(x*x+y*y) < radius)
            return true;
        return false;
    }
    @Override
    public String toString() {
        return "Circle " + " is a subclass of " + super.toString() +
                " radius=" + radius;
    }
}

