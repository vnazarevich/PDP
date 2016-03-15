package HomeWorks.TestCollectionsEfficienty;

public class Result {
	private int count;
	private String collectionClass;
	private long timeAddInTail;
	private long timeAddInMiddle;
	private long timeAddInHead;
	
	public Result(String collectionClass, int count) {
		this.count = count;
		this.collectionClass = collectionClass;
	}

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

	@Override
	public String toString() {
		return "Result [ "
				+ collectionClass  +", count=" + count + ", timeAddInTail=" + timeAddInTail
				+ ", timeAddInMiddle=" + timeAddInMiddle + ", timeAddInHead="
				+ timeAddInHead + "]";
	}
	
	
	
	

}
