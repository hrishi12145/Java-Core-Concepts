package com.virtusa.Ex5;

public class DeadLockTest {

	public static void main(String[] args) {
		DeadLockTest test = new DeadLockTest();

		Book book = test.new Book();
		Pen pen = test.new Pen();

		// Thread-1
		Runnable writer1 = new Runnable() {
			public void run() {
				synchronized (book) {
					// Adding delay so that both threads can start trying to
					// lock resources
					try {
						Thread.sleep(10);
						// writer-1 have book but need pen also
						System.out.println("writer1 Locked - book obj then trying to accquire pen obj");
						synchronized (pen) {
							System.out.println("writer1 trying to acquire pen obj");
						}
					} catch (InterruptedException e) {

						e.printStackTrace();
					}
				}
			}
		};

		// Thread-2
		Runnable writer2 = new Runnable() {
			public void run() {
				synchronized (pen) {
					try {
						Thread.sleep(10);
						System.out.println("writer2 Locked - pen obj then trying to accquire book obj");
						// writer-2 have pen but need book also
						synchronized (book) {
							System.out.println("writer2 trying to acquire book obj");
						}
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};

		new Thread(writer1).start();
		new Thread(writer2).start();
	}

	private class Book {
		private String bkname = "Notebook";

		@SuppressWarnings("unused")
		public String getBkname() {
			return bkname;
		}

		@SuppressWarnings("unused")
		public void setBkname(String bkname) {
			this.bkname = bkname;
		}

	}

	private class Pen {
		private String brand = "Cello";

		@SuppressWarnings("unused")
		public String getBrand() {
			return brand;
		}

		@SuppressWarnings("unused")
		public void setBrand(String brand) {
			this.brand = brand;
		}

	}
}
