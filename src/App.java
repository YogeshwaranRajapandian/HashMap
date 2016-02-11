import java.util.HashMap;
import java.util.Map;


public class App {

	public static void main(String[] args) {
		//HASHMAPS One member is the KEY the other is the VALUE Ex: <Key,Value>
		
		//HashMap doe not maintain order.
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		
		map.put(5, "Five");
		map.put(2, "Two");
		map.put(7, "Seven");
		map.put(55, "Fifty-Five");
		map.put(9, "Nine");
		
		//Iterating of the various keys and values in a hashmap
		for(Map.Entry<Integer, String> entry: map.entrySet()){
			int key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key+ " "+ value);
		}
		//trying to get a key that doesn't exist returns NULL
		String text = map.get(55);
		System.out.println(text);
		
		//adding a duplicate key & value just overwrites 
		//the previous key's value
		
		map.put(55,"Now Changed");
		text = map.get(55);
		System.out.println(text);
		
		//Iterating of the various keys and values in a hashmap
		map.put(2, "WOW");
		for(Map.Entry<Integer, String> entry2: map.entrySet()){
			int key2 = entry2.getKey();
			String value2 = entry2.getValue();
			System.out.println(key2+ " "+ value2);
		}
		
		
		
		
	}
	
}
