package com.virtusa.Ex5;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

class SampleObj1{
	int x;
	int y;
	ReadWriteLock read_write = new ReentrantReadWriteLock();
	void setX(int x) {
		this.x = x;
	}
	int getX() {
		return x;
	}
	void incr() {
		Lock lock = read_write.writeLock();
		lock.lock();
		try {
			y= getX();
			System.out.println("Y = "+y);
			y++;
			try {Thread.sleep(1);}catch (Exception e) {
				e.printStackTrace();
			}
			setX(y);
		}finally {
			lock.unlock();
		}
	}

}
public class LockMain {

	public static void main(String[] args) throws InterruptedException {
		SampleObj obj = new SampleObj();
		obj.setX(10);
		
		Thread t1= new Thread(obj);
		t1.start();
		Thread t2=new Thread(obj);
		t2.start();
		Thread.sleep(12);
		System.out.println(obj.getX());
	}

}
