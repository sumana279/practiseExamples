package com.example.JavaAlg.ThreadSafeQueue;

import java.util.concurrent.BlockingQueue;

public class BlockingConsumer implements Runnable {
	private BlockingQueue<ThreadMessage> queue;

	public BlockingConsumer(BlockingQueue<ThreadMessage> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		try {
			ThreadMessage msg;

			// consuming messages until exit message is received

			System.out.println("ok " + (msg = queue.take()).getMsg());
			msg = queue.take();
			while (msg.getMsg() != "exit") {
				Thread.sleep(10);
				System.out.println("BlockingConsumer: Message - " + msg.getMsg() + " consumed.");
				msg = queue.take();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
