package org.example;

public class Benchmark {
    Command command;

    public Benchmark(Command command) {
        this.command = command;
    }

    public long Run(int times) {
        Stopwatch stopwatch = new Stopwatch();
        stopwatch.start();
        for (int i = 0; i < times; i++) {
            command.execute();
        }
        stopwatch.stop();
        return stopwatch.getElapsedTime();
    }
}
