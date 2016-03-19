package com.epam.nazarevych.testCollectionsEfficienty;

import java.util.ArrayList;
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
		
		result.setTimeAddInHead(testAdding(list, count, 0));
		result.setTimeAddInMiddle(testAdding(list, count, list.size()/2));
		result.setTimeAddInTail(testAdding(list, count, list.size()-1));
		
		result.setTimeSetInHead(testSeting(list, count, 0));
		result.setTimeSetInMiddle(testSeting(list, count, list.size()/2));
		result.setTimeSetInTail(testSeting(list, count, list.size()-1));
		
		result.setTimeGetFromHead(testGeting(list, count, 0));
		result.setTimeGetFromMiddle(testGeting(list, count, list.size()/2));
		result.setTimeGetFromTail(testGeting(list, count, list.size()-1));
		
		result.setTimeRemoveFromHead(testRemoving(list, count, 0));
		result.setTimeRemoveFromMiddle(testRemoving(list, count, list.size()/2));
		result.setTimeRemoveFromTail(testRemoving(list, count, list.size()-1));
//		
		resultList.add(result);
	}

	private long testAdding(List listTest, int count, int index) {
		List list = listTest;
		Iterator iterator = list.iterator();
		long timeStart = System.nanoTime();
		for (int i = 0; i < count; i++) {
			list.add(index, ELEMENT);
		}
		return  System.nanoTime() - timeStart;
	}

	
	private long testSeting(List listTest, int count, int index) {
		List list = listTest;
		Iterator iterator = list.iterator();
		long timeStart = System.nanoTime();
		for (int i = 0; i < count; i++) {
			list.set(index, ELEMENT);
		}
		return  System.nanoTime() - timeStart;
	}	
	
	private long testGeting(List listTest, int count, int index) {
		List list = listTest;
		Iterator iterator = list.iterator();
		long timeStart = System.nanoTime();
		for (int i = 0; i < count; i++) {
			list.get(index);
		}
		return  System.nanoTime() - timeStart;
	}
	
	private long testRemoving(List listTest, int count, int index) {
		List list = listTest;
		Iterator iterator = list.iterator();
		long timeStart = System.nanoTime();
		for (int i = 0; i < count; i++) {
			list.get(index);
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
