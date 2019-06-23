<<<<<<< Updated upstream:src/com/sperasoft/mood/javaforqa/Task3/inheritance/Cylinder.java
package com.sperasoft.mood.javaforqa.inheritance;
=======
package com.sperasoft.mood.javaforqa.task3And4.inheritance;
>>>>>>> Stashed changes:src/com/sperasoft/mood/javaforqa/task3And4/inheritance/Cylinder.java

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
<<<<<<< Updated upstream:src/com/sperasoft/mood/javaforqa/Task3/inheritance/Cylinder.java
        return 2 * PI * getRadius() * height + 2 * super.getArea();
=======
        return 2 * CustomMathUtil.PI * getRadius() * height + 2 * super.getArea();
>>>>>>> Stashed changes:src/com/sperasoft/mood/javaforqa/task3And4/inheritance/Cylinder.java
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
