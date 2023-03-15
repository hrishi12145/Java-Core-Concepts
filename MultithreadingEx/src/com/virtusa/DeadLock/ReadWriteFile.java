package com.virtusa.DeadLock;
// Dead Lock 
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteFile {

	public static void main(String[] args) throws Exception {

		// Reader
		FileReader reader = new FileReader("C:\\Users\\HRISHI\\OneDrive\\Documents\\test.txt");

		// Writer
		FileWriter writer = new FileWriter("C:\\Users\\HRISHI\\OneDrive\\Documents\\test.txt", true);

		// Thread-1
		Runnable thread1 = new Runnable() {
			public void run() {
				synchronized (reader) {
					// Adding delay so that both threads can start trying to
					// lock resources
					try {

						Thread.sleep(100);
						// thread1 have reader object but need writer object also to write to the file
						System.out.println("Thread1 Locked - reader obj then trying to accquire writer obj");

						synchronized (writer) {
							String str = "In Thread 1";
							try {
								writer.write(str);
								writer.flush();
								writer.close();
								System.out.println("Success");
							} catch (IOException e) {
								e.printStackTrace();
							}
							System.out.println("TShread1 trying to acquire writer obj");
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
				synchronized (writer) {

					try {
						Thread.sleep(100);
						System.out.println("Thread2 Locked - Writer obj then trying to accquire reader obj");

						// Thread-2 have writer object but need reader object also to read from the file
						synchronized (reader) {
							int i;
							try {
								while ((i = reader.read()) != -1)
									System.out.print((char) i);
								reader.close();
							} catch (IOException e1) {

								e1.printStackTrace();
							}

							System.out.println("Thread2 trying to acquire reader obj");
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
