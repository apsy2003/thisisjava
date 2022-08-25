package sec03.exam01_multi_type_parameter;
//외부에서 받아서 내가 고친다.
public class Product<T, M> {
	private T kind;
	private M model;
	public T getKind() {
		return this.kind;
	}
	public void setKind(T kind) {
		this.kind = kind;
	}
	public M getModel() {
		return this.model;
	}
	public void setModel(M model) {
		this.model = model;
	}

	
}
