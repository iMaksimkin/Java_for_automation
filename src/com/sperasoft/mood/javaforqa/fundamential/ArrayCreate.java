package com.sperasoft.mood.javaforqa.fundamential;

/**
 * Created by резерв on 13.06.2019.
 */
public class ArrayCreate {
    // TODO use it for ArraySearch and ArraySort class like random array maker and print it

    public ArrayCreate(int i)

    {


    }
    public static int[] arrayCreator(int size ) {
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((Math.random() * 100));
            System.out.print(arr[i] + " ");
        }
        return arr;
    }



    public ArrayCreate() {

    }

  public static void arrayPrint(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    }
