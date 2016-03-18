package com.epam.nazarevych.testCollectionsEfficienty;

import java.util.ArrayList;
import java.util.LinkedList;

public class Start {

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
		speedTester.testList(arrayList, 100000);
		
		speedTester.getResults();
		System.out.println("L");
		
	}

}
