package collections;

import java.util.*;

public class TempHW {
	private final static int DEFAULT_VALUE = 1;
	private static SpeedTester speedTester; 
	private static ArrayList arrayList;
	private static LinkedList linkedList;
	
	private static void initialisation(int maxIndex){
		speedTester = new SpeedTester();
		//List
		arrayList = new ArrayList();
		for (int i=0; i< maxIndex; i++){
			arrayList.add(DEFAULT_VALUE);
		}
		
		//List linkedList = new LinkedList();	
		
		
		
	}

	
	public static void main(String[] args) {
		initialisation(100);
		speedTester.testList(arrayList, 1);
		speedTester.testList(arrayList, 100);
		speedTester.testList(arrayList, 1000000);
		
		speedTester.getResults();
		
	}

	

}
