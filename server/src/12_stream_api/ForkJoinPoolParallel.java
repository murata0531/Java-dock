import java.util.stream.*;
import java.util.*;
import java.util.concurrent.*;

public class ForkJoinPoolParallel {
    public static void main(String[] args) throws Exception {

        System.out.println("commonPool : " + ForkJoinPool.commonPool().getParallelism());

        IntStream.range(0, 100).parallel().forEach(i -> System.out.println(Thread.currentThread().getName() + ": " + i));
    }
}