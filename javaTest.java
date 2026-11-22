import java.util.Random;

public class Main {

    public static void main(String[] args) {

        System.out.println("================================");
        System.out.println("       JAVA MAC TEST");
        System.out.println("================================");

        long start = System.nanoTime();

        final int ITERATIONS = 50_000_000;
        double result = 0;

        for (int i = 1; i <= ITERATIONS; i++) {
            result += Math.sqrt(i) * Math.sin(i);
        }

        long end = System.nanoTime();

        System.out.println("Java version: " +
                System.getProperty("java.version"));

        System.out.println("OS: " +
                System.getProperty("os.name"));

        System.out.println("Architecture: " +
                System.getProperty("os.arch"));

        System.out.println("Iterations: " + ITERATIONS);

        System.out.println("Result: " + result);

        System.out.printf("Execution time: %.3f seconds%n",
                (end - start) / 1_000_000_000.0);

        System.out.println("================================");
        System.out.println("       TEST COMPLETED!");
        System.out.println("================================");
    }
}

