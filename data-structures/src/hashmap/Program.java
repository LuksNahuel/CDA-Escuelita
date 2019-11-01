package hashmap;
import java.util.Collection;
import java.util.HashMap;

public class Program {

	public static void main(String[] args) {
		
		HashMap<String, String> jashmap = new HashMap<String, String>();
		jashmap.put("Argentina", "BUENOS AIRES");
		jashmap.put("Alemania", "BERLÍN");
		jashmap.put("Uruguay", "MONTEVIDEO");
		jashmap.put("Perú", "LIMA");
		
		jashmap.forEach((key, value) -> jashmap.replace(key, value, value.toLowerCase()));
		
		
		/*jashmap.forEach((key, value) -> { jashmap.put(key.toUpperCase(), value); 
										  jashmap.remove(key); });*/
		
		Collection<String> llaves = jashmap.keySet();
		Collection<String> valores = jashmap.values();
		
		//System.out.println(jashmap.get("Uruguay"));
		
		System.out.println(llaves);
		System.out.println(valores); 
	}

}
