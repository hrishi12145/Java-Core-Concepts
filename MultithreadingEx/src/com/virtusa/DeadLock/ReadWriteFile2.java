package com.virtusa.DeadLock;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// Avoid DeadLock change the order of the resources
public class ReadWriteFile2 {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {

		// Reader
		FileReader reader = new FileReader("C:\\Users\\HRISHI\\OneDrive\\Documents\\test2.txt");

		// Writer
		FileWriter writer = new FileWriter("C:\\Users\\HRISHI\\OneDrive\\Documents\\test2.txt", true);

		// Thread-1
		Runnable thread1 = new Runnable() {
			public void run() {
				synchronized (reader) {
					// Adding delay so that both threads can start trying to
					// lock resources
					try {

						Thread.sleep(10);
						// thread1 have reader object but need writer object also to write to the file
						System.out.println("Thread1 Locked - reader obj then trying to accquire writer obj");

						synchronized (writer) {
							String str = "Thread 1 using writer obj";
							try {
								writer.write(str);
								writer.flush();
							} catch (IOException e) {
								e.printStackTrace();
							}

						}
					} catch (InterruptedException e) {

						e.printStackTrace();
					}
				}
			}
		};

		// Thread-2
		Runnable thread2 = new Runnable() {
			public void run() {
				synchronized (reader) {

					try {
						Thread.sleep(10);
						System.out.println();
						System.out.println("Thread2 Locked - Reader obj then trying to accquire writer obj");

						// Thread-2 have writer object but need reader object also to read from the file
						synchronized (writer) {
							String str = "Thread 2 using writer obj";
							try {
								writer.write(str);
								writer.flush();
								writer.close();
							} catch (IOException e) {
								e.printStackTrace();
							}

						}
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};

		new Thread(thread1).start();
		new Thread(thread2).start();
		
	}
}
