<<<<<<< 092f7de4c8ac4792505cbba5be27b5f3c02b5b4e:src/com/sperasoft/mood/javaforqa/task1/fundamential/TowersOfHanoi.java
=======
<<<<<<< Updated upstream:src/com/sperasoft/mood/javaforqa/fundamential/TowersOfHanoi.java
<<<<<<< Updated upstream:src/com/sperasoft/mood/javaforqa/fundamential/TowersOfHanoi.java
<<<<<<< Updated upstream:src/com/sperasoft/mood/javaforqa/fundamential/TowersOfHanoi.java
package com.sperasoft.mood.javaforqa.fundamential;
=======
package com.sperasoft.mood.javaforqa.task1.fundamential;
>>>>>>> Stashed changes:src/com/sperasoft/mood/javaforqa/task1/fundamential/TowersOfHanoi.java
=======
package com.sperasoft.mood.javaforqa.task1.fundamential;
>>>>>>> Stashed changes:src/com/sperasoft/mood/javaforqa/task1/fundamential/TowersOfHanoi.java

import java.util.Scanner;

public class TowersOfHanoi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter disk's amount : ");
        int amount = in.nextInt();
        solveTowers(amount, 'A', 'B', 'C');
    }

    public static void solveTowers(int number, char from, char sub, char to) {
        if (number == 1) {
            System.out.println("Disk 1 from " + from + " to " + to);
        } else {
            solveTowers(number - 1, from, to, sub);
            System.out.println("Disk " + number + " from " + from + " to " + to);
            solveTowers(number - 1, sub, from, to);
        }
    }
=======
>>>>>>> updating project structure and some classes:src/com/sperasoft/mood/javaforqa/fundamential/TowersOfHanoi.java
package com.sperasoft.mood.javaforqa.task1.fundamential;

import java.util.Scanner;

public class TowersOfHanoi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter disk's amount : ");
        int amount = in.nextInt();
        solveTowers(amount, 'A', 'B', 'C');
    }

    public static void solveTowers(int number, char from, char sub, char to) {
        if (number == 1) {
            System.out.println("Disk 1 from " + from + " to " + to);
        } else {
            solveTowers(number - 1, from, to, sub);
            System.out.println("Disk " + number + " from " + from + " to " + to);
            solveTowers(number - 1, sub, from, to);
        }
    }
<<<<<<< 092f7de4c8ac4792505cbba5be27b5f3c02b5b4e:src/com/sperasoft/mood/javaforqa/task1/fundamential/TowersOfHanoi.java
=======
>>>>>>> Stashed changes:src/com/sperasoft/mood/javaforqa/task1/fundamential/TowersOfHanoi.java
>>>>>>> updating project structure and some classes:src/com/sperasoft/mood/javaforqa/fundamential/TowersOfHanoi.java
}