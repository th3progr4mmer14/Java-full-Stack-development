public class VirtualTest {

    public static void main(String[] args) throws Exception {

        long start = System.currentTimeMillis();

        try (var executor = 
                java.util.concurrent.Executors.newVirtualThreadPerTaskExecutor()) {

            for (int i = 0; i < 100_000; i++) {
                executor.submit(() -> {
                    Thread.sleep(100);
                    return "OK";
                });
            }
        }

        System.out.println("100,000 virtual threads completed!");
        System.out.println("Time: " +
                (System.currentTimeMillis() - start) + " ms");
    }
}
