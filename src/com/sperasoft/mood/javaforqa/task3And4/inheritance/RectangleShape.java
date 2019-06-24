package com.sperasoft.mood.javaforqa.task3And4.inheritance;

public class RectangleShape extends Shape {
    protected double width;
    protected double length;

    public RectangleShape() {
        super();
        double width = 1.0;
        double length = 1.0;
    }

    @Override
    public double getPerimetr() {
        return 2 * (width + length);
    }

    @Override
    public double getArea() {
        return width*length;
    }

    public boolean isInside  (double x, double y) {
        //return Math.abs(x) < (width / 2) && Math.abs(y) < (length / 2);
        return x < (width / 2) && y < (length / 2);
}

    public RectangleShape(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public RectangleShape(String colour, boolean filled, double width, double length) {
        super(colour, filled);
        this.width = width;
        this.length = length;
    }



    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }



    @Override
    public String toString() {
        return "Rectangle which is a subclass of " + super.toString() +
                " width=" + width +
                " length=" + length;
    }

}

