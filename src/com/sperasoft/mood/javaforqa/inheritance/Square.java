package com.sperasoft.mood.javaforqa.inheritance;

public class Square extends Rectangle {
    public Square() {
        super();
    }

    public Square(double side) {
        this.width = side;
        this.length = side;
    }


    public Square(String colour, boolean filled, double side) {
        super(colour, filled, side, side);


    }

    @Override
    public void setLength(double length) {
        this.length = length;
        this.width = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
        this.length = width;
    }

    @Override
    public String toString() {
        return "Square which is a subclass of " + super.toString() + "\nwith side=" + this.getLength();
    }

}


