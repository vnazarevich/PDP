package com.epam.nazarevych.testCollectionsEfficienty;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class SpeedTester {
	private final static int ELEMENT = 100;
	static ArrayList<Result> resultList = new ArrayList<Result> () ;
	
//	public void testList(List list, int count) {
//		testListAdd(list, count);	
//	}

	public void getResults() {
		for (Result result: resultList){
			System.out.println(result.toString());
		}
		
	}

	public void testList(List list, int count) {
		//System.out.println(list.getClass().getName());
		Result result = new Result(list.getClass().getName(), count);
		
		result.setTimeAddInHead(testAddingList(list, count, 0));
		result.setTimeAddInMiddle(testAddingList(list, count, list.size()/2));
		result.setTimeAddInTail(testAddingList(list, count, list.size()-1));
		
		result.setTimeSetInHead(testSetingList(list, count, 0));
		result.setTimeSetInMiddle(testSetingList(list, count, list.size()/2));
		result.setTimeSetInTail(testSetingList(list, count, list.size()-1));
		
		result.setTimeGetFromHead(testGetingList(list, count, 0));
		result.setTimeGetFromMiddle(testGetingList(list, count, list.size()/2));
		result.setTimeGetFromTail(testGetingList(list, count, list.size()-1));
		
		result.setTimeRemoveFromHead(testRemovingList(list, count, 0));
		result.setTimeRemoveFromMiddle(testRemovingList(list, count, list.size()/2));
		result.setTimeRemoveFromTail(testRemovingList(list, count, list.size()-1));
//		
		resultList.add(result);
	}

	private long testAddingList(List list, int count, int index) {
		List testList = list;
		long timeStart = System.nanoTime();
		for (int i = 0; i < count; i++) {
			testList.add(index, ELEMENT);
		}
		return  System.nanoTime() - timeStart;
	}

	
	private long testSetingList(List list, int count, int index) {
		List testList = list;
		long timeStart = System.nanoTime();
		for (int i = 0; i < count; i++) {
			testList.set(index, ELEMENT);
		}
		return  System.nanoTime() - timeStart;
	}	
	
	private long testGetingList(List list, int count, int index) {
		List testList = list;
		long timeStart = System.nanoTime();
		for (int i = 0; i < count; i++) {
			testList.get(index);
		}
		return  System.nanoTime() - timeStart;
	}
	
	private long testRemovingList(List list, int count, int index) {
		List testList = list;
		if (index == (list.size()-1)){
			long timeStart = System.nanoTime();
			for (int i = 0; i < count; i++) {
				testList.remove(index--);
			}
			return  System.nanoTime() - timeStart;
		}
		long timeStart = System.nanoTime();
		for (int i = 0; i < count; i++) {
			testList.remove(index);
		}
		return  System.nanoTime() - timeStart;
	}
	
//	while (iterator.hasNext()){
//		iterator.next().set()
//	}
//	for (int index = 0; index < count; index++) {
//		list.add(index, ELEMENT);
//	}
	
	
}
