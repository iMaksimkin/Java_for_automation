<<<<<<< 092f7de4c8ac4792505cbba5be27b5f3c02b5b4e:src/com/sperasoft/mood/javaforqa/task1/fundamential/alternativeVarFirstTask/CountMin.java
=======
<<<<<<< Updated upstream:src/com/sperasoft/mood/javaforqa/fundamential/JavaFundamentalsPractice1_1.java
package com.sperasoft.mood.javaforqa.fundamential;


import java.util.Scanner;

public class CountMin extends BaseCountMin {
    public static void main(String[] args) {

        /* TODO exeption when a=b */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();
        System.out.print("Введите третье число: ");
        int c = scanner.nextInt();
        System.out.print("Введите четвертое число: ");
        int d = scanner.nextInt();

        System.out.print(countMin(a,b));
        System.out.println(countMin(countMin(a,b), c));
        System.out.println(countMin(countMin(a,b),countMin(c,d)));
        // or we need to use
        //Integer a = scanner.nextInt();
        //    Integer b = scanner.nextInt();
        // and compare it by
        //  int min = Math.min((a.intValue()), b.intValue());
        //   System.out.println(min);
       // int min;
        ////min = Math.min(a, b);
       //System.out.println(min);
    }
}

=======
>>>>>>> updating project structure and some classes:src/com/sperasoft/mood/javaforqa/fundamential/JavaFundamentalsPractice1_1.java
package com.sperasoft.mood.javaforqa.task1.fundamential.alternativeVarFirstTask;


import java.util.Scanner;

public class CountMin extends BaseCountMin {
    public static void main(String[] args) {

        /* TODO exeption when a=b */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();
        System.out.print("Введите третье число: ");
        int c = scanner.nextInt();
        System.out.print("Введите четвертое число: ");
        int d = scanner.nextInt();

        System.out.print(countMin(a,b));
        System.out.println(countMin(countMin(a,b), c));
        System.out.println(countMin(countMin(a,b),countMin(c,d)));
        // or we need to use
        //Integer a = scanner.nextInt();
        //    Integer b = scanner.nextInt();
        // and compare it by
        //  int min = Math.min((a.intValue()), b.intValue());
        //   System.out.println(min);
       // int min;
        ////min = Math.min(a, b);
       //System.out.println(min);
    }
}

<<<<<<< 092f7de4c8ac4792505cbba5be27b5f3c02b5b4e:src/com/sperasoft/mood/javaforqa/task1/fundamential/alternativeVarFirstTask/CountMin.java
=======
>>>>>>> Stashed changes:src/com/sperasoft/mood/javaforqa/task1/fundamential/alternativeVarFirstTask/CountMin.java
>>>>>>> updating project structure and some classes:src/com/sperasoft/mood/javaforqa/fundamential/JavaFundamentalsPractice1_1.java
