package com.virtusa.Producer_Consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Producer implements Runnable {
    private List<String> queue = new ArrayList<>();

    public Producer(List<String> queue) {
        this.queue = queue;
    }
    @Override
    public void run() {
        String messages[] = {"Hello1","Hello2","Hello3"};
        for (String message : messages) {
            synchronized (queue) {
            	queue.add(message);
                try {
                    Random random = new Random();
                    Thread.sleep(random.nextInt(2000));
                    
                } catch (InterruptedException e) {
                    System.out.println(Thread.currentThread().getName() + " interrupted.");
                }
            }
            System.out.println(Thread.currentThread().getName() + " added " + message);
        }
        System.out.println(Thread.currentThread().getName() + " added " + Main.EOF);
        synchronized (queue) {
        	queue.add(Main.EOF);
        }
    }
}
