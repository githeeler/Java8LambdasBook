package ch5.advColAndColl;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;


import ch0.utilities.Artist;
import ch0.utilities.SampleData;

public class Exercises {

	public static void main(String[] args) {
	
		excercise1();
		
		excercise2();
	}
	
	public static void excercise1()
	{
		
		System.out.println("a)-----------");
		System.out.println("Artists names uppercase: " + 
		
		SampleData.membersOfTheBeatles.stream()
				.map(Artist::getName)
				.map(String::toUpperCase)
				.collect(Collectors.toList())
				);
		
		
		System.out.println("b)-----------");
		System.out.println("The sum is:" + 
				Stream.of(1,2,3,4,5,6,7,8,9).reduce(0, Integer::sum));
		
		
		System.out.println("c)-----------");
		System.out.println("total amount of members of bands:" + 
			SampleData.threeArtists()
				.flatMap(Artist::getMembers)
				.count());
		
	}
	
	public static void excercise2()
	{
		
		System.out.println("a)-----------");
		System.out.print("Artist with longest name: ");
		
		Stream<String> names = SampleData.membersOfTheBeatles.stream()
				.map(Artist::getName);
		
		Optional<String> theLongest = names.reduce((st1,st2)->st1.length() >= st2.length() ? st1 : st2);	
		System.out.println(theLongest.get());
		
		
		System.out.println("b)-----------");
		Stream<String> names_b = Stream.of("John", "Paul", "George", "John", "Paul", "John");

		Map<Object, Long> countNmaesMap = names_b.collect(Collectors.groupingBy(entry -> entry,  Collectors.counting()));
		System.out.println("Map with names occurences: "+ countNmaesMap.toString());
		
	}
}
