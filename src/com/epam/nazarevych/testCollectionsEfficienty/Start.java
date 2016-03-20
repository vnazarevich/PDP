package com.epam.nazarevych.testCollectionsEfficienty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;
import java.util.logging.Logger;

public class Start {
	
	private static Logger log = Logger.getLogger(Start.class.getName());

	private final static Integer DEFAULT_VALUE = 1;
	private static SpeedTester speedTester; 
	private static Map<String, Long> compareMemorySize = new HashMap<>();
	
	private static ArrayList<Integer> arrayList;
	private static LinkedList <Integer> linkedList;
	private static Vector <Integer> vector;
	private static Stack <Integer> stack;
	
	private static HashSet <Integer> hashSet;
	private static TreeSet<Integer>  treeSet;
	private static LinkedHashSet<Integer> linkedHashSet;
	private static Set <Integer> sets;
	
	private static HashMap <Integer, Integer> hashMap;
	private static TreeMap<Integer, Integer>  treeMap;
	private static LinkedHashMap<Integer, Integer> linkedHashMap;
	private static Hashtable <Integer, Integer> hashTable;
	
	private static PriorityQueue<Integer> priorityQueue;

	private static void initialisation(int maxIndex){
		log.info("start initialisation " );
		speedTester = new SpeedTester();
		//List
		arrayList = new ArrayList();
		for (int i=0; i< maxIndex; i++){
			arrayList.add(DEFAULT_VALUE);
		}
		
		linkedList = new LinkedList(arrayList);
		vector = new Vector (arrayList);
		stack = new Stack ();
		hashSet = new HashSet(arrayList);
		treeSet = new TreeSet(arrayList);
		linkedHashSet = new LinkedHashSet<>(arrayList);
		sets = Sets.newHashSet(hashSet);
		hashMap = new HashMap();
		treeMap = new TreeMap();
		linkedHashMap = new LinkedHashMap<>();
		hashTable = new Hashtable<>();
		priorityQueue = new PriorityQueue<>(arrayList);
		
		
	}
	private static void counterMemorySize() {
		Runtime runtime = Runtime.getRuntime();
		long memoryFinish = runtime.totalMemory();
		long memoryStart = runtime.totalMemory();
		
		//freeMemory();
		List arrayListTest = new ArrayList<>(arrayList);
		memoryFinish = runtime.totalMemory();   //freeMemory();	//totalMemory();
		compareMemorySize.put("ArrayList "+ arrayList.size(), memoryFinish-memoryStart);
		
		memoryStart = runtime.freeMemory();	//totalMemory();
		List linkedListTest = new LinkedList<>(linkedList);
		memoryFinish = runtime.freeMemory();	//totalMemory();
		compareMemorySize.put("LinkedList "+ linkedList.size(), memoryFinish-memoryStart);
		
		

	}

	public static void main(String[] args) {
		initialisation(1000);
		counterMemorySize();
		speedTester.testList(arrayList, 10   );
		speedTester.testList(linkedList, 10);
		speedTester.testList(arrayList, 1000);
		speedTester.testList(linkedList, 1000);
		speedTester.testList(vector, 1000);
		speedTester.testList(stack, 1000);	
		
		speedTester.testSet(hashSet, 1000);
		speedTester.testSet(treeSet, 1000);
		speedTester.testSet(linkedHashSet, 1000);
		
		speedTester.testMap(hashMap, 1000);
		speedTester.testMap(treeMap, 1000);
		speedTester.testMap(linkedHashMap, 1000);
		speedTester.testMap(hashTable, 1000);
		
		speedTester.testQueue(priorityQueue, 1000);

		
		System.out.println("====================================== Not sorted results ==========================================");
	//	System.out.println("Collection count AddInHead AddInMiddle AddInTail SetInHead SetInMiddle SetInTail GetInHead GetInMiddle GetInTail RemoveInHead RemoveInMiddle RemoveInTail");
		speedTester.showResults();
		System.out.println();
		
		System.out.println("====================================== Memory sizes results ==========================================");
		getCompareMemorySize();
		
	}
	private static void getCompareMemorySize() {
		System.out.println(compareMemorySize.toString());
		
	}

}
