<<<<<<< 092f7de4c8ac4792505cbba5be27b5f3c02b5b4e:src/com/sperasoft/mood/javaforqa/task2/objects1/Dog.java
=======
<<<<<<< Updated upstream:src/com/sperasoft/mood/javaforqa/objects1/Dog.java
<<<<<<< Updated upstream:src/com/sperasoft/mood/javaforqa/objects1/Dog.java
<<<<<<< Updated upstream:src/com/sperasoft/mood/javaforqa/objects1/Dog.java
package com.sperasoft.mood.javaforqa.objects1;
=======
package com.sperasoft.mood.javaforqa.task2.objects1;
>>>>>>> Stashed changes:src/com/sperasoft/mood/javaforqa/task2/objects1/Dog.java
=======
package com.sperasoft.mood.javaforqa.task2.objects1;
>>>>>>> Stashed changes:src/com/sperasoft/mood/javaforqa/task2/objects1/Dog.java


import java.util.Random;

public class Dog {

    public enum Size {
        BIG {
            @Override
            public String toString() {
                return "BIG"; //DOG.BIG
            }
        },
        MEDIUM, SMALL
    }


    //  public static final String SIZE_1 = "BIG";
    //  public static final String SIZE_2 = "SMALL";
    //  public static final String SIZE_3 = "MEDIUM";
    private String name;
    private Size size;
    private int age;

    public Dog() {
    }

    public Dog(String name, int age, Size size) {
        this.name = name;
        this.age = age;

        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        return;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public int getAge() {
        return age;
    }


    public void setAge(int age) {

        if (age < 0 || age > 20) {
            this.age = 0;
        } else {
            this.age = age;
        }
        return;

    }

    public String generateName() {
        String symbols = "asdfvxbmndtoataayxzjoufkgngsefzeaeadbdfxuobd";
        StringBuilder randString = new StringBuilder();
        int count = (int) (Math.random() * 100);
        for (int i = 0; i < count; i++)
            randString.append(symbols.charAt((int) (Math.random() * symbols.length())));

        return randString.toString();
    }

    // or we can generate names like in next method (generateSize()) from the Array of values to make it more readable,
// or take the values(devided by spaces or by split any symbol from file (read by bufferreader and put it in to array)
//
    public static String generateSize() {

        String[] sizes = new String[]{"BIG", "MEDIUM", "SMALL"};
        String random = sizes[new Random().nextInt(sizes.length)];
        return random;

    }

    public int generateAge() {
        Random r = new Random();
        return r.nextInt(21) + 1;
    }


    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", age=" + age +
                '}';
    }


    public static int compareDogsByName(Dog a, Dog b) {
        return a.name.compareTo(b.name); //from a->z
    }

    public static int compareDogsByName1(Dog b, Dog a) {
        return a.name.compareTo(b.name);  //from z->a
    }

    public static int compareDogsBySize(Dog b, Dog a) {

        return a.size.compareTo(b.size);
    }

    public static int compareDogsBySize1(Dog a, Dog b) {

        return a.size.compareTo(b.size);
    }

    public static int compareDogsByAge(Dog a, Dog b) {
        {
            return a.getAge() - b.getAge();
        }
    }

    public static int compareDogsByAge1(Dog a, Dog b) {
        {
            return b.getAge() - a.getAge();
        }
    }
=======
>>>>>>> updating project structure and some classes:src/com/sperasoft/mood/javaforqa/objects1/Dog.java
package com.sperasoft.mood.javaforqa.task2.objects1;


import java.util.Random;

public class Dog {

    public enum Size {
        BIG {
            @Override
            public String toString() {
                return "BIG"; //DOG.BIG
            }
        },
        MEDIUM, SMALL
    }


    //  public static final String SIZE_1 = "BIG";
    //  public static final String SIZE_2 = "SMALL";
    //  public static final String SIZE_3 = "MEDIUM";
    private String name;
    private Size size;
    private int age;

    public Dog() {
    }

    public Dog(String name, int age, Size size) {
        this.name = name;
        this.age = age;

        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        return;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public int getAge() {
        return age;
    }


    public void setAge(int age) {

        if (age < 0 || age > 20) {
            this.age = 0;
        } else {
            this.age = age;
        }
        return;

    }

    public String generateName() {
        String symbols = "asdfvxbmndtoataayxzjoufkgngsefzeaeadbdfxuobd";
        StringBuilder randString = new StringBuilder();
        int count = (int) (Math.random() * 100);
        for (int i = 0; i < count; i++)
            randString.append(symbols.charAt((int) (Math.random() * symbols.length())));

        return randString.toString();
    }

    // or we can generate names like in next method (generateSize()) from the Array of values to make it more readable,
// or take the values(devided by spaces or by split any symbol from file (read by bufferreader and put it in to array)
//
    public static String generateSize() {

        String[] sizes = new String[]{"BIG", "MEDIUM", "SMALL"};
        String random = sizes[new Random().nextInt(sizes.length)];
        return random;

    }

    public int generateAge() {
        Random r = new Random();
        return r.nextInt(21) + 1;
    }


    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", age=" + age +
                '}';
    }


    public static int compareDogsByName(Dog a, Dog b) {
        return a.name.compareTo(b.name); //from a->z
    }

    public static int compareDogsByName1(Dog b, Dog a) {
        return a.name.compareTo(b.name);  //from z->a
    }

    public static int compareDogsBySize(Dog b, Dog a) {

        return a.size.compareTo(b.size);
    }

    public static int compareDogsBySize1(Dog a, Dog b) {

        return a.size.compareTo(b.size);
    }

    public static int compareDogsByAge(Dog a, Dog b) {
        {
            return a.getAge() - b.getAge();
        }
    }

    public static int compareDogsByAge1(Dog a, Dog b) {
        {
            return b.getAge() - a.getAge();
        }
    }
<<<<<<< 092f7de4c8ac4792505cbba5be27b5f3c02b5b4e:src/com/sperasoft/mood/javaforqa/task2/objects1/Dog.java
=======
>>>>>>> Stashed changes:src/com/sperasoft/mood/javaforqa/task2/objects1/Dog.java
>>>>>>> updating project structure and some classes:src/com/sperasoft/mood/javaforqa/objects1/Dog.java
}