package sec02.exam02_generic_type;
//보통 파라매트를 두개, 세개 이상 적용되기도 함.
public class Box<T> {
	private T t;
	
	public T get() {
		return t;
	}
	public void set(T t) {
		this.t = t;
	}
}
