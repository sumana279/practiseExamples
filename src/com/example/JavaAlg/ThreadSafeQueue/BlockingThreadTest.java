package com.example.JavaAlg.ThreadSafeQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingThreadTest {

	public static void main(String[] args) {
        BlockingQueue<ThreadMessage> queue = new ArrayBlockingQueue<>(10);

		BlockingConsumer bcs = new BlockingConsumer(queue);
		BlockingProducer bps = new BlockingProducer(queue);
		new Thread(bps).start();
		new Thread(bcs).start();
		
        System.out.println("Let's get started. Producer / Consumer Test Started.\n");

		
	}

}
