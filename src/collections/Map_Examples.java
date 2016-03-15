package collections;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.WeakHashMap;

public class Map_Examples {

	private static Map<Integer, String> hashMap = new HashMap<Integer, String>() {
		{
			put(5, "FFFFFFFF");
			put(100, "GGGGGGGGG");
			put(1, "aaaaaa");
			put(30, "dddddd");

		}
	};

	private static Map<Integer,String> linkedHashMap = new LinkedHashMap<Integer,String>(){
		{
			put(5, "FFFFFFFF");
			put(100, "GGGGGGGGG");
			put(1, "aaaaaa");
			put(30, "dddddd");

		}		
	};
	
	private static Map<Integer, String> treeMap = new TreeMap<Integer, String>(hashMap);
	
	private static Map<Integer, String> weakMap = new WeakHashMap<Integer, String>(hashMap);
	
	public static void main(String args[]) {
		System.out.println(hashMap);
		//mapForeach(hashMap);
		System.out.println(linkedHashMap);
		System.out.println(treeMap);
		//testAccessOrder();
		testWeakMap(weakMap);
		
	//	hashMap.
		
	}

	private static void testWeakMap(Map<Integer, String> weakMap2) {
		Integer key = 10000;
		System.out.println( key.getClass().getName());
		for (Integer i: weakMap2.keySet()){
			System.out.println( i.getClass().getName());
		};
		WeakReference<Integer> weak_i = new WeakReference<Integer>(100000);
		System.out.println(weak_i instanceof WeakReference);
		System.out.println( weak_i.getClass().getName());
		
	}

	private static void testAccessOrder() {
		System.out.println("______________ testAccessOrder() ________________");
		Map<Integer,String> linkedHashMap_1 = new LinkedHashMap<Integer,String>(16, 0.6f, true ){{
			put(5, "FFFFFFFF");
			put(100, "GGGGGGGGG");
			put(1, "aaaaaa");
			put(30, "dddddd");
		}};
		System.out.println("accessOrder = true");
		System.out.println(linkedHashMap_1);
		linkedHashMap_1.get(5);
		System.out.println(linkedHashMap_1);
		System.out.println("accessOrder = false");
		System.out.println(linkedHashMap);
		linkedHashMap.get(5);
		System.out.println(linkedHashMap);
		
	}

	private static void mapForeach(Map<Integer, String> map) {
		System.out.println(map.toString());
		// option 1
		for (Integer i : map.keySet()) {
			System.out.println(map.get(i));
		}
		// option 2
		for (Entry<Integer, String> entry : map.entrySet()) {
			System.out
					.println(entry.getKey() + ", value - " + entry.getValue());
		}
		// option 3
		for (String i : map.values()) {
			i = i + "-1";
			System.out.println(i);
		}
		System.out.println(map);
		// option 4
		Iterator<Integer> iterator = map.keySet().iterator();
		while (iterator.hasNext()) {
			Integer i = iterator.next();
			map.put(i, "LaLaLa");
		}
		System.out.println(map);
		// option 5 for Java 8
		// map.forEach((k,v) -> [do something with k & v]);
	}

}
