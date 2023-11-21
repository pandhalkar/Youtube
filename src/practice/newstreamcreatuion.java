package practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class newstreamcreatuion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String> ls=Stream.of("AAm", "AAP", "Sam" , "Ram").filter(t->t.endsWith("m"))
		.map(t->t.toUpperCase()).collect(Collectors.toList());
		System.out.println(ls.get(0));
		
		//print unique no# 1,3,3,5,5,6,7,7,89
		
	
		List<Integer> lks = Arrays.asList(3, 3, 4, 4, 5, 6, 7, 87, 5, 4, 3, 3, 3, 3);
		lks.stream().distinct().forEach(y -> System.out.println(y));
		List <Integer> man= lks.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(man.get(3));
		

		
		
		

	}

}
