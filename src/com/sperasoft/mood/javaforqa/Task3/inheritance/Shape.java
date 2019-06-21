package com.sperasoft.mood.javaforqa.inheritance;

public abstract class Shape {

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

    @Override
    public String toString() {
        return "shape" +
                "\ncolour: " + colour +
                " filled: " + filled;
    }
}
