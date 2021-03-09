package test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MutAndImmu {
	public static void main(String k[]) {
		Map<String, String> map = new HashMap<>();
		  map.put("key1", "value1");
		  map.put("key2", "value2");
		  map.put("key3", "value3");
		  //System.out.println(map.getClass());             // java.util.HashMap

		  // convert mutable Map to immutable map
		  Map<String, String> immutableMap = Collections.unmodifiableMap(map);
		  //System.out.println(immutableMap.getClass());    // java.util.Collections$UnmodifiableMap
		  //immutableMap.put("key4", "value4");             // UnsupportedOperationException
	
	
		// single entry immutable map
		  Map<String, String> map1 = Collections.singletonMap("key1", "value1");

		  System.out.println(map1.getClass());   // java.util.Collections$SingletonMap
		  System.out.println(map1.get("key1"));            // throws UnsupportedOperationException
	
	
	}	

}
