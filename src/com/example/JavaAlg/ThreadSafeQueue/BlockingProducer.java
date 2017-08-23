package com.example.JavaAlg.ThreadSafeQueue;

import java.util.concurrent.BlockingQueue;

public class BlockingProducer implements Runnable {

	private BlockingQueue<ThreadMessage> queue;

	public BlockingProducer() {
		super();
		this.queue = queue;
	}

	public BlockingProducer(BlockingQueue<ThreadMessage> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			ThreadMessage msg = new ThreadMessage("i'm msg " + i);
			try {
				Thread.sleep(10);
				queue.put(msg);
				System.out.println("BlockingProducer: Message - " + msg.getMsg() + " produced.");
			} catch (Exception e) {
				System.out.println("Exception:" + e);
			}
		}

		ThreadMessage msg = new ThreadMessage("All done from Producer side.");
		try {
			queue.put(msg);
			System.out.println("BlockingProducer: Exit Message - " + msg.getMsg());
		} catch (Exception e) {
			System.out.println("Exception:" + e);
		}

	}

}
