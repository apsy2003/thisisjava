package sec06.exam04_wait_notify;

public class WorkObject {
	public synchronized void methodA() {
		System.out.println("ThreadA의 methodA() 작업실행");
		notify(); //싱크로나이즈드에서의 상태 대기.
		try {
			wait();
		} catch (InterruptedException e) {} //try catch문을 써줘야함.
	}
	public synchronized void methodB() {
		System.out.println("ThreadB의 methodB() 작업실행");
		notify(); //싱크로나이즈드에서의 상태 대기.
		try {
			wait();
		} catch (InterruptedException e) {} //try catch문을 써줘야함.
	}
}
