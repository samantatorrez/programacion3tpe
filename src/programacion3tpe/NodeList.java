package programacion3tpe;

public class NodeList {
	private Object info;
	private NodeList next;
	public NodeList(Object info, NodeList next) {
		this.setInfo(info);
		this.setNext(next);
	}
	public Object getInfo() {
		return this.info;
	}
	public void setInfo(Object info) {
		this.info = info;
	}
	public NodeList getNext() {
		return next;
	}
	public void setNext(NodeList next) {
		this.next = next;
	}
	
	
}
