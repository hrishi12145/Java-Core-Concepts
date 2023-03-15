package com.virtusa.Producer_Consumer;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static final String EOF = "EOF";
    public static void main(String[] args) {
        List<String> queue = new ArrayList<>();

        Thread producerThread1 = new Thread(new Producer(queue));
        producerThread1.setName("ProducerThread1");

        Thread consumerThread1 = new Thread(new Consumer(queue));
        consumerThread1.setName("consumerThread1");

        producerThread1.start();
        consumerThread1.start();
    }
}