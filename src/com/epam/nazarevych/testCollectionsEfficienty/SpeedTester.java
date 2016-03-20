package com.epam.nazarevych.testCollectionsEfficienty;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class SpeedTester {
	private final static int ELEMENT = 100;
	private ArrayList<Result> resultList = new ArrayList<Result>();

	public void getResults() {
		for (Result result : resultList) {
			System.out.println(result.toString());
			// if (result.getCollectionClass().equals("java.util.ArrayList") ||
			// result.getCollectionClass().equals("java.util.ArrayList")){
			// System.out.println(result.toString());
			// }
		}

		// count=" + count + ", collectionClass="
		// + collectionClass + ", timeAddInTail=" + timeAddInTail
		// + ", timeAddInMiddle=" + timeAddInMiddle + ", timeAddInHead="
		// + timeAddInHead + ", timeSetInTail=" + timeSetInTail
		// + ", timeSetInMiddle=" + timeSetInMiddle + ", timeSetInHead="
		// + timeSetInHead + ", timeGetFromTail=" + timeGetFromTail
		// + ", timeGetFromMiddle=" + timeGetFromMiddle
		// + ", timeGetFromHead=" + timeGetFromHead
		// + ", timeRemoveFromTail=" + timeRemoveFromTail
		// + ", timeRemoveFromMiddle=" + timeRemoveFromMiddle
		// + ", timeRemoveFromHead=" + timeRemoveFromHead +
		// for (Result result: resultList){
		// System.out.println(result.toString());
		// }
	}

	/*
	 * This method count time of operation adding, getting, setting and removing
	 * from Tail, Middle and Head of List also it count average time of all
	 * adding, getting, setting and removing operation
	 */
	public void testList(List list, int count) {
		Result result = new Result(list.getClass().getName(), count);

		result.setTimeAddInHead(testAddingList(list, count, 0));
		result.setTimeAddInMiddle(testAddingList(list, count, list.size() / 2));
		result.setTimeAddInTail(testAddingList(list, count, list.size() - 1));
		result.setTimeAdd(
				getAverage(result.getTimeAddInHead(), result.getTimeAddInMiddle(), result.getTimeAddInTail()));

		result.setTimeSetInHead(testSetingList(list, count, 0));
		result.setTimeSetInMiddle(testSetingList(list, count, list.size() / 2));
		result.setTimeSetInTail(testSetingList(list, count, list.size() - 1));
		result.setTimeSet(
				getAverage(result.getTimeSetInHead(), result.getTimeSetInMiddle(), result.getTimeSetInTail()));

		result.setTimeGetFromHead(testGetingList(list, count, 0));
		result.setTimeGetFromMiddle(testGetingList(list, count, list.size() / 2));
		result.setTimeGetFromTail(testGetingList(list, count, list.size() - 1));
		result.setTimeGet(
				getAverage(result.getTimeGetFromHead(), result.getTimeGetFromMiddle(), result.getTimeGetFromTail()));

		result.setTimeRemoveFromHead(testRemovingList(list, count, 0));
		result.setTimeRemoveFromMiddle(testRemovingList(list, count, list.size() / 2));
		result.setTimeRemoveFromTail(testRemovingList(list, count, list.size() - 1));
		result.setTimeRemove(getAverage(result.getTimeRemoveFromHead(), result.getTimeRemoveFromMiddle(),
				result.getTimeRemoveFromTail()));

		resultList.add(result);
	}

	/*
	 * For map operation add(new elem) = set(new elem) = put( new elem)
	 */
	public void testMap(Map<Integer, Integer> map, int count) {
		Result result = new Result(map.getClass().getName(), count);
		result.setTimeAdd(testPuttinMap(map, count));
		result.setTimeGet(testGettingMap(map, count));
		result.setTimeSet(testPuttinMap(map, count));
		result.setTimeRemove(testRemovingMap(map, count));
		resultList.add(result);
	}

	public void testQueue(Queue<Integer> queue, int count) {
		Result result = new Result(queue.getClass().getName(), count);
		result.setTimeAdd(testAddingQueue(queue, count));
		result.setTimeRemove(testRemovingQueue(queue, count));
		resultList.add(result);
	}

	private long testRemovingQueue(Queue<Integer> queue, int count) {
		Queue queueTest = queue;
		long timeStart = System.nanoTime();
		for (int i = 0; i < count; i++) {
			queueTest.remove(ELEMENT);
		}
		return System.nanoTime() - timeStart;
	}

	private long testAddingQueue(Queue<Integer> queue, int count) {
		Queue queueTest = queue;
		long timeStart = System.nanoTime();
		for (int i = 0; i < count; i++) {
			queueTest.add(ELEMENT);
		}
		return System.nanoTime() - timeStart;
	}

	public void testSet(Set<Integer> set, int count) {
		Result result = new Result(set.getClass().getName(), count);
		result.setTimeAdd(testAddingSet(set, count));
		result.setTimeRemove(testRemoveSet(set, count));
		resultList.add(result);
	}

	public void showResults() {
		System.out.println("Collection name   numberIterations   adding   getting   setting   removing ");
		for (Result result : resultList) {
			System.out.println(result.getCollectionClass().replace("java.util.", "") + "               "
					+ result.getCount() + "            " + result.getTimeAdd() + "       " + result.getTimeSet()
					+ "      " + result.getTimeGet() + "   " + result.getTimeRemove());
		}

	}

	private long testRemovingMap(Map<Integer, Integer> map, int count) {
		Map mapTest = map;
		long timeStart = System.nanoTime();
		for (int i = 0; i < count; i++) {
			mapTest.remove(ELEMENT);
		}
		return System.nanoTime() - timeStart;
	}

	private long testGettingMap(Map<Integer, Integer> map, int count) {
		Map mapTest = map;
		long timeStart = System.nanoTime();
		for (int i = 0; i < count; i++) {
			mapTest.get(ELEMENT);
		}
		return System.nanoTime() - timeStart;
	}

	private long testPuttinMap(Map<Integer, Integer> map, int count) {
		Map mapTest = map;
		long timeStart = System.nanoTime();
		for (int i = 0; i < count; i++) {
			mapTest.put(ELEMENT, ELEMENT);
		}
		return System.nanoTime() - timeStart;
	}

	private long getAverage(long... values) {
		int count = 0;
		long sum = 0;
		for (long val : values) {
			sum += val;
			count++;
		}
		return sum / count;

	}

	private long testRemoveSet(Set<Integer> set, int count) {
		Set setTest = set;
		long timeStart = System.nanoTime();
		for (int i = 0; i < count; i++) {
			setTest.remove(ELEMENT);
		}
		return System.nanoTime() - timeStart;
	}

	private long testAddingSet(Set<Integer> set, int count) {
		Set setTest = set;
		long timeStart = System.nanoTime();
		for (int i = 0; i < count; i++) {
			setTest.add(ELEMENT);
		}
		return System.nanoTime() - timeStart;
	}

	private long testAddingList(List list, int count, int index) {
		List testList = list;
		long timeStart = System.nanoTime();
		for (int i = 0; i < count; i++) {
			testList.add(index, ELEMENT);
		}
		return System.nanoTime() - timeStart;
	}

	private long testSetingList(List list, int count, int index) {
		List testList = list;
		long timeStart = System.nanoTime();
		for (int i = 0; i < count; i++) {
			testList.set(index, ELEMENT);
		}
		return System.nanoTime() - timeStart;
	}

	private long testGetingList(List list, int count, int index) {
		List testList = list;
		long timeStart = System.nanoTime();
		for (int i = 0; i < count; i++) {
			testList.get(index);
		}
		return System.nanoTime() - timeStart;
	}

	private long testRemovingList(List list, int count, int index) {
		List testList = list;
		if (index == (list.size() - 1)) {
			long timeStart = System.nanoTime();
			for (int i = 0; i < count; i++) {
				testList.remove(index--);
			}
			return System.nanoTime() - timeStart;
		}
		long timeStart = System.nanoTime();
		for (int i = 0; i < count; i++) {
			testList.remove(index);
		}
		return System.nanoTime() - timeStart;
	}

	// while (iterator.hasNext()){
	// iterator.next().set()
	// }
	// for (int index = 0; index < count; index++) {
	// list.add(index, ELEMENT);
	// }

}
