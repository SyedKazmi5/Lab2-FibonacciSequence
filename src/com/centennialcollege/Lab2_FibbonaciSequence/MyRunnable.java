package com.centennialcollege.Lab2_FibbonaciSequence;

public class MyRunnable implements Runnable {
	private int _num;

	public MyRunnable(int num) {
		// TODO Auto-generated constructor stub
		this._num = num;

	}

	@Override
	public void run() {

		// Task
		Task1();
	}

	private synchronized void Task1() {
		// for (int index = 0; index < 10; index++) {
		// System.out.println("Runnable " + this._name + " count: " + index);
		// try {
		// Thread.sleep(1000); // wait for 1000 ms =1 second
		// } catch (InterruptedException exception) {
		// // TODO Auto-generated catch block
		// System.err.println("Runnable Interrupted" + exception);
		// }
		// }
		int n = _num, first = 0, second = 1, next, i;
		System.out.println("Printing first " + n + " numbers in Fibonacci Series \n");
		for (i = 0; i < n; i++) {
			try {
				Thread.sleep(10); // wait for 1000 ms =1 second
				if (i <= 1)
					next = i;
				else {
					next = first + second;
					first = second;
					second = next;
				}
				System.out.print(next + "\t");
			} catch (InterruptedException exception) {
				System.err.println("Runnable Interrupted" + exception);
			}

		}
	}
}
