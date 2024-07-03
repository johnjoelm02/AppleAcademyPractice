package java8_practice;
import java.util.*; 
import java.util.stream.Stream; 
	
	
	class createstream { 

		private static void getStream() 
		{ 

			Stream<String> streamOfArray 
				= Stream.empty(); 

			Iterator<String> it 
				= streamOfArray.iterator(); 

			while (it.hasNext()) { 
				System.out.print(it.next() + " "); 
			} 
		} 

		public static void main(String[] args) 
		{ 

			getStream(); 
			
			// System.out.println("Hi");
		} 
	} 

