//******************************************************************
//                                                                 
//  Excercises.java                                               
//  Copyright 2019 PSI AG. All rights reserved.              
//  PSI PROPRIETARY/CONFIDENTIAL. Use is subject to license terms
//                                                                 
// ******************************************************************

package ch2.introduction;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

import javax.swing.text.DateFormatter;

public class Exercises {

	public static void main(String[] args) {
	
		Excercise2();
	}
	
	public static void Question1()
	{
		Function f = a -> null;
		Function<Integer, Integer> incr = i -> i + 100;
		BinaryOperator<Double> sum = (x, y) -> x + y;
		Function<Long, Long> c = x -> x +1;
		
	}
	
	
	public static void Excercise2()
	{
		
		ThreadLocal<DateFormatter> th = ThreadLocal.withInitial(() -> {
			
			
			DateFormatter dformatter = new DateFormatter(new SimpleDateFormat("dd-mm-yyyy"));
			try {
				System.out.println("Formatted example date is:" + dformatter.valueToString(new Date()));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return dformatter;
		});
		
		th.get();
	}
	
	public static void Excercise3()
	{
		//check( x -> x > 5); //won't compile -> The method check(Predicate<Integer>) is ambiguous for the type Excercises
	}
	
	static void check(Predicate<Integer> predicate){}
	static void check(IntPred predicate){}
}

interface IntPred {
	boolean test(Integer value);
}


