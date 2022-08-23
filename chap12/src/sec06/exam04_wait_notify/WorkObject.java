package sec06.exam04_wait_notify;

public class WorkObject {
	public synchronized void methodA() {
		System.out.println("ThreadA�� methodA() �۾�����");
		notify(); //��ũ�γ�����忡���� ���� ���.
		try {
			wait();
		} catch (InterruptedException e) {} //try catch���� �������.
	}
	public synchronized void methodB() {
		System.out.println("ThreadB�� methodB() �۾�����");
		notify(); //��ũ�γ�����忡���� ���� ���.
		try {
			wait();
		} catch (InterruptedException e) {} //try catch���� �������.
	}
}
