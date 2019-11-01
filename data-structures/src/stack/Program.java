package stack;
import java.util.Queue;
import java.util.LinkedList;
//import java.util.Scanner;
import java.util.Stack;

public class Program {

	public static void main(String[] args) {
		Queue<String> cola = new LinkedList<String>();
		Stack<String> pila = new Stack<String>();
		
		cola.add("Lucas");
		cola.add("Agustin");
		cola.add("Fede");
		cola.add("Ariel");
		cola.add("Chile");
		cola.add("Octavio");
		cola.add("Wilson");
		
		System.out.println(cola);
	
		
		while(!cola.isEmpty()) {
			pila.push(cola.remove());
		}
		
		while(!pila.isEmpty()) {
			cola.add(pila.pop());
		}
		
		
		System.out.println(cola);
//		Scanner input = new Scanner(System.in);
//		
//		while(cola.size() != 5) {
//			System.out.println("Ingrese un nombre para añadir a la cola: ");
//			cola.add(input.nextLine());
//		}
//		
//		
//		
//		input.close();
//		
//		System.out.println(cola);
	}

}
