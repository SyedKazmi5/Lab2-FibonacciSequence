package com.centennialcollege.Lab2_FibbonaciSequence;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.printf("How many numbers to display in the fibonacci sequencee: ");

		int numbers = input.nextInt();
		MyRunnable myRunable1 = new MyRunnable(numbers);

		ExecutorService executor = Executors.newFixedThreadPool(1);

		executor.execute(myRunable1);

		executor.shutdown();

	}

}
