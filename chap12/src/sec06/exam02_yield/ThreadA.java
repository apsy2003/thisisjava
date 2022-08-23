package sec06.exam02_yield;

public class ThreadA extends Thread{
	public boolean stop = false;
	public boolean work = true;
	
	@Override
	public void run() {
		while(!stop) {
			if(work) {
				try {Thread.sleep(1000);} catch (InterruptedException e) {}
				System.out.println("ThreadA 작업 내용");
			}else {
				Thread.yield();
			}
		}
		System.out.println("ThreadA 종료");
	}
}
