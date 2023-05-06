package org.example;

import java.io.Console;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        var benchmark = new BenchmarkRunner();

        System.out.println("ArrayList add:");
        benchmark.Run(new ArrayListAdd());

        System.out.println("\nLinkedList add:");
        benchmark.Run(new LinkedListAdd());

        System.out.println("\nArrayList get:");
        benchmark.Run(new ArrayListGet());

        System.out.println("\nLinkedList get:");
        benchmark.Run(new LinkedListGet());

        System.out.println("\nArrayList remove by index:");
        benchmark.Run(new ArrayListRemoveIndex());

        System.out.println("\nLinkedList remove by index:");
        benchmark.Run(new LinkedListRemoveIndex());

        System.out.println("\nArrayList remove object:");
        benchmark.Run(new ArrayListRemoveObject());

        System.out.println("\nLinkedList remove object:");
        benchmark.Run(new LinkedListRemoveObject());
    }


}