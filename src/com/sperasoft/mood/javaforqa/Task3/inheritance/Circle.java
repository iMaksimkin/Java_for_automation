package com.sperasoft.mood.javaforqa.inheritance;

public class Circle extends Shape {

    public enum Colour {
        GREEN {
            @Override
            public String toString() {
                return "зеленый";
            }
        },
        PINK {
            @Override
            public String toString() {
                return "розовый";
            }
        }, PURPLE {
            @Override
            public String toString() {
                return "фиолетовый";
            }
        }, RED {
            @Override
            public String toString() {
                return "красный";
            }
        }
    }

    public static final double PI = 3.14;
    private double radius;
    private Colour color;


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Colour getColor() {
        return color;
    }

    public void setColor(Colour color) {
        this.color = color;
    }

    public Circle() {
        radius = 1;

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, Colour color) {
        this.radius = radius;
        this.color = color;
    }

    public double getArea() {

        return PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Круг " +
                "\nрадиус=" + radius +
                "\nцвет=" + color;
    }
}

