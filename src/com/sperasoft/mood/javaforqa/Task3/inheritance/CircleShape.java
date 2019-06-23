package com.sperasoft.mood.javaforqa.task3And4.inheritance;


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

<<<<<<< Updated upstream:src/com/sperasoft/mood/javaforqa/Task3/inheritance/CircleShape.java
=======
    @Override
    public double getPerimetr() {
       return CustomMathUtil.PI*2*this.radius;
    }
>>>>>>> Stashed changes:src/com/sperasoft/mood/javaforqa/task3And4/inheritance/CircleShape.java

    public double getArea() {
<<<<<<< Updated upstream:src/com/sperasoft/mood/javaforqa/Task3/inheritance/CircleShape.java
<<<<<<< Updated upstream:src/com/sperasoft/mood/javaforqa/Task3/inheritance/CircleShape.java

        return PI * this.radius * radius;
=======
=======
>>>>>>> Stashed changes:src/com/sperasoft/mood/javaforqa/task3And4/inheritance/CircleShape.java
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
>>>>>>> Stashed changes:src/com/sperasoft/mood/javaforqa/task3And4/inheritance/CircleShape.java
    }

    @Override
    public String toString() {
        return "Circle " + " is a subclass of " + super.toString() +
                " radius=" + radius;
    }
}

