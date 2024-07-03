package java8_practice;

import java.util.*; 
import java.util.stream.Stream; 

class streambuilder { 

	 												
	private static <T> void getStream() 
	{ 

													
		Stream.Builder<String> builder 
			= Stream.builder(); 

													
		Stream<String> stream = builder.add("a") 
									.add("b") 
									.add("c") 
									.build(); 

													
		Iterator<String> it = stream.iterator(); 

													
		while (it.hasNext()) { 
			System.out.print(it.next() + " "); 
		} 
	} 

	public static void main(String[] args) 
	{ 

													// Get the Stream using Builder 
		getStream(); 
	} 
} 
