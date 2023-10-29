package test;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add("test1");
		set.add("test2");
		set.add("test1");
		for(String data : set) {
			System.out.println(data);
		}
		
		System.out.println(set.size());
	}

}
