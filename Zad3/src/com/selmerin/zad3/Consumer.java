package com.selmerin.zad3;


public class Consumer extends Thread {
	
	Monitor monitor;
	
	public Consumer(Monitor l, String name) {
		super(name);
		monitor = l;
	}
	
	public void run(){
		while(true){
			//monitor.getI(getName());
			try {
				sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(getName()+ " " +monitor.getI(getName()));
		}
	}
			
}
		
