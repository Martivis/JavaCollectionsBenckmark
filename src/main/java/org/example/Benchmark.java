package org.example;

public class Benchmark {
    public static long Run(Command command, int times) {
        Stopwatch stopwatch = new Stopwatch();
        stopwatch.start();
        for (int i = 0; i < times; i++) {
            command.execute();
        }
        stopwatch.stop();
        return stopwatch.getElapsedTime();
    }
}
