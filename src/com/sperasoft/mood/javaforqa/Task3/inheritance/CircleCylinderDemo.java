<<<<<<< Updated upstream:src/com/sperasoft/mood/javaforqa/Task3/inheritance/CircleCylinderDemo.java
package com.sperasoft.mood.javaforqa.inheritance;
=======
package com.sperasoft.mood.javaforqa.task3And4.inheritance;
>>>>>>> Stashed changes:src/com/sperasoft/mood/javaforqa/task3And4/inheritance/CircleCylinderDemo.java

public class CircleCylinderDemo {
    public static void main(String[] args) {

        Circle circle = new Circle(5.0, Circle.Colour.GREEN);

        System.out.println(circle.toString());

        System.out.println("Площадь круга=" + circle.getArea());

        Cylinder cylinder = new Cylinder(7, Circle.Colour.PINK, 15);

        System.out.println(cylinder.toString());

        System.out.println("Площадь цилидра=" + cylinder.getArea());

        System.out.println("Объём цилиндра=" + cylinder.getVolume());
    }
}

