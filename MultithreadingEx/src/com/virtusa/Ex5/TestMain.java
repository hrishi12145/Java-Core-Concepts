package com.virtusa.Ex5;
class SampleObj implements Runnable{
	int x;
	int y;
	void setX(int x) {
		this.x = x;
	}
	int getX() {
		return x;
	}
	void incr() {
		synchronized(this) {
			y= getX();
			System.out.println("Y = "+y);
			y++;
			try {Thread.sleep(1);}catch (Exception e) {
				e.printStackTrace();
			}
			setX(y);
		}
	}
	@Override
	public void run() {
		incr();
		
	}
}

public class TestMain {
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
