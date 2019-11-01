package linked_list;
//import java.util.Collections;
import linked_list.LinkedList;
//import java.util.LinkedList;

public class Program {

	public static void main(String[] args) {
		LinkedList lista = new LinkedList();
		lista.append(5);
		lista.append(6);
		lista.append(9);
		
		lista.reserve();
		
		System.out.println(lista.imprimir());
	
		
		/*LinkedList<Integer> lista = new LinkedList<Integer>();
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		Collections.reverse(lista);
		System.out.println(lista);*/
	}
	
	

}
