package java8_practice;

import java.util.stream.Stream; 

class streamiterate { 

	
	private static <T> void
	getStream(int seedValue, int limitTerms) 
	{ 

	 
		Stream.iterate(seedValue, 
					(Integer n) -> n * n) 
			.limit(limitTerms) 
			.forEach(System.out::println); 
	} 

	public static void main(String[] args) 
	{ 

	 
		int seedValue = 2; 


		int limitTerms = 5; 


		getStream(seedValue, limitTerms); 
	} 
} 
