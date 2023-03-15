package com.virtusa.ExceutorFrameWorkEx4;

import java.time.LocalDateTime;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
class MyCallable implements Callable<LocalDateTime>{

	@Override
	public LocalDateTime call() throws Exception {
		return null;
	}

	
	
}
public class PrintDateAndTime {

	public static void main(String[] args) {

		ExecutorService service = Executors.newFixedThreadPool(5);
		
		

	}

}
