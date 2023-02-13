package assignments.multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Futures {

    public static void main(String[] args) {
        long mainTime = System.currentTimeMillis();
        CompletableFuture<List<Integer>> first10Pos = CompletableFuture.supplyAsync(() -> {
            long threadTime = System.currentTimeMillis();

            List<Integer> list  = new ArrayList<>();
            for (int i = 1; i <= 10; i++) {
                list.add(i);
            }

            threadTime = System.currentTimeMillis() - threadTime;

            System.out.println("ms to get the first 10 positive numbers: " + threadTime);

            return list;
        });

        CompletableFuture<List<Integer>> first10Neg = CompletableFuture.supplyAsync(() -> {
            long threadTime = System.currentTimeMillis();

            List<Integer> list  = new ArrayList<>();
            for (int i = 1; i <= 10; i++) {
                list.add(-i);
            }

            threadTime = System.currentTimeMillis() - threadTime;

            System.out.println("ms to get the first 10 negative numbers: " + threadTime);

            return list;
        });

        try {
            long threadTime = System.currentTimeMillis();

            List<Integer> list = first10Pos.thenCombine(first10Neg, (l1, l2) -> {
               for (int i : l2) {
                   l1.add(i);
               }

               return l1;
            }).get();

            threadTime = System.currentTimeMillis() - threadTime;

            System.out.println("\n\nPrinting out the first 10 position and negative numbers:");
            for (int i : list) {
                System.out.println(i);
            }

            mainTime = System.currentTimeMillis() - mainTime;

            System.out.println("\n");
            System.out.println("ms to complete future task: " + threadTime);
            System.out.println("ms to complete main method: " + mainTime);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
