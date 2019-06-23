package com.sperasoft.mood.javaforqa.task3And4.inheritance;

public abstract class Shape {
// do we need create inteface with methods getPerimetr and getArea
    private String colour;
    private boolean filled;

    public Shape(String colour, boolean filled) {
        this.colour = colour;
        this.filled = filled;
    }

    public Shape(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Shape() {
        colour = "green";
        filled = true;

    }

    public abstract double getPerimetr();



    public abstract double getArea();

    public abstract boolean isInside(double x, double y);

    @Override
    public String toString() {
        return "shape" +
                "\ncolour: " + colour +
                " filled: " + filled;


    }
}
