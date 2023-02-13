# Multithreading

## CompletableFutures
In this assignment, we create two CompletableFutures, one for counting the first 10 positive, whole numbered digits
and one for the first 10 negative.

We then combine both CompletableFutures into one unified List using the `thenCombine` function.

Additionally, we have several timers, which logs, in milliseconds, the amount of time various components take to
complete. These are then logged into the console.


## Threading
In this assignment, I created 2 thread. One counting all the even numbers from 0-50 and another counting all the odd numbers from 50-0.

To accomplish the even number loop, we use a `for loop` which allows us to loop from 0, checking if `i` is less than or equal to 50, and then adds 2.

For the odd number loop we do the exact same, except we loop from 1, and our console printing function is `50 - i` instead of just `i`.

After each number being printed to the console, the individual thread sleeps for 2 seconds, or 2000 ms, this is done using `Thread.sleep`.


 
