package com.learn.cs.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListUsingLambdas {

	public static void main(String[] args) {
		
		List<Integer> lis = Arrays.asList(20,8,6,19,23,1,100,0);
		
		lis.stream().sorted().forEach(o -> System.out.println(o));// ascending order
		
		lis.stream().sorted(Comparator.reverseOrder()).forEach(o -> System.out.println(o));// descending order
		
		// sorting custom/user defined objects
		
		List<Book> books = BookDB.getBooks();
		
		// sort based on pages of book - approach 1
		
		Collections.sort(books, (o1,o2) -> o2.getPages() - o1.getPages());
		
		System.out.println(books);
		
		//using stream api - approach 2
		
		books.stream().sorted((o1,o2) -> o1.getPages() - o2.getPages()).forEach(System.out::println);
		
		//alternative way - approach 3
		
		books.stream().sorted(Comparator.comparing(b -> b.getPages())).forEach(System.out::println);
		
		//sorting by book name in descending order by passing method reference - approach 4
		
		books.stream().sorted(Comparator.comparing(Book::getName).reversed()).forEach(System.out::println);
		
	}

}
