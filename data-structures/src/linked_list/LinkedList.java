package linked_list;
import linked_list.Node;

public class LinkedList {
	Node head = null;
	
	public void insert(int pos, int data) {
		if(pos > this.size()) {
			this.append(data);
		} else {
			Node nuevo = new Node(data);
			if(pos == 0) {
				nuevo.next = this.head;
				this.head = nuevo;
			} else {
				int count = 0;
				Node aux = this.head;
				while(count < pos - 1 /*&& aux != null*/) {
					count++;
					aux = aux.next;
				}
				nuevo.next = aux.next;
				aux.next = nuevo;
			}
		}
	}
	
	public String imprimir() {
		String cadena = "";
		Node aux = this.head;
		while(aux != null) {
			cadena = cadena + aux.data + " -> ";
			aux = aux.next;
		}
		cadena = cadena + "[";
		return cadena;
	}
	
	public void append(int data) {
		Node nuevo = new Node(data);
		if(this.isEmpty()) {
			this.head = nuevo;
		} else {
			Node aux = this.head;
			while(aux.next != null) {
				aux = aux.next;
			}
			aux.next = nuevo;
		}
	}
	
	public boolean isEmpty() {
		return this.head == null;
	}
	
	public int size() {
		int size = 0;
		Node aux = this.head;
		while(aux != null) {
			size++;
			aux = aux.next;
		}
		return size;
	}
	
	public Node getElement(int pos) {
		int count = 0;
		Node aux = this.head;
		Node element = null;
		while(aux.next != null) {
			if(count == pos) {
				element = aux;
			}
			count++;
			aux = aux.next;
		}
		return element;
	}
	
	public void empty() {
		this.head = null;
	}
	
	public void reserve() {
		Node prev = null;
		Node current = this.head;
		Node next = this.head;
		
		while(current != null) {
			next = next.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		
		this.head = prev;
	}
} 
