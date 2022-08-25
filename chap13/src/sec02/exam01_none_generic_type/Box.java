package sec02.exam01_none_generic_type;

public class Box {
	private Object object;
	/*get메서드는 리턴을 해줘야함*/
	public Object get() {
		return object;
	}
	/*set은 안해줘도됨*/
	public void set(Object object) {
		this.object = object;
	}
}
