package com.antonakospanos.ocp.exam;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class GoCertify {

    static class StaticNestedClass {
        // EMPTY
    }

    private static class PrivateStaticNestedClass {
        // EMPTY
    }

    class InnerClass {
        // EMPTY
    }

    private class PrivateInnerClass {
        // EMPTY
    }

    public static void main(String[] args) {
        int number = 0b1010_1011_0111;
        System.out.println("Number: " + number);

         Enthuware.Office o = new Enthuware().new HomeOffice();
//         o.getAddress();

        compareExecutorWithExecutorService();

//        Path p1 = null;
//        Path p2 = null;
//        try(Files.copy(p1, p2, StandardCopyOption.REPLACE_EXISTING)){ Files.delete(p1); }
    }

    public static void compareExecutorWithExecutorService() {
        // 1. One of the key difference between Executor and ExecutorService interface is that former is a parent interface while ExecutorService extends Executor i.e. it's a sub-interface of Executor
        // 2. Another important difference between ExecutorService and Executor is that Executor defines execute() method which accepts an object of the Runnable interface, while submit() method can accept objects of both Runnable and Callable interfaces
        // 3. The third difference between Executor and ExecutorService interface is that execute() method doesn't return any result, its return type is void but submit() method returns the result of computation via a Future object
        // 4. The fourth difference between ExecutorService and Executor interface is that apart from allowing a client to submit a task, ExecutorService also provides methods to control the thread pool e.g. terminate the thread pool by calling the shutDown() method
        // 5. Executors class provides factory methods to create different kinds of thread pools e.g. newSingleThreadExecutor()
        Executor e = new Executor() {
            @Override
            public void execute(Runnable command) {
                // TODO
            }
        };
        e = Executors.newScheduledThreadPool(5);

        ExecutorService es = Executors.newScheduledThreadPool(1);
        es.submit(new Callable<Object>() {
            @Override
            public Object call() throws Exception {
                return null;
            }
        });

        es.submit(new Runnable() {
            @Override
            public void run() {

            }
        });
    }
}
