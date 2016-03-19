package jConsole_Test;

import java.util.ArrayList;

public class MainClass {
	static ArrayList <MainClass> arr = new ArrayList<MainClass> ();

	public static void main(String[] args) {
		while (true){
			System.out.println(1);
			arr.add(new MainClass());
		}

	}

}
