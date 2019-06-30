package com.indra.ArrayList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortList {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(100);
		list.add(54);
		list.add(7);
		list.add(31);
		List<Integer> list1 = new ArrayList<Integer>();
		for(Integer lis : list) {
			list1.add(lis);
		}
		list.sort(new Comparator<Integer>() {
			public int compare(Integer a, Integer b) {
				return b-a;
			}
		});
		/*Above to 2o to 24 lines of code can be replace with below one line 
		list.sort((a,b) -> Integer.compare(b, a));
		*/
		list1.sort(null);
		System.out.println("List in ascending order"+ list1);
		System.out.println("List in descending order"+ list);
	}

}
