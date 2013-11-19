package com.selmerin.zad3;
import java.util.LinkedList;


public class Monitor {

	private static LinkedList<Integer> kolejka = new LinkedList<Integer>();
	private int size;
	
	public Monitor(int s) {
		size = s;
	}
	
	public synchronized void add(int i, String name){
		if(kolejka.size() >= size){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		kolejka.add(i);
		notify();

	}
	public synchronized int getI(String name){
		if(kolejka.isEmpty()){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		int j = kolejka.poll();
		notify();

		//System.out.println(name+" "+j);
		return j;

	}
	public synchronized boolean isEmpty(){
		return kolejka.isEmpty();
	}
	public synchronized int size(){
		return kolejka.size();
	}

}
