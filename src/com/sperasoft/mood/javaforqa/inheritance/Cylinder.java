package com.sperasoft.mood.javaforqa.inheritance;

public class Cylinder extends Circle {

    private double height;

    public double getHieght() {
        return height;
    }

    public void setHieght(double hieght) {
        this.height = height;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, Colour color, double height) {
        super(radius, color);
        this.height = height;
    }

    public Cylinder(double radius) {
        super(radius);
    }

    @Override
    public double getArea() {
        return 2 * PI * getRadius() * height + 2 * super.getArea();
    }

    @Override
    public String toString() {
        return "\nЦилиндр " +
                "\nрадиус=" + getRadius() +
                "\nцвет=" + getColor() +
                "\nвысота=" + height;
    }

    public double getVolume() {
        return height * super.getArea();
    }
}
