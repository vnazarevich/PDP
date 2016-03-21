import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class testFeachers {

	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList(20);
		Collections.fill(arrayList, 1);
		System.out.println("arrayList.toString() " + arrayList.toString());
		
		Integer [] arr = {5, 10, 3, 2, 1};
		arrayList.addAll(Arrays.asList(arr));
		Collections.fill(arrayList, 1);
		System.out.println("arrayList.toString() " + arrayList.toString());
		arrayList.remove(1);
		System.out.println("arrayList.toString() " + arrayList.toString());
	}

}
