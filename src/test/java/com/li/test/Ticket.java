package com.li.test;


public class Ticket  {
	public static void main(String[] args) {
		int  people=100;
		TicketSystem t1=new TicketSystem();
		Thread[] thread = new Thread[people];
		for(int i = 1; i < people; i++){
			thread[i]=new Thread(t1);
			thread[i].start();
		}
		
	}

}

class TicketSystem extends Thread{
	 int ticket = 50;
	 String str = " ";
	 int time = 50;
	 
	 @Override
	 public void run() {
	  if (ticket > 0) {
	   synchronized (str) {
	    if (ticket > 0) {
	     System.out.println(Thread.currentThread().getName()
	       + ": taker  get " + ticket + " ticket");
	     ticket--;
	          }
	      }
	  }
	  try {
	   Thread.sleep(time);
	  } catch (InterruptedException e) {
	   e.printStackTrace();
	     }
	 }
}
	 

