package ch4.libraries;

import ch0.utilities.SampleData;

public class Exercises {

	public static void main(String[] args) {
		excercise1();
		//ssss
		//ccc
		//xxx

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
	
}
