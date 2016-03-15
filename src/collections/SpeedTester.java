package collections;

import java.util.ArrayList;
import java.util.List;

public class SpeedTester {
	private final static int ELEMENT = 100;
	static ArrayList<Result> resultList = new ArrayList<Result> () ;
	
	public void testList(List list, int count) {
		testListAdd(list, count);	
	}

	public void getResults() {
		for (Result result: resultList){
			System.out.println(result.toString());
		}
		
	}

	private void testListAdd(List list, int count) {
		System.out.println(list.getClass().getName());
		Result result = new Result(list.getClass().getName(), count);
		result.setTimeAddInTail(testAddingInTail(list, count));
		result.setTimeAddInMiddle(testAddingInMiddle(list, count));
		result.setTimeAddInHead(testAddingInHead(list, count));
		resultList.add(result);
	}

	private long testAddingInHead(List listTest, int count) {
		List list = listTest;
		long timeStart = System.nanoTime();
		for (int index = 0; index < count; index++) {
			list.add(index, ELEMENT);
		}
		long l = timeStart - System.nanoTime();
		System.out.println(l);
		return l;
	}

	private long testAddingInMiddle(List listTest, int count) {
		List list = listTest;
		int indexMiddle = list.size() / 2;
		int maxIndex = indexMiddle + count;

		long timeStart = System.nanoTime();
		for (int index = indexMiddle; index < maxIndex; index++) {
			list.add(index, ELEMENT);
		}
		return timeStart - System.nanoTime();
	}

	private long testAddingInTail(List listTest, int count) {
		List list = listTest;
		long timeStart = System.nanoTime();
		for (int i = 0; i < count; i++) {
			list.add(ELEMENT);
		}
		return timeStart - System.nanoTime();
	}

	
	
}
