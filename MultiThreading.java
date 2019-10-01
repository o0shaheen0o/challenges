import java.util.concurrent.Semaphore;
public class MultiThreading {

	public static void main(String[] args) throws InterruptedException {


		Semaphore semamphore = new Semaphore (0);

		semamphore.acquire();
		System.out.println("aquired semaphore from thread "+Thread.currentThread().getName());

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				semamphore.release();
				System.out.println("released semaphore from thread "+ Thread.currentThread().getName());

			}

		});

		t1.join();

		t1.start();



	}

}
