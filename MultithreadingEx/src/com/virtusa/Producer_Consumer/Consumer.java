package com.virtusa.Producer_Consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Consumer implements Runnable {
	private List<String> queue = new ArrayList<>();

	public Consumer(List<String> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (queue) {
				if (queue.isEmpty()) {
					continue;
				} 
				if (queue.get(0).equals(Main.EOF)) {
                    System.out.println(Thread.currentThread().getName() + " exiting.");
                    break;
                }else {
					System.out.println(Thread.currentThread().getName() + " removed " + queue.remove(0));
					try {
						Random random = new Random();
						Thread.sleep(random.nextInt(2000));
					} catch (InterruptedException e) {
						System.out.println(Thread.currentThread().getName() + " interrupted.");
					}
				}
			}
		}
		
	}
}
