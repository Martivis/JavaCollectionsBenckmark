package org.example;

import java.io.Console;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        var timesList = new int[] { 1000, 2000, 10000 };
        var linkedListResults = new long[3];

        for (int i = 0; i < 3; i++) {
            var linkedListAdd = new LinkedListAdd();
            linkedListResults[i] = Benchmark.Run(linkedListAdd, timesList[i]);
        }

        var arrayListResults = new long[3];
        for (int i = 0; i < 3; i++) {
            var arrayListAdd = new ArrayListAdd();
            arrayListResults[i] = Benchmark.Run(arrayListAdd, timesList[i]);
        }

        for (int i = 0; i < 3; i++) {
            System.out.println(linkedListResults[i]);
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(arrayListResults[i]);
        }
    }


}