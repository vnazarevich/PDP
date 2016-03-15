package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Collections_Example {
	static List <Integer> arrayList = new ArrayList<Integer>(){{
		add(5);
		add(15);
		add(100);
		add(1);
	}};
	
	public static void main(String args[]) {
		Integer [] arr = {2, 100, 10, 0};
		List <Integer> list_1 = new ArrayList (Arrays.asList(arr));
		arr = (Integer[]) list_1.toArray();
		
	}

}
