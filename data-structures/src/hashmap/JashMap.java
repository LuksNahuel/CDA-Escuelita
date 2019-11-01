package hashmap;
import java.util.ArrayList;
import java.util.HashMap;
import hashmap.User;

public class JashMap {
	
	public static void main(String[] args) {
		HashMap<ArrayList<Integer>, String> jash = new HashMap<ArrayList<Integer>, String>();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
	
		jash.put(list, "numeros naturales");
		
		//jash.forEach((key, value) -> System.out.println(key + " " + value));
		
		
		HashMap<String, User> uash = new HashMap<String, User>();
		
		uash.put("empleado", new User("chile@chile.cl", "chileeeXD"));
		uash.put("encargado", new User("octavioMasKpito@gmail.com", "octaXD"));
		uash.put("none", new User("as123@gmail.com", "ase1231"));
		
		
		HashMap<String, User> uash2 = new HashMap<String, User>();
		
		uash2.put("director", new User("chile@chile.cl", "chileeeXD"));
		uash2.put("RRHH", new User("octavioMasKpito@gmail.com", "octaXD"));
		uash2.put("bromista", new User("as123@gmail.com", "ase1231"));
		
	
		//uash.forEach((key, value) -> System.out.println(key + " " + value.getUsername() + " " + value.getEmail()));
		
		HashMap<Integer, HashMap<String, User>> jashFlashero = new HashMap<Integer, HashMap<String, User>>();
		
		jashFlashero.put(0, uash);
		jashFlashero.put(1, uash2);
		
		jashFlashero.forEach((key, value) -> {
			System.out.println(key);
			value.forEach((keyAux, valueAux) -> {
				System.out.println(keyAux + " " + valueAux.getUsername() + " " + valueAux.getEmail());
			});
		});
		
		
	}
}
