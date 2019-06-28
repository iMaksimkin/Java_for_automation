package com.sperasoft.mood.javaforqa.Task5And6.GenericsAndCollections.Practice5;

import java.io.Console;

/**
 * Created by резерв on 27.06.2019.
 */
public class CustomLinkedListDemo {
    static void Main(string[] args)
    {
        Console.WriteLine("Add First:");
        LinkedList myList1 = new LinkedList();

        myList1.AddFirst("Hello");
        myList1.AddFirst("Magical");
        myList1.AddFirst("World");
        myList1.printAllNodes();

        Console.WriteLine();

        Console.WriteLine("Add Last:");
        CustomLinkedList.LinkedList myList2 = new CustomLinkedList.LinkedList();

        myList2.AddLast("Hello");
        myList2.AddLast("Magical");
        myList2.AddLast("World");
        myList2.printAllNodes();

        Console.ReadLine();
    }
}

