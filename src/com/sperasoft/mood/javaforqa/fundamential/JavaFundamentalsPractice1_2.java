<<<<<<< Updated upstream:src/com/sperasoft/mood/javaforqa/fundamential/JavaFundamentalsPractice1_2.java

package com.sperasoft.mood.javaforqa.fundamential;


import java.util.Scanner;

public class JavaFundamentalsPractice1_2 extends BaseCountMin {
    // TODO extends JavaFundamentialPractice1_1 to write less code
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       System.out.print("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();
        System.out.print("Введите третье число: ");
        int c = scanner.nextInt();
       int k = countMin(a,b);


        int min = Math.min(c, k);
        System.out.print(min);
    }
}
=======
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

>>>>>>> Stashed changes:src/com/sperasoft/mood/javaforqa/task1/fundamential/alternativeVarFirstTask/CountMin.java
