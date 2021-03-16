package CoreJavaL2.thread;

public class Communicate {

	Producer producer = new Producer();
	Consumer consumer = new Consumer(producer);

}

class Producer extends Thread {
	StringBuffer sb;

	public Producer() {
		sb = new StringBuffer();
	}

	public void run() {
		synchronized (this.sb) {
			for (int i = 1; i < 10; i++) {
				try {
					sb.append(i + ":");
					Thread.sleep(100);
					System.out.println("appending");
				} catch (Exception e) {
					e.printStackTrace();
				}
				sb.notify();
				System.out.println("giving notification to consumer.sb is free now");
			}
		}
	}
}

class Consumer extends Thread {
	Producer producer;

	public Consumer(Producer producer) {
		super();
		this.producer = producer;
	}

	@Override
	public void run() {
		synchronized (producer.sb) {
			System.out.println(producer.sb);
			try {
				System.out.println("Waiting for prod object");
				producer.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
