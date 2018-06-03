package programacion3tpe;

import java.util.Arrays;
import java.util.Iterator;


public class SimpleList implements Iterable {
	protected NodeList first;
	protected NodeList last;
	protected int size;
	
	public SimpleList(){
		this.first =null;
		this.last =null;
		this.size=0;
	}
	public SimpleList(int n) {
		for(int i=0; i<n; i++) {
			insert((int)(Math.floor(Math.random() * 10) + 1));
		}
	}
	public void insert(Object o){
		NodeList tmp = new NodeList(o,null);
		tmp.setNext(this.first);
		this.first=tmp;
		this.size++;
	}
	public Object extract(){
		if (first != null){
			Object objetoExtraido=first.getInfo();
			NodeList nodoSiguiente=first.getNext();
			if(nodoSiguiente!=null){
				first.setNext(null);
				first=nodoSiguiente;
			} else {
				first=null;
			}
			this.size--;
			return objetoExtraido;
		}
		return null;
	}

	public void print(){
		for(int i=0;i<size;i++){
			NodeList cast =(NodeList) getElement(i);
			System.out.println(Arrays.toString((String[])cast.getInfo()));
		}	
	}
	
	public boolean isEmpty(){
		return first==null;
	}

	public int getTamaño() {
		return size;
	}
	@Override
	public Iterator iterator() {
		return new SimpleListIterator();
	}

	public void add(Object o) {
		NodeList nodo= new NodeList(o, null);
		if(first==null) {
			this.first=nodo;
		}
		this.size++;
		this.last=nodo;
	}

	public void addArray(String[] array){
		NodeList nodo= new NodeList(array, null);
		if(first==null) {
			this.first=nodo;
			this.size++;
			this.last=nodo;
		} else {
			this.last.setNext(nodo);
			this.last=nodo;
			this.size++;
		}
		
	}

	public Object getElement(int pos) {
		Iterator iterador1= iterator();
		int count=0;
        while(iterador1.hasNext()&&count<=pos) {
        	Object o = iterador1.next();
        	if(count==pos) {
        		return o;
        	}
        	count++;
        }
		return null;
	}
	
	class SimpleListIterator implements Iterator{
		NodeList actual = null;
		@Override
		public boolean hasNext() {
			if(actual==null && first!= null) {
				return true;
			} else if (actual!=null) {
				return (actual.getNext()!=null);
			}
			return false;
		}

		@Override
		public NodeList next() {
			if(actual==null && first!= null) {
				actual= first;
				return first;
			}
			else if (actual!=null) {
				actual = actual.getNext();
				return actual;
			}
			return null;
		}
		
	}
}
