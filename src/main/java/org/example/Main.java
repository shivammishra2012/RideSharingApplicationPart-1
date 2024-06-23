package org.example;

import org.example.com.services.RideSharingApp;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        RideSharingApp app = new RideSharingApp();

        app.addDriver("Driver1");
        app.addDriver("Driver2");

        app.addRider("RiderA");
        app.addRider("RiderB");
        app.addRider("RiderC");

        ExecutorService executorService= Executors.newFixedThreadPool(3);
        // Simulating multiple ride requests
        Runnable task1 = () -> app.requestRide("RiderA", 50, 60, 1);
        Runnable task2 = () -> app.requestRide("RiderA", 50, 60, 2);
        Runnable task3 = () -> app.requestRide("RiderB", 100, 120, 1);
        Runnable task4 = () -> app.requestRide("RiderB", 100, 120, 2);
        Runnable task5 = () -> app.requestRide("RiderC", 10, 20, 1);
        Runnable task6 = () -> app.requestRide("RiderC", 10, 20, 2);
        Runnable task7 = () -> app.requestRide("RiderC", 30, 40, 1);
        Runnable task8 = () -> app.requestRide("RiderC", 30, 40, 2);

        executorService.execute(task1);
        executorService.execute(task2);
        executorService.execute(task3);
        executorService.execute(task4);
        executorService.execute(task5);
        executorService.execute(task6);
        executorService.execute(task7);
        executorService.execute(task8);
        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.MINUTES);


        // since Runnable is a functional interface so we can direct method lamda expression
        //Runnable task1 = new Runnable() {
        //    @Override
        //    public void run() {
        //        app.requestRide("RiderA", 50, 60, 1);
        //    }
        //};


//       // with normal thread also we can also achieve the same functionality
//        Thread thread1 = new Thread(() -> {
//            app.requestRide("RiderA", 50, 60, 1);
//        });
//
//        Thread thread2 = new Thread(() -> {
//            app.requestRide("RiderA", 50, 60, 2);
//        });
//
//// Start threads
//        thread1.start();
//        thread2.start();


    }
}