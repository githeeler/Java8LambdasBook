package ch3.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import ch0.utilities.Album;
import ch0.utilities.Artist;
import ch0.utilities.SampleData;

public class Exercises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//excercise1();
		excercise2();
	}

	
	public static void excercise1()
	{
			System.out.println("Exercise 1 --------------------------------------------)");
			System.out.println("a)-----------");
			System.out.println("addUp returned: " + addUp(Stream.of(1,2,3,4,5,6,7,8,9)));
			
			System.out.println("b)-----------");
			System.out.println("Artists and place of origin: " + 
					getNameAndOrigin(SampleData.membersOfTheBeatles));
			
			System.out.println("c)-----------");
			System.out.println("Albums with at most three tracks: " + 
					getNameAndOrigin(SampleData.albums));
		
	}
	
	private static int addUp(Stream<Integer> numbers)
	{
		return numbers.reduce(0, (x, y) -> x + y).intValue();	
	}
	
	private static List<String> getNameAndOrigin(List<Artist> artists)
	{
		return artists.stream()
		.map(artist -> artist.getName() + " " + artist.getNationality())
		//.flatMap(artist -> Stream.of(artist.getName(), artist.getNationality()))		
		.collect(Collectors.toList());
	}
	
	private static List<String> getNameAndOrigin(Stream<Album> albums)
	{
		return albums
				.filter( album -> album.getTrackList().size() <= 3)
				.map( album -> album.getName())
				.collect(Collectors.toList());
	}
	
	
	
	public static void excercise2()
	{
		
		System.out.println("Exercise 2 --------------------------------------------)");
		System.out.println("total amount of members of bands:" + 
			SampleData.threeArtists()
				.flatMap(artist -> artist.getMembers())
				.count());
	}
	
}
