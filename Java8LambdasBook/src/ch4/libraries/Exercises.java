package ch4.libraries;

import ch0.utilities.Artists;
import ch0.utilities.SampleData;

public class Exercises {

	public static void main(String[] args) {
		
		//excercise1();
		excercise3();
		
	}

	
	public static void excercise1()
	{
		
		System.out.println("Exercise 1: count artists performing, in the case of groups, and any musicians who are members of those groups plus the group itself");
		System.out.println("--------------------------------------------");
		SampleData.albums
			.forEach( album -> {  
				System.out.println("the Album " + album.getName() + " has " + album.getAllMusicans().count() + " musicans");
				});
	}
	
	public static void excercise3()
	{
		
		Artists artists = new Artists(SampleData.membersOfTheBeatles);
		
		System.out.println( "The 4 artist has name : " + artists.getArtistName(3));
		
		System.out.println( "The 5 artist has name : " + artists.getArtistName(4));
		
	}
	
	
	
}
