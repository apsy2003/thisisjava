package sec06.exam05_wait_notify;

public class DataBox {
	private String data;
	
	public synchronized String getData() {
		if(this.data == null) {
			try {
				wait();
			} catch (InterruptedException e) {}
		}
		String returnValue = data;
		System.out.println("ConsummerThread가 읽은 데이터: " + returnValue);
		data = null; //변수 접시를 비움. //이후에 notify를 시킴. // 현 일이 끝나고 다음일 해야 한다고 알려줌. 
		notify();
		return returnValue;
	}
	
	public synchronized void setData(String data) {
		if(this.data != null) {
			try {
				wait();
			} catch (InterruptedException e) {}
		}
		this.data = data;
		System.out.println("ProducerThread가 생성한 데이터: " + data);
		notify();
	}//set메서드. 값이 아니면 wait를 사용해야 함.
	
}
