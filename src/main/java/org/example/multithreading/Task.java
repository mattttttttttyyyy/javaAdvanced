package org.example.multithreading;
/*
33. Create a new thread in main in two different ways. By declaring a Task class that
implements the Runnable interface and using an anonymous class that implements Runnable.
Both threads are supposed to print 10_000 times any text and the number
of the current iteration (variable and from the loop).
*/

class TestingIt{
    public void testing(){
        Runnable task2 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10_000; i++) {
                    System.out.println("Run inside #"+i);

                }
            }
        };
        Thread testing = new Thread(task2);
        testing.start();
    }
}
public class Task {
    public static void main(String[] args) {
        Runnable task = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10_000; i++) {
                    System.out.println("Run #"+i);

                }
            }
        };
        Thread testing = new Thread(task);
        testing.start();
        TestingIt testingIt = new TestingIt();
        testingIt.testing();





    }
}
