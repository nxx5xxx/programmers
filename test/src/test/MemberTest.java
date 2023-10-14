package test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class MemberTest {

	public static void main(String[] args) {
		Set<Member> set = new HashSet<>();

	set.add(new Member("홍길동",30));
	set.add(new Member("홍길동",30));
	set.add(new Member("길동",30));
	set.add(new Member("동길이",30));
		
		List<Member> memList = new Vector<>();
		Iterator<Member> iterator = set.iterator();
		while(iterator.hasNext()) {
			memList.add((Member) iterator.next());
			//System.out.println(iterator.next());
		}
		
		Member[] setToArr = set.toArray(new Member[memList.size()]);
		for(Member toS : setToArr) {
			System.out.println(toS);
		}
		System.out.println("------------------");
		Member[] listToArr = memList.toArray(new Member[memList.size()]);
		for(Member toS : listToArr) {
			System.out.println(toS);
		}
		
		System.out.println("------------------");
		//반대
		List<Member> arrToList = new Vector<>(Arrays.asList(listToArr));
		for(Member data : arrToList)System.out.println(data);
		System.out.println("------------------");		
		Set<Member> arrToSet = new HashSet<>(Arrays.asList(setToArr));
		for(Member data : arrToSet)System.out.println(data);

	}

}
