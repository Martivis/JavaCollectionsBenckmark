package org.example;

public class BenchmarkRunner {
    private final int[] times = new int[] { 1000, 2000, 10000 };

    public void Run(Command command) {
        for (int i = 0; i < times.length; i++) {
            var result = Benchmark.Run(command, times[i]);
            print(times[i], result);
        }
    }

    private void print(int times, long time) {
        System.out.print(times);
        System.out.print(" times: ");
        System.out.print(time);
        System.out.println(" ns;");
    }
}
