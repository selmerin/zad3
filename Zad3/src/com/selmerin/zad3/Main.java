package com.selmerin.zad3;
public class Main {

	public static void main(String[] args) {
		
		
		Monitor monitor = new Monitor(1);
		Producer producer = new Producer(monitor, "Producent1");
		Consumer consumer1 = new Consumer(monitor, "Konsument1");
		Consumer consumer2 = new Consumer(monitor, "Konsument2");
	//	Consumer consumer3 = new Consumer(monitor, "Konsument3");


		producer.start();
		consumer1.start();
		consumer2.start();
		consumer3.start();

		
	}

}
