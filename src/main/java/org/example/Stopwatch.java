package org.example;

public class Stopwatch {
    private long startTime;
    private long stopTime;
    private boolean running;

    public void start() {
        if (!running) {
            startTime = System.nanoTime();
            running = true;
        }
    }

    public void stop() {
        if (running) {
            stopTime = System.nanoTime();
            running = false;
        }
    }

    public long getElapsedTime() {
        if (running) {
            return (System.nanoTime() - startTime);
        } else {
            return (stopTime - startTime);
        }
    }
}
