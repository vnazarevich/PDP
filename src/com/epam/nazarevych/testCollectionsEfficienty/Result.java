package com.epam.nazarevych.testCollectionsEfficienty;

import java.util.List;

public class Result {
	private int count;
	private String collectionClass;
	private long timeAdd;
	private long timeAddInTail;
	private long timeAddInMiddle;
	private long timeAddInHead;
	private long timeSet;
	private long timeSetInTail;
	private long timeSetInMiddle;
	private long timeSetInHead;
	private long timeGet;
	private long timeGetFromTail;
	private long timeGetFromMiddle;
	private long timeGetFromHead;
	private long timeRemove;
	private long timeRemoveFromTail;
	private long timeRemoveFromMiddle;
	private long timeRemoveFromHead;
	private long memorySize;

	// private long

	public Result(String collectionClass, int count) {
		this.count = count;
		this.collectionClass = collectionClass;
	}

	@Override
	public String toString() {
		return collectionClass.replace("java.util.", "")+"  " + count + "   "
				+  timeAddInHead + "   " 
				+ timeAddInMiddle + "  "
				+ timeAddInTail + "  " 
				
				+ timeSetInHead  + "    "
				+ timeSetInMiddle +"   " 
				+ timeSetInTail + "   " 
				
				+ timeGetFromHead + "   " 
				+ timeGetFromMiddle + "       " 
				+ timeGetFromTail + "       "
				
				+  timeRemoveFromHead + "      "
				+  timeRemoveFromMiddle + "      "
				+  timeRemoveFromTail + "   ";
//		return "Result [count=" + count + ", collectionClass="
//				+ collectionClass + ", timeAddInTail=" + timeAddInTail
//				+ ", timeAddInMiddle=" + timeAddInMiddle + ", timeAddInHead="
//				+ timeAddInHead + ", timeSetInTail=" + timeSetInTail
//				+ ", timeSetInMiddle=" + timeSetInMiddle + ", timeSetInHead="
//				+ timeSetInHead + ", timeGetFromTail=" + timeGetFromTail
//				+ ", timeGetFromMiddle=" + timeGetFromMiddle
//				+ ", timeGetFromHead=" + timeGetFromHead
//				+ ", timeRemoveFromTail=" + timeRemoveFromTail
//				+ ", timeRemoveFromMiddle=" + timeRemoveFromMiddle
//				+ ", timeRemoveFromHead=" + timeRemoveFromHead + "]";
	}
	
	
	// getters and setters
	
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getCollectionClass() {
		return collectionClass;
	}

	public void setCollectionClass(String collectionClass) {
		this.collectionClass = collectionClass;
	}

	public long getTimeAddInTail() {
		return timeAddInTail;
	}

	public void setTimeAddInTail(long timeAddInTail) {
		this.timeAddInTail = timeAddInTail;
	}

	public long getTimeAddInMiddle() {
		return timeAddInMiddle;
	}

	public void setTimeAddInMiddle(long timeAddInMiddle) {
		this.timeAddInMiddle = timeAddInMiddle;
	}

	public long getTimeAddInHead() {
		return timeAddInHead;
	}

	public void setTimeAddInHead(long timeAddInHead) {
		this.timeAddInHead = timeAddInHead;
	}

	public long getTimeSetInTail() {
		return timeSetInTail;
	}

	public void setTimeSetInTail(long timeSetInTail) {
		this.timeSetInTail = timeSetInTail;
	}

	public long getTimeSetInMiddle() {
		return timeSetInMiddle;
	}

	public void setTimeSetInMiddle(long timeSetInMiddle) {
		this.timeSetInMiddle = timeSetInMiddle;
	}

	public long getTimeSetInHead() {
		return timeSetInHead;
	}

	public void setTimeSetInHead(long timeSetInHead) {
		this.timeSetInHead = timeSetInHead;
	}

	public long getTimeGetFromTail() {
		return timeGetFromTail;
	}

	public void setTimeGetFromTail(long timeGetFromTail) {
		this.timeGetFromTail = timeGetFromTail;
	}

	public long getTimeGetFromMiddle() {
		return timeGetFromMiddle;
	}

	public void setTimeGetFromMiddle(long timeGetFromMiddle) {
		this.timeGetFromMiddle = timeGetFromMiddle;
	}

	public long getTimeGetFromHead() {
		return timeGetFromHead;
	}

	public void setTimeGetFromHead(long timeGetFromHead) {
		this.timeGetFromHead = timeGetFromHead;
	}

	public long getTimeRemoveFromTail() {
		return timeRemoveFromTail;
	}

	public void setTimeRemoveFromTail(long timeRemoveFromTail) {
		this.timeRemoveFromTail = timeRemoveFromTail;
	}

	public long getTimeRemoveFromMiddle() {
		return timeRemoveFromMiddle;
	}

	public void setTimeRemoveFromMiddle(long timeRemoveFromMiddle) {
		this.timeRemoveFromMiddle = timeRemoveFromMiddle;
	}

	public long getTimeRemoveFromHead() {
		return timeRemoveFromHead;
	}

	public void setTimeRemoveFromHead(long timeRemoveFromHead) {
		this.timeRemoveFromHead = timeRemoveFromHead;
	}

	public long getMemorySize() {
		return memorySize;
	}

	public void setMemorySize(long memorySize) {
		this.memorySize = memorySize;
	}

	public long getTimeAdd() {
		return timeAdd;
	}

	public void setTimeAdd(long timeAdd) {
		this.timeAdd = timeAdd;
	}

	public long getTimeSet() {
		return timeSet;
	}

	public void setTimeSet(long timeSet) {
		this.timeSet = timeSet;
	}

	public long getTimeGet() {
		return timeGet;
	}

	public void setTimeGet(long timeGet) {
		this.timeGet = timeGet;
	}

	public long getTimeRemove() {
		return timeRemove;
	}

	public void setTimeRemove(long timeRemove) {
		this.timeRemove = timeRemove;
	}

	
	
}
