package com.epam.nazarevych.testCollectionsEfficienty;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;

import javax.management.openmbean.ArrayType;

public class Start {
	
	private static Logger log = Logger.getLogger(Start.class.getName());

	private final static Integer DEFAULT_VALUE = 1;
	private static SpeedTester speedTester; 
	private static ArrayList<Integer> arrayList;
	private static LinkedList <Integer> linkedList;
	
	private static void initialisation(int maxIndex){
		log.info("start initialisation " );
		speedTester = new SpeedTester();
		//List
		arrayList = new ArrayList();
		for (int i=0; i< maxIndex; i++){
			arrayList.add(DEFAULT_VALUE);
		}
		
		linkedList = new LinkedList(arrayList);
		
	}
	
	public static void main(String[] args) {
		initialisation(100);
		speedTester.testList(arrayList, 1);
		speedTester.testList(arrayList, 100);
		//speedTester.testList(arrayList, 100000);
		
		System.out.println("====================================== Not sorted results ==========================================");
		speedTester.getResults();
		System.out.println();
		
	}

}
