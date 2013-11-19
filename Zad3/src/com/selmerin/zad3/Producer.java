package com.selmerin.zad3;

public class Producer extends Thread{
	
	Monitor monitor;
	
	public Producer(Monitor m, String name) {
		super(name);
		monitor = m;
	}
	
	public void run(){
		while(true){
			int i = (int)(Math.random()*100);
			monitor.add(i, getName());
			System.out.println(getName()+" "+i);
			try {
				sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
